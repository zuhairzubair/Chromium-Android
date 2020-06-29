package org.chromium.chrome.browser.vr;

import J.N;
import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class ArCoreInstallUtilsJni implements ArCoreInstallUtils.ArInstallHelperNative {
  private static ArCoreInstallUtils.ArInstallHelperNative testInstance;

  public static final JniStaticTestMocker<ArCoreInstallUtils.ArInstallHelperNative> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.vr.ArCoreInstallUtils.ArInstallHelperNative>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.vr.ArCoreInstallUtils.ArInstallHelperNative instance) {
      if (!J.N.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void onRequestInstallSupportedArCoreResult(long nativeArCoreInstallHelper,
      boolean success) {
    N.MuJDjBBE(nativeArCoreInstallHelper, success);
  }

  @Override
  public void installArCoreDeviceProviderFactory() {
    N.MX_DrqNv();
  }

  public static ArCoreInstallUtils.ArInstallHelperNative get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.vr.ArCoreInstallUtils.ArInstallHelperNative. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new ArCoreInstallUtilsJni();
  }
}
