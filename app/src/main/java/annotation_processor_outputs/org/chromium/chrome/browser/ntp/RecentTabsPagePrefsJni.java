package org.chromium.chrome.browser.ntp;

import J.N;
import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.chrome.browser.profiles.Profile;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class RecentTabsPagePrefsJni implements RecentTabsPagePrefs.Natives {
  private static RecentTabsPagePrefs.Natives testInstance;

  public static final JniStaticTestMocker<RecentTabsPagePrefs.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.ntp.RecentTabsPagePrefs.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.ntp.RecentTabsPagePrefs.Natives instance) {
      if (!J.N.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public long init(Profile profile) {
    return (long)N.MgCrfa$Q(profile);
  }

  @Override
  public void destroy(long nativeRecentTabsPagePrefs) {
    N.M79sPWt6(nativeRecentTabsPagePrefs);
  }

  @Override
  public void setSnapshotDocumentCollapsed(long nativeRecentTabsPagePrefs, boolean isCollapsed) {
    N.MhydmfCG(nativeRecentTabsPagePrefs, isCollapsed);
  }

  @Override
  public boolean getSnapshotDocumentCollapsed(long nativeRecentTabsPagePrefs) {
    return (boolean)N.MaD74OxA(nativeRecentTabsPagePrefs);
  }

  @Override
  public void setRecentlyClosedTabsCollapsed(long nativeRecentTabsPagePrefs, boolean isCollapsed) {
    N.MJ2SUJYd(nativeRecentTabsPagePrefs, isCollapsed);
  }

  @Override
  public boolean getRecentlyClosedTabsCollapsed(long nativeRecentTabsPagePrefs) {
    return (boolean)N.MvzD6qT5(nativeRecentTabsPagePrefs);
  }

  @Override
  public void setSyncPromoCollapsed(long nativeRecentTabsPagePrefs, boolean isCollapsed) {
    N.MNaMvyV8(nativeRecentTabsPagePrefs, isCollapsed);
  }

  @Override
  public boolean getSyncPromoCollapsed(long nativeRecentTabsPagePrefs) {
    return (boolean)N.MEv1xg6U(nativeRecentTabsPagePrefs);
  }

  @Override
  public void setForeignSessionCollapsed(long nativeRecentTabsPagePrefs, String sessionTag,
      boolean isCollapsed) {
    N.MTY3Z1W7(nativeRecentTabsPagePrefs, sessionTag, isCollapsed);
  }

  @Override
  public boolean getForeignSessionCollapsed(long nativeRecentTabsPagePrefs, String sessionTag) {
    return (boolean)N.MF5D$8jU(nativeRecentTabsPagePrefs, sessionTag);
  }

  public static RecentTabsPagePrefs.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.ntp.RecentTabsPagePrefs.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new RecentTabsPagePrefsJni();
  }
}
