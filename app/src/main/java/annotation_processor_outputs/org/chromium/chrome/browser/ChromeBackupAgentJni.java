package org.chromium.chrome.browser;

import J.N;
import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class ChromeBackupAgentJni implements ChromeBackupAgent.Natives {
  private static ChromeBackupAgent.Natives testInstance;

  public static final JniStaticTestMocker<ChromeBackupAgent.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.ChromeBackupAgent.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.ChromeBackupAgent.Natives instance) {
      if (!J.N.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public String[] getBoolBackupNames(ChromeBackupAgent caller) {
    return (String[])N.MbX2xqHc(caller);
  }

  @Override
  public boolean[] getBoolBackupValues(ChromeBackupAgent caller) {
    return (boolean[])N.MK5h0eL7(caller);
  }

  @Override
  public void setBoolBackupPrefs(ChromeBackupAgent caller, String[] name, boolean[] value) {
    N.Mz_v0sJG(caller, name, value);
  }

  public static ChromeBackupAgent.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.ChromeBackupAgent.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new ChromeBackupAgentJni();
  }
}
