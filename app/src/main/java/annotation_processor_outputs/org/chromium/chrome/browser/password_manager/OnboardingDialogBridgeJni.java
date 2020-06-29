package org.chromium.chrome.browser.password_manager;

import J.N;
import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class OnboardingDialogBridgeJni implements OnboardingDialogBridge.Natives {
  private static OnboardingDialogBridge.Natives testInstance;

  public static final JniStaticTestMocker<OnboardingDialogBridge.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.password_manager.OnboardingDialogBridge.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.password_manager.OnboardingDialogBridge.Natives instance) {
      if (!J.N.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void onboardingAccepted(long nativeOnboardingDialogView, OnboardingDialogBridge caller) {
    N.M0BYACf2(nativeOnboardingDialogView, caller);
  }

  @Override
  public void onboardingRejected(long nativeOnboardingDialogView, OnboardingDialogBridge caller) {
    N.Mf6QB57w(nativeOnboardingDialogView, caller);
  }

  @Override
  public void onboardingAborted(long nativeOnboardingDialogView, OnboardingDialogBridge caller) {
    N.MrUERaCw(nativeOnboardingDialogView, caller);
  }

  public static OnboardingDialogBridge.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.password_manager.OnboardingDialogBridge.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new OnboardingDialogBridgeJni();
  }
}
