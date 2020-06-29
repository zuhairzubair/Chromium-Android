package org.chromium.chrome.browser;

import J.N;
import java.lang.Override;
import java.security.PrivateKey;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class SSLClientCertificateRequestJni implements SSLClientCertificateRequest.Natives {
  private static SSLClientCertificateRequest.Natives testInstance;

  public static final JniStaticTestMocker<SSLClientCertificateRequest.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.SSLClientCertificateRequest.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.SSLClientCertificateRequest.Natives instance) {
      if (!J.N.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void notifyClientCertificatesChangedOnIOThread() {
    N.MfO8s98l();
  }

  @Override
  public void onSystemRequestCompletion(long requestPtr, byte[][] certChain,
      PrivateKey privateKey) {
    N.MK6D9ZZF(requestPtr, certChain, privateKey);
  }

  public static SSLClientCertificateRequest.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.SSLClientCertificateRequest.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new SSLClientCertificateRequestJni();
  }
}
