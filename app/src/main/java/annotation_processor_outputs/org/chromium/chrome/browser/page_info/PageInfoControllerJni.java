package org.chromium.chrome.browser.page_info;

import J.N;
import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.content_public.browser.WebContents;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class PageInfoControllerJni implements PageInfoController.Natives {
  private static PageInfoController.Natives testInstance;

  public static final JniStaticTestMocker<PageInfoController.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.page_info.PageInfoController.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.page_info.PageInfoController.Natives instance) {
      if (!J.N.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public long init(PageInfoController controller, WebContents webContents) {
    return (long)N.Mi71ivGE(controller, webContents);
  }

  @Override
  public void destroy(long nativePageInfoControllerAndroid, PageInfoController caller) {
    N.MP$mkR42(nativePageInfoControllerAndroid, caller);
  }

  @Override
  public void recordPageInfoAction(long nativePageInfoControllerAndroid, PageInfoController caller,
      int action) {
    N.MPH$pinU(nativePageInfoControllerAndroid, caller, action);
  }

  public static PageInfoController.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.page_info.PageInfoController.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new PageInfoControllerJni();
  }
}
