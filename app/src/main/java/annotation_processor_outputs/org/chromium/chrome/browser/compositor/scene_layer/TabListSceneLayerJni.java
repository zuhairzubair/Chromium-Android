package org.chromium.chrome.browser.compositor.scene_layer;

import J.N;
import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.chrome.browser.compositor.LayerTitleCache;
import org.chromium.chrome.browser.compositor.layouts.content.TabContentManager;
import org.chromium.ui.resources.ResourceManager;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class TabListSceneLayerJni implements TabListSceneLayer.Natives {
  private static TabListSceneLayer.Natives testInstance;

  public static final JniStaticTestMocker<TabListSceneLayer.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.compositor.scene_layer.TabListSceneLayer.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.compositor.scene_layer.TabListSceneLayer.Natives instance) {
      if (!J.N.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public long init(TabListSceneLayer caller) {
    return (long)N.MwkJn6dB(caller);
  }

  @Override
  public void beginBuildingFrame(long nativeTabListSceneLayer, TabListSceneLayer caller) {
    N.MQUD003X(nativeTabListSceneLayer, caller);
  }

  @Override
  public void finishBuildingFrame(long nativeTabListSceneLayer, TabListSceneLayer caller) {
    N.Mn9kYrkw(nativeTabListSceneLayer, caller);
  }

  @Override
  public void updateLayer(long nativeTabListSceneLayer, TabListSceneLayer caller,
      int backgroundColor, float viewportX, float viewportY, float viewportWidth,
      float viewportHeight, LayerTitleCache layerTitleCache, TabContentManager tabContentManager,
      ResourceManager resourceManager) {
    N.Mf2p86oA(nativeTabListSceneLayer, caller, backgroundColor, viewportX, viewportY, viewportWidth, viewportHeight, layerTitleCache, tabContentManager, resourceManager);
  }

  @Override
  public void putTabLayer(long nativeTabListSceneLayer, TabListSceneLayer caller, int selectedId,
      int[] ids, boolean useAdditionalIds, int toolbarResourceId, int closeButtonResourceId,
      int shadowResourceId, int contourResourceId, int backLogoResourceId, int borderResourceId,
      int borderInnerShadowResourceId, boolean canUseLiveLayer, int tabBackgroundColor,
      int backLogoColor, boolean incognito, boolean isPortrait, float x, float y, float width,
      float height, float contentWidth, float contentHeight, float visibleContentHeight,
      float shadowX, float shadowY, float shadowWidth, float shadowHeight, float pivotX,
      float pivotY, float rotationX, float rotationY, float alpha, float borderAlpha,
      float borderInnerShadowAlpha, float contourAlpha, float shadowAlpha, float closeAlpha,
      float closeBtnWidth, float closeBtnAssetSize, float staticToViewBlend, float borderScale,
      float saturation, float brightness, boolean showToolbar, int defaultThemeColor,
      int toolbarBackgroundColor, int closeButtonColor, boolean anonymizeToolbar,
      boolean showTabTitle, int toolbarTextBoxResource, int toolbarTextBoxBackgroundColor,
      float toolbarTextBoxAlpha, float toolbarAlpha, float contentOffset, float sideBorderScale,
      boolean insetVerticalBorder) {
    N.Mp1Kxnqn(nativeTabListSceneLayer, caller, selectedId, ids, useAdditionalIds, toolbarResourceId, closeButtonResourceId, shadowResourceId, contourResourceId, backLogoResourceId, borderResourceId, borderInnerShadowResourceId, canUseLiveLayer, tabBackgroundColor, backLogoColor, incognito, isPortrait, x, y, width, height, contentWidth, contentHeight, visibleContentHeight, shadowX, shadowY, shadowWidth, shadowHeight, pivotX, pivotY, rotationX, rotationY, alpha, borderAlpha, borderInnerShadowAlpha, contourAlpha, shadowAlpha, closeAlpha, closeBtnWidth, closeBtnAssetSize, staticToViewBlend, borderScale, saturation, brightness, showToolbar, defaultThemeColor, toolbarBackgroundColor, closeButtonColor, anonymizeToolbar, showTabTitle, toolbarTextBoxResource, toolbarTextBoxBackgroundColor, toolbarTextBoxAlpha, toolbarAlpha, contentOffset, sideBorderScale, insetVerticalBorder);
  }

  @Override
  public void putBackgroundLayer(long nativeTabListSceneLayer, TabListSceneLayer caller,
      int resourceId, float alpha, int topOffset) {
    N.MdnzXRBb(nativeTabListSceneLayer, caller, resourceId, alpha, topOffset);
  }

  public static TabListSceneLayer.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.compositor.scene_layer.TabListSceneLayer.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new TabListSceneLayerJni();
  }
}
