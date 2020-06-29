package org.chromium.chrome.browser.compositor.scene_layer;

import J.N;
import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.chrome.browser.compositor.LayerTitleCache;
import org.chromium.ui.resources.ResourceManager;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class TabStripSceneLayerJni implements TabStripSceneLayer.Natives {
  private static TabStripSceneLayer.Natives testInstance;

  public static final JniStaticTestMocker<TabStripSceneLayer.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.compositor.scene_layer.TabStripSceneLayer.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.compositor.scene_layer.TabStripSceneLayer.Natives instance) {
      if (!J.N.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public long init(TabStripSceneLayer caller) {
    return (long)N.M8m15MW0(caller);
  }

  @Override
  public void beginBuildingFrame(long nativeTabStripSceneLayer, TabStripSceneLayer caller,
      boolean visible) {
    N.MyYEfiIB(nativeTabStripSceneLayer, caller, visible);
  }

  @Override
  public void finishBuildingFrame(long nativeTabStripSceneLayer, TabStripSceneLayer caller) {
    N.MAgwm7zv(nativeTabStripSceneLayer, caller);
  }

  @Override
  public void updateTabStripLayer(long nativeTabStripSceneLayer, TabStripSceneLayer caller,
      float width, float height, float yOffset, float backgroundTabBrightness, float brightness,
      boolean shouldReaddBackground) {
    N.MtZ2MTu4(nativeTabStripSceneLayer, caller, width, height, yOffset, backgroundTabBrightness, brightness, shouldReaddBackground);
  }

  @Override
  public void updateNewTabButton(long nativeTabStripSceneLayer, TabStripSceneLayer caller,
      int resourceId, float x, float y, float width, float height, boolean visible,
      ResourceManager resourceManager) {
    N.M4f9__d6(nativeTabStripSceneLayer, caller, resourceId, x, y, width, height, visible, resourceManager);
  }

  @Override
  public void updateModelSelectorButton(long nativeTabStripSceneLayer, TabStripSceneLayer caller,
      int resourceId, float x, float y, float width, float height, boolean incognito,
      boolean visible, ResourceManager resourceManager) {
    N.Mbxphj9n(nativeTabStripSceneLayer, caller, resourceId, x, y, width, height, incognito, visible, resourceManager);
  }

  @Override
  public void updateTabStripLeftFade(long nativeTabStripSceneLayer, TabStripSceneLayer caller,
      int resourceId, float opacity, ResourceManager resourceManager) {
    N.Mp3SuRkJ(nativeTabStripSceneLayer, caller, resourceId, opacity, resourceManager);
  }

  @Override
  public void updateTabStripRightFade(long nativeTabStripSceneLayer, TabStripSceneLayer caller,
      int resourceId, float opacity, ResourceManager resourceManager) {
    N.MBpqOf1m(nativeTabStripSceneLayer, caller, resourceId, opacity, resourceManager);
  }

  @Override
  public void putStripTabLayer(long nativeTabStripSceneLayer, TabStripSceneLayer caller, int id,
      int closeResourceId, int handleResourceId, int handleOutlineResourceId, int closeTint,
      int handleTint, int handleOutlineTint, boolean foreground, boolean closePressed,
      float toolbarWidth, float x, float y, float width, float height, float contentOffsetX,
      float closeButtonAlpha, boolean isLoading, float spinnerRotation,
      LayerTitleCache layerTitleCache, ResourceManager resourceManager) {
    N.M7UBWx3g(nativeTabStripSceneLayer, caller, id, closeResourceId, handleResourceId, handleOutlineResourceId, closeTint, handleTint, handleOutlineTint, foreground, closePressed, toolbarWidth, x, y, width, height, contentOffsetX, closeButtonAlpha, isLoading, spinnerRotation, layerTitleCache, resourceManager);
  }

  @Override
  public void setContentTree(long nativeTabStripSceneLayer, TabStripSceneLayer caller,
      SceneLayer contentTree) {
    N.Mm9evJzJ(nativeTabStripSceneLayer, caller, contentTree);
  }

  public static TabStripSceneLayer.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.compositor.scene_layer.TabStripSceneLayer.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new TabStripSceneLayerJni();
  }
}
