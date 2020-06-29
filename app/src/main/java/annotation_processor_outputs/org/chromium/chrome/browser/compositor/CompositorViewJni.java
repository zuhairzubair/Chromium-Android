package org.chromium.chrome.browser.compositor;

import J.N;
import android.view.Surface;
import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.chrome.browser.compositor.layouts.content.TabContentManager;
import org.chromium.chrome.browser.compositor.scene_layer.SceneLayer;
import org.chromium.content_public.browser.WebContents;
import org.chromium.ui.base.WindowAndroid;
import org.chromium.ui.resources.ResourceManager;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class CompositorViewJni implements CompositorView.Natives {
  private static CompositorView.Natives testInstance;

  public static final JniStaticTestMocker<CompositorView.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.compositor.CompositorView.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.compositor.CompositorView.Natives instance) {
      if (!J.N.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public long init(CompositorView caller, boolean lowMemDevice, WindowAndroid windowAndroid,
      LayerTitleCache layerTitleCache, TabContentManager tabContentManager) {
    return (long)N.M1onz6N$(caller, lowMemDevice, windowAndroid, layerTitleCache, tabContentManager);
  }

  @Override
  public void destroy(long nativeCompositorView, CompositorView caller) {
    N.MsBICFNS(nativeCompositorView, caller);
  }

  @Override
  public ResourceManager getResourceManager(long nativeCompositorView, CompositorView caller) {
    return (ResourceManager)N.MKvVEaSX(nativeCompositorView, caller);
  }

  @Override
  public void surfaceCreated(long nativeCompositorView, CompositorView caller) {
    N.MGPC4Ktv(nativeCompositorView, caller);
  }

  @Override
  public void surfaceDestroyed(long nativeCompositorView, CompositorView caller) {
    N.MyANQhkH(nativeCompositorView, caller);
  }

  @Override
  public void surfaceChanged(long nativeCompositorView, CompositorView caller, int format,
      int width, int height, boolean backedBySurfaceTexture, Surface surface) {
    N.MH1eqy7s(nativeCompositorView, caller, format, width, height, backedBySurfaceTexture, surface);
  }

  @Override
  public void onPhysicalBackingSizeChanged(long nativeCompositorView, CompositorView caller,
      WebContents webContents, int width, int height) {
    N.MzYzRqF3(nativeCompositorView, caller, webContents, width, height);
  }

  @Override
  public void finalizeLayers(long nativeCompositorView, CompositorView caller) {
    N.MPzbdzfI(nativeCompositorView, caller);
  }

  @Override
  public void setNeedsComposite(long nativeCompositorView, CompositorView caller) {
    N.M_Nkznfe(nativeCompositorView, caller);
  }

  @Override
  public void setLayoutBounds(long nativeCompositorView, CompositorView caller) {
    N.Mjz8vYEz(nativeCompositorView, caller);
  }

  @Override
  public void setOverlayVideoMode(long nativeCompositorView, CompositorView caller,
      boolean enabled) {
    N.M$Spxfoj(nativeCompositorView, caller, enabled);
  }

  @Override
  public void setOverlayImmersiveArMode(long nativeCompositorView, CompositorView caller,
      boolean enabled) {
    N.MfNGeyza(nativeCompositorView, caller, enabled);
  }

  @Override
  public void setSceneLayer(long nativeCompositorView, CompositorView caller,
      SceneLayer sceneLayer) {
    N.MPdbXv3F(nativeCompositorView, caller, sceneLayer);
  }

  @Override
  public void setCompositorWindow(long nativeCompositorView, CompositorView caller,
      WindowAndroid window) {
    N.M0hIhbxf(nativeCompositorView, caller, window);
  }

  @Override
  public void cacheBackBufferForCurrentSurface(long nativeCompositorView, CompositorView caller) {
    N.Mlw_qgLA(nativeCompositorView, caller);
  }

  @Override
  public void evictCachedBackBuffer(long nativeCompositorView, CompositorView caller) {
    N.MVesqb5U(nativeCompositorView, caller);
  }

  @Override
  public void onTabChanged(long nativeCompositorView, CompositorView caller) {
    N.MefOJ2yP(nativeCompositorView, caller);
  }

  public static CompositorView.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.compositor.CompositorView.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new CompositorViewJni();
  }
}
