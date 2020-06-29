package org.chromium.chrome.browser.ntp;

import J.N;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.chrome.browser.tab.Tab;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class ForeignSessionHelperJni implements ForeignSessionHelper.Natives {
  private static ForeignSessionHelper.Natives testInstance;

  public static final JniStaticTestMocker<ForeignSessionHelper.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.ntp.ForeignSessionHelper.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.ntp.ForeignSessionHelper.Natives instance) {
      if (!J.N.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public long init(Profile profile) {
    return (long)N.MpwfXr6h(profile);
  }

  @Override
  public void destroy(long nativeForeignSessionHelper) {
    N.MHB2z4$M(nativeForeignSessionHelper);
  }

  @Override
  public boolean isTabSyncEnabled(long nativeForeignSessionHelper) {
    return (boolean)N.MWH8i2u_(nativeForeignSessionHelper);
  }

  @Override
  public void triggerSessionSync(long nativeForeignSessionHelper) {
    N.Mwf$8a3o(nativeForeignSessionHelper);
  }

  @Override
  public void setOnForeignSessionCallback(long nativeForeignSessionHelper,
      ForeignSessionHelper.ForeignSessionCallback callback) {
    N.MiRrgRsD(nativeForeignSessionHelper, callback);
  }

  @Override
  public boolean getForeignSessions(long nativeForeignSessionHelper,
      List<ForeignSessionHelper.ForeignSession> resultSessions) {
    return (boolean)N.MrEqlTFQ(nativeForeignSessionHelper, resultSessions);
  }

  @Override
  public boolean openForeignSessionTab(long nativeForeignSessionHelper, Tab tab, String sessionTag,
      int tabId, int disposition) {
    return (boolean)N.MRO3CB0d(nativeForeignSessionHelper, tab, sessionTag, tabId, disposition);
  }

  @Override
  public void deleteForeignSession(long nativeForeignSessionHelper, String sessionTag) {
    N.MKRVXtGV(nativeForeignSessionHelper, sessionTag);
  }

  @Override
  public void setInvalidationsForSessionsEnabled(long nativeForeignSessionHelper, boolean enabled) {
    N.Mq_fLm3S(nativeForeignSessionHelper, enabled);
  }

  public static ForeignSessionHelper.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.ntp.ForeignSessionHelper.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new ForeignSessionHelperJni();
  }
}
