package org.chromium.chrome.browser.permissions;

import J.N;
import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class PermissionDialogDelegateJni implements PermissionDialogDelegate.Natives {
  private static PermissionDialogDelegate.Natives testInstance;

  public static final JniStaticTestMocker<PermissionDialogDelegate.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.permissions.PermissionDialogDelegate.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.permissions.PermissionDialogDelegate.Natives instance) {
      if (!J.N.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void accept(long nativePermissionDialogDelegate, PermissionDialogDelegate caller) {
    N.MFuPdQCS(nativePermissionDialogDelegate, caller);
  }

  @Override
  public void cancel(long nativePermissionDialogDelegate, PermissionDialogDelegate caller) {
    N.MIzxYZSI(nativePermissionDialogDelegate, caller);
  }

  @Override
  public void dismissed(long nativePermissionDialogDelegate, PermissionDialogDelegate caller) {
    N.MxsYC4x9(nativePermissionDialogDelegate, caller);
  }

  @Override
  public void destroy(long nativePermissionDialogDelegate, PermissionDialogDelegate caller) {
    N.M5wo6e1K(nativePermissionDialogDelegate, caller);
  }

  public static PermissionDialogDelegate.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.permissions.PermissionDialogDelegate.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new PermissionDialogDelegateJni();
  }
}
