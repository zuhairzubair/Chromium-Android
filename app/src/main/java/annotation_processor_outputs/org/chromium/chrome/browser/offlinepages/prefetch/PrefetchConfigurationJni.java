package org.chromium.chrome.browser.offlinepages.prefetch;

import J.N;
import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.chrome.browser.profiles.ProfileKey;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class PrefetchConfigurationJni implements PrefetchConfiguration.Natives {
  private static PrefetchConfiguration.Natives testInstance;

  public static final JniStaticTestMocker<PrefetchConfiguration.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.offlinepages.prefetch.PrefetchConfiguration.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.offlinepages.prefetch.PrefetchConfiguration.Natives instance) {
      if (!J.N.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public boolean isPrefetchingEnabled(ProfileKey key) {
    return (boolean)N.MmFeqmtn(key);
  }

  @Override
  public boolean isEnabledByServer(ProfileKey key) {
    return (boolean)N.M9WQl0ie(key);
  }

  @Override
  public boolean isForbiddenCheckDue(ProfileKey key) {
    return (boolean)N.MBbHDYGg(key);
  }

  @Override
  public boolean isEnabledByServerUnknown(ProfileKey key) {
    return (boolean)N.M94kN9ol(key);
  }

  @Override
  public void setPrefetchingEnabledInSettings(ProfileKey key, boolean enabled) {
    N.MBd5XB3K(key, enabled);
  }

  @Override
  public boolean isPrefetchingEnabledInSettings(ProfileKey key) {
    return (boolean)N.MNfhveva(key);
  }

  public static PrefetchConfiguration.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.offlinepages.prefetch.PrefetchConfiguration.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new PrefetchConfigurationJni();
  }
}
