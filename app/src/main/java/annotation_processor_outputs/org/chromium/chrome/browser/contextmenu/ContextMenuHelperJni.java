package org.chromium.chrome.browser.contextmenu;

import J.N;
import android.graphics.Bitmap;
import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.Callback;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class ContextMenuHelperJni implements ContextMenuHelper.Natives {
  private static ContextMenuHelper.Natives testInstance;

  public static final JniStaticTestMocker<ContextMenuHelper.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.contextmenu.ContextMenuHelper.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.contextmenu.ContextMenuHelper.Natives instance) {
      if (!J.N.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void onStartDownload(long nativeContextMenuHelper, ContextMenuHelper caller,
      boolean isLink, boolean isDataReductionProxyEnabled) {
    N.MLHVy1fT(nativeContextMenuHelper, caller, isLink, isDataReductionProxyEnabled);
  }

  @Override
  public void searchForImage(long nativeContextMenuHelper, ContextMenuHelper caller) {
    N.MgBIqwFU(nativeContextMenuHelper, caller);
  }

  @Override
  public void retrieveImageForShare(long nativeContextMenuHelper, ContextMenuHelper caller,
      Callback<byte[]> callback, int maxWidthPx, int maxHeightPx) {
    N.MzTG3l9H(nativeContextMenuHelper, caller, callback, maxWidthPx, maxHeightPx);
  }

  @Override
  public void retrieveImageForContextMenu(long nativeContextMenuHelper, ContextMenuHelper caller,
      Callback<Bitmap> callback, int maxWidthPx, int maxHeightPx) {
    N.MOGUBTs4(nativeContextMenuHelper, caller, callback, maxWidthPx, maxHeightPx);
  }

  @Override
  public void onContextMenuClosed(long nativeContextMenuHelper, ContextMenuHelper caller) {
    N.McrcWTzG(nativeContextMenuHelper, caller);
  }

  public static ContextMenuHelper.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.contextmenu.ContextMenuHelper.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new ContextMenuHelperJni();
  }
}
