package org.chromium.chrome.browser.infobar;

import J.N;
import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.chrome.browser.download.DownloadInfoBarController;
import org.chromium.chrome.browser.tab.Tab;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class DownloadProgressInfoBarJni implements DownloadProgressInfoBar.Natives {
  private static DownloadProgressInfoBar.Natives testInstance;

  public static final JniStaticTestMocker<DownloadProgressInfoBar.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.infobar.DownloadProgressInfoBar.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.infobar.DownloadProgressInfoBar.Natives instance) {
      if (!J.N.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void create(DownloadProgressInfoBar.Client client, Tab tab,
      DownloadInfoBarController.DownloadProgressInfoBarData info) {
    N.Mk8VgAr8(client, tab, info);
  }

  @Override
  public Tab getTab(long nativeDownloadProgressInfoBar, DownloadProgressInfoBar caller) {
    return (Tab)N.Mv$tV_xY(nativeDownloadProgressInfoBar, caller);
  }

  public static DownloadProgressInfoBar.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.infobar.DownloadProgressInfoBar.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new DownloadProgressInfoBarJni();
  }
}
