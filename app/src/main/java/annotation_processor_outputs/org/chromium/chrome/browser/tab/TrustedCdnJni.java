package org.chromium.chrome.browser.tab;

import J.N;
import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.content_public.browser.WebContents;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class TrustedCdnJni implements TrustedCdn.Natives {
  private static TrustedCdn.Natives testInstance;

  public static final JniStaticTestMocker<TrustedCdn.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.tab.TrustedCdn.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(org.chromium.chrome.browser.tab.TrustedCdn.Natives instance) {
      if (!J.N.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public long init(TrustedCdn caller) {
    return (long)N.M1Q9lmqc(caller);
  }

  @Override
  public void onDestroyed(long nativeTrustedCdn, TrustedCdn caller) {
    N.MM2LHRfv(nativeTrustedCdn, caller);
  }

  @Override
  public void setWebContents(long nativeTrustedCdn, TrustedCdn caller, WebContents webContents) {
    N.MyyZwXPU(nativeTrustedCdn, caller, webContents);
  }

  @Override
  public void resetWebContents(long nativeTrustedCdn, TrustedCdn caller) {
    N.M003oy2o(nativeTrustedCdn, caller);
  }

  public static TrustedCdn.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.tab.TrustedCdn.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new TrustedCdnJni();
  }
}
