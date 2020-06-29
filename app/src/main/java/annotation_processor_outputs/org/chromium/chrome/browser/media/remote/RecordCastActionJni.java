package org.chromium.chrome.browser.media.remote;

import J.N;
import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class RecordCastActionJni implements RecordCastAction.Natives {
  private static RecordCastAction.Natives testInstance;

  public static final JniStaticTestMocker<RecordCastAction.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.media.remote.RecordCastAction.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.media.remote.RecordCastAction.Natives instance) {
      if (!J.N.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void recordRemotePlaybackDeviceSelected(int deviceType) {
    N.MfUpn6aF(deviceType);
  }

  @Override
  public void recordCastPlayRequested() {
    N.MmxPIkFv();
  }

  @Override
  public void recordCastDefaultPlayerResult(boolean castSucceeded) {
    N.MSOuiJ7D(castSucceeded);
  }

  @Override
  public void recordCastYouTubePlayerResult(boolean castSucceeded) {
    N.M3oxMvht(castSucceeded);
  }

  @Override
  public void recordCastEndedTimeRemaining(int videoLengthMs, int timeRemainingMs) {
    N.M8ywhaFE(videoLengthMs, timeRemainingMs);
  }

  @Override
  public void recordCastMediaType(int mediaType) {
    N.M9IIDuZF(mediaType);
  }

  public static RecordCastAction.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.media.remote.RecordCastAction.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new RecordCastActionJni();
  }
}
