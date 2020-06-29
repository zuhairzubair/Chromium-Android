package org.chromium.chrome.browser.feed;

import J.N;
import java.lang.Override;
import java.lang.Runnable;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.chrome.browser.profiles.Profile;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class FeedSchedulerBridgeJni implements FeedSchedulerBridge.Natives {
  private static FeedSchedulerBridge.Natives testInstance;

  public static final JniStaticTestMocker<FeedSchedulerBridge.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.feed.FeedSchedulerBridge.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.feed.FeedSchedulerBridge.Natives instance) {
      if (!J.N.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public long init(FeedSchedulerBridge caller, Profile profile) {
    return (long)N.MaWd4Nps(caller, profile);
  }

  @Override
  public void destroy(long nativeFeedSchedulerBridge, FeedSchedulerBridge caller) {
    N.M9Vgwidk(nativeFeedSchedulerBridge, caller);
  }

  @Override
  public int shouldSessionRequestData(long nativeFeedSchedulerBridge, FeedSchedulerBridge caller,
      boolean hasContent, long contentCreationDateTimeMs, boolean hasOutstandingRequest) {
    return (int)N.M9Es6XDh(nativeFeedSchedulerBridge, caller, hasContent, contentCreationDateTimeMs, hasOutstandingRequest);
  }

  @Override
  public void onReceiveNewContent(long nativeFeedSchedulerBridge, FeedSchedulerBridge caller,
      long contentCreationDateTimeMs) {
    N.MegjDW8s(nativeFeedSchedulerBridge, caller, contentCreationDateTimeMs);
  }

  @Override
  public void onRequestError(long nativeFeedSchedulerBridge, FeedSchedulerBridge caller,
      int networkResponseCode) {
    N.MdakQXC8(nativeFeedSchedulerBridge, caller, networkResponseCode);
  }

  @Override
  public void onForegrounded(long nativeFeedSchedulerBridge, FeedSchedulerBridge caller) {
    N.MRWjXeaB(nativeFeedSchedulerBridge, caller);
  }

  @Override
  public void onFixedTimer(long nativeFeedSchedulerBridge, FeedSchedulerBridge caller,
      Runnable onCompletion) {
    N.MxTUDJlK(nativeFeedSchedulerBridge, caller, onCompletion);
  }

  @Override
  public void onSuggestionConsumed(long nativeFeedSchedulerBridge, FeedSchedulerBridge caller) {
    N.MVdSLXOM(nativeFeedSchedulerBridge, caller);
  }

  @Override
  public boolean onArticlesCleared(long nativeFeedSchedulerBridge, FeedSchedulerBridge caller,
      boolean suppressRefreshes) {
    return (boolean)N.MNgS0Qir(nativeFeedSchedulerBridge, caller, suppressRefreshes);
  }

  public static FeedSchedulerBridge.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.feed.FeedSchedulerBridge.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new FeedSchedulerBridgeJni();
  }
}
