package org.chromium.chrome.browser.settings.website;

import J.N;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.chrome.browser.profiles.Profile;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
public final class WebsitePreferenceBridgeJni implements WebsitePreferenceBridge.Natives {
  private static WebsitePreferenceBridge.Natives testInstance;

  public static final JniStaticTestMocker<WebsitePreferenceBridge.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.settings.website.WebsitePreferenceBridge.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.settings.website.WebsitePreferenceBridge.Natives instance) {
      if (!J.N.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void getArOrigins(Object list) {
    N.Ms2hY0DA(list);
  }

  @Override
  public void getCameraOrigins(Object list, boolean managedOnly) {
    N.MKTw1dxY(list, managedOnly);
  }

  @Override
  public void getClipboardOrigins(Object list) {
    N.MQvChB_P(list);
  }

  @Override
  public void getGeolocationOrigins(Object list, boolean managedOnly) {
    N.MSWoSJWB(list, managedOnly);
  }

  @Override
  public void getMicrophoneOrigins(Object list, boolean managedOnly) {
    N.MD5vAbhk(list, managedOnly);
  }

  @Override
  public void getMidiOrigins(Object list) {
    N.Mjh7KjJF(list);
  }

  @Override
  public void getNotificationOrigins(Object list) {
    N.MP6If2F$(list);
  }

  @Override
  public void getNfcOrigins(Object list) {
    N.Micrhy9p(list);
  }

  @Override
  public void getProtectedMediaIdentifierOrigins(Object list) {
    N.M8DlRZjZ(list);
  }

  @Override
  public boolean getNfcEnabled() {
    return (boolean)N.MZGybbP1();
  }

  @Override
  public void getSensorsOrigins(Object list) {
    N.Mcmd1bqe(list);
  }

  @Override
  public void getVrOrigins(Object list) {
    N.M4Jj7QWW(list);
  }

  @Override
  public int getArSettingForOrigin(String origin, String embedder, boolean isIncognito) {
    return (int)N.MezMuoTX(origin, embedder, isIncognito);
  }

  @Override
  public int getCameraSettingForOrigin(String origin, String embedder, boolean isIncognito) {
    return (int)N.MAl7w1o_(origin, embedder, isIncognito);
  }

  @Override
  public int getClipboardSettingForOrigin(String origin, boolean isIncognito) {
    return (int)N.Mg5OPIFa(origin, isIncognito);
  }

  @Override
  public int getGeolocationSettingForOrigin(String origin, String embedder, boolean isIncognito) {
    return (int)N.MGhKbo3s(origin, embedder, isIncognito);
  }

  @Override
  public int getMicrophoneSettingForOrigin(String origin, String embedder, boolean isIncognito) {
    return (int)N.M4YOyrHl(origin, embedder, isIncognito);
  }

  @Override
  public int getMidiSettingForOrigin(String origin, String embedder, boolean isIncognito) {
    return (int)N.McOk2TIn(origin, embedder, isIncognito);
  }

  @Override
  public int getNfcSettingForOrigin(String origin, String embedder, boolean isIncognito) {
    return (int)N.MN9wopu8(origin, embedder, isIncognito);
  }

  @Override
  public int getNotificationSettingForOrigin(String origin, boolean isIncognito) {
    return (int)N.MdSE7byZ(origin, isIncognito);
  }

  @Override
  public boolean isNotificationEmbargoedForOrigin(Profile profile, String origin) {
    return (boolean)N.Md8fnW_P(profile, origin);
  }

  @Override
  public int getProtectedMediaIdentifierSettingForOrigin(String origin, String embedder,
      boolean isIncognito) {
    return (int)N.Mp8zYdSG(origin, embedder, isIncognito);
  }

  @Override
  public int getSensorsSettingForOrigin(String origin, String embedder, boolean isIncognito) {
    return (int)N.M3QMoHrK(origin, embedder, isIncognito);
  }

  @Override
  public int getVrSettingForOrigin(String origin, String embedder, boolean isIncognito) {
    return (int)N.MzfXVGsa(origin, embedder, isIncognito);
  }

  @Override
  public void setArSettingForOrigin(String origin, String embedder, int value,
      boolean isIncognito) {
    N.Mo8v06qK(origin, embedder, value, isIncognito);
  }

  @Override
  public void setCameraSettingForOrigin(String origin, int value, boolean isIncognito) {
    N.McDkzrNQ(origin, value, isIncognito);
  }

  @Override
  public void setClipboardSettingForOrigin(String origin, int value, boolean isIncognito) {
    N.MiIjDLyv(origin, value, isIncognito);
  }

  @Override
  public void setGeolocationSettingForOrigin(String origin, String embedder, int value,
      boolean isIncognito) {
    N.Mq5kwlx5(origin, embedder, value, isIncognito);
  }

  @Override
  public void setMicrophoneSettingForOrigin(String origin, int value, boolean isIncognito) {
    N.MwHaLB2d(origin, value, isIncognito);
  }

  @Override
  public void setMidiSettingForOrigin(String origin, String embedder, int value,
      boolean isIncognito) {
    N.MxzfeSre(origin, embedder, value, isIncognito);
  }

  @Override
  public void setNfcSettingForOrigin(String origin, String embedder, int value,
      boolean isIncognito) {
    N.MC$0NZSZ(origin, embedder, value, isIncognito);
  }

  @Override
  public void setNotificationSettingForOrigin(String origin, int value, boolean isIncognito) {
    N.MzA6gloa(origin, value, isIncognito);
  }

  @Override
  public void reportNotificationRevokedForOrigin(String origin, int newSettingValue,
      boolean isIncognito) {
    N.MaGpWvYn(origin, newSettingValue, isIncognito);
  }

  @Override
  public void setProtectedMediaIdentifierSettingForOrigin(String origin, String embedder, int value,
      boolean isIncognito) {
    N.MX2itkWg(origin, embedder, value, isIncognito);
  }

  @Override
  public void setSensorsSettingForOrigin(String origin, String embedder, int value,
      boolean isIncognito) {
    N.M_Kz9zba(origin, embedder, value, isIncognito);
  }

  @Override
  public void setVrSettingForOrigin(String origin, String embedder, int value,
      boolean isIncognito) {
    N.MYg3nG1p(origin, embedder, value, isIncognito);
  }

  @Override
  public void clearBannerData(String origin) {
    N.MjMVdGnu(origin);
  }

  @Override
  public void clearMediaLicenses(String origin) {
    N.M6cxA2s9(origin);
  }

  @Override
  public void clearCookieData(String path) {
    N.MFFkJwXG(path);
  }

  @Override
  public void clearLocalStorageData(String path, Object callback) {
    N.MlEhCct9(path, callback);
  }

  @Override
  public void clearStorageData(String origin, int type, Object callback) {
    N.MEPhFv8N(origin, type, callback);
  }

  @Override
  public void getChosenObjects(int type, Object list) {
    N.MMra8MKW(type, list);
  }

  @Override
  public void resetNotificationsSettingsForTest() {
    N.MeUbUT7g();
  }

  @Override
  public void revokeObjectPermission(int type, String origin, String embedder, String object) {
    N.McS1IM9K(type, origin, embedder, object);
  }

  @Override
  public boolean isContentSettingsPatternValid(String pattern) {
    return (boolean)N.Myqojysl(pattern);
  }

  @Override
  public boolean urlMatchesContentSettingsPattern(String url, String pattern) {
    return (boolean)N.MnZI1hzi(url, pattern);
  }

  @Override
  public void fetchStorageInfo(Object callback) {
    N.MHY2PpDb(callback);
  }

  @Override
  public void fetchLocalStorageInfo(Object callback, boolean includeImportant) {
    N.MsBVt3bB(callback, includeImportant);
  }

  @Override
  public boolean isPermissionControlledByDSE(int contentSettingsType, String origin,
      boolean isIncognito) {
    return (boolean)N.MupmhqOw(contentSettingsType, origin, isIncognito);
  }

  @Override
  public boolean getAdBlockingActivated(String origin) {
    return (boolean)N.M4qjk5EM(origin);
  }

  @Override
  public boolean isContentSettingEnabled(int contentSettingType) {
    return (boolean)N.MzhC7uCH(contentSettingType);
  }

  @Override
  public boolean isContentSettingManaged(int contentSettingType) {
    return (boolean)N.MVgNcUyW(contentSettingType);
  }

  @Override
  public void setContentSettingEnabled(int contentSettingType, boolean allow) {
    N.MOg2QEzZ(contentSettingType, allow);
  }

  @Override
  public void getContentSettingsExceptions(int contentSettingsType,
      List<ContentSettingException> list) {
    N.MR9_7wWJ(contentSettingsType, list);
  }

  @Override
  public void setContentSettingForPattern(int contentSettingType, String primaryPattern,
      String secondaryPattern, int setting) {
    N.M_UReks0(contentSettingType, primaryPattern, secondaryPattern, setting);
  }

  @Override
  public int getContentSetting(int contentSettingType) {
    return (int)N.MlVGOcAm(contentSettingType);
  }

  @Override
  public void setContentSetting(int contentSettingType, int setting) {
    N.MyxgEy9t(contentSettingType, setting);
  }

  @Override
  public boolean getAcceptCookiesEnabled() {
    return (boolean)N.MGEN$98C();
  }

  @Override
  public boolean getAcceptCookiesUserModifiable() {
    return (boolean)N.MIme5YVB();
  }

  @Override
  public boolean getAcceptCookiesManagedByCustodian() {
    return (boolean)N.M6xKlvLm();
  }

  @Override
  public boolean getArEnabled() {
    return (boolean)N.MFgzuTqF();
  }

  @Override
  public boolean getAutomaticDownloadsEnabled() {
    return (boolean)N.MVmD0X62();
  }

  @Override
  public boolean getBackgroundSyncEnabled() {
    return (boolean)N.MPmoYC0$();
  }

  @Override
  public boolean getAllowLocationUserModifiable() {
    return (boolean)N.MtTNcPLS();
  }

  @Override
  public boolean getLocationAllowedByPolicy() {
    return (boolean)N.MygbHRaU();
  }

  @Override
  public boolean getAllowLocationManagedByCustodian() {
    return (boolean)N.MJSjVnyO();
  }

  @Override
  public boolean getCameraEnabled() {
    return (boolean)N.MqPDcqRa();
  }

  @Override
  public void setCameraEnabled(boolean enabled) {
    N.M_2xbxMA(enabled);
  }

  @Override
  public boolean getCameraUserModifiable() {
    return (boolean)N.MtzDPoSB();
  }

  @Override
  public boolean getCameraManagedByCustodian() {
    return (boolean)N.MdfKr2m4();
  }

  @Override
  public boolean getMicEnabled() {
    return (boolean)N.M8sDPRul();
  }

  @Override
  public void setMicEnabled(boolean enabled) {
    N.MH0gpyYV(enabled);
  }

  @Override
  public boolean getMicUserModifiable() {
    return (boolean)N.MVf85Pcf();
  }

  @Override
  public boolean getMicManagedByCustodian() {
    return (boolean)N.Mp9JkT0X();
  }

  @Override
  public boolean getSensorsEnabled() {
    return (boolean)N.MYkQ_6Q_();
  }

  @Override
  public boolean getSoundEnabled() {
    return (boolean)N.Mb3gdH8X();
  }

  @Override
  public boolean getVrEnabled() {
    return (boolean)N.Mg4390UU();
  }

  @Override
  public void setAutomaticDownloadsEnabled(boolean enabled) {
    N.MwKjm35f(enabled);
  }

  @Override
  public void setAllowCookiesEnabled(boolean enabled) {
    N.MwAI1mjl(enabled);
  }

  @Override
  public void setArEnabled(boolean enabled) {
    N.MVbybjF7(enabled);
  }

  @Override
  public void setBackgroundSyncEnabled(boolean enabled) {
    N.MX_4Pbnq(enabled);
  }

  @Override
  public void setClipboardEnabled(boolean enabled) {
    N.M03UkQAa(enabled);
  }

  @Override
  public boolean getAllowLocationEnabled() {
    return (boolean)N.MXNX193k();
  }

  @Override
  public boolean getNotificationsEnabled() {
    return (boolean)N.MMsbmzNP();
  }

  @Override
  public void setAllowLocationEnabled(boolean enabled) {
    N.Mihzm3Up(enabled);
  }

  @Override
  public void setNotificationsEnabled(boolean enabled) {
    N.MLlnkuwZ(enabled);
  }

  @Override
  public void setNfcEnabled(boolean enabled) {
    N.M$z4ryGW(enabled);
  }

  @Override
  public void setSensorsEnabled(boolean enabled) {
    N.MvQW8wbt(enabled);
  }

  @Override
  public void setSoundEnabled(boolean enabled) {
    N.ML7Nbi6W(enabled);
  }

  @Override
  public void setVrEnabled(boolean enabled) {
    N.Mv3EyWFY(enabled);
  }

  @Override
  public boolean getQuietNotificationsUiEnabled(Profile profile) {
    return (boolean)N.MNYBCwWc(profile);
  }

  @Override
  public void setQuietNotificationsUiEnabled(Profile profile, boolean enabled) {
    N.Msf7b7cM(profile, enabled);
  }

  public static WebsitePreferenceBridge.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.settings.website.WebsitePreferenceBridge.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new WebsitePreferenceBridgeJni();
  }
}
