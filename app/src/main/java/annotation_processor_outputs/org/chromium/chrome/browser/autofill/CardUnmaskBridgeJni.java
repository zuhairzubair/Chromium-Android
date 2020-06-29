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
final class CardUnmaskBridgeJni implements CardUnmaskBridge.Natives {
  private static CardUnmaskBridge.Natives testInstance;

  public static final JniStaticTestMocker<CardUnmaskBridge.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.autofill.CardUnmaskBridge.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.autofill.CardUnmaskBridge.Natives instance) {
      if (!J.N.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void promptDismissed(long nativeCardUnmaskPromptViewAndroid, CardUnmaskBridge caller) {
    N.Mek0Fv7c(nativeCardUnmaskPromptViewAndroid, caller);
  }

  @Override
  public boolean checkUserInputValidity(long nativeCardUnmaskPromptViewAndroid,
      CardUnmaskBridge caller, String userResponse) {
    return (boolean)N.MRcUBmjo(nativeCardUnmaskPromptViewAndroid, caller, userResponse);
  }

  @Override
  public void onUserInput(long nativeCardUnmaskPromptViewAndroid, CardUnmaskBridge caller,
      String cvc, String month, String year, boolean shouldStoreLocally, boolean enableFidoAuth) {
    N.McBOMUil(nativeCardUnmaskPromptViewAndroid, caller, cvc, month, year, shouldStoreLocally, enableFidoAuth);
  }

  @Override
  public void onNewCardLinkClicked(long nativeCardUnmaskPromptViewAndroid,
      CardUnmaskBridge caller) {
    N.Mxa$aTDN(nativeCardUnmaskPromptViewAndroid, caller);
  }

  @Override
  public int getExpectedCvcLength(long nativeCardUnmaskPromptViewAndroid, CardUnmaskBridge caller) {
    return (int)N.Mu0etYO0(nativeCardUnmaskPromptViewAndroid, caller);
  }

  public static CardUnmaskBridge.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.autofill.CardUnmaskBridge.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new CardUnmaskBridgeJni();
  }
}
