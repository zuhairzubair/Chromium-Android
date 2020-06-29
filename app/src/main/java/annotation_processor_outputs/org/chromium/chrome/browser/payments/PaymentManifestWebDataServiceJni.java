package org.chromium.chrome.browser.payments;

import J.N;
import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.components.payments.WebAppManifestSection;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class PaymentManifestWebDataServiceJni implements PaymentManifestWebDataService.Natives {
  private static PaymentManifestWebDataService.Natives testInstance;

  public static final JniStaticTestMocker<PaymentManifestWebDataService.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.payments.PaymentManifestWebDataService.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.payments.PaymentManifestWebDataService.Natives instance) {
      if (!J.N.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public long init(PaymentManifestWebDataService caller) {
    return (long)N.M9X__o$R(caller);
  }

  @Override
  public void destroy(long nativePaymentManifestWebDataServiceAndroid,
      PaymentManifestWebDataService caller) {
    N.MX7AwTCa(nativePaymentManifestWebDataServiceAndroid, caller);
  }

  @Override
  public boolean getPaymentMethodManifest(long nativePaymentManifestWebDataServiceAndroid,
      PaymentManifestWebDataService caller, String methodName,
      PaymentManifestWebDataService.PaymentManifestWebDataServiceCallback callback) {
    return (boolean)N.M8p9RlSH(nativePaymentManifestWebDataServiceAndroid, caller, methodName, callback);
  }

  @Override
  public boolean getPaymentWebAppManifest(long nativePaymentManifestWebDataServiceAndroid,
      PaymentManifestWebDataService caller, String appPackageName,
      PaymentManifestWebDataService.PaymentManifestWebDataServiceCallback callback) {
    return (boolean)N.MRdDiZyv(nativePaymentManifestWebDataServiceAndroid, caller, appPackageName, callback);
  }

  @Override
  public void addPaymentMethodManifest(long nativePaymentManifestWebDataServiceAndroid,
      PaymentManifestWebDataService caller, String methodName, String[] appPackageNames) {
    N.MKb_1VDz(nativePaymentManifestWebDataServiceAndroid, caller, methodName, appPackageNames);
  }

  @Override
  public void addPaymentWebAppManifest(long nativePaymentManifestWebDataServiceAndroid,
      PaymentManifestWebDataService caller, WebAppManifestSection[] manifest) {
    N.MrEdT70Z(nativePaymentManifestWebDataServiceAndroid, caller, manifest);
  }

  public static PaymentManifestWebDataService.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.payments.PaymentManifestWebDataService.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new PaymentManifestWebDataServiceJni();
  }
}
