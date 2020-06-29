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
final class AutofillNameFixFlowBridgeJni implements AutofillNameFixFlowBridge.Natives {
  private static AutofillNameFixFlowBridge.Natives testInstance;

  public static final JniStaticTestMocker<AutofillNameFixFlowBridge.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.autofill.AutofillNameFixFlowBridge.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.autofill.AutofillNameFixFlowBridge.Natives instance) {
      if (!J.N.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void promptDismissed(long nativeCardNameFixFlowViewAndroid,
      AutofillNameFixFlowBridge caller) {
    N.MriHT7LJ(nativeCardNameFixFlowViewAndroid, caller);
  }

  @Override
  public void onUserAccept(long nativeCardNameFixFlowViewAndroid, AutofillNameFixFlowBridge caller,
      String name) {
    N.MW86M3Ok(nativeCardNameFixFlowViewAndroid, caller, name);
  }

  public static AutofillNameFixFlowBridge.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.autofill.AutofillNameFixFlowBridge.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new AutofillNameFixFlowBridgeJni();
  }
}
