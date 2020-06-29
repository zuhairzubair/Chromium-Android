package org.chromium.chrome.browser.rappor;

import J.N;
import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class RapporServiceBridgeJni implements RapporServiceBridge.Natives {
  private static RapporServiceBridge.Natives testInstance;

  public static final JniStaticTestMocker<RapporServiceBridge.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.rappor.RapporServiceBridge.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.rappor.RapporServiceBridge.Natives instance) {
      if (!J.N.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void sampleDomainAndRegistryFromURL(String metric, String url) {
    N.MjCLWtXx(metric, url);
  }

  @Override
  public void sampleString(String metric, String sampleValue) {
    N.M9$b5Zw2(metric, sampleValue);
  }

  public static RapporServiceBridge.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.rappor.RapporServiceBridge.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new RapporServiceBridgeJni();
  }
}
