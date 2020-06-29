package org.chromium.chrome.browser.autofill;

import J.N;
import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class CreditCardScannerBridgeJni implements CreditCardScannerBridge.Natives {
  private static CreditCardScannerBridge.Natives testInstance;

  public static final JniStaticTestMocker<CreditCardScannerBridge.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.autofill.CreditCardScannerBridge.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.autofill.CreditCardScannerBridge.Natives instance) {
      if (!J.N.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void scanCancelled(long nativeCreditCardScannerViewAndroid,
      CreditCardScannerBridge caller) {
    N.MzlSwhwH(nativeCreditCardScannerViewAndroid, caller);
  }

  @Override
  public void scanCompleted(long nativeCreditCardScannerViewAndroid, CreditCardScannerBridge caller,
      String cardHolderName, String cardNumber, int expirationMonth, int expirationYear) {
    N.Md35y73f(nativeCreditCardScannerViewAndroid, caller, cardHolderName, cardNumber, expirationMonth, expirationYear);
  }

  public static CreditCardScannerBridge.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.autofill.CreditCardScannerBridge.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new CreditCardScannerBridgeJni();
  }
}
