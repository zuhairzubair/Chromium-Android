package org.chromium.chrome.browser.tab;

import J.N;
import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.chrome.browser.contextmenu.ContextMenuPopulator;
import org.chromium.content_public.browser.WebContents;
import org.chromium.content_public.common.ResourceRequestBody;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class TabImplJni implements TabImpl.Natives {
  private static TabImpl.Natives testInstance;

  public static final JniStaticTestMocker<TabImpl.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.tab.TabImpl.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(org.chromium.chrome.browser.tab.TabImpl.Natives instance) {
      if (!J.N.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void init(TabImpl caller) {
    N.MS$o3L11(caller);
  }

  @Override
  public void destroy(long nativeTabAndroid, TabImpl caller) {
    N.M1Fyow7a(nativeTabAndroid, caller);
  }

  @Override
  public void initWebContents(long nativeTabAndroid, TabImpl caller, boolean incognito,
      boolean isBackgroundTab, WebContents webContents, int parentTabId,
      TabWebContentsDelegateAndroid delegate, ContextMenuPopulator contextMenuPopulator) {
    N.MUKSQbrZ(nativeTabAndroid, caller, incognito, isBackgroundTab, webContents, parentTabId, delegate, contextMenuPopulator);
  }

  @Override
  public void updateDelegates(long nativeTabAndroid, TabImpl caller,
      TabWebContentsDelegateAndroid delegate, ContextMenuPopulator contextMenuPopulator) {
    N.M6xWklI_(nativeTabAndroid, caller, delegate, contextMenuPopulator);
  }

  @Override
  public void destroyWebContents(long nativeTabAndroid, TabImpl caller) {
    N.MYIgyGYO(nativeTabAndroid, caller);
  }

  @Override
  public void releaseWebContents(long nativeTabAndroid, TabImpl caller) {
    N.MoDA8Gdb(nativeTabAndroid, caller);
  }

  @Override
  public void onPhysicalBackingSizeChanged(long nativeTabAndroid, TabImpl caller,
      WebContents webContents, int width, int height) {
    N.MzfONDmc(nativeTabAndroid, caller, webContents, width, height);
  }

  @Override
  public int loadUrl(long nativeTabAndroid, TabImpl caller, String url, String initiatorOrigin,
      String extraHeaders, ResourceRequestBody postData, int transition, String referrerUrl,
      int referrerPolicy, boolean isRendererInitiated, boolean shoulReplaceCurrentEntry,
      boolean hasUserGesture, boolean shouldClearHistoryList, long inputStartTimestamp,
      long intentReceivedTimestamp) {
    return (int)N.M0oMLHHt(nativeTabAndroid, caller, url, initiatorOrigin, extraHeaders, postData, transition, referrerUrl, referrerPolicy, isRendererInitiated, shoulReplaceCurrentEntry, hasUserGesture, shouldClearHistoryList, inputStartTimestamp, intentReceivedTimestamp);
  }

  @Override
  public void setActiveNavigationEntryTitleForUrl(long nativeTabAndroid, TabImpl caller, String url,
      String title) {
    N.MhCci$0r(nativeTabAndroid, caller, url, title);
  }

  @Override
  public void loadOriginalImage(long nativeTabAndroid, TabImpl caller) {
    N.MNS_JAOn(nativeTabAndroid, caller);
  }

  public static TabImpl.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.tab.TabImpl.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new TabImplJni();
  }
}
