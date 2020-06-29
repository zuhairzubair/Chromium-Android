package org.chromium.chrome.browser.compositor;

import J.N;
import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class LayerTitleCacheJni implements LayerTitleCache.Natives {
  private static LayerTitleCache.Natives testInstance;

  public static final JniStaticTestMocker<LayerTitleCache.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.compositor.LayerTitleCache.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.compositor.LayerTitleCache.Natives instance) {
      if (!J.N.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public long init(LayerTitleCache caller, int fadeWidth, int faviconStartlPadding,
      int faviconEndPadding, int spinnerResId, int spinnerIncognitoResId) {
    return (long)N.MTbG5FQ5(caller, fadeWidth, faviconStartlPadding, faviconEndPadding, spinnerResId, spinnerIncognitoResId);
  }

  @Override
  public void destroy(long nativeLayerTitleCache) {
    N.M4YKMV3h(nativeLayerTitleCache);
  }

  @Override
  public void clearExcept(long nativeLayerTitleCache, LayerTitleCache caller, int exceptId) {
    N.MearVShy(nativeLayerTitleCache, caller, exceptId);
  }

  @Override
  public void updateLayer(long nativeLayerTitleCache, LayerTitleCache caller, int tabId,
      int titleResId, int faviconResId, boolean isIncognito, boolean isRtl) {
    N.Mn77UQtR(nativeLayerTitleCache, caller, tabId, titleResId, faviconResId, isIncognito, isRtl);
  }

  @Override
  public void updateFavicon(long nativeLayerTitleCache, LayerTitleCache caller, int tabId,
      int faviconResId) {
    N.MJ3tyP3k(nativeLayerTitleCache, caller, tabId, faviconResId);
  }

  public static LayerTitleCache.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.compositor.LayerTitleCache.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new LayerTitleCacheJni();
  }
}
