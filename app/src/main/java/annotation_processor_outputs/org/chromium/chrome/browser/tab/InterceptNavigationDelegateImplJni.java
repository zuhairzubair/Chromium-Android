package org.chromium.chrome.browser.tab;

import J.N;
import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.content_public.browser.WebContents;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class InterceptNavigationDelegateImplJni implements InterceptNavigationDelegateImpl.Natives {
  private static InterceptNavigationDelegateImpl.Natives testInstance;

  public static final JniStaticTestMocker<InterceptNavigationDelegateImpl.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.tab.InterceptNavigationDelegateImpl.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.tab.InterceptNavigationDelegateImpl.Natives instance) {
      if (!J.N.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void associateWithWebContents(
      InterceptNavigationDelegateImpl nativeInterceptNavigationDelegateImpl,
      WebContents webContents) {
    N.M9qsb5XW(nativeInterceptNavigationDelegateImpl, webContents);
  }

  public static InterceptNavigationDelegateImpl.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.tab.InterceptNavigationDelegateImpl.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new InterceptNavigationDelegateImplJni();
  }
}
