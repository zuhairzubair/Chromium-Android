package org.chromium.chrome.browser.password_manager;

import J.N;
import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class AutoSigninFirstRunDialogJni implements AutoSigninFirstRunDialog.Natives {
  private static AutoSigninFirstRunDialog.Natives testInstance;

  public static final JniStaticTestMocker<AutoSigninFirstRunDialog.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.password_manager.AutoSigninFirstRunDialog.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.password_manager.AutoSigninFirstRunDialog.Natives instance) {
      if (!J.N.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void onTurnOffClicked(long nativeAutoSigninFirstRunDialogAndroid,
      AutoSigninFirstRunDialog caller) {
    N.MNvg9$ZU(nativeAutoSigninFirstRunDialogAndroid, caller);
  }

  @Override
  public void onOkClicked(long nativeAutoSigninFirstRunDialogAndroid,
      AutoSigninFirstRunDialog caller) {
    N.MV90asHX(nativeAutoSigninFirstRunDialogAndroid, caller);
  }

  @Override
  public void destroy(long nativeAutoSigninFirstRunDialogAndroid, AutoSigninFirstRunDialog caller) {
    N.MTjiTA74(nativeAutoSigninFirstRunDialogAndroid, caller);
  }

  @Override
  public void onLinkClicked(long nativeAutoSigninFirstRunDialogAndroid,
      AutoSigninFirstRunDialog caller) {
    N.MQjsefF9(nativeAutoSigninFirstRunDialogAndroid, caller);
  }

  public static AutoSigninFirstRunDialog.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.password_manager.AutoSigninFirstRunDialog.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new AutoSigninFirstRunDialogJni();
  }
}
