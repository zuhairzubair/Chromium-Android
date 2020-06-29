package org.chromium.chrome.browser.sync;

import J.N;
import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class ProfileSyncServiceJni implements ProfileSyncService.Natives {
  private static ProfileSyncService.Natives testInstance;

  public static final JniStaticTestMocker<ProfileSyncService.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.sync.ProfileSyncService.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.sync.ProfileSyncService.Natives instance) {
      if (!J.N.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public long init(ProfileSyncService caller) {
    return (long)N.MulmQvSr(caller);
  }

  @Override
  public void requestStart(long nativeProfileSyncServiceAndroid, ProfileSyncService caller) {
    N.M2FbdG0l(nativeProfileSyncServiceAndroid, caller);
  }

  @Override
  public void requestStop(long nativeProfileSyncServiceAndroid, ProfileSyncService caller) {
    N.Myc5Nx1y(nativeProfileSyncServiceAndroid, caller);
  }

  @Override
  public void setSyncAllowedByPlatform(long nativeProfileSyncServiceAndroid,
      ProfileSyncService caller, boolean allowed) {
    N.Md$qCoTO(nativeProfileSyncServiceAndroid, caller, allowed);
  }

  @Override
  public void flushDirectory(long nativeProfileSyncServiceAndroid, ProfileSyncService caller) {
    N.Mbs$pg2O(nativeProfileSyncServiceAndroid, caller);
  }

  @Override
  public void setSyncSessionsId(long nativeProfileSyncServiceAndroid, ProfileSyncService caller,
      String tag) {
    N.MgBi3zGI(nativeProfileSyncServiceAndroid, caller, tag);
  }

  @Override
  public int getAuthError(long nativeProfileSyncServiceAndroid, ProfileSyncService caller) {
    return (int)N.MmYvMKiO(nativeProfileSyncServiceAndroid, caller);
  }

  @Override
  public boolean requiresClientUpgrade(long nativeProfileSyncServiceAndroid,
      ProfileSyncService caller) {
    return (boolean)N.M3XV0Up2(nativeProfileSyncServiceAndroid, caller);
  }

  @Override
  public boolean isEngineInitialized(long nativeProfileSyncServiceAndroid,
      ProfileSyncService caller) {
    return (boolean)N.Mga07EF4(nativeProfileSyncServiceAndroid, caller);
  }

  @Override
  public boolean isEncryptEverythingAllowed(long nativeProfileSyncServiceAndroid,
      ProfileSyncService caller) {
    return (boolean)N.MNBk3pKK(nativeProfileSyncServiceAndroid, caller);
  }

  @Override
  public boolean isEncryptEverythingEnabled(long nativeProfileSyncServiceAndroid,
      ProfileSyncService caller) {
    return (boolean)N.MwXg19e5(nativeProfileSyncServiceAndroid, caller);
  }

  @Override
  public boolean isTransportStateActive(long nativeProfileSyncServiceAndroid,
      ProfileSyncService caller) {
    return (boolean)N.Me8aW$ZQ(nativeProfileSyncServiceAndroid, caller);
  }

  @Override
  public void enableEncryptEverything(long nativeProfileSyncServiceAndroid,
      ProfileSyncService caller) {
    N.MXKIugP5(nativeProfileSyncServiceAndroid, caller);
  }

  @Override
  public boolean isPassphraseRequiredForPreferredDataTypes(long nativeProfileSyncServiceAndroid,
      ProfileSyncService caller) {
    return (boolean)N.M7c35BFF(nativeProfileSyncServiceAndroid, caller);
  }

  @Override
  public boolean isTrustedVaultKeyRequired(long nativeProfileSyncServiceAndroid,
      ProfileSyncService caller) {
    return (boolean)N.M8uQ8DWG(nativeProfileSyncServiceAndroid, caller);
  }

  @Override
  public boolean isTrustedVaultKeyRequiredForPreferredDataTypes(
      long nativeProfileSyncServiceAndroid, ProfileSyncService caller) {
    return (boolean)N.MbDTiQl_(nativeProfileSyncServiceAndroid, caller);
  }

  @Override
  public boolean isUsingSecondaryPassphrase(long nativeProfileSyncServiceAndroid,
      ProfileSyncService caller) {
    return (boolean)N.MKkxCXyK(nativeProfileSyncServiceAndroid, caller);
  }

  @Override
  public boolean setDecryptionPassphrase(long nativeProfileSyncServiceAndroid,
      ProfileSyncService caller, String passphrase) {
    return (boolean)N.MlUAisy7(nativeProfileSyncServiceAndroid, caller, passphrase);
  }

  @Override
  public void setEncryptionPassphrase(long nativeProfileSyncServiceAndroid,
      ProfileSyncService caller, String passphrase) {
    N.M_l3G2yX(nativeProfileSyncServiceAndroid, caller, passphrase);
  }

  @Override
  public int getPassphraseType(long nativeProfileSyncServiceAndroid, ProfileSyncService caller) {
    return (int)N.MguEMeJF(nativeProfileSyncServiceAndroid, caller);
  }

  @Override
  public boolean hasExplicitPassphraseTime(long nativeProfileSyncServiceAndroid,
      ProfileSyncService caller) {
    return (boolean)N.MZ5PAkH1(nativeProfileSyncServiceAndroid, caller);
  }

  @Override
  public long getExplicitPassphraseTime(long nativeProfileSyncServiceAndroid,
      ProfileSyncService caller) {
    return (long)N.MaVJ6PiJ(nativeProfileSyncServiceAndroid, caller);
  }

  @Override
  public String getSyncEnterGooglePassphraseBodyWithDateText(long nativeProfileSyncServiceAndroid,
      ProfileSyncService caller) {
    return (String)N.MzdbY3ND(nativeProfileSyncServiceAndroid, caller);
  }

  @Override
  public String getSyncEnterCustomPassphraseBodyWithDateText(long nativeProfileSyncServiceAndroid,
      ProfileSyncService caller) {
    return (String)N.Mm0TRqKH(nativeProfileSyncServiceAndroid, caller);
  }

  @Override
  public String getCurrentSignedInAccountText(long nativeProfileSyncServiceAndroid,
      ProfileSyncService caller) {
    return (String)N.MWW_VhAo(nativeProfileSyncServiceAndroid, caller);
  }

  @Override
  public String getSyncEnterCustomPassphraseBodyText(long nativeProfileSyncServiceAndroid,
      ProfileSyncService caller) {
    return (String)N.M9pHrX0Y(nativeProfileSyncServiceAndroid, caller);
  }

  @Override
  public int getNumberOfSyncedDevices(long nativeProfileSyncServiceAndroid,
      ProfileSyncService caller) {
    return (int)N.MJbuRc3$(nativeProfileSyncServiceAndroid, caller);
  }

  @Override
  public int[] getActiveDataTypes(long nativeProfileSyncServiceAndroid, ProfileSyncService caller) {
    return (int[])N.Mn8VB9Cv(nativeProfileSyncServiceAndroid, caller);
  }

  @Override
  public int[] getChosenDataTypes(long nativeProfileSyncServiceAndroid, ProfileSyncService caller) {
    return (int[])N.M_gH1Vgj(nativeProfileSyncServiceAndroid, caller);
  }

  @Override
  public int[] getPreferredDataTypes(long nativeProfileSyncServiceAndroid,
      ProfileSyncService caller) {
    return (int[])N.Mb40kbdU(nativeProfileSyncServiceAndroid, caller);
  }

  @Override
  public void setChosenDataTypes(long nativeProfileSyncServiceAndroid, ProfileSyncService caller,
      boolean syncEverything, int[] modelTypeArray) {
    N.MRx3HxkB(nativeProfileSyncServiceAndroid, caller, syncEverything, modelTypeArray);
  }

  @Override
  public void triggerRefresh(long nativeProfileSyncServiceAndroid, ProfileSyncService caller) {
    N.MZRDDomH(nativeProfileSyncServiceAndroid, caller);
  }

  @Override
  public void setSetupInProgress(long nativeProfileSyncServiceAndroid, ProfileSyncService caller,
      boolean inProgress) {
    N.MvEEhEqM(nativeProfileSyncServiceAndroid, caller, inProgress);
  }

  @Override
  public void setFirstSetupComplete(long nativeProfileSyncServiceAndroid, ProfileSyncService caller,
      int syncFirstSetupCompleteSource) {
    N.MlP9oGhJ(nativeProfileSyncServiceAndroid, caller, syncFirstSetupCompleteSource);
  }

  @Override
  public boolean isFirstSetupComplete(long nativeProfileSyncServiceAndroid,
      ProfileSyncService caller) {
    return (boolean)N.MaQzF2Pg(nativeProfileSyncServiceAndroid, caller);
  }

  @Override
  public boolean isSyncRequested(long nativeProfileSyncServiceAndroid, ProfileSyncService caller) {
    return (boolean)N.MB8QsrpS(nativeProfileSyncServiceAndroid, caller);
  }

  @Override
  public boolean canSyncFeatureStart(long nativeProfileSyncServiceAndroid,
      ProfileSyncService caller) {
    return (boolean)N.Map18zd9(nativeProfileSyncServiceAndroid, caller);
  }

  @Override
  public boolean isSyncActive(long nativeProfileSyncServiceAndroid, ProfileSyncService caller) {
    return (boolean)N.M$BssAkU(nativeProfileSyncServiceAndroid, caller);
  }

  @Override
  public boolean isSyncDisabledByEnterprisePolicy(long nativeProfileSyncServiceAndroid,
      ProfileSyncService caller) {
    return (boolean)N.M4TQ0K8e(nativeProfileSyncServiceAndroid, caller);
  }

  @Override
  public boolean hasKeepEverythingSynced(long nativeProfileSyncServiceAndroid,
      ProfileSyncService caller) {
    return (boolean)N.MpBx$QMz(nativeProfileSyncServiceAndroid, caller);
  }

  @Override
  public boolean hasUnrecoverableError(long nativeProfileSyncServiceAndroid,
      ProfileSyncService caller) {
    return (boolean)N.MreEfroQ(nativeProfileSyncServiceAndroid, caller);
  }

  @Override
  public boolean isPassphrasePrompted(long nativeProfileSyncServiceAndroid,
      ProfileSyncService caller) {
    return (boolean)N.MVrj7ZUK(nativeProfileSyncServiceAndroid, caller);
  }

  @Override
  public void setPassphrasePrompted(long nativeProfileSyncServiceAndroid, ProfileSyncService caller,
      boolean prompted) {
    N.Miy4KuvH(nativeProfileSyncServiceAndroid, caller, prompted);
  }

  @Override
  public long getProfileSyncServiceForTest(long nativeProfileSyncServiceAndroid,
      ProfileSyncService caller) {
    return (long)N.MMK89g6Q(nativeProfileSyncServiceAndroid, caller);
  }

  @Override
  public long getLastSyncedTimeForTest(long nativeProfileSyncServiceAndroid,
      ProfileSyncService caller) {
    return (long)N.MNKDP3EE(nativeProfileSyncServiceAndroid, caller);
  }

  @Override
  public void getAllNodes(long nativeProfileSyncServiceAndroid, ProfileSyncService caller,
      ProfileSyncService.GetAllNodesCallback callback) {
    N.MYCZiPUY(nativeProfileSyncServiceAndroid, caller, callback);
  }

  public static ProfileSyncService.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.sync.ProfileSyncService.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new ProfileSyncServiceJni();
  }
}
