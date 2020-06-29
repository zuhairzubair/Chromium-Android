package org.chromium.chrome.browser.usage_stats;

import J.N;
import java.lang.Boolean;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;
import org.chromium.base.Callback;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.chrome.browser.profiles.Profile;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class UsageStatsBridgeJni implements UsageStatsBridge.Natives {
  private static UsageStatsBridge.Natives testInstance;

  public static final JniStaticTestMocker<UsageStatsBridge.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.usage_stats.UsageStatsBridge.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.usage_stats.UsageStatsBridge.Natives instance) {
      if (!J.N.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public long init(UsageStatsBridge caller, Profile profile) {
    return (long)N.MZTYueAb(caller, profile);
  }

  @Override
  public void destroy(long nativeUsageStatsBridge, UsageStatsBridge caller) {
    N.MUrp7nfR(nativeUsageStatsBridge, caller);
  }

  @Override
  public void getAllEvents(long nativeUsageStatsBridge, UsageStatsBridge caller,
      Callback<List<WebsiteEventProtos.WebsiteEvent>> callback) {
    N.M6Rdk6FF(nativeUsageStatsBridge, caller, callback);
  }

  @Override
  public void queryEventsInRange(long nativeUsageStatsBridge, UsageStatsBridge caller, long start,
      long end, Callback<List<WebsiteEventProtos.WebsiteEvent>> callback) {
    N.M_MumILJ(nativeUsageStatsBridge, caller, start, end, callback);
  }

  @Override
  public void addEvents(long nativeUsageStatsBridge, UsageStatsBridge caller, byte[][] events,
      Callback<Boolean> callback) {
    N.M$1mbh6c(nativeUsageStatsBridge, caller, events, callback);
  }

  @Override
  public void deleteAllEvents(long nativeUsageStatsBridge, UsageStatsBridge caller,
      Callback<Boolean> callback) {
    N.Mot8dCyk(nativeUsageStatsBridge, caller, callback);
  }

  @Override
  public void deleteEventsInRange(long nativeUsageStatsBridge, UsageStatsBridge caller, long start,
      long end, Callback<Boolean> callback) {
    N.Mr1dopkU(nativeUsageStatsBridge, caller, start, end, callback);
  }

  @Override
  public void deleteEventsWithMatchingDomains(long nativeUsageStatsBridge, UsageStatsBridge caller,
      String[] domains, Callback<Boolean> callback) {
    N.M67g7Hwt(nativeUsageStatsBridge, caller, domains, callback);
  }

  @Override
  public void getAllSuspensions(long nativeUsageStatsBridge, UsageStatsBridge caller,
      Callback<String[]> callback) {
    N.MggFWmhE(nativeUsageStatsBridge, caller, callback);
  }

  @Override
  public void setSuspensions(long nativeUsageStatsBridge, UsageStatsBridge caller, String[] domains,
      Callback<Boolean> callback) {
    N.M2UQ4Zbr(nativeUsageStatsBridge, caller, domains, callback);
  }

  @Override
  public void getAllTokenMappings(long nativeUsageStatsBridge, UsageStatsBridge caller,
      Callback<Map<String, String>> callback) {
    N.MiNnjkrf(nativeUsageStatsBridge, caller, callback);
  }

  @Override
  public void setTokenMappings(long nativeUsageStatsBridge, UsageStatsBridge caller,
      String[] tokens, String[] fqdns, Callback<Boolean> callback) {
    N.Mz1N0m$q(nativeUsageStatsBridge, caller, tokens, fqdns, callback);
  }

  public static UsageStatsBridge.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.usage_stats.UsageStatsBridge.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new UsageStatsBridgeJni();
  }
}
