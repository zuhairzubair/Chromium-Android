package org.chromium.chrome.browser.compositor.scene_layer;

import J.N;
import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.chrome.browser.compositor.layouts.content.TabContentManager;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class StaticTabSceneLayerJni implements StaticTabSceneLayer.Natives {
  private static StaticTabSceneLayer.Natives testInstance;

  public static final JniStaticTestMocker<StaticTabSceneLayer.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.compositor.scene_layer.StaticTabSceneLayer.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.compositor.scene_layer.StaticTabSceneLayer.Natives instance) {
      if (!J.N.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public long init(StaticTabSceneLayer caller) {
    return (long)N.MqXhoEEp(caller);
  }

  @Override
  public void updateTabLayer(long nativeStaticTabSceneLayer, StaticTabSceneLayer caller,
      TabContentManager tabContentManager, int id, boolean canUseLiveLayer, int backgroundColor,
      float x, float y, float staticToViewBlend, float saturation, float brightness) {
    N.MatWNfnY(nativeStaticTabSceneLayer, caller, tabContentManager, id, canUseLiveLayer, backgroundColor, x, y, staticToViewBlend, saturation, brightness);
  }

  public static StaticTabSceneLayer.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.compositor.scene_layer.StaticTabSceneLayer.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new StaticTabSceneLayerJni();
  }
}
