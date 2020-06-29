package org.chromium.chrome.browser.metrics;

import J.N;
import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.content_public.browser.WebContents;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class UkmRecorderJni implements UkmRecorder.Natives {
  private static UkmRecorder.Natives testInstance;

  public static final JniStaticTestMocker<UkmRecorder.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.metrics.UkmRecorder.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.metrics.UkmRecorder.Natives instance) {
      if (!J.N.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void recordEventWithBooleanMetric(WebContents webContents, String eventName,
      String metricName) {
    N.MX4lNgiF(webContents, eventName, metricName);
  }

  @Override
  public void recordEventWithIntegerMetric(WebContents webContents, String eventName,
      String metricName, int metricValue) {
    N.M5aNQ$DO(webContents, eventName, metricName, metricValue);
  }

  public static UkmRecorder.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.metrics.UkmRecorder.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new UkmRecorderJni();
  }
}
