package org.chromium.chrome.browser.dom_distiller;

import J.N;
import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.components.navigation_interception.InterceptNavigationDelegate;
import org.chromium.content_public.browser.WebContents;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class DomDistillerTabUtilsJni implements DomDistillerTabUtils.Natives {
  private static DomDistillerTabUtils.Natives testInstance;

  public static final JniStaticTestMocker<DomDistillerTabUtils.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.dom_distiller.DomDistillerTabUtils.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.dom_distiller.DomDistillerTabUtils.Natives instance) {
      if (!J.N.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void distillCurrentPageAndView(WebContents webContents) {
    N.MAJeztUL(webContents);
  }

  @Override
  public void distillCurrentPage(WebContents webContents) {
    N.M2whIOZH(webContents);
  }

  @Override
  public void distillAndView(WebContents sourceWebContents, WebContents destinationWebContents) {
    N.MwpZ4nY4(sourceWebContents, destinationWebContents);
  }

  @Override
  public String getFormattedUrlFromOriginalDistillerUrl(String url) {
    return (String)N.M5yzUycr(url);
  }

  @Override
  public int getDistillerHeuristics() {
    return (int)N.MWpdTnYb();
  }

  @Override
  public void setInterceptNavigationDelegate(InterceptNavigationDelegate delegate,
      WebContents webContents) {
    N.MEwGhN3r(delegate, webContents);
  }

  public static DomDistillerTabUtils.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.dom_distiller.DomDistillerTabUtils.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new DomDistillerTabUtilsJni();
  }
}
