package org.chromium.chrome.browser.password_manager;

import J.N;
import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class PasswordGenerationDialogBridgeJni implements PasswordGenerationDialogBridge.Natives {
  private static PasswordGenerationDialogBridge.Natives testInstance;

  public static final JniStaticTestMocker<PasswordGenerationDialogBridge.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.password_manager.PasswordGenerationDialogBridge.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.password_manager.PasswordGenerationDialogBridge.Natives instance) {
      if (!J.N.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void passwordAccepted(long nativePasswordGenerationDialogViewAndroid,
      PasswordGenerationDialogBridge caller, String generatedPassword) {
    N.M1W3B6UT(nativePasswordGenerationDialogViewAndroid, caller, generatedPassword);
  }

  @Override
  public void passwordRejected(long nativePasswordGenerationDialogViewAndroid,
      PasswordGenerationDialogBridge caller) {
    N.Ml5BeqqW(nativePasswordGenerationDialogViewAndroid, caller);
  }

  public static PasswordGenerationDialogBridge.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.password_manager.PasswordGenerationDialogBridge.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new PasswordGenerationDialogBridgeJni();
  }
}
