package org.chromium.chrome.browser.media;

import J.N;
import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.chrome.browser.thinwebview.CompositorView;
import org.chromium.ui.base.WindowAndroid;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class PictureInPictureActivityJni implements PictureInPictureActivity.Natives {
  private static PictureInPictureActivity.Natives testInstance;

  public static final JniStaticTestMocker<PictureInPictureActivity.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.media.PictureInPictureActivity.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.media.PictureInPictureActivity.Natives instance) {
      if (!J.N.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void onActivityStart(long nativeOverlayWindowAndroid, PictureInPictureActivity self,
      WindowAndroid window) {
    N.MjkqYLC6(nativeOverlayWindowAndroid, self, window);
  }

  @Override
  public void destroy(long nativeOverlayWindowAndroid) {
    N.MrWAWBMN(nativeOverlayWindowAndroid);
  }

  @Override
  public void play(long nativeOverlayWindowAndroid) {
    N.Mg8bKPmu(nativeOverlayWindowAndroid);
  }

  @Override
  public void compositorViewCreated(long nativeOverlayWindowAndroid,
      CompositorView compositorView) {
    N.MxJhtvhD(nativeOverlayWindowAndroid, compositorView);
  }

  @Override
  public void onViewSizeChanged(long nativeOverlayWindowAndroid, int width, int height) {
    N.MLM3OS4j(nativeOverlayWindowAndroid, width, height);
  }

  public static PictureInPictureActivity.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.media.PictureInPictureActivity.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new PictureInPictureActivityJni();
  }
}
