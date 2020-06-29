package org.chromium.chrome.browser.prerender;

import J.N;
import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.content_public.browser.WebContents;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class ExternalPrerenderHandlerJni implements ExternalPrerenderHandler.Natives {
  private static ExternalPrerenderHandler.Natives testInstance;

  public static final JniStaticTestMocker<ExternalPrerenderHandler.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.prerender.ExternalPrerenderHandler.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.prerender.ExternalPrerenderHandler.Natives instance) {
      if (!J.N.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public long init() {
    return (long)N.M6F90ItB();
  }

  @Override
  public WebContents addPrerender(long nativeExternalPrerenderHandlerAndroid, Profile profile,
      WebContents webContents, String url, String referrer, int top, int left, int bottom,
      int right, boolean prerenderOnCellular) {
    return (WebContents)N.Mh5pqfSa(nativeExternalPrerenderHandlerAndroid, profile, webContents, url, referrer, top, left, bottom, right, prerenderOnCellular);
  }

  @Override
  public boolean hasPrerenderedUrl(Profile profile, String url, WebContents webContents) {
    return (boolean)N.MyjCxA0g(profile, url, webContents);
  }

  @Override
  public void cancelCurrentPrerender(long nativeExternalPrerenderHandlerAndroid) {
    N.MvfjJxSd(nativeExternalPrerenderHandlerAndroid);
  }

  @Override
  public boolean hasRecentlyPrefetchedUrlForTesting(Profile profile, String url) {
    return (boolean)N.MEvvTupk(profile, url);
  }

  @Override
  public void clearPrefetchInformationForTesting(Profile profile) {
    N.M7RTjayo(profile);
  }

  public static ExternalPrerenderHandler.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.prerender.ExternalPrerenderHandler.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new ExternalPrerenderHandlerJni();
  }
}
