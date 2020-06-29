package org.chromium.chrome.browser.usage_stats;

import J.N;
import android.graphics.Bitmap;
import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.chrome.browser.profiles.Profile;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class NotificationSuspenderJni implements NotificationSuspender.Natives {
  private static NotificationSuspender.Natives testInstance;

  public static final JniStaticTestMocker<NotificationSuspender.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.usage_stats.NotificationSuspender.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.usage_stats.NotificationSuspender.Natives instance) {
      if (!J.N.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void storeNotificationResources(Profile profile, String[] notificationIds,
      String[] origins, Bitmap[] resources) {
    N.Mj9WitTn(profile, notificationIds, origins, resources);
  }

  @Override
  public void reDisplayNotifications(Profile profile, String[] origins) {
    N.MkLq9R0C(profile, origins);
  }

  public static NotificationSuspender.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.usage_stats.NotificationSuspender.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new NotificationSuspenderJni();
  }
}
