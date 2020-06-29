package org.chromium.chrome.browser.rlz;

import J.N;
import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class RevenueStatsJni implements RevenueStats.Natives {
  private static RevenueStats.Natives testInstance;

  public static final JniStaticTestMocker<RevenueStats.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.rlz.RevenueStats.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(org.chromium.chrome.browser.rlz.RevenueStats.Natives instance) {
      if (!J.N.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void setSearchClient(String client) {
    N.MplsWNeH(client);
  }

  @Override
  public void setRlzParameterValue(String rlz) {
    N.MHjlpGv0(rlz);
  }

  public static RevenueStats.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.rlz.RevenueStats.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new RevenueStatsJni();
  }
}
