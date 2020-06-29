package org.chromium.chrome.browser.device_dialog;

import J.N;
import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class UsbChooserDialogJni implements UsbChooserDialog.Natives {
  private static UsbChooserDialog.Natives testInstance;

  public static final JniStaticTestMocker<UsbChooserDialog.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.device_dialog.UsbChooserDialog.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.device_dialog.UsbChooserDialog.Natives instance) {
      if (!J.N.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void onItemSelected(long nativeUsbChooserDialogAndroid, String deviceId) {
    N.M8m3iwzV(nativeUsbChooserDialogAndroid, deviceId);
  }

  @Override
  public void onDialogCancelled(long nativeUsbChooserDialogAndroid) {
    N.MyQOumx4(nativeUsbChooserDialogAndroid);
  }

  @Override
  public void loadUsbHelpPage(long nativeUsbChooserDialogAndroid) {
    N.M0RyTBvz(nativeUsbChooserDialogAndroid);
  }

  public static UsbChooserDialog.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.device_dialog.UsbChooserDialog.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new UsbChooserDialogJni();
  }
}
