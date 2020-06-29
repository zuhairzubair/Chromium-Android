/*
 * Copyright 2011 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.ipc.invalidation.external.client.contrib;

import com.google.android.gcm.GCMBaseIntentService;
import com.google.android.gcm.GCMBroadcastReceiver;
import com.google.android.gcm.GCMRegistrar;
import com.google.ipc.invalidation.external.client.SystemResources.Logger;
import com.google.ipc.invalidation.external.client.android.service.AndroidLogger;
import com.google.ipc.invalidation.ticl.android2.WakeLockManager;
import com.google.ipc.invalidation.ticl.android2.channel.AndroidChannelPreferences;
import com.google.ipc.invalidation.ticl.android2.channel.AndroidChannelPreferences.GcmChannelType;

import android.app.IntentService;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.ServiceInfo;

/**
 * A Google Cloud Messaging listener class that rebroadcasts events as package-scoped
 * broadcasts. This allows multiple components to share a single GCM connection.
 * <p>
 * This listener uses an API of broadcasted Intents that is modeled after that provided by
 * {@link GCMBaseIntentService}. For each upcall (e.g., onMessage, on Registered, etc) specified
 * by {@code GCMBaseIntentService}, there is an {@code EXTRA_OP_...} constant defined in
 * {@link Intents}.
 * <p>
 * Note that this class does <b>NOT</b> handle registering with GCM; applications are still required
 * to do that in the usual way (e.g., using the GCMRegistrar class from the GCM library).
 * <p>
 * In order to raise a {@code GCMBaseIntentService} event to listeners, this service will broadcast
 * an Intent with the following properties:
 * 1. The action of the Intent is {@link Intents#ACTION}
 * 2. There is a boolean-valued extra in the Intent whose key is the {@code EXTRA_OP_...} key
 *    for that call and whose value is {@code true}. For any intent, exactly one {@code EXTRA_OP}
 *    extra will be set.
 * 3. The Intent contains additional call-specific extras required to interpret it. (See note for
 *    onMessage, below).
 * <p>
 * Clients of this service <b>MUST NOT</b> assume that there is a one-to-one mapping between
 * issued broadcasts and actual GCM intents. I.e., this service may issue broadcast intents
 * spontaneously, and it may not issue an intent for every GCM event.
 * <p>
 * For the onMessage() call, the broadcast intent will contain key/value extras containing the
 * message payload. These extras are guaranteed to be identical to those that would have been in
 * the Intent provided to the onMessage call. However, clients <b>MUST NOT</b> assume that the
 * Intent broadcast to communicate a GCM message is literally the same Intent generated by the GCM
 * client library.
 * <p>
 * This class does not expose the {@code onError} call, since according to the GCM documentation
 * there is nothing to do except log an error (which this class does).
 *
 */
public class MultiplexingGcmListener extends GCMBaseIntentService {
  /* This class is public so that it can be instantiated by the Android runtime. */

  /** Constants used in broadcast Intents. */
  public static final class Intents {
    /** Prefix of the action and extras. */
    private static final String PREFIX = "com.google.ipc.invalidation.gcmmplex.";

    /** Action of all broadcast intents issued. */
    public static final String ACTION = PREFIX + "EVENT";

    /** Extra corresponding to an {@code onMessage} upcall. */
    public static final String EXTRA_OP_MESSAGE = PREFIX + "MESSAGE";

    /** Extra corresponding to an {@code onRegistered} upcall. */
    public static final String EXTRA_OP_REGISTERED = PREFIX + "REGISTERED";

    /** Extra corresponding to an {@code onUnregistered} upcall. */
    public static final String EXTRA_OP_UNREGISTERED = PREFIX + "UNREGISTERED";

    /** Extra corresponding to an {@code onDeletedMessages} upcall. */
    public static final String EXTRA_OP_DELETED_MESSAGES = PREFIX + "DELETED_MSGS";

    /**
     * Extra set iff the operation is {@link #EXTRA_OP_REGISTERED} or
     * {@link #EXTRA_OP_UNREGISTERED}; it is string-valued and holds the registration id.
     */
    public static final String EXTRA_DATA_REG_ID = PREFIX + "REGID";

    /**
     * Extra set iff the operation is {@link #EXTRA_OP_DELETED_MESSAGES}; it is integer-valued
     * and holds the number of deleted messages.
     */
    public static final String EXTRA_DATA_NUM_DELETED_MSGS = PREFIX + "NUM_DELETED_MSGS";
  }

  /**
   * {@link GCMBroadcastReceiver} that forwards GCM intents to the {@code MultiplexingGcmListener}
   * class.
   */
  public static class GCMReceiver extends GCMBroadcastReceiver {
    /* This class is public so that it can be instantiated by the Android runtime. */
    @Override
    protected String getGCMIntentServiceClassName(Context context) {
      return MultiplexingGcmListener.class.getName();
    }
  }

