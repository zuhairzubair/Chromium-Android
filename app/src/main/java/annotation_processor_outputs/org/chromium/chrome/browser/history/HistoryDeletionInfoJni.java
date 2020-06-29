package org.chromium.chrome.browser.history;

import J.N;
import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class HistoryDeletionInfoJni implements HistoryDeletionInfo.Natives {
  private static HistoryDeletionInfo.Natives testInstance;

  public static final JniStaticTestMocker<HistoryDeletionInfo.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.history.HistoryDeletionInfo.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.history.HistoryDeletionInfo.Natives instance) {
      if (!J.N.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public String[] getDeletedURLs(long historyDeletionInfoPtr) {
    return (String[])N.MLyEE9$M(historyDeletionInfoPtr);
  }

  @Override
  public boolean isTimeRangeValid(long historyDeletionInfoPtr) {
    return (boolean)N.MBUJ8Aeh(historyDeletionInfoPtr);
  }

  @Override
  public boolean isTimeRangeForAllTime(long historyDeletionInfoPtr) {
    return (boolean)N.MDNd$JT3(historyDeletionInfoPtr);
  }

  @Override
  public long getTimeRangeBegin(long historyDeletionInfoPtr) {
    return (long)N.MnN3KMAm(historyDeletionInfoPtr);
  }

  @Override
  public long getTimeRangeEnd(long historyDeletionInfoPtr) {
    return (long)N.MJagjgdk(historyDeletionInfoPtr);
  }

  public static HistoryDeletionInfo.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.history.HistoryDeletionInfo.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new HistoryDeletionInfoJni();
  }
}
