package org.chromium.chrome.browser.history;

import J.N;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class BrowsingHistoryBridgeJni implements BrowsingHistoryBridge.Natives {
  private static BrowsingHistoryBridge.Natives testInstance;

  public static final JniStaticTestMocker<BrowsingHistoryBridge.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.history.BrowsingHistoryBridge.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.history.BrowsingHistoryBridge.Natives instance) {
      if (!J.N.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public long init(BrowsingHistoryBridge caller, boolean isIncognito) {
    return (long)N.Mj1_ZHGA(caller, isIncognito);
  }

  @Override
  public void destroy(long nativeBrowsingHistoryBridge, BrowsingHistoryBridge caller) {
    N.MZEuRD6z(nativeBrowsingHistoryBridge, caller);
  }

  @Override
  public void queryHistory(long nativeBrowsingHistoryBridge, BrowsingHistoryBridge caller,
      List<HistoryItem> historyItems, String query) {
    N.ML$TCyGp(nativeBrowsingHistoryBridge, caller, historyItems, query);
  }

  @Override
  public void queryHistoryContinuation(long nativeBrowsingHistoryBridge,
      BrowsingHistoryBridge caller, List<HistoryItem> historyItems) {
    N.MuGq8Vn6(nativeBrowsingHistoryBridge, caller, historyItems);
  }

  @Override
  public void markItemForRemoval(long nativeBrowsingHistoryBridge, BrowsingHistoryBridge caller,
      String url, long[] nativeTimestamps) {
    N.Mya3ANHw(nativeBrowsingHistoryBridge, caller, url, nativeTimestamps);
  }

  @Override
  public void removeItems(long nativeBrowsingHistoryBridge, BrowsingHistoryBridge caller) {
    N.MVl9wW5M(nativeBrowsingHistoryBridge, caller);
  }

  public static BrowsingHistoryBridge.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.history.BrowsingHistoryBridge.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new BrowsingHistoryBridgeJni();
  }
}
