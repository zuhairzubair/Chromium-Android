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
final class ToolbarSceneLayerJni implements ToolbarSceneLayer.Natives {
  private static ToolbarSceneLayer.Natives testInstance;

  public static final JniStaticTestMocker<ToolbarSceneLayer.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.compositor.scene_layer.ToolbarSceneLayer.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.compositor.scene_layer.ToolbarSceneLayer.Natives instance) {
      if (!J.N.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public long init(ToolbarSceneLayer caller) {
    return (long)N.MBcxGgwt(caller);
  }

  @Override
  public void setContentTree(long nativeToolbarSceneLayer, ToolbarSceneLayer caller,
      SceneLayer contentTree) {
    N.MTki7LO3(nativeToolbarSceneLayer, caller, contentTree);
  }

  @Override
  public void updateToolbarLayer(long nativeToolbarSceneLayer, ToolbarSceneLayer caller,
      ResourceManager resourceManager, int resourceId, int toolbarBackgroundColor,
      int urlBarResourceId, float urlBarAlpha, int urlBarColor, float contentOffset,
      float viewHeight, boolean visible, boolean showShadow) {
    N.MNYME7b7(nativeToolbarSceneLayer, caller, resourceManager, resourceId, toolbarBackgroundColor, urlBarResourceId, urlBarAlpha, urlBarColor, contentOffset, viewHeight, visible, showShadow);
  }

  @Override
  public void updateProgressBar(long nativeToolbarSceneLayer, ToolbarSceneLayer caller,
      int progressBarX, int progressBarY, int progressBarWidth, int progressBarHeight,
      int progressBarColor, int progressBarBackgroundX, int progressBarBackgroundY,
      int progressBarBackgroundWidth, int progressBarBackgroundHeight,
      int progressBarBackgroundColor) {
    N.MU9jRRfu(nativeToolbarSceneLayer, caller, progressBarX, progressBarY, progressBarWidth, progressBarHeight, progressBarColor, progressBarBackgroundX, progressBarBackgroundY, progressBarBackgroundWidth, progressBarBackgroundHeight, progressBarBackgroundColor);
  }

  public static ToolbarSceneLayer.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.compositor.scene_layer.ToolbarSceneLayer.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new ToolbarSceneLayerJni();
  }
}
