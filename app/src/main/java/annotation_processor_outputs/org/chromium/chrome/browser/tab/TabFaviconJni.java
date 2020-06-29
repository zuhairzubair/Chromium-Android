package org.chromium.chrome.browser.tab;

import J.N;
import android.graphics.Bitmap;
import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.content_public.browser.WebContents;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class TabFaviconJni implements TabFavicon.Natives {
  private static TabFavicon.Natives testInstance;

  public static final JniStaticTestMocker<TabFavicon.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.tab.TabFavicon.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(org.chromium.chrome.browser.tab.TabFavicon.Natives instance) {
      if (!J.N.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public long init(TabFavicon caller) {
    return (long)N.MMZhE4x7(caller);
  }

  @Override
  public void onDestroyed(long nativeTabFavicon, TabFavicon caller) {
    N.M221q0MR(nativeTabFavicon, caller);
  }

  @Override
  public void setWebContents(long nativeTabFavicon, TabFavicon caller, WebContents webContents) {
    N.MP93Z_9Y(nativeTabFavicon, caller, webContents);
  }

  @Override
  public void resetWebContents(long nativeTabFavicon, TabFavicon caller) {
    N.Mmp1Icg1(nativeTabFavicon, caller);
  }

  @Override
  public Bitmap getFavicon(long nativeTabFavicon, TabFavicon caller) {
    return (Bitmap)N.MmmF426r(nativeTabFavicon, caller);
  }

  public static TabFavicon.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.tab.TabFavicon.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new TabFaviconJni();
  }
}
