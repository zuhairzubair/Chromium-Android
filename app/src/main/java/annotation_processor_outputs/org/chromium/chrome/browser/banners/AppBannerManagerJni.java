package org.chromium.chrome.browser.banners;

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
final class AppBannerManagerJni implements AppBannerManager.Natives {
  private static AppBannerManager.Natives testInstance;

  public static final JniStaticTestMocker<AppBannerManager.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.banners.AppBannerManager.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.banners.AppBannerManager.Natives instance) {
      if (!J.N.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public int getHomescreenLanguageOption() {
    return (int)N.M6NVPSCv();
  }

  @Override
  public AppBannerManager getJavaBannerManagerForWebContents(WebContents webContents) {
    return (AppBannerManager)N.MEiNcXHa(webContents);
  }

  @Override
  public boolean onAppDetailsRetrieved(long nativeAppBannerManagerAndroid, AppBannerManager caller,
      AppData data, String title, String packageName, String imageUrl) {
    return (boolean)N.MlYoCHJm(nativeAppBannerManagerAndroid, caller, data, title, packageName, imageUrl);
  }

  @Override
  public boolean isRunningForTesting(long nativeAppBannerManagerAndroid, AppBannerManager caller) {
    return (boolean)N.MuNFQZEn(nativeAppBannerManagerAndroid, caller);
  }

  @Override
  public void setDaysAfterDismissAndIgnoreToTrigger(int dismissDays, int ignoreDays) {
    N.MqD_a44v(dismissDays, ignoreDays);
  }

  @Override
  public void setTimeDeltaForTesting(int days) {
    N.Mx88zrkd(days);
  }

  @Override
  public void setTotalEngagementToTrigger(double engagement) {
    N.MqHhUUa7(engagement);
  }

  public static AppBannerManager.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.banners.AppBannerManager.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new AppBannerManagerJni();
  }
}
