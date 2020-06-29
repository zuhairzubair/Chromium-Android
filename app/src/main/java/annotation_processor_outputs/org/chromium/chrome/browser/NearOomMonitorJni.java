package org.chromium.chrome.browser;

import J.N;
import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class NearOomMonitorJni implements NearOomMonitor.Natives {
  private static NearOomMonitor.Natives testInstance;

  public static final JniStaticTestMocker<NearOomMonitor.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.NearOomMonitor.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(org.chromium.chrome.browser.NearOomMonitor.Natives instance) {
      if (!J.N.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void onLowMemory(long nativeNearOomMonitor, NearOomMonitor caller) {
    N.MvDhdpTR(nativeNearOomMonitor, caller);
  }

  public static NearOomMonitor.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.NearOomMonitor.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new NearOomMonitorJni();
  }
}
