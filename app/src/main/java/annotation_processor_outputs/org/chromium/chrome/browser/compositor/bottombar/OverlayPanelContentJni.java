package org.chromium.chrome.browser.compositor.bottombar;

import J.N;
import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.components.embedder_support.delegate.WebContentsDelegateAndroid;
import org.chromium.components.navigation_interception.InterceptNavigationDelegate;
import org.chromium.content_public.browser.WebContents;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class OverlayPanelContentJni implements OverlayPanelContent.Natives {
  private static OverlayPanelContent.Natives testInstance;

  public static final JniStaticTestMocker<OverlayPanelContent.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.compositor.bottombar.OverlayPanelContent.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.compositor.bottombar.OverlayPanelContent.Natives instance) {
      if (!J.N.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public long init(OverlayPanelContent caller) {
    return (long)N.MIJaVtKT(caller);
  }

  @Override
  public void destroy(long nativeOverlayPanelContent, OverlayPanelContent caller) {
    N.MUq5ITc4(nativeOverlayPanelContent, caller);
  }

  @Override
  public void removeLastHistoryEntry(long nativeOverlayPanelContent, OverlayPanelContent caller,
      String historyUrl, long urlTimeMs) {
    N.Me5Orzs5(nativeOverlayPanelContent, caller, historyUrl, urlTimeMs);
  }

  @Override
  public void onPhysicalBackingSizeChanged(long nativeOverlayPanelContent,
      OverlayPanelContent caller, WebContents webContents, int width, int height) {
    N.M7MukokD(nativeOverlayPanelContent, caller, webContents, width, height);
  }

  @Override
  public void setWebContents(long nativeOverlayPanelContent, OverlayPanelContent caller,
      WebContents webContents, WebContentsDelegateAndroid delegate) {
    N.MzHfGFwX(nativeOverlayPanelContent, caller, webContents, delegate);
  }

  @Override
  public void destroyWebContents(long nativeOverlayPanelContent, OverlayPanelContent caller) {
    N.Mgx0E3X8(nativeOverlayPanelContent, caller);
  }

  @Override
  public void setInterceptNavigationDelegate(long nativeOverlayPanelContent,
      OverlayPanelContent caller, InterceptNavigationDelegate delegate, WebContents webContents) {
    N.MhbyyKle(nativeOverlayPanelContent, caller, delegate, webContents);
  }

  @Override
  public void updateBrowserControlsState(long nativeOverlayPanelContent, OverlayPanelContent caller,
      boolean areControlsHidden) {
    N.Msf6mgl3(nativeOverlayPanelContent, caller, areControlsHidden);
  }

  public static OverlayPanelContent.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.compositor.bottombar.OverlayPanelContent.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new OverlayPanelContentJni();
  }
}
