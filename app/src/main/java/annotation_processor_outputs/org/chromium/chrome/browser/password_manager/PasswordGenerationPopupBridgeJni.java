package org.chromium.chrome.browser.password_manager;

import J.N;
import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class PasswordGenerationPopupBridgeJni implements PasswordGenerationPopupBridge.Natives {
  private static PasswordGenerationPopupBridge.Natives testInstance;

  public static final JniStaticTestMocker<PasswordGenerationPopupBridge.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.password_manager.PasswordGenerationPopupBridge.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.password_manager.PasswordGenerationPopupBridge.Natives instance) {
      if (!J.N.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void dismissed(long nativePasswordGenerationEditingPopupViewAndroid,
      PasswordGenerationPopupBridge caller) {
    N.M6qXk$DQ(nativePasswordGenerationEditingPopupViewAndroid, caller);
  }

  public static PasswordGenerationPopupBridge.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.password_manager.PasswordGenerationPopupBridge.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new PasswordGenerationPopupBridgeJni();
  }
}
