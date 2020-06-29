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
final class BluetoothChooserDialogJni implements BluetoothChooserDialog.Natives {
  private static BluetoothChooserDialog.Natives testInstance;

  public static final JniStaticTestMocker<BluetoothChooserDialog.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.device_dialog.BluetoothChooserDialog.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.device_dialog.BluetoothChooserDialog.Natives instance) {
      if (!J.N.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void onDialogFinished(long nativeBluetoothChooserAndroid, int eventType, String deviceId) {
    N.MztfiUrN(nativeBluetoothChooserAndroid, eventType, deviceId);
  }

  @Override
  public void restartSearch(long nativeBluetoothChooserAndroid) {
    N.MvKl$XvB(nativeBluetoothChooserAndroid);
  }

  @Override
  public void showBluetoothOverviewLink(long nativeBluetoothChooserAndroid) {
    N.M$uhYebq(nativeBluetoothChooserAndroid);
  }

  @Override
  public void showBluetoothAdapterOffLink(long nativeBluetoothChooserAndroid) {
    N.MZvQXN$v(nativeBluetoothChooserAndroid);
  }

  @Override
  public void showNeedLocationPermissionLink(long nativeBluetoothChooserAndroid) {
    N.MkOkhfCA(nativeBluetoothChooserAndroid);
  }

  public static BluetoothChooserDialog.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.device_dialog.BluetoothChooserDialog.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new BluetoothChooserDialogJni();
  }
}
