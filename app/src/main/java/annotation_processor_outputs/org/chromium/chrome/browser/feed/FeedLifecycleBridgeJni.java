package org.chromium.chrome.browser.feed;

import J.N;
import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.chrome.browser.profiles.Profile;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class FeedLifecycleBridgeJni implements FeedLifecycleBridge.Natives {
  private static FeedLifecycleBridge.Natives testInstance;

  public static final JniStaticTestMocker<FeedLifecycleBridge.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.feed.FeedLifecycleBridge.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.feed.FeedLifecycleBridge.Natives instance) {
      if (!J.N.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public long init(FeedLifecycleBridge caller, Profile profile) {
    return (long)N.MRzLhE1p(caller, profile);
  }

  @Override
  public void destroy(long nativeFeedLifecycleBridge, FeedLifecycleBridge caller) {
    N.M9cP0d9G(nativeFeedLifecycleBridge, caller);
  }

  public static FeedLifecycleBridge.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.feed.FeedLifecycleBridge.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new FeedLifecycleBridgeJni();
  }
}
