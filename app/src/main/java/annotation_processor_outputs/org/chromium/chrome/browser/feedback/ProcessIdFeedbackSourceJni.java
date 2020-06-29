package org.chromium.chrome.browser.feedback;

import J.N;
import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class ProcessIdFeedbackSourceJni implements ProcessIdFeedbackSource.Natives {
  private static ProcessIdFeedbackSource.Natives testInstance;

  public static final JniStaticTestMocker<ProcessIdFeedbackSource.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.feedback.ProcessIdFeedbackSource.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.feedback.ProcessIdFeedbackSource.Natives instance) {
      if (!J.N.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public long getCurrentPid() {
    return (long)N.MXN_TQGn();
  }

  @Override
  public void start(ProcessIdFeedbackSource source) {
    N.Mx7ChZtk(source);
  }

  @Override
  public long[] getProcessIdsForType(long nativeProcessIdFeedbackSource,
      ProcessIdFeedbackSource caller, int processType) {
    return (long[])N.MKHKXOCT(nativeProcessIdFeedbackSource, caller, processType);
  }

  public static ProcessIdFeedbackSource.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.feedback.ProcessIdFeedbackSource.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new ProcessIdFeedbackSourceJni();
  }
}
