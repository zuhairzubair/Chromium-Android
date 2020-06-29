package org.chromium.chrome.browser.feedback;

import J.N;
import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class SystemInfoFeedbackSourceJni implements SystemInfoFeedbackSource.Natives {
  private static SystemInfoFeedbackSource.Natives testInstance;

  public static final JniStaticTestMocker<SystemInfoFeedbackSource.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.feedback.SystemInfoFeedbackSource.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.feedback.SystemInfoFeedbackSource.Natives instance) {
      if (!J.N.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public String getCpuArchitecture() {
    return (String)N.MpdXuPgt();
  }

  @Override
  public String getGpuVendor() {
    return (String)N.M3VLomue();
  }

  @Override
  public String getGpuModel() {
    return (String)N.MZ6RjAhF();
  }

  @Override
  public int getAvailableMemoryMB() {
    return (int)N.Mnh$RUKx();
  }

  @Override
  public int getTotalMemoryMB() {
    return (int)N.MEPW6xxL();
  }

  public static SystemInfoFeedbackSource.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.feedback.SystemInfoFeedbackSource.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new SystemInfoFeedbackSourceJni();
  }
}
