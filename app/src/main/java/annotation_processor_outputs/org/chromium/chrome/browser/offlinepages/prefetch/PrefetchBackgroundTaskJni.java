package org.chromium.chrome.browser.offlinepages.prefetch;

import J.N;
import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class PrefetchBackgroundTaskJni implements PrefetchBackgroundTask.Natives {
  private static PrefetchBackgroundTask.Natives testInstance;

  public static final JniStaticTestMocker<PrefetchBackgroundTask.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.offlinepages.prefetch.PrefetchBackgroundTask.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.offlinepages.prefetch.PrefetchBackgroundTask.Natives instance) {
      if (!J.N.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public boolean startPrefetchTask(PrefetchBackgroundTask caller) {
    return (boolean)N.M_yiIXuu(caller);
  }

  @Override
  public boolean onStopTask(long nativePrefetchBackgroundTaskAndroid,
      PrefetchBackgroundTask caller) {
    return (boolean)N.MgpkLR_Z(nativePrefetchBackgroundTaskAndroid, caller);
  }

  @Override
  public void setTaskReschedulingForTesting(long nativePrefetchBackgroundTaskAndroid,
      PrefetchBackgroundTask caller, int rescheduleType) {
    N.M2m8iSZh(nativePrefetchBackgroundTaskAndroid, caller, rescheduleType);
  }

  @Override
  public void signalTaskFinishedForTesting(long nativePrefetchBackgroundTaskAndroid,
      PrefetchBackgroundTask caller) {
    N.MFEqJ7Qg(nativePrefetchBackgroundTaskAndroid, caller);
  }

  public static PrefetchBackgroundTask.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.offlinepages.prefetch.PrefetchBackgroundTask.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new PrefetchBackgroundTaskJni();
  }
}
