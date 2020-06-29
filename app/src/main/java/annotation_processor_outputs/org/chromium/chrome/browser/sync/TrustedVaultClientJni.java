package org.chromium.chrome.browser.sync;

import J.N;
import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class TrustedVaultClientJni implements TrustedVaultClient.Natives {
  private static TrustedVaultClient.Natives testInstance;

  public static final JniStaticTestMocker<TrustedVaultClient.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.sync.TrustedVaultClient.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.sync.TrustedVaultClient.Natives instance) {
      if (!J.N.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void fetchKeysCompleted(long nativeTrustedVaultClientAndroid, String gaiaId,
      byte[][] keys) {
    N.M0S8oNZH(nativeTrustedVaultClientAndroid, gaiaId, keys);
  }

  @Override
  public void markKeysAsStaleCompleted(long nativeTrustedVaultClientAndroid, boolean result) {
    N.M7rNqXkX(nativeTrustedVaultClientAndroid, result);
  }

  @Override
  public void notifyKeysChanged(long nativeTrustedVaultClientAndroid) {
    N.MlSGBpm_(nativeTrustedVaultClientAndroid);
  }

  public static TrustedVaultClient.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.sync.TrustedVaultClient.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new TrustedVaultClientJni();
  }
}
