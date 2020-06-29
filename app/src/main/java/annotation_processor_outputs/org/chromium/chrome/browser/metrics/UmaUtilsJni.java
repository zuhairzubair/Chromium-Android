package org.chromium.chrome.browser.metrics;

import J.N;
import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class UmaUtilsJni implements UmaUtils.Natives {
  private static UmaUtils.Natives testInstance;

  public static final JniStaticTestMocker<UmaUtils.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.metrics.UmaUtils.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(org.chromium.chrome.browser.metrics.UmaUtils.Natives instance) {
      if (!J.N.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public boolean isClientInMetricsReportingSample() {
    return (boolean)N.MGJFzlge();
  }

  @Override
  public void recordMetricsReportingDefaultOptIn(boolean optIn) {
    N.M76Za3Tu(optIn);
  }

  public static UmaUtils.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.metrics.UmaUtils.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new UmaUtilsJni();
  }
}
