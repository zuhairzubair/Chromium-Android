package org.chromium.chrome.browser;

import J.N;
import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.chrome.browser.profiles.Profile;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class WarmupManagerJni implements WarmupManager.Natives {
  private static WarmupManager.Natives testInstance;

  public static final JniStaticTestMocker<WarmupManager.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.WarmupManager.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(org.chromium.chrome.browser.WarmupManager.Natives instance) {
      if (!J.N.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void startPreconnectPredictorInitialization(Profile profile) {
    N.MejOrYY2(profile);
  }

  @Override
  public void preconnectUrlAndSubresources(Profile profile, String url) {
    N.Mw6Ub3GC(profile, url);
  }

  @Override
  public void warmupSpareRenderer(Profile profile) {
    N.M8gRDwVJ(profile);
  }

  public static WarmupManager.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.WarmupManager.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new WarmupManagerJni();
  }
}
