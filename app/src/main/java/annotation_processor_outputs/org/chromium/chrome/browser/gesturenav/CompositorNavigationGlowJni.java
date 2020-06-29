package org.chromium.chrome.browser.gesturenav;

import J.N;
import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.content_public.browser.WebContents;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class CompositorNavigationGlowJni implements CompositorNavigationGlow.Natives {
  private static CompositorNavigationGlow.Natives testInstance;

  public static final JniStaticTestMocker<CompositorNavigationGlow.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.gesturenav.CompositorNavigationGlow.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.gesturenav.CompositorNavigationGlow.Natives instance) {
      if (!J.N.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public long init(CompositorNavigationGlow caller, float dipScale, WebContents webContents) {
    return (long)N.MzJQbog2(caller, dipScale, webContents);
  }

  @Override
  public void prepare(long nativeNavigationGlow, CompositorNavigationGlow caller, float startX,
      float startY, int width, int height) {
    N.Mh7HUra7(nativeNavigationGlow, caller, startX, startY, width, height);
  }

  @Override
  public void onOverscroll(long nativeNavigationGlow, CompositorNavigationGlow caller,
      float accumulatedScroll, float delta) {
    N.Mmktf561(nativeNavigationGlow, caller, accumulatedScroll, delta);
  }

  @Override
  public void onReset(long nativeNavigationGlow, CompositorNavigationGlow caller) {
    N.M5ii_o9D(nativeNavigationGlow, caller);
  }

  @Override
  public void destroy(long nativeNavigationGlow, CompositorNavigationGlow caller) {
    N.MxNewYMm(nativeNavigationGlow, caller);
  }

  public static CompositorNavigationGlow.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.gesturenav.CompositorNavigationGlow.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new CompositorNavigationGlowJni();
  }
}
