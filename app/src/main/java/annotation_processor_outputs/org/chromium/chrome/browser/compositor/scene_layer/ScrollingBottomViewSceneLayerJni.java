package org.chromium.chrome.browser.compositor.scene_layer;

import J.N;
import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.ui.resources.ResourceManager;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class ScrollingBottomViewSceneLayerJni implements ScrollingBottomViewSceneLayer.Natives {
  private static ScrollingBottomViewSceneLayer.Natives testInstance;

  public static final JniStaticTestMocker<ScrollingBottomViewSceneLayer.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.compositor.scene_layer.ScrollingBottomViewSceneLayer.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.compositor.scene_layer.ScrollingBottomViewSceneLayer.Natives instance) {
      if (!J.N.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public long init(ScrollingBottomViewSceneLayer caller) {
    return (long)N.MD_FCzcF(caller);
  }

  @Override
  public void setContentTree(long nativeScrollingBottomViewSceneLayer,
      ScrollingBottomViewSceneLayer caller, SceneLayer contentTree) {
    N.MUkYwKLO(nativeScrollingBottomViewSceneLayer, caller, contentTree);
  }

  @Override
  public void updateScrollingBottomViewLayer(long nativeScrollingBottomViewSceneLayer,
      ScrollingBottomViewSceneLayer caller, ResourceManager resourceManager, int viewResourceId,
      int shadowHeightPx, float xOffset, float yOffset, boolean showShadow) {
    N.Mkk33U_Y(nativeScrollingBottomViewSceneLayer, caller, resourceManager, viewResourceId, shadowHeightPx, xOffset, yOffset, showShadow);
  }

  public static ScrollingBottomViewSceneLayer.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.compositor.scene_layer.ScrollingBottomViewSceneLayer.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new ScrollingBottomViewSceneLayerJni();
  }
}
