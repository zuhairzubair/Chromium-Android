package org.chromium.chrome.browser.password_manager;

import J.N;
import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class AccountChooserDialogJni implements AccountChooserDialog.Natives {
  private static AccountChooserDialog.Natives testInstance;

  public static final JniStaticTestMocker<AccountChooserDialog.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.password_manager.AccountChooserDialog.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.password_manager.AccountChooserDialog.Natives instance) {
      if (!J.N.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void onCredentialClicked(long nativeAccountChooserDialogAndroid,
      AccountChooserDialog caller, int credentialId, boolean signinButtonClicked) {
    N.MJZem$De(nativeAccountChooserDialogAndroid, caller, credentialId, signinButtonClicked);
  }

  @Override
  public void cancelDialog(long nativeAccountChooserDialogAndroid, AccountChooserDialog caller) {
    N.M$NQU8jD(nativeAccountChooserDialogAndroid, caller);
  }

  @Override
  public void destroy(long nativeAccountChooserDialogAndroid, AccountChooserDialog caller) {
    N.M495Qln5(nativeAccountChooserDialogAndroid, caller);
  }

  @Override
  public void onLinkClicked(long nativeAccountChooserDialogAndroid, AccountChooserDialog caller) {
    N.MOFoPxaU(nativeAccountChooserDialogAndroid, caller);
  }

  public static AccountChooserDialog.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.password_manager.AccountChooserDialog.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new AccountChooserDialogJni();
  }
}
