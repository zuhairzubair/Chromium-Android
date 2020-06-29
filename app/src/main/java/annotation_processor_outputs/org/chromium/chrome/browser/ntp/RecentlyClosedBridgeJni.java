package org.chromium.chrome.browser.ntp;

import J.N;
import java.lang.Override;
import java.util.List;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.chrome.browser.tab.Tab;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class RecentlyClosedBridgeJni implements RecentlyClosedBridge.Natives {
  private static RecentlyClosedBridge.Natives testInstance;

  public static final JniStaticTestMocker<RecentlyClosedBridge.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.ntp.RecentlyClosedBridge.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.ntp.RecentlyClosedBridge.Natives instance) {
      if (!J.N.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public long init(RecentlyClosedBridge caller, Profile profile) {
    return (long)N.Mlookj5S(caller, profile);
  }

  @Override
  public void destroy(long nativeRecentlyClosedTabsBridge, RecentlyClosedBridge caller) {
    N.MN6LZLAP(nativeRecentlyClosedTabsBridge, caller);
  }

  @Override
  public boolean getRecentlyClosedTabs(long nativeRecentlyClosedTabsBridge,
      RecentlyClosedBridge caller, List<RecentlyClosedTab> tabs, int maxTabCount) {
    return (boolean)N.MDcVP4$A(nativeRecentlyClosedTabsBridge, caller, tabs, maxTabCount);
  }

  @Override
  public boolean openRecentlyClosedTab(long nativeRecentlyClosedTabsBridge,
      RecentlyClosedBridge caller, Tab tab, int recentTabId, int windowOpenDisposition) {
    return (boolean)N.MvBdqLcK(nativeRecentlyClosedTabsBridge, caller, tab, recentTabId, windowOpenDisposition);
  }

  @Override
  public boolean openMostRecentlyClosedTab(long nativeRecentlyClosedTabsBridge,
      RecentlyClosedBridge caller) {
    return (boolean)N.M2TIwc10(nativeRecentlyClosedTabsBridge, caller);
  }

  @Override
  public void clearRecentlyClosedTabs(long nativeRecentlyClosedTabsBridge,
      RecentlyClosedBridge caller) {
    N.MYKF8L9p(nativeRecentlyClosedTabsBridge, caller);
  }

  public static RecentlyClosedBridge.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.ntp.RecentlyClosedBridge.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new RecentlyClosedBridgeJni();
  }
}
