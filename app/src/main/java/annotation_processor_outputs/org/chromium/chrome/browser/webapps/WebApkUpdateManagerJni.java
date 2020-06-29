package org.chromium.chrome.browser.webapps;

import J.N;
import android.graphics.Bitmap;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.Callback;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class WebApkUpdateManagerJni implements WebApkUpdateManager.Natives {
  private static WebApkUpdateManager.Natives testInstance;

  public static final JniStaticTestMocker<WebApkUpdateManager.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.webapps.WebApkUpdateManager.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.webapps.WebApkUpdateManager.Natives instance) {
      if (!J.N.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void storeWebApkUpdateRequestToFile(String updateRequestPath, String startUrl,
      String scope, String name, String shortName, String primaryIconUrl, Bitmap primaryIcon,
      boolean isPrimaryIconMaskable, String badgeIconUrl, Bitmap badgeIcon, String[] iconUrls,
      String[] iconHashes, int displayMode, int orientation, long themeColor, long backgroundColor,
      String shareTargetAction, String shareTargetParamTitle, String shareTargetParamText,
      boolean shareTargetParamIsMethodPost, boolean shareTargetParamIsEncTypeMultipart,
      String[] shareTargetParamFileNames, Object[] shareTargetParamAccepts, String manifestUrl,
      String webApkPackage, int webApkVersion, boolean isManifestStale, int updateReason,
      Callback<Boolean> callback) {
    N.MBaSXT5X(updateRequestPath, startUrl, scope, name, shortName, primaryIconUrl, primaryIcon, isPrimaryIconMaskable, badgeIconUrl, badgeIcon, iconUrls, iconHashes, displayMode, orientation, themeColor, backgroundColor, shareTargetAction, shareTargetParamTitle, shareTargetParamText, shareTargetParamIsMethodPost, shareTargetParamIsEncTypeMultipart, shareTargetParamFileNames, shareTargetParamAccepts, manifestUrl, webApkPackage, webApkVersion, isManifestStale, updateReason, callback);
  }

  @Override
  public void updateWebApkFromFile(String updateRequestPath,
      WebApkUpdateManager.WebApkUpdateCallback callback) {
    N.MEqkTChv(updateRequestPath, callback);
  }

  public static WebApkUpdateManager.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.webapps.WebApkUpdateManager.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new WebApkUpdateManagerJni();
  }
}
