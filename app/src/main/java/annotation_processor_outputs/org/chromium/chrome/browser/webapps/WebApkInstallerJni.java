package org.chromium.chrome.browser.webapps;

import J.N;
import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class WebApkInstallerJni implements WebApkInstaller.Natives {
  private static WebApkInstaller.Natives testInstance;

  public static final JniStaticTestMocker<WebApkInstaller.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.webapps.WebApkInstaller.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.webapps.WebApkInstaller.Natives instance) {
      if (!J.N.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void onInstallFinished(long nativeWebApkInstaller, WebApkInstaller caller, int result) {
    N.MQ3SBZxh(nativeWebApkInstaller, caller, result);
  }

  @Override
  public void onGotSpaceStatus(long nativeWebApkInstaller, WebApkInstaller caller, int status) {
    N.Mz0ZUPry(nativeWebApkInstaller, caller, status);
  }

  public static WebApkInstaller.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.webapps.WebApkInstaller.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new WebApkInstallerJni();
  }
}
