package org.chromium.chrome.browser.instantapps;

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
final class InstantAppsSettingsJni implements InstantAppsSettings.Natives {
  private static InstantAppsSettings.Natives testInstance;

  public static final JniStaticTestMocker<InstantAppsSettings.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.instantapps.InstantAppsSettings.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.instantapps.InstantAppsSettings.Natives instance) {
      if (!J.N.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public boolean getInstantAppDefault(WebContents webContents, String url) {
    return (boolean)N.MaqKlsVX(webContents, url);
  }

  @Override
  public void setInstantAppDefault(WebContents webContents, String url) {
    N.M7d0mTmG(webContents, url);
  }

  @Override
  public boolean shouldShowBanner(WebContents webContents, String url) {
    return (boolean)N.M0gHjCEI(webContents, url);
  }

  public static InstantAppsSettings.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.instantapps.InstantAppsSettings.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new InstantAppsSettingsJni();
  }
}
