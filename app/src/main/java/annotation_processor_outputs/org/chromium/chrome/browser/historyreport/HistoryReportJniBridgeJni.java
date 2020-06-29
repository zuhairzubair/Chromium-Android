package org.chromium.chrome.browser.historyreport;

import J.N;
import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class HistoryReportJniBridgeJni implements HistoryReportJniBridge.Natives {
  private static HistoryReportJniBridge.Natives testInstance;

  public static final JniStaticTestMocker<HistoryReportJniBridge.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.historyreport.HistoryReportJniBridge.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.historyreport.HistoryReportJniBridge.Natives instance) {
      if (!J.N.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public long init(HistoryReportJniBridge caller) {
    return (long)N.MTybPOFS(caller);
  }

  @Override
  public long trimDeltaFile(long nativeHistoryReportJniBridge, HistoryReportJniBridge caller,
      long seqNoLowerBound) {
    return (long)N.Mao2fV_W(nativeHistoryReportJniBridge, caller, seqNoLowerBound);
  }

  @Override
  public DeltaFileEntry[] query(long nativeHistoryReportJniBridge, HistoryReportJniBridge caller,
      long lastSeqNo, int limit) {
    return (DeltaFileEntry[])N.MRHqDjPT(nativeHistoryReportJniBridge, caller, lastSeqNo, limit);
  }

  @Override
  public UsageReport[] getUsageReportsBatch(long nativeHistoryReportJniBridge,
      HistoryReportJniBridge caller, int batchSize) {
    return (UsageReport[])N.MLhU72Je(nativeHistoryReportJniBridge, caller, batchSize);
  }

  @Override
  public void removeUsageReports(long nativeHistoryReportJniBridge, HistoryReportJniBridge caller,
      String[] reportIds) {
    N.MilENC5v(nativeHistoryReportJniBridge, caller, reportIds);
  }

  @Override
  public void clearUsageReports(long nativeHistoryReportJniBridge, HistoryReportJniBridge caller) {
    N.M6zbYlIM(nativeHistoryReportJniBridge, caller);
  }

  @Override
  public boolean addHistoricVisitsToUsageReportsBuffer(long nativeHistoryReportJniBridge,
      HistoryReportJniBridge caller) {
    return (boolean)N.MgsI50d_(nativeHistoryReportJniBridge, caller);
  }

  @Override
  public String dump(long nativeHistoryReportJniBridge, HistoryReportJniBridge caller) {
    return (String)N.MQUkZY_W(nativeHistoryReportJniBridge, caller);
  }

  public static HistoryReportJniBridge.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.historyreport.HistoryReportJniBridge.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new HistoryReportJniBridgeJni();
  }
}
