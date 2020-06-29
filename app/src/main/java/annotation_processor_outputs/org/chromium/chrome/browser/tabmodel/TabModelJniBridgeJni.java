package org.chromium.chrome.browser.tabmodel;

import J.N;
import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.chrome.browser.tab.Tab;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class TabModelJniBridgeJni implements TabModelJniBridge.Natives {
  private static TabModelJniBridge.Natives testInstance;

  public static final JniStaticTestMocker<TabModelJniBridge.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.tabmodel.TabModelJniBridge.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.tabmodel.TabModelJniBridge.Natives instance) {
      if (!J.N.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public long init(TabModelJniBridge caller, boolean isIncognito, boolean isTabbedActivity) {
    return (long)N.M15HofTq(caller, isIncognito, isTabbedActivity);
  }

  @Override
  public Profile getProfileAndroid(long nativeTabModelJniBridge, TabModelJniBridge caller) {
    return (Profile)N.McKCR2Q3(nativeTabModelJniBridge, caller);
  }

  @Override
  public void broadcastSessionRestoreComplete(long nativeTabModelJniBridge,
      TabModelJniBridge caller) {
    N.MY_BqaOA(nativeTabModelJniBridge, caller);
  }

  @Override
  public void destroy(long nativeTabModelJniBridge, TabModelJniBridge caller) {
    N.Mg3Aho0E(nativeTabModelJniBridge, caller);
  }

  @Override
  public void tabAddedToModel(long nativeTabModelJniBridge, TabModelJniBridge caller, Tab tab) {
    N.M2Pb3$9r(nativeTabModelJniBridge, caller, tab);
  }

  @Override
  public void logFromCloseMetric(long ms, boolean perceived) {
    N.M0w4i0fl(ms, perceived);
  }

  @Override
  public void logFromExitMetric(long ms, boolean perceived) {
    N.MLFTDgsB(ms, perceived);
  }

  @Override
  public void logFromNewMetric(long ms, boolean perceived) {
    N.MloaDHKI(ms, perceived);
  }

  @Override
  public void logFromUserMetric(long ms, boolean perceived) {
    N.MWG5rxj$(ms, perceived);
  }

  public static TabModelJniBridge.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.tabmodel.TabModelJniBridge.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new TabModelJniBridgeJni();
  }
}
