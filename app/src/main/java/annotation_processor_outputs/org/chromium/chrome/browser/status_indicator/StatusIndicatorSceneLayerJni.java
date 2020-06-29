package org.chromium.chrome.browser.status_indicator;

import J.N;
import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.chrome.browser.compositor.scene_layer.SceneLayer;
import org.chromium.ui.resources.ResourceManager;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class StatusIndicatorSceneLayerJni implements StatusIndicatorSceneLayer.Natives {
  private static StatusIndicatorSceneLayer.Natives testInstance;

  public static final JniStaticTestMocker<StatusIndicatorSceneLayer.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.status_indicator.StatusIndicatorSceneLayer.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.status_indicator.StatusIndicatorSceneLayer.Natives instance) {
      if (!J.N.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public long init(StatusIndicatorSceneLayer caller) {
    return (long)N.MvcFT3Dn(caller);
  }

  @Override
  public void setContentTree(long nativeStatusIndicatorSceneLayer, StatusIndicatorSceneLayer caller,
      SceneLayer contentTree) {
    N.MqEZWVhE(nativeStatusIndicatorSceneLayer, caller, contentTree);
  }

  @Override
  public void updateStatusIndicatorLayer(long nativeStatusIndicatorSceneLayer,
      StatusIndicatorSceneLayer caller, ResourceManager resourceManager, int viewResourceId,
      int offset) {
    N.MsJYu3I7(nativeStatusIndicatorSceneLayer, caller, resourceManager, viewResourceId, offset);
  }

  public static StatusIndicatorSceneLayer.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.status_indicator.StatusIndicatorSceneLayer.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new StatusIndicatorSceneLayerJni();
  }
}
