package org.chromium.chrome.browser.metrics;

import J.N;
import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class UmaSessionStatsJni implements UmaSessionStats.Natives {
  private static UmaSessionStats.Natives testInstance;

  public static final JniStaticTestMocker<UmaSessionStats.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.metrics.UmaSessionStats.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.metrics.UmaSessionStats.Natives instance) {
      if (!J.N.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public long init() {
    return (long)N.MU4tSmY3();
  }

  @Override
  public void changeMetricsReportingConsent(boolean consent) {
    N.Mh1r7OJ$(consent);
  }

  @Override
  public void initMetricsAndCrashReportingForTesting() {
    N.MUxX7QtQ();
  }

  @Override
  public void unsetMetricsAndCrashReportingForTesting() {
    N.MECd7f6K();
  }

  @Override
  public void updateMetricsAndCrashReportingForTesting(boolean consent) {
    N.MyAuEISA(consent);
  }

  @Override
  public void updateMetricsServiceState(boolean mayUpload) {
    N.Mq3Hvtdc(mayUpload);
  }

  @Override
  public void umaResumeSession(long nativeUmaSessionStats, UmaSessionStats caller) {
    N.M950EFso(nativeUmaSessionStats, caller);
  }

  @Override
  public void umaEndSession(long nativeUmaSessionStats, UmaSessionStats caller) {
    N.MAKAEiev(nativeUmaSessionStats, caller);
  }

  @Override
  public void registerExternalExperiment(String studyName, int[] experimentIds) {
    N.MwmPuE$v(studyName, experimentIds);
  }

  @Override
  public void registerSyntheticFieldTrial(String trialName, String groupName) {
    N.MT4iKtWs(trialName, groupName);
  }

  @Override
  public void recordTabCountPerLoad(int numTabsOpen) {
    N.MP6JTEGK(numTabsOpen);
  }

  @Override
  public void recordPageLoaded(boolean isDesktopUserAgent) {
    N.MZTfl9lI(isDesktopUserAgent);
  }

  @Override
  public void recordPageLoadedWithKeyboard() {
    N.MeATiwBk();
  }

  public static UmaSessionStats.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.metrics.UmaSessionStats.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new UmaSessionStatsJni();
  }
}
