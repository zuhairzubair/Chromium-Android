package org.chromium.chrome.browser.download;

import J.N;
import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class DownloadLocationDialogBridgeJni implements DownloadLocationDialogBridge.Natives {
  private static DownloadLocationDialogBridge.Natives testInstance;

  public static final JniStaticTestMocker<DownloadLocationDialogBridge.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.download.DownloadLocationDialogBridge.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.download.DownloadLocationDialogBridge.Natives instance) {
      if (!J.N.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void onComplete(long nativeDownloadLocationDialogBridge,
      DownloadLocationDialogBridge caller, String returnedPath) {
    N.M20MP4SB(nativeDownloadLocationDialogBridge, caller, returnedPath);
  }

  @Override
  public void onCanceled(long nativeDownloadLocationDialogBridge,
      DownloadLocationDialogBridge caller) {
    N.MFRgsyUw(nativeDownloadLocationDialogBridge, caller);
  }

  @Override
  public String getDownloadDefaultDirectory() {
    return (String)N.MgPdlo6f();
  }

  @Override
  public void setDownloadAndSaveFileDefaultDirectory(String directory) {
    N.M85_ACgi(directory);
  }

  public static DownloadLocationDialogBridge.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.download.DownloadLocationDialogBridge.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new DownloadLocationDialogBridgeJni();
  }
}
