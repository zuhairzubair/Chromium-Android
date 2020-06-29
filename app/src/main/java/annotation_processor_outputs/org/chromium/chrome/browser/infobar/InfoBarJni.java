package org.chromium.chrome.browser.infobar;

import J.N;
import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class InfoBarJni implements InfoBar.Natives {
  private static InfoBar.Natives testInstance;

  public static final JniStaticTestMocker<InfoBar.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.infobar.InfoBar.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(org.chromium.chrome.browser.infobar.InfoBar.Natives instance) {
      if (!J.N.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public int getInfoBarIdentifier(long nativeInfoBarAndroid, InfoBar caller) {
    return (int)N.MfsFPc2F(nativeInfoBarAndroid, caller);
  }

  @Override
  public void onLinkClicked(long nativeInfoBarAndroid, InfoBar caller) {
    N.MKU1DDSu(nativeInfoBarAndroid, caller);
  }

  @Override
  public void onButtonClicked(long nativeInfoBarAndroid, InfoBar caller, int action) {
    N.MIi8S4CA(nativeInfoBarAndroid, caller, action);
  }

  @Override
  public void onCloseButtonClicked(long nativeInfoBarAndroid, InfoBar caller) {
    N.MlP0Xunk(nativeInfoBarAndroid, caller);
  }

  public static InfoBar.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.infobar.InfoBar.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new InfoBarJni();
  }
}
