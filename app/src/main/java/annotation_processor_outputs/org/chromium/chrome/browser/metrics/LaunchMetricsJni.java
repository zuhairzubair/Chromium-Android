package org.chromium.chrome.browser.metrics;

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
final class LaunchMetricsJni implements LaunchMetrics.Natives {
  private static LaunchMetrics.Natives testInstance;

  public static final JniStaticTestMocker<LaunchMetrics.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.metrics.LaunchMetrics.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.metrics.LaunchMetrics.Natives instance) {
      if (!J.N.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void recordLaunch(boolean isShortcut, String url, int source, int displayMode,
      WebContents webContents) {
    N.M7MirFey(isShortcut, url, source, displayMode, webContents);
  }

  @Override
  public void recordHomePageLaunchMetrics(boolean showHomeButton, boolean homepageIsNtp,
      String homepageUrl) {
    N.M7xe7yjp(showHomeButton, homepageIsNtp, homepageUrl);
  }

  public static LaunchMetrics.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.metrics.LaunchMetrics.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new LaunchMetricsJni();
  }
}
