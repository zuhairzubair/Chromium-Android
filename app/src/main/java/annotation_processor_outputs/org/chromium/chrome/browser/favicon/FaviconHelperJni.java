package org.chromium.chrome.browser.favicon;

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
final class FaviconHelperJni implements FaviconHelper.Natives {
  private static FaviconHelper.Natives testInstance;

  public static final JniStaticTestMocker<FaviconHelper.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.favicon.FaviconHelper.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.favicon.FaviconHelper.Natives instance) {
      if (!J.N.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public long init() {
    return (long)N.MbmjdWDe();
  }

  @Override
  public void destroy(long nativeFaviconHelper) {
    N.Mo1Pyu5g(nativeFaviconHelper);
  }

  @Override
  public boolean getLocalFaviconImageForURL(long nativeFaviconHelper, Profile profile,
      String pageUrl, int desiredSizeInDip,
      FaviconHelper.FaviconImageCallback faviconImageCallback) {
    return (boolean)N.Mju$gqQ$(nativeFaviconHelper, profile, pageUrl, desiredSizeInDip, faviconImageCallback);
  }

  @Override
  public boolean getForeignFaviconImageForURL(long nativeFaviconHelper, Profile profile,
      String pageUrl, int desiredSizeInDip,
      FaviconHelper.FaviconImageCallback faviconImageCallback) {
    return (boolean)N.M41qXBFp(nativeFaviconHelper, profile, pageUrl, desiredSizeInDip, faviconImageCallback);
  }

  @Override
  public void ensureIconIsAvailable(long nativeFaviconHelper, Profile profile,
      WebContents webContents, String pageUrl, String iconUrl, boolean isLargeIcon,
      FaviconHelper.IconAvailabilityCallback callback) {
    N.MQ8wMkRr(nativeFaviconHelper, profile, webContents, pageUrl, iconUrl, isLargeIcon, callback);
  }

  @Override
  public void touchOnDemandFavicon(long nativeFaviconHelper, Profile profile, String iconUrl) {
    N.MhQ8CAFh(nativeFaviconHelper, profile, iconUrl);
  }

  public static FaviconHelper.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.favicon.FaviconHelper.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new FaviconHelperJni();
  }
}
