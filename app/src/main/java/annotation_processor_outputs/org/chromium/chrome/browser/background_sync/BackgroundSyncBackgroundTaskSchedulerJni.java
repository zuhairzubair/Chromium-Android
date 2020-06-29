package org.chromium.chrome.browser.background_sync;

import J.N;
import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class BackgroundSyncBackgroundTaskSchedulerJni implements BackgroundSyncBackgroundTaskScheduler.Natives {
  private static BackgroundSyncBackgroundTaskScheduler.Natives testInstance;

  public static final JniStaticTestMocker<BackgroundSyncBackgroundTaskScheduler.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.background_sync.BackgroundSyncBackgroundTaskScheduler.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.background_sync.BackgroundSyncBackgroundTaskScheduler.Natives instance) {
      if (!J.N.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void setPlayServicesVersionCheckDisabledForTests(boolean disabled) {
    N.MmtZRuxl(disabled);
  }

  public static BackgroundSyncBackgroundTaskScheduler.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.background_sync.BackgroundSyncBackgroundTaskScheduler.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new BackgroundSyncBackgroundTaskSchedulerJni();
  }
}
