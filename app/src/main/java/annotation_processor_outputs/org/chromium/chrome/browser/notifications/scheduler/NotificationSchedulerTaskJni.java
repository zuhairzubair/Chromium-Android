package org.chromium.chrome.browser.notifications.scheduler;

import J.N;
import java.lang.Boolean;
import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.Callback;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.chrome.browser.profiles.Profile;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class NotificationSchedulerTaskJni implements NotificationSchedulerTask.Natives {
  private static NotificationSchedulerTask.Natives testInstance;

  public static final JniStaticTestMocker<NotificationSchedulerTask.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.notifications.scheduler.NotificationSchedulerTask.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.notifications.scheduler.NotificationSchedulerTask.Natives instance) {
      if (!J.N.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void onStartTask(NotificationSchedulerTask caller, Profile profile,
      Callback<Boolean> callback) {
    N.Mgeg_Rc9(caller, profile, callback);
  }

  @Override
  public boolean onStopTask(NotificationSchedulerTask caller, Profile profile) {
    return (boolean)N.M91xgL_Z(caller, profile);
  }

  public static NotificationSchedulerTask.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.notifications.scheduler.NotificationSchedulerTask.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new NotificationSchedulerTaskJni();
  }
}
