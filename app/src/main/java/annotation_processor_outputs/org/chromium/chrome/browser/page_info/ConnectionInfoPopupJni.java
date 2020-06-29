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
final class ConnectionInfoPopupJni implements ConnectionInfoPopup.Natives {
  private static ConnectionInfoPopup.Natives testInstance;

  public static final JniStaticTestMocker<ConnectionInfoPopup.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.page_info.ConnectionInfoPopup.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.page_info.ConnectionInfoPopup.Natives instance) {
      if (!J.N.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public long init(ConnectionInfoPopup popup, WebContents webContents) {
    return (long)N.MbkP3gof(popup, webContents);
  }

  @Override
  public void destroy(long nativeConnectionInfoPopupAndroid, ConnectionInfoPopup caller) {
    N.MwIta4Az(nativeConnectionInfoPopupAndroid, caller);
  }

  @Override
  public void resetCertDecisions(long nativeConnectionInfoPopupAndroid, ConnectionInfoPopup caller,
      WebContents webContents) {
    N.MelNGyiY(nativeConnectionInfoPopupAndroid, caller, webContents);
  }

  public static ConnectionInfoPopup.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.page_info.ConnectionInfoPopup.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new ConnectionInfoPopupJni();
  }
}