  /**
   * Convenience base class for client implementations. It provides base classes for a broadcast
   * receiver and an intent service that work together to handle events from the
   * {@code MultiplexingGcmListener} while holding a wake lock.
   * <p>
   * This class guarantees that the {@code onYYY} methods will be called holding a wakelock, and
   * that the wakelock will be automatically released when the method returns.
   * <p>
   * The wakelock will also be automatically released
   * {@link Receiver#WAKELOCK_TIMEOUT_MS} ms after the original Intent was received by the
   * {@link Receiver} class, to guard against leaks. Applications requiring a longer-duration
   * wakelock should acquire one on their own in the appropriate {@code onYYY} method.
   */
  public static abstract class AbstractListener extends IntentService {
    /** Prefix of all wakelocks acquired by the receiver and the intent service. */
    private static final String WAKELOCK_PREFIX = "multiplexing-gcm-listener:";

    /** Intent extra key used to hold wakelock names, for runtime checks. */
    private static final String EXTRA_WAKELOCK_NAME =
        "com.google.ipc.invalidation.gcmmplex.listener.WAKELOCK_NAME";

    /**
     * A {@code BroadcastReceiver} to receive intents from the {@code MultiplexingGcmListener}
     * service. It acquires a wakelock and forwards the intent to the service named by
     * {@link #getServiceClass}, which must be a subclass of {@code AbstractListener}.
     */
    public static abstract class Receiver extends BroadcastReceiver {
      /** Timeout after which wakelocks will be automatically released. */
      private static final int WAKELOCK_TIMEOUT_MS = 30 * 1000;

      @Override
      public final void onReceive(Context context, Intent intent) {
        // This method is final to prevent subclasses from overriding it and introducing errors in
        // the wakelock protocol.
        Class<?> serviceClass = getServiceClass();

        // If the service isn't an AbstractListener subclass, then it will not release the wakelock
        // properly, causing bugs.
        if (!AbstractListener.class.isAssignableFrom(serviceClass)) {
          throw new RuntimeException(
              "Service class is not a subclass of AbstractListener: " + serviceClass);
        }
        String wakelockKey = getWakelockKey(serviceClass);
        intent.setClass(context, serviceClass);

        // To avoid insidious bugs, tell the service which wakelock we acquired. The service will
        // log a warning if the lock it releases is not this lock.
        intent.putExtra(EXTRA_WAKELOCK_NAME, wakelockKey);

        // Acquire the lock and start the service. The service is responsible for releasing the
        // lock.
        WakeLockManager.getInstance(context).acquire(wakelockKey, WAKELOCK_TIMEOUT_MS);
        context.startService(intent);
      }

      /** Returns the class of the service that will handle intents. */
      protected abstract Class<?> getServiceClass();
    }

    protected AbstractListener(String name) {
      super(name);

      // If the process dies during a call to onHandleIntent, redeliver the intent when the service
      // restarts.
      setIntentRedelivery(true);
    }

    @Override
    public final void onHandleIntent(Intent intent) {
      if (intent == null) {
        return;
      }

      // This method is final to prevent subclasses from overriding it and introducing errors in
      // the wakelock protocol.
      try {
        doHandleIntent(intent);
      } finally {
        // Release the wakelock acquired by the receiver. The receiver provides the name of the
        // lock it acquired in the Intent so that we can sanity-check that we are releasing the
        // right lock.
        String receiverAcquiredWakelock = intent.getStringExtra(EXTRA_WAKELOCK_NAME);
        String wakelockToRelease = getWakelockKey(getClass());
        if (!wakelockToRelease.equals(receiverAcquiredWakelock)) {
          logger.warning("Receiver acquired wakelock '%s' but releasing '%s'",
              receiverAcquiredWakelock, wakelockToRelease);
        }
        WakeLockManager wakelockManager = WakeLockManager.getInstance(this);
        wakelockManager.release(wakelockToRelease);
      }
    }

    /** Handles {@code intent} while holding a wake lock. */
    private void doHandleIntent(Intent intent) {
      // Ensure this is an Intent we want to handle.
      if (!MultiplexingGcmListener.Intents.ACTION.equals(intent.getAction())) {
        logger.warning("Ignoring intent with unknown action: %s", intent);
        return;
      }
      // Dispatch based on the extras.
      if (intent.hasExtra(MultiplexingGcmListener.Intents.EXTRA_OP_MESSAGE)) {
        onMessage(intent);
      } else if (intent.hasExtra(MultiplexingGcmListener.Intents.EXTRA_OP_REGISTERED)) {
        onRegistered(intent.getStringExtra(MultiplexingGcmListener.Intents.EXTRA_DATA_REG_ID));
      } else if (intent.hasExtra(MultiplexingGcmListener.Intents.EXTRA_OP_UNREGISTERED)) {
        onUnregistered(intent.getStringExtra(MultiplexingGcmListener.Intents.EXTRA_DATA_REG_ID));
      } else if (intent.hasExtra(MultiplexingGcmListener.Intents.EXTRA_OP_DELETED_MESSAGES)) {
        int numDeleted =
            intent.getIntExtra(MultiplexingGcmListener.Intents.EXTRA_DATA_NUM_DELETED_MSGS, -1);
        if (numDeleted == -1) {
          logger.warning("Could not parse num-deleted field of GCM broadcast: %s", intent);
          return;
        }
        onDeletedMessages(numDeleted);
      } else {
        logger.warning("Broadcast GCM intent with no known operation: %s", intent);
      }
    }

