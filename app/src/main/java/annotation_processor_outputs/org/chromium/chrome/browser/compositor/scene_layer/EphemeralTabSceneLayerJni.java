package org.chromium.chrome.browser.compositor.scene_layer;

import J.N;
import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.content_public.browser.WebContents;
import org.chromium.ui.resources.ResourceManager;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class EphemeralTabSceneLayerJni implements EphemeralTabSceneLayer.Natives {
  private static EphemeralTabSceneLayer.Natives testInstance;

  public static final JniStaticTestMocker<EphemeralTabSceneLayer.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.compositor.scene_layer.EphemeralTabSceneLayer.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.compositor.scene_layer.EphemeralTabSceneLayer.Natives instance) {
      if (!J.N.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public long init(EphemeralTabSceneLayer caller) {
    return (long)N.MwxT2YU9(caller);
  }

  @Override
  public void createEphemeralTabLayer(long nativeEphemeralTabSceneLayer,
      EphemeralTabSceneLayer caller, ResourceManager resourceManager,
      EphemeralTabSceneLayer.FaviconCallback callback) {
    N.MioL5jip(nativeEphemeralTabSceneLayer, caller, resourceManager, callback);
  }

  @Override
  public void setContentTree(long nativeEphemeralTabSceneLayer, EphemeralTabSceneLayer caller,
      SceneLayer contentTree) {
    N.MV2vJgK7(nativeEphemeralTabSceneLayer, caller, contentTree);
  }

  @Override
  public void hideTree(long nativeEphemeralTabSceneLayer, EphemeralTabSceneLayer caller) {
    N.MDIXWmNZ(nativeEphemeralTabSceneLayer, caller);
  }

  @Override
  public void setResourceIds(long nativeEphemeralTabSceneLayer, EphemeralTabSceneLayer caller,
      int barTextResourceId, int barBackgroundResourceId, int roundedBarTopResourceId,
      int barShadowResourceId, int panelIconResourceId, int dragHandlebarResourceId,
      int openTabIconResourceId, int closeIconResourceId) {
    N.MMMxe9IR(nativeEphemeralTabSceneLayer, caller, barTextResourceId, barBackgroundResourceId, roundedBarTopResourceId, barShadowResourceId, panelIconResourceId, dragHandlebarResourceId, openTabIconResourceId, closeIconResourceId);
  }

  @Override
  public void update(long nativeEphemeralTabSceneLayer, EphemeralTabSceneLayer caller,
      int titleViewId, int captionViewId, int captionIconId, float captionIconOpacity,
      float captionAnimationPercentage, float textLayerMinHeight, float titleCaptionSpacing,
      boolean captionVisible, int progressBarBackgroundResourceId, int progressBarResourceId,
      float dpToPx, float basePageBrightness, float basePageYOffset, WebContents webContents,
      float panelX, float panelY, float panelWidth, float panelHeight, int barBackgroundColor,
      float barMarginSide, float barMarginTop, float barHeight, boolean barBorderVisible,
      float barBorderHeight, int iconColor, int dragHandlebarColor, float faviconOpacity,
      boolean isProgressBarVisible, float progressBarHeight, float progressBarOpacity,
      float progressBarCompletion, int separatorLineColor) {
    N.M7x5k_eP(nativeEphemeralTabSceneLayer, caller, titleViewId, captionViewId, captionIconId, captionIconOpacity, captionAnimationPercentage, textLayerMinHeight, titleCaptionSpacing, captionVisible, progressBarBackgroundResourceId, progressBarResourceId, dpToPx, basePageBrightness, basePageYOffset, webContents, panelX, panelY, panelWidth, panelHeight, barBackgroundColor, barMarginSide, barMarginTop, barHeight, barBorderVisible, barBorderHeight, iconColor, dragHandlebarColor, faviconOpacity, isProgressBarVisible, progressBarHeight, progressBarOpacity, progressBarCompletion, separatorLineColor);
  }

  public static EphemeralTabSceneLayer.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.compositor.scene_layer.EphemeralTabSceneLayer.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new EphemeralTabSceneLayerJni();
  }
}
