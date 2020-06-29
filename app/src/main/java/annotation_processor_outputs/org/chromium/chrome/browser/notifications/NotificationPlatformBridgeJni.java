package org.chromium.chrome.browser.notifications;

import J.N;
import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class NotificationPlatformBridgeJni implements NotificationPlatformBridge.Natives {
  private static NotificationPlatformBridge.Natives testInstance;

  public static final JniStaticTestMocker<NotificationPlatformBridge.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.notifications.NotificationPlatformBridge.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.notifications.NotificationPlatformBridge.Natives instance) {
      if (!J.N.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void initializeNotificationPlatformBridge() {
    N.MMmsCv9_();
  }

  @Override
  public void onNotificationClicked(long nativeNotificationPlatformBridgeAndroid,
      NotificationPlatformBridge caller, String notificationId, int notificationType, String origin,
      String scopeUrl, String profileId, boolean incognito, String webApkPackage, int actionIndex,
      String reply) {
    N.MLnX7Uof(nativeNotificationPlatformBridgeAndroid, caller, notificationId, notificationType, origin, scopeUrl, profileId, incognito, webApkPackage, actionIndex, reply);
  }

  @Override
  public void onNotificationClosed(long nativeNotificationPlatformBridgeAndroid,
      NotificationPlatformBridge caller, String notificationId, int notificationType, String origin,
      String profileId, boolean incognito, boolean byUser) {
    N.Mu4UlKd1(nativeNotificationPlatformBridgeAndroid, caller, notificationId, notificationType, origin, profileId, incognito, byUser);
  }

  @Override
  public void storeCachedWebApkPackageForNotificationId(
      long nativeNotificationPlatformBridgeAndroid, NotificationPlatformBridge caller,
      String notificationId, String webApkPackage) {
    N.MlTGi82B(nativeNotificationPlatformBridgeAndroid, caller, notificationId, webApkPackage);
  }

  public static NotificationPlatformBridge.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.notifications.NotificationPlatformBridge.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new NotificationPlatformBridgeJni();
  }
}
