package org.chromium.chrome.browser.component_updater;

import J.N;
import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class UpdateSchedulerJni implements UpdateScheduler.Natives {
  private static UpdateScheduler.Natives testInstance;

  public static final JniStaticTestMocker<UpdateScheduler.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.component_updater.UpdateScheduler.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.component_updater.UpdateScheduler.Natives instance) {
      if (!J.N.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void onStartTask(long nativeBackgroundTaskUpdateScheduler, UpdateScheduler caller) {
    N.MlOPWyho(nativeBackgroundTaskUpdateScheduler, caller);
  }

  @Override
  public void onStopTask(long nativeBackgroundTaskUpdateScheduler, UpdateScheduler caller) {
    N.MGPsKKYQ(nativeBackgroundTaskUpdateScheduler, caller);
  }

  public static UpdateScheduler.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.component_updater.UpdateScheduler.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new UpdateSchedulerJni();
  }
}
