package org.chromium.chrome.browser.webapps;

import J.N;
import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.content_public.browser.WebContents;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class WebApkUpdateDataFetcherJni implements WebApkUpdateDataFetcher.Natives {
  private static WebApkUpdateDataFetcher.Natives testInstance;

  public static final JniStaticTestMocker<WebApkUpdateDataFetcher.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.webapps.WebApkUpdateDataFetcher.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.webapps.WebApkUpdateDataFetcher.Natives instance) {
      if (!J.N.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public long initialize(WebApkUpdateDataFetcher caller, String scope, String webManifestUrl) {
    return (long)N.M76SYHnX(caller, scope, webManifestUrl);
  }

  @Override
  public void replaceWebContents(long nativeWebApkUpdateDataFetcher, WebApkUpdateDataFetcher caller,
      WebContents webContents) {
    N.M_a8xBBL(nativeWebApkUpdateDataFetcher, caller, webContents);
  }

  @Override
  public void destroy(long nativeWebApkUpdateDataFetcher, WebApkUpdateDataFetcher caller) {
    N.MbkiXMEf(nativeWebApkUpdateDataFetcher, caller);
  }

  @Override
  public void start(long nativeWebApkUpdateDataFetcher, WebApkUpdateDataFetcher caller,
      WebContents webContents) {
    N.Mj3efCOU(nativeWebApkUpdateDataFetcher, caller, webContents);
  }

  public static WebApkUpdateDataFetcher.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.webapps.WebApkUpdateDataFetcher.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new WebApkUpdateDataFetcherJni();
  }
}
