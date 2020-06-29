package org.chromium.chrome.browser.tab;

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
final class TabWebContentsDelegateAndroidJni implements TabWebContentsDelegateAndroid.Natives {
  private static TabWebContentsDelegateAndroid.Natives testInstance;

  public static final JniStaticTestMocker<TabWebContentsDelegateAndroid.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.tab.TabWebContentsDelegateAndroid.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.tab.TabWebContentsDelegateAndroid.Natives instance) {
      if (!J.N.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void onRendererUnresponsive(WebContents webContents) {
    N.MGGpKzhA(webContents);
  }

  @Override
  public void onRendererResponsive(WebContents webContents) {
    N.MiIsudS0(webContents);
  }

  @Override
  public void showFramebustBlockInfoBar(WebContents webContents, String url) {
    N.MSMgW87y(webContents, url);
  }

  public static TabWebContentsDelegateAndroid.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.tab.TabWebContentsDelegateAndroid.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new TabWebContentsDelegateAndroidJni();
  }
}
