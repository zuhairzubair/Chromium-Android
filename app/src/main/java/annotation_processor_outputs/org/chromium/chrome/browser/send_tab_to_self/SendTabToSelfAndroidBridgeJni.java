package org.chromium.chrome.browser.send_tab_to_self;

import J.N;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.content_public.browser.WebContents;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class SendTabToSelfAndroidBridgeJni implements SendTabToSelfAndroidBridge.Natives {
  private static SendTabToSelfAndroidBridge.Natives testInstance;

  public static final JniStaticTestMocker<SendTabToSelfAndroidBridge.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.send_tab_to_self.SendTabToSelfAndroidBridge.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.send_tab_to_self.SendTabToSelfAndroidBridge.Natives instance) {
      if (!J.N.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public SendTabToSelfEntry addEntry(Profile profile, String url, String title, long navigationTime,
      String targetDeviceSyncCacheGuid) {
    return (SendTabToSelfEntry)N.MKmH9Lg0(profile, url, title, navigationTime, targetDeviceSyncCacheGuid);
  }

  @Override
  public void getAllGuids(Profile profile, List<String> guids) {
    N.MadoE_YC(profile, guids);
  }

  @Override
  public void deleteAllEntries(Profile profile) {
    N.Mj5pyDRD(profile);
  }

  @Override
  public void deleteEntry(Profile profile, String guid) {
    N.MUFcnjRf(profile, guid);
  }

  @Override
  public void dismissEntry(Profile profile, String guid) {
    N.M6pRqHAq(profile, guid);
  }

  @Override
  public void markEntryOpened(Profile profile, String guid) {
    N.Mf__f4Nt(profile, guid);
  }

  @Override
  public SendTabToSelfEntry getEntryByGUID(Profile profile, String guid) {
    return (SendTabToSelfEntry)N.MUC1_m1a(profile, guid);
  }

  @Override
  public boolean isFeatureAvailable(WebContents webContents) {
    return (boolean)N.Mjnza5kO(webContents);
  }

  @Override
  public void showInfoBar(WebContents webContents, String guid, String url,
      String targetDeviceSyncCacheGuid) {
    N.MbMui4np(webContents, guid, url, targetDeviceSyncCacheGuid);
  }

  @Override
  public void getAllTargetDeviceInfos(Profile profile, List<TargetDeviceInfo> guids) {
    N.MwoWeG2K(profile, guids);
  }

  public static SendTabToSelfAndroidBridge.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.send_tab_to_self.SendTabToSelfAndroidBridge.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new SendTabToSelfAndroidBridgeJni();
  }
}
