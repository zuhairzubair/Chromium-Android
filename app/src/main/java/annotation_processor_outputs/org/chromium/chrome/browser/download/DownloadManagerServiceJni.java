package org.chromium.chrome.browser.download;

import J.N;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.Callback;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class DownloadManagerServiceJni implements DownloadManagerService.Natives {
  private static DownloadManagerService.Natives testInstance;

  public static final JniStaticTestMocker<DownloadManagerService.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.download.DownloadManagerService.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.download.DownloadManagerService.Natives instance) {
      if (!J.N.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public boolean isSupportedMimeType(String mimeType) {
    return (boolean)N.M4t0L845(mimeType);
  }

  @Override
  public int getAutoResumptionLimit() {
    return (int)N.M3NaDnJv();
  }

  @Override
  public long init(DownloadManagerService caller, boolean isProfileAdded) {
    return (long)N.MeJ$lv4P(caller, isProfileAdded);
  }

  @Override
  public void openDownload(long nativeDownloadManagerService, DownloadManagerService caller,
      String downloadGuid, boolean isOffTheRecord, int source) {
    N.M3D9bHLw(nativeDownloadManagerService, caller, downloadGuid, isOffTheRecord, source);
  }

  @Override
  public void resumeDownload(long nativeDownloadManagerService, DownloadManagerService caller,
      String downloadGuid, boolean isOffTheRecord, boolean hasUserGesture) {
    N.MieiRHrs(nativeDownloadManagerService, caller, downloadGuid, isOffTheRecord, hasUserGesture);
  }

  @Override
  public void retryDownload(long nativeDownloadManagerService, DownloadManagerService caller,
      String downloadGuid, boolean isOffTheRecord, boolean hasUserGesture) {
    N.MrbVtlld(nativeDownloadManagerService, caller, downloadGuid, isOffTheRecord, hasUserGesture);
  }

  @Override
  public void cancelDownload(long nativeDownloadManagerService, DownloadManagerService caller,
      String downloadGuid, boolean isOffTheRecord) {
    N.MV30ev0v(nativeDownloadManagerService, caller, downloadGuid, isOffTheRecord);
  }

  @Override
  public void pauseDownload(long nativeDownloadManagerService, DownloadManagerService caller,
      String downloadGuid, boolean isOffTheRecord) {
    N.MmztvsiA(nativeDownloadManagerService, caller, downloadGuid, isOffTheRecord);
  }

  @Override
  public void removeDownload(long nativeDownloadManagerService, DownloadManagerService caller,
      String downloadGuid, boolean isOffTheRecord) {
    N.M8Q_hBf$(nativeDownloadManagerService, caller, downloadGuid, isOffTheRecord);
  }

  @Override
  public void renameDownload(long nativeDownloadManagerService, DownloadManagerService caller,
      String downloadGuid, String targetName, Callback<Integer> callback, boolean isOffTheRecord) {
    N.MbUQtFGf(nativeDownloadManagerService, caller, downloadGuid, targetName, callback, isOffTheRecord);
  }

  @Override
  public void getAllDownloads(long nativeDownloadManagerService, DownloadManagerService caller,
      boolean isOffTheRecord) {
    N.M0Cf1c3Z(nativeDownloadManagerService, caller, isOffTheRecord);
  }

  @Override
  public void checkForExternallyRemovedDownloads(long nativeDownloadManagerService,
      DownloadManagerService caller, boolean isOffTheRecord) {
    N.MQ35Y$D$(nativeDownloadManagerService, caller, isOffTheRecord);
  }

  @Override
  public void updateLastAccessTime(long nativeDownloadManagerService, DownloadManagerService caller,
      String downloadGuid, boolean isOffTheRecord) {
    N.M2cL0nU9(nativeDownloadManagerService, caller, downloadGuid, isOffTheRecord);
  }

  @Override
  public void onProfileAdded(long nativeDownloadManagerService, DownloadManagerService caller) {
    N.MFfdOo0Y(nativeDownloadManagerService, caller);
  }

  @Override
  public void createInterruptedDownloadForTest(long nativeDownloadManagerService,
      DownloadManagerService caller, String url, String guid, String targetPath) {
    N.MKJzUTj3(nativeDownloadManagerService, caller, url, guid, targetPath);
  }

  @Override
  public void recordFirstBackgroundInterruptReason(long nativeDownloadManagerService,
      DownloadManagerService caller, String guid, boolean downloadStarted) {
    N.MBkC1K8I(nativeDownloadManagerService, caller, guid, downloadStarted);
  }

  public static DownloadManagerService.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.download.DownloadManagerService.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new DownloadManagerServiceJni();
  }
}
