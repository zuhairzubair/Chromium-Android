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
final class AutofillExpirationDateFixFlowBridgeJni implements AutofillExpirationDateFixFlowBridge.Natives {
  private static AutofillExpirationDateFixFlowBridge.Natives testInstance;

  public static final JniStaticTestMocker<AutofillExpirationDateFixFlowBridge.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.autofill.AutofillExpirationDateFixFlowBridge.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.autofill.AutofillExpirationDateFixFlowBridge.Natives instance) {
      if (!J.N.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void promptDismissed(long nativeCardExpirationDateFixFlowViewAndroid,
      AutofillExpirationDateFixFlowBridge caller) {
    N.MYC4Z0Ea(nativeCardExpirationDateFixFlowViewAndroid, caller);
  }

  @Override
  public void onUserAccept(long nativeCardExpirationDateFixFlowViewAndroid,
      AutofillExpirationDateFixFlowBridge caller, String month, String year) {
    N.MX7djb2r(nativeCardExpirationDateFixFlowViewAndroid, caller, month, year);
  }

  public static AutofillExpirationDateFixFlowBridge.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.autofill.AutofillExpirationDateFixFlowBridge.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new AutofillExpirationDateFixFlowBridgeJni();
  }
}
