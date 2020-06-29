package org.chromium.chrome.browser.engagement;

import J.N;
import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.chrome.browser.profiles.Profile;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class SiteEngagementServiceJni implements SiteEngagementService.Natives {
  private static SiteEngagementService.Natives testInstance;

  public static final JniStaticTestMocker<SiteEngagementService.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.engagement.SiteEngagementService.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.engagement.SiteEngagementService.Natives instance) {
      if (!J.N.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public SiteEngagementService siteEngagementServiceForProfile(Profile profile) {
    return (SiteEngagementService)N.MUmktJOr(profile);
  }

  @Override
  public void setParamValuesForTesting() {
    N.MpfSYQzO();
  }

  @Override
  public double getScore(long nativeSiteEngagementServiceAndroid, SiteEngagementService caller,
      String url) {
    return (double)N.MvRjvDxB(nativeSiteEngagementServiceAndroid, caller, url);
  }

  @Override
  public void resetBaseScoreForURL(long nativeSiteEngagementServiceAndroid,
      SiteEngagementService caller, String url, double score) {
    N.MR4YQtEF(nativeSiteEngagementServiceAndroid, caller, url, score);
  }

  public static SiteEngagementService.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.engagement.SiteEngagementService.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new SiteEngagementServiceJni();
  }
}
