package org.chromium.chrome.browser.offlinepages;

import J.N;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import javax.annotation.Generated;
import org.chromium.base.Callback;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.chrome.browser.profiles.ProfileKey;
import org.chromium.content_public.browser.LoadUrlParams;
import org.chromium.content_public.browser.WebContents;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class OfflinePageBridgeJni implements OfflinePageBridge.Natives {
  private static OfflinePageBridge.Natives testInstance;

  public static final JniStaticTestMocker<OfflinePageBridge.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.offlinepages.OfflinePageBridge.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.offlinepages.OfflinePageBridge.Natives instance) {
      if (!J.N.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public boolean canSavePage(String url) {
    return (boolean)N.MXyz2Okt(url);
  }

  @Override
  public OfflinePageBridge getOfflinePageBridgeForProfileKey(ProfileKey profileKey) {
    return (OfflinePageBridge)N.MspGcmXb(profileKey);
  }

  @Override
  public void getAllPages(long nativeOfflinePageBridge, OfflinePageBridge caller,
      List<OfflinePageItem> offlinePages, final Callback<List<OfflinePageItem>> callback) {
    N.MBAG2og$(nativeOfflinePageBridge, caller, offlinePages, callback);
  }

  @Override
  public void willCloseTab(long nativeOfflinePageBridge, OfflinePageBridge caller,
      WebContents webContents) {
    N.MIDiWOi_(nativeOfflinePageBridge, caller, webContents);
  }

  @Override
  public void getPageByOfflineId(long nativeOfflinePageBridge, OfflinePageBridge caller,
      long offlineId, Callback<OfflinePageItem> callback) {
    N.M8YdeM7z(nativeOfflinePageBridge, caller, offlineId, callback);
  }

  @Override
  public void getPagesByClientId(long nativeOfflinePageBridge, OfflinePageBridge caller,
      List<OfflinePageItem> result, String[] namespaces, String[] ids,
      Callback<List<OfflinePageItem>> callback) {
    N.MnXU5$QT(nativeOfflinePageBridge, caller, result, namespaces, ids, callback);
  }

  @Override
  public void getPagesByRequestOrigin(long nativeOfflinePageBridge, OfflinePageBridge caller,
      List<OfflinePageItem> result, String requestOrigin,
      Callback<List<OfflinePageItem>> callback) {
    N.MIDl27P6(nativeOfflinePageBridge, caller, result, requestOrigin, callback);
  }

  @Override
  public void getPagesByNamespace(long nativeOfflinePageBridge, OfflinePageBridge caller,
      List<OfflinePageItem> result, String nameSpace, Callback<List<OfflinePageItem>> callback) {
    N.MJ$y30Dy(nativeOfflinePageBridge, caller, result, nameSpace, callback);
  }

  @Override
  public void deletePagesByClientId(long nativeOfflinePageBridge, OfflinePageBridge caller,
      String[] namespaces, String[] ids, Callback<Integer> callback) {
    N.Mwp3hyBt(nativeOfflinePageBridge, caller, namespaces, ids, callback);
  }

  @Override
  public void deletePagesByClientIdAndOrigin(long nativeOfflinePageBridge, OfflinePageBridge caller,
      String[] namespaces, String[] ids, String origin, Callback<Integer> callback) {
    N.MXul9JQQ(nativeOfflinePageBridge, caller, namespaces, ids, origin, callback);
  }

  @Override
  public void deletePagesByOfflineId(long nativeOfflinePageBridge, OfflinePageBridge caller,
      long[] offlineIds, Callback<Integer> callback) {
    N.MdLxBRGW(nativeOfflinePageBridge, caller, offlineIds, callback);
  }

  @Override
  public void publishInternalPageByOfflineId(long nativeOfflinePageBridge, OfflinePageBridge caller,
      long offlineId, Callback<String> publishedCallback) {
    N.MSHYzaXq(nativeOfflinePageBridge, caller, offlineId, publishedCallback);
  }

  @Override
  public void publishInternalPageByGuid(long nativeOfflinePageBridge, OfflinePageBridge caller,
      String guid, Callback<String> publishedCallback) {
    N.MLQauPJ1(nativeOfflinePageBridge, caller, guid, publishedCallback);
  }

  @Override
  public void selectPageForOnlineUrl(long nativeOfflinePageBridge, OfflinePageBridge caller,
      String onlineUrl, int tabId, Callback<OfflinePageItem> callback) {
    N.MR_37z77(nativeOfflinePageBridge, caller, onlineUrl, tabId, callback);
  }

  @Override
  public void savePage(long nativeOfflinePageBridge, OfflinePageBridge caller,
      OfflinePageBridge.SavePageCallback callback, WebContents webContents, String clientNamespace,
      String clientId, String origin) {
    N.MD7l7nn$(nativeOfflinePageBridge, caller, callback, webContents, clientNamespace, clientId, origin);
  }

  @Override
  public String getOfflinePageHeaderForReload(long nativeOfflinePageBridge,
      OfflinePageBridge caller, WebContents webContents) {
    return (String)N.MRMfaXXV(nativeOfflinePageBridge, caller, webContents);
  }

  @Override
  public boolean isShowingOfflinePreview(long nativeOfflinePageBridge, OfflinePageBridge caller,
      WebContents webContents) {
    return (boolean)N.MYT2RMuB(nativeOfflinePageBridge, caller, webContents);
  }

  @Override
  public boolean isShowingDownloadButtonInErrorPage(long nativeOfflinePageBridge,
      OfflinePageBridge caller, WebContents webContents) {
    return (boolean)N.Mvkx0jqI(nativeOfflinePageBridge, caller, webContents);
  }

  @Override
  public void scheduleDownload(long nativeOfflinePageBridge, OfflinePageBridge caller,
      WebContents webContents, String nameSpace, String url, int uiAction, String origin) {
    N.MNR_O1IV(nativeOfflinePageBridge, caller, webContents, nameSpace, url, uiAction, origin);
  }

  @Override
  public boolean isOfflinePage(long nativeOfflinePageBridge, OfflinePageBridge caller,
      WebContents webContents) {
    return (boolean)N.Mmgl0zEx(nativeOfflinePageBridge, caller, webContents);
  }

  @Override
  public boolean isInPrivateDirectory(long nativeOfflinePageBridge, OfflinePageBridge caller,
      String filePath) {
    return (boolean)N.MT9xecBl(nativeOfflinePageBridge, caller, filePath);
  }

  @Override
  public boolean isTemporaryNamespace(long nativeOfflinePageBridge, OfflinePageBridge caller,
      String nameSpace) {
    return (boolean)N.MB5pa3Na(nativeOfflinePageBridge, caller, nameSpace);
  }

  @Override
  public OfflinePageItem getOfflinePage(long nativeOfflinePageBridge, OfflinePageBridge caller,
      WebContents webContents) {
    return (OfflinePageItem)N.MzjNdQag(nativeOfflinePageBridge, caller, webContents);
  }

  @Override
  public void checkForNewOfflineContent(long nativeOfflinePageBridge, OfflinePageBridge caller,
      long freshnessTimeMillis, Callback<String> callback) {
    N.MFVw2bHR(nativeOfflinePageBridge, caller, freshnessTimeMillis, callback);
  }

  @Override
  public void getLoadUrlParamsByOfflineId(long nativeOfflinePageBridge, OfflinePageBridge caller,
      long offlineId, int location, Callback<LoadUrlParams> callback) {
    N.MBaVkYrR(nativeOfflinePageBridge, caller, offlineId, location, callback);
  }

  @Override
  public boolean isShowingTrustedOfflinePage(long nativeOfflinePageBridge, OfflinePageBridge caller,
      WebContents webContents) {
    return (boolean)N.MD0P9_ar(nativeOfflinePageBridge, caller, webContents);
  }

  @Override
  public void getLoadUrlParamsForOpeningMhtmlFileOrContent(long nativeOfflinePageBridge,
      OfflinePageBridge caller, String url, Callback<LoadUrlParams> callback) {
    N.MRrUWI5B(nativeOfflinePageBridge, caller, url, callback);
  }

  @Override
  public void acquireFileAccessPermission(long nativeOfflinePageBridge, OfflinePageBridge caller,
      WebContents webContents, Callback<Boolean> callback) {
    N.M5gQgQvs(nativeOfflinePageBridge, caller, webContents, callback);
  }

  public static OfflinePageBridge.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.offlinepages.OfflinePageBridge.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new OfflinePageBridgeJni();
  }
}
