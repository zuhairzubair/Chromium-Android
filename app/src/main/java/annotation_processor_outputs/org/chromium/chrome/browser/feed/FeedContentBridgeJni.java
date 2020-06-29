package org.chromium.chrome.browser.feed;

import J.N;
import java.lang.Boolean;
import java.lang.Override;
import java.lang.String;
import java.lang.Void;
import java.util.Map;
import javax.annotation.Generated;
import org.chromium.base.Callback;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.chrome.browser.profiles.Profile;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class FeedContentBridgeJni implements FeedContentBridge.Natives {
  private static FeedContentBridge.Natives testInstance;

  public static final JniStaticTestMocker<FeedContentBridge.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.feed.FeedContentBridge.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.feed.FeedContentBridge.Natives instance) {
      if (!J.N.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public long init(FeedContentBridge caller, Profile profile) {
    return (long)N.MqMtcWL$(caller, profile);
  }

  @Override
  public void destroy(long nativeFeedContentBridge, FeedContentBridge caller) {
    N.M4JPNm8Z(nativeFeedContentBridge, caller);
  }

  @Override
  public void loadContent(long nativeFeedContentBridge, FeedContentBridge caller, String[] keys,
      Callback<Map<String, byte[]>> successCallback, Callback<Void> failureCallback) {
    N.MrS8flIs(nativeFeedContentBridge, caller, keys, successCallback, failureCallback);
  }

  @Override
  public void loadContentByPrefix(long nativeFeedContentBridge, FeedContentBridge caller,
      String prefix, Callback<Map<String, byte[]>> successCallback,
      Callback<Void> failureCallback) {
    N.MXmSscWE(nativeFeedContentBridge, caller, prefix, successCallback, failureCallback);
  }

  @Override
  public void loadAllContentKeys(long nativeFeedContentBridge, FeedContentBridge caller,
      Callback<String[]> successCallback, Callback<Void> failureCallback) {
    N.Mj8PQvQF(nativeFeedContentBridge, caller, successCallback, failureCallback);
  }

  @Override
  public void commitContentMutation(long nativeFeedContentBridge, FeedContentBridge caller,
      Callback<Boolean> callback) {
    N.MK1VOe6w(nativeFeedContentBridge, caller, callback);
  }

  @Override
  public void createContentMutation(long nativeFeedContentBridge, FeedContentBridge caller) {
    N.Ms1M0Rxo(nativeFeedContentBridge, caller);
  }

  @Override
  public void deleteContentMutation(long nativeFeedContentBridge, FeedContentBridge caller) {
    N.MXlknZVM(nativeFeedContentBridge, caller);
  }

  @Override
  public void appendDeleteOperation(long nativeFeedContentBridge, FeedContentBridge caller,
      String key) {
    N.MDLslDIB(nativeFeedContentBridge, caller, key);
  }

  @Override
  public void appendDeleteByPrefixOperation(long nativeFeedContentBridge, FeedContentBridge caller,
      String prefix) {
    N.MH_cvzmC(nativeFeedContentBridge, caller, prefix);
  }

  @Override
  public void appendUpsertOperation(long nativeFeedContentBridge, FeedContentBridge caller,
      String key, byte[] data) {
    N.M6d_C$mS(nativeFeedContentBridge, caller, key, data);
  }

  @Override
  public void appendDeleteAllOperation(long nativeFeedContentBridge, FeedContentBridge caller) {
    N.MZ2u2oa4(nativeFeedContentBridge, caller);
  }

  public static FeedContentBridge.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.feed.FeedContentBridge.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new FeedContentBridgeJni();
  }
}
