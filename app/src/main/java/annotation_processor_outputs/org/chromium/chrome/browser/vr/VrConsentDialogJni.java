package org.chromium.chrome.browser.vr;

import J.N;
import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class VrConsentDialogJni implements VrConsentDialog.VrConsentUiHelper {
  private static VrConsentDialog.VrConsentUiHelper testInstance;

  public static final JniStaticTestMocker<VrConsentDialog.VrConsentUiHelper> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.vr.VrConsentDialog.VrConsentUiHelper>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.vr.VrConsentDialog.VrConsentUiHelper instance) {
      if (!J.N.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void onUserConsentResult(long nativeGvrConsentHelper, boolean allowed) {
    N.MK$BEbK1(nativeGvrConsentHelper, allowed);
  }

  public static VrConsentDialog.VrConsentUiHelper get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.vr.VrConsentDialog.VrConsentUiHelper. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new VrConsentDialogJni();
  }
}