    // These methods have the same specs as in {@code GCMBaseIntentService}.
    protected abstract void onMessage(Intent intent);
    protected abstract void onRegistered(String registrationId);
    protected abstract void onUnregistered(String registrationId);
    protected abstract void onDeletedMessages(int total);

    /**
     * Returns the name of the wakelock to acquire for the intent service implemented by
     * {@code clazz}.
     */
    private static String getWakelockKey(Class<?> clazz) {
      return WAKELOCK_PREFIX + clazz.getName();
    }
  }

  /**
   * Name of the metadata element within the {@code service} element whose value is a
   * comma-delimited list of GCM sender ids.
   */
  private static final String GCM_SENDER_IDS_METADATA_KEY = "sender_ids";

  /** Logger. */
  private static final Logger logger = AndroidLogger.forTag("MplexGcmListener");

  // All onYYY methods work by constructing an appropriate Intent and broadcasting it.

  @Override
  protected void onMessage(Context context, Intent intent) {
    Intent newIntent = new Intent();
    newIntent.putExtra(Intents.EXTRA_OP_MESSAGE, true);
    newIntent.putExtras(intent);
    rebroadcast(newIntent);
  }

  @Override
  protected void onRegistered(Context context, String registrationId) {
    Intent intent = new Intent();
    intent.putExtra(Intents.EXTRA_OP_REGISTERED, true);
    intent.putExtra(Intents.EXTRA_DATA_REG_ID, registrationId);
    rebroadcast(intent);
  }

  @Override
  protected void onUnregistered(Context context, String registrationId) {
    Intent intent = new Intent();
    intent.putExtra(Intents.EXTRA_OP_UNREGISTERED, true);
    intent.putExtra(Intents.EXTRA_DATA_REG_ID, registrationId);
    rebroadcast(intent);
  }

  @Override
  protected void onDeletedMessages(Context context, int total) {
    Intent intent = new Intent();
    intent.putExtra(Intents.EXTRA_OP_DELETED_MESSAGES, true);
    intent.putExtra(Intents.EXTRA_DATA_NUM_DELETED_MSGS, total);
    rebroadcast(intent);
  }

  @Override
  protected void onError(Context context, String errorId) {
    // This is called for unrecoverable errors, so just log a warning.
    logger.warning("GCM error: %s", errorId);
  }

  @Override
  protected String[] getSenderIds(Context context) {
    return readSenderIdsFromManifestOrDie(this);
  }

  /**
   * Broadcasts {@code intent} with the action set to {@link Intents#ACTION} and the package name
   * set to the package name of this service.
   */
  private void rebroadcast(Intent intent) {
    intent.setAction(Intents.ACTION);
    intent.setPackage(getPackageName());
    sendBroadcast(intent);
  }

  /**
   * Registers with GCM if not already registered. Also verifies that the device supports GCM
   * and that the manifest is correctly configured. Returns the existing registration id, if one
   * exists, or the empty string if one does not.
   *
   * @throws UnsupportedOperationException if the device does not have all GCM dependencies
   * @throws IllegalStateException if the manifest is not correctly configured
   */
  public static String initializeGcm(Context context) {
      AndroidChannelPreferences.setGcmChannelType(GcmChannelType.DEFAULT);
      GCMRegistrar.checkDevice(context);
      GCMRegistrar.checkManifest(context);
      final String regId = GCMRegistrar.getRegistrationId(context);
      if (regId.isEmpty()) {
          GCMRegistrar.register(context, readSenderIdsFromManifestOrDie(context));
      }
    return regId;
  }

  /**
   * Returns the GCM sender ids from {@link #GCM_SENDER_IDS_METADATA_KEY} or throws a
   * {@code RuntimeException} if they are not defined.
   */
  
  static String[] readSenderIdsFromManifestOrDie(Context context) {
    try {
      ServiceInfo serviceInfo = context.getPackageManager().getServiceInfo(
          new ComponentName(context, MultiplexingGcmListener.class), PackageManager.GET_META_DATA);
      if (serviceInfo.metaData == null) {
        throw new RuntimeException("Service has no metadata");
      }
      String senderIds = serviceInfo.metaData.getString(GCM_SENDER_IDS_METADATA_KEY);
      if (senderIds == null) {
        throw new RuntimeException("Service does not have the sender-ids metadata");
      }
      return senderIds.split(",");
    } catch (NameNotFoundException exception) {
      throw new RuntimeException("Could not read service info from manifest", exception);
    }
  }
}
