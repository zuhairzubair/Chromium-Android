package org.chromium.chrome.browser.infobar;

import J.N;
import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.content_public.browser.WebContents;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class DataReductionPromoInfoBarDelegateJni implements DataReductionPromoInfoBarDelegate.Natives {
  private static DataReductionPromoInfoBarDelegate.Natives testInstance;

  public static final JniStaticTestMocker<DataReductionPromoInfoBarDelegate.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.infobar.DataReductionPromoInfoBarDelegate.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.infobar.DataReductionPromoInfoBarDelegate.Natives instance) {
      if (!J.N.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void launch(WebContents webContents) {
    N.MtlSrB_p(webContents);
  }

  public static DataReductionPromoInfoBarDelegate.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.infobar.DataReductionPromoInfoBarDelegate.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new DataReductionPromoInfoBarDelegateJni();
  }
}
