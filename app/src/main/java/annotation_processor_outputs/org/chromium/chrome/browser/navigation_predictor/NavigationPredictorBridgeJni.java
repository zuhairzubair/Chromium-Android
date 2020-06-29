package org.chromium.chrome.browser.navigation_predictor;

import J.N;
import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class NavigationPredictorBridgeJni implements NavigationPredictorBridge.Natives {
  private static NavigationPredictorBridge.Natives testInstance;

  public static final JniStaticTestMocker<NavigationPredictorBridge.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.navigation_predictor.NavigationPredictorBridge.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.navigation_predictor.NavigationPredictorBridge.Natives instance) {
      if (!J.N.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void onActivityWarmResumed() {
    N.M2$lKost();
  }

  @Override
  public void onColdStart() {
    N.M8Splr0_();
  }

  @Override
  public void onPause() {
    N.MnSIHeV3();
  }

  public static NavigationPredictorBridge.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.navigation_predictor.NavigationPredictorBridge.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new NavigationPredictorBridgeJni();
  }
}
