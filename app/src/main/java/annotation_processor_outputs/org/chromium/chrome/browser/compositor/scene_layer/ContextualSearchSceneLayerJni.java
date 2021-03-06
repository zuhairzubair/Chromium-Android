package org.chromium.chrome.browser.compositor.scene_layer;

import J.N;
import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.content_public.browser.WebContents;
import org.chromium.ui.resources.ResourceManager;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class ContextualSearchSceneLayerJni implements ContextualSearchSceneLayer.Natives {
  private static ContextualSearchSceneLayer.Natives testInstance;

  public static final JniStaticTestMocker<ContextualSearchSceneLayer.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.compositor.scene_layer.ContextualSearchSceneLayer.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.compositor.scene_layer.ContextualSearchSceneLayer.Natives instance) {
      if (!J.N.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public long init(ContextualSearchSceneLayer caller) {
    return (long)N.MPHuAHE_(caller);
  }

  @Override
  public void createContextualSearchLayer(long nativeContextualSearchSceneLayer,
      ContextualSearchSceneLayer caller, ResourceManager resourceManager) {
    N.MFh7xXWg(nativeContextualSearchSceneLayer, caller, resourceManager);
  }

  @Override
  public void setContentTree(long nativeContextualSearchSceneLayer,
      ContextualSearchSceneLayer caller, SceneLayer contentTree) {
    N.MhNzVlSH(nativeContextualSearchSceneLayer, caller, contentTree);
  }

  @Override
  public void hideTree(long nativeContextualSearchSceneLayer, ContextualSearchSceneLayer caller) {
    N.MepKCVRL(nativeContextualSearchSceneLayer, caller);
  }

  @Override
  public void updateContextualSearchLayer(long nativeContextualSearchSceneLayer,
      ContextualSearchSceneLayer caller, int searchBarBackgroundResourceId,
      int searchBarBackgroundColor, int searchContextResourceId, int searchTermResourceId,
      int searchCaptionResourceId, int searchBarShadowResourceId, int searchProviderIconResourceId,
      int quickActionIconResourceId, int arrowUpResourceId, int dragHandlebarResourceId,
      int openTabIconResourceId, int closeIconResourceId, int progressBarBackgroundResourceId,
      int progressBarResourceId, int searchPromoResourceId, int barBannerRippleResourceId,
      int barBannerTextResourceId, float dpToPx, float layoutWidth, float layoutHeight,
      float basePageBrightness, float basePageYOffset, WebContents webContents,
      boolean searchPromoVisible, float searchPromoHeight, float searchPromoOpacity,
      int searchPromoBackgroundColor, boolean searchBarBannerVisible, float searchBarBannerHeight,
      float searchBarBannerPaddingPx, float searchBarBannerRippleWidth,
      float searchBarBannerRippleOpacity, float searchBarBannerTextOpacity, float searchPanelX,
      float searchPanelY, float searchPanelWidth, float searchPanelHeight,
      float searchBarMarginSide, float searchBarMarginTop, float searchBarHeight,
      float searchContextOpacity, float searchTextLayerMinHeight, float searchTermOpacity,
      float searchTermCaptionSpacing, float searchCaptionAnimationPercentage,
      boolean searchCaptionVisible, boolean searchBarBorderVisible, float searchBarBorderHeight,
      boolean quickActionIconVisible, boolean thumbnailVisible, String thumbnailUrl,
      float customImageVisibilityPercentage, int barImageSize, int iconColor,
      int dragHandlebarColor, float arrowIconOpacity, float arrowIconRotation,
      float closeIconOpacity, boolean isProgressBarVisible, float progressBarHeight,
      float progressBarOpacity, float progressBarCompletion, float dividerLineVisibilityPercentage,
      float dividerLineWidth, float dividerLineHeight, int dividerLineColor,
      float dividerLineXOffset, boolean touchHighlightVisible, float touchHighlightXOffset,
      float toucHighlightWidth, Profile profile, int barBackgroundResourceId,
      int separatorLineColor) {
    N.MP4UE9Nn(nativeContextualSearchSceneLayer, caller, searchBarBackgroundResourceId, searchBarBackgroundColor, searchContextResourceId, searchTermResourceId, searchCaptionResourceId, searchBarShadowResourceId, searchProviderIconResourceId, quickActionIconResourceId, arrowUpResourceId, dragHandlebarResourceId, openTabIconResourceId, closeIconResourceId, progressBarBackgroundResourceId, progressBarResourceId, searchPromoResourceId, barBannerRippleResourceId, barBannerTextResourceId, dpToPx, layoutWidth, layoutHeight, basePageBrightness, basePageYOffset, webContents, searchPromoVisible, searchPromoHeight, searchPromoOpacity, searchPromoBackgroundColor, searchBarBannerVisible, searchBarBannerHeight, searchBarBannerPaddingPx, searchBarBannerRippleWidth, searchBarBannerRippleOpacity, searchBarBannerTextOpacity, searchPanelX, searchPanelY, searchPanelWidth, searchPanelHeight, searchBarMarginSide, searchBarMarginTop, searchBarHeight, searchContextOpacity, searchTextLayerMinHeight, searchTermOpacity, searchTermCaptionSpacing, searchCaptionAnimationPercentage, searchCaptionVisible, searchBarBorderVisible, searchBarBorderHeight, quickActionIconVisible, thumbnailVisible, thumbnailUrl, customImageVisibilityPercentage, barImageSize, iconColor, dragHandlebarColor, arrowIconOpacity, arrowIconRotation, closeIconOpacity, isProgressBarVisible, progressBarHeight, progressBarOpacity, progressBarCompletion, dividerLineVisibilityPercentage, dividerLineWidth, dividerLineHeight, dividerLineColor, dividerLineXOffset, touchHighlightVisible, touchHighlightXOffset, toucHighlightWidth, profile, barBackgroundResourceId, separatorLineColor);
  }

  public static ContextualSearchSceneLayer.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.compositor.scene_layer.ContextualSearchSceneLayer.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new ContextualSearchSceneLayerJni();
  }
}
