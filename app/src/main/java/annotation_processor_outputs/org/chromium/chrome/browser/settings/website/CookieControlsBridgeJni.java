package org.chromium.chrome.browser.settings.website;

import J.N;
import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.content_public.browser.WebContents;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class CookieControlsBridgeJni implements CookieControlsBridge.Natives {
  private static CookieControlsBridge.Natives testInstance;

  public static final JniStaticTestMocker<CookieControlsBridge.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.settings.website.CookieControlsBridge.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.settings.website.CookieControlsBridge.Natives instance) {
      if (!J.N.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public long init(CookieControlsBridge caller, WebContents webContents) {
    return (long)N.MZ1M1Tj2(caller, webContents);
  }

  @Override
  public void destroy(long nativeCookieControlsBridge, CookieControlsBridge caller) {
    N.MrG2hLLT(nativeCookieControlsBridge, caller);
  }

  public static CookieControlsBridge.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.settings.website.CookieControlsBridge.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new CookieControlsBridgeJni();
  }
}
