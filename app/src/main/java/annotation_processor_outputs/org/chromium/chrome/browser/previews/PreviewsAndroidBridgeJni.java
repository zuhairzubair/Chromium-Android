package org.chromium.chrome.browser.previews;

import J.N;
import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.content_public.browser.WebContents;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class PreviewsAndroidBridgeJni implements PreviewsAndroidBridge.Natives {
  private static PreviewsAndroidBridge.Natives testInstance;

  public static final JniStaticTestMocker<PreviewsAndroidBridge.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.previews.PreviewsAndroidBridge.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.previews.PreviewsAndroidBridge.Natives instance) {
      if (!J.N.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public long init(PreviewsAndroidBridge caller) {
    return (long)N.MZa4o8Eq(caller);
  }

  @Override
  public boolean shouldShowPreviewUI(long nativePreviewsAndroidBridge, PreviewsAndroidBridge caller,
      WebContents webContents) {
    return (boolean)N.MMwFZLsG(nativePreviewsAndroidBridge, caller, webContents);
  }

  @Override
  public String getLitePageRedirectOriginalURL(long nativePreviewsAndroidBridge,
      PreviewsAndroidBridge caller, String visibleURL) {
    return (String)N.Md_CUDy6(nativePreviewsAndroidBridge, caller, visibleURL);
  }

  @Override
  public String getStalePreviewTimestamp(long nativePreviewsAndroidBridge,
      PreviewsAndroidBridge caller, WebContents webContents) {
    return (String)N.MLFrTUbq(nativePreviewsAndroidBridge, caller, webContents);
  }

  @Override
  public void loadOriginal(long nativePreviewsAndroidBridge, PreviewsAndroidBridge caller,
      WebContents webContents) {
    N.MUNdHFuu(nativePreviewsAndroidBridge, caller, webContents);
  }

  @Override
  public String getPreviewsType(long nativePreviewsAndroidBridge, PreviewsAndroidBridge caller,
      WebContents webContents) {
    return (String)N.M6rlffHy(nativePreviewsAndroidBridge, caller, webContents);
  }

  public static PreviewsAndroidBridge.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.previews.PreviewsAndroidBridge.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new PreviewsAndroidBridgeJni();
  }
}
