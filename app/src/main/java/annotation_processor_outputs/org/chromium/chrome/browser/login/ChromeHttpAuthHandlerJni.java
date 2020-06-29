package org.chromium.chrome.browser.login;

import J.N;
import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class ChromeHttpAuthHandlerJni implements ChromeHttpAuthHandler.Natives {
  private static ChromeHttpAuthHandler.Natives testInstance;

  public static final JniStaticTestMocker<ChromeHttpAuthHandler.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.login.ChromeHttpAuthHandler.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.login.ChromeHttpAuthHandler.Natives instance) {
      if (!J.N.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void setAuth(long nativeChromeHttpAuthHandler, ChromeHttpAuthHandler caller,
      String username, String password) {
    N.MAMBiVB$(nativeChromeHttpAuthHandler, caller, username, password);
  }

  @Override
  public void cancelAuth(long nativeChromeHttpAuthHandler, ChromeHttpAuthHandler caller) {
    N.MbTC7yfl(nativeChromeHttpAuthHandler, caller);
  }

  @Override
  public String getMessageBody(long nativeChromeHttpAuthHandler, ChromeHttpAuthHandler caller) {
    return (String)N.MDNVFLnS(nativeChromeHttpAuthHandler, caller);
  }

  public static ChromeHttpAuthHandler.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.login.ChromeHttpAuthHandler.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new ChromeHttpAuthHandlerJni();
  }
}
