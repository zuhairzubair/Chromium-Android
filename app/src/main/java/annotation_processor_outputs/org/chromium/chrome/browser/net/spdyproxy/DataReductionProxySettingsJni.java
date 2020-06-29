package org.chromium.chrome.browser.net.spdyproxy;

import J.N;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.chrome.browser.settings.datareduction.DataReductionDataUseItem;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class DataReductionProxySettingsJni implements DataReductionProxySettings.Natives {
  private static DataReductionProxySettings.Natives testInstance;

  public static final JniStaticTestMocker<DataReductionProxySettings.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.net.spdyproxy.DataReductionProxySettings.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.net.spdyproxy.DataReductionProxySettings.Natives instance) {
      if (!J.N.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public long init(DataReductionProxySettings caller) {
    return (long)N.M2kzbCDY(caller);
  }

  @Override
  public boolean isDataReductionProxyPromoAllowed(long nativeDataReductionProxySettingsAndroid,
      DataReductionProxySettings caller) {
    return (boolean)N.M2eLfdI_(nativeDataReductionProxySettingsAndroid, caller);
  }

  @Override
  public boolean isDataReductionProxyFREPromoAllowed(long nativeDataReductionProxySettingsAndroid,
      DataReductionProxySettings caller) {
    return (boolean)N.Mu7kSsGU(nativeDataReductionProxySettingsAndroid, caller);
  }

  @Override
  public boolean isDataReductionProxyEnabled(long nativeDataReductionProxySettingsAndroid,
      DataReductionProxySettings caller) {
    return (boolean)N.M9eQkbEA(nativeDataReductionProxySettingsAndroid, caller);
  }

  @Override
  public boolean isDataReductionProxyManaged(long nativeDataReductionProxySettingsAndroid,
      DataReductionProxySettings caller) {
    return (boolean)N.MO7d50bX(nativeDataReductionProxySettingsAndroid, caller);
  }

  @Override
  public void setDataReductionProxyEnabled(long nativeDataReductionProxySettingsAndroid,
      DataReductionProxySettings caller, boolean enabled) {
    N.MkmavAwt(nativeDataReductionProxySettingsAndroid, caller, enabled);
  }

  @Override
  public long getDataReductionLastUpdateTime(long nativeDataReductionProxySettingsAndroid,
      DataReductionProxySettings caller) {
    return (long)N.MF6dNZ7w(nativeDataReductionProxySettingsAndroid, caller);
  }

  @Override
  public void clearDataSavingStatistics(long nativeDataReductionProxySettingsAndroid,
      DataReductionProxySettings caller, int reason) {
    N.MqCEYHgN(nativeDataReductionProxySettingsAndroid, caller, reason);
  }

  @Override
  public DataReductionProxySettings.ContentLengths getContentLengths(
      long nativeDataReductionProxySettingsAndroid, DataReductionProxySettings caller) {
    return (DataReductionProxySettings.ContentLengths)N.MG86mkwd(nativeDataReductionProxySettingsAndroid, caller);
  }

  @Override
  public long getTotalHttpContentLengthSaved(long nativeDataReductionProxySettingsAndroid,
      DataReductionProxySettings caller) {
    return (long)N.Mp3ZSFr_(nativeDataReductionProxySettingsAndroid, caller);
  }

  @Override
  public long[] getDailyOriginalContentLengths(long nativeDataReductionProxySettingsAndroid,
      DataReductionProxySettings caller) {
    return (long[])N.M4N7SUZB(nativeDataReductionProxySettingsAndroid, caller);
  }

  @Override
  public long[] getDailyReceivedContentLengths(long nativeDataReductionProxySettingsAndroid,
      DataReductionProxySettings caller) {
    return (long[])N.MmJPih$3(nativeDataReductionProxySettingsAndroid, caller);
  }

  @Override
  public String getDataReductionProxyPassThroughHeader(long nativeDataReductionProxySettingsAndroid,
      DataReductionProxySettings caller) {
    return (String)N.M7tPC6la(nativeDataReductionProxySettingsAndroid, caller);
  }

  @Override
  public boolean isDataReductionProxyUnreachable(long nativeDataReductionProxySettingsAndroid,
      DataReductionProxySettings caller) {
    return (boolean)N.MdLp8Ai5(nativeDataReductionProxySettingsAndroid, caller);
  }

  @Override
  public String maybeRewriteWebliteUrl(long nativeDataReductionProxySettingsAndroid,
      DataReductionProxySettings caller, String url) {
    return (String)N.MB7bnmWo(nativeDataReductionProxySettingsAndroid, caller, url);
  }

  @Override
  public void queryDataUsage(long nativeDataReductionProxySettingsAndroid,
      DataReductionProxySettings caller, List<DataReductionDataUseItem> items, int numDays) {
    N.MLJ8wHM0(nativeDataReductionProxySettingsAndroid, caller, items, numDays);
  }

  public static DataReductionProxySettings.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.net.spdyproxy.DataReductionProxySettings.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new DataReductionProxySettingsJni();
  }
}
