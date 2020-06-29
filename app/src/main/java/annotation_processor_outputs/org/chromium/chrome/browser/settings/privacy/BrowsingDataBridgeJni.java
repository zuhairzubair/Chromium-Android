package org.chromium.chrome.browser.settings.privacy;

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
final class BrowsingDataBridgeJni implements BrowsingDataBridge.Natives {
  private static BrowsingDataBridge.Natives testInstance;

  public static final JniStaticTestMocker<BrowsingDataBridge.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.settings.privacy.BrowsingDataBridge.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.settings.privacy.BrowsingDataBridge.Natives instance) {
      if (!J.N.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void clearBrowsingData(BrowsingDataBridge caller, Profile profile, int[] dataTypes,
      int timePeriod, String[] blacklistDomains, int[] blacklistedDomainReasons,
      String[] ignoredDomains, int[] ignoredDomainReasons) {
    N.M_VnjDR5(caller, profile, dataTypes, timePeriod, blacklistDomains, blacklistedDomainReasons, ignoredDomains, ignoredDomainReasons);
  }

  @Override
  public void requestInfoAboutOtherFormsOfBrowsingHistory(BrowsingDataBridge caller,
      Profile profile, BrowsingDataBridge.OtherFormsOfBrowsingHistoryListener listener) {
    N.MJC_Fcma(caller, profile, listener);
  }

  @Override
  public void fetchImportantSites(Profile profile,
      BrowsingDataBridge.ImportantSitesCallback callback) {
    N.MvLG_vXE(profile, callback);
  }

  @Override
  public int getMaxImportantSites() {
    return (int)N.MYznhD98();
  }

  @Override
  public void markOriginAsImportantForTesting(Profile profile, String origin) {
    N.Mb4HKYYu(profile, origin);
  }

  @Override
  public boolean getBrowsingDataDeletionPreference(BrowsingDataBridge caller, int dataType,
      int clearBrowsingDataTab) {
    return (boolean)N.MxZ$ufLx(caller, dataType, clearBrowsingDataTab);
  }

  @Override
  public void setBrowsingDataDeletionPreference(BrowsingDataBridge caller, int dataType,
      int clearBrowsingDataTab, boolean value) {
    N.MDRlZAaQ(caller, dataType, clearBrowsingDataTab, value);
  }

  @Override
  public int getBrowsingDataDeletionTimePeriod(BrowsingDataBridge caller,
      int clearBrowsingDataTab) {
    return (int)N.MNTS0AN5(caller, clearBrowsingDataTab);
  }

  @Override
  public void setBrowsingDataDeletionTimePeriod(BrowsingDataBridge caller, int clearBrowsingDataTab,
      int timePeriod) {
    N.MnIggMVG(caller, clearBrowsingDataTab, timePeriod);
  }

  @Override
  public int getLastClearBrowsingDataTab(BrowsingDataBridge caller) {
    return (int)N.MlgNqF5a(caller);
  }

  @Override
  public void setLastClearBrowsingDataTab(BrowsingDataBridge caller, int lastTab) {
    N.M$qgZb_y(caller, lastTab);
  }

  public static BrowsingDataBridge.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.settings.privacy.BrowsingDataBridge.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new BrowsingDataBridgeJni();
  }
}
