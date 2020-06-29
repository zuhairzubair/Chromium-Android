package org.chromium.chrome.browser.infobar;

import J.N;
import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.chrome.browser.instantapps.InstantAppsBannerData;
import org.chromium.content_public.browser.WebContents;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class InstantAppsInfoBarDelegateJni implements InstantAppsInfoBarDelegate.Natives {
  private static InstantAppsInfoBarDelegate.Natives testInstance;

  public static final JniStaticTestMocker<InstantAppsInfoBarDelegate.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.infobar.InstantAppsInfoBarDelegate.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.infobar.InstantAppsInfoBarDelegate.Natives instance) {
      if (!J.N.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void launch(WebContents webContents, InstantAppsBannerData data, String url,
      boolean instantAppIsDefault) {
    N.MWjsnbGf(webContents, data, url, instantAppIsDefault);
  }

  public static InstantAppsInfoBarDelegate.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.infobar.InstantAppsInfoBarDelegate.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new InstantAppsInfoBarDelegateJni();
  }
}
