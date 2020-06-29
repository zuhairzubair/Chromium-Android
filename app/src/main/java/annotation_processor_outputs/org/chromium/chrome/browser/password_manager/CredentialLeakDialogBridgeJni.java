package org.chromium.chrome.browser.password_manager;

import J.N;
import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class CredentialLeakDialogBridgeJni implements CredentialLeakDialogBridge.Natives {
  private static CredentialLeakDialogBridge.Natives testInstance;

  public static final JniStaticTestMocker<CredentialLeakDialogBridge.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.password_manager.CredentialLeakDialogBridge.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.password_manager.CredentialLeakDialogBridge.Natives instance) {
      if (!J.N.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void accepted(long nativeCredentialLeakDialogViewAndroid,
      CredentialLeakDialogBridge caller) {
    N.Mmumo5h_(nativeCredentialLeakDialogViewAndroid, caller);
  }

  @Override
  public void cancelled(long nativeCredentialLeakDialogViewAndroid,
      CredentialLeakDialogBridge caller) {
    N.M2h75In5(nativeCredentialLeakDialogViewAndroid, caller);
  }

  @Override
  public void closed(long nativeCredentialLeakDialogViewAndroid,
      CredentialLeakDialogBridge caller) {
    N.MEu0f3Ks(nativeCredentialLeakDialogViewAndroid, caller);
  }

  public static CredentialLeakDialogBridge.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.password_manager.CredentialLeakDialogBridge.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new CredentialLeakDialogBridgeJni();
  }
}
