package org.chromium.chrome.browser.feed;

import J.N;
import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.Callback;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.chrome.browser.feed.library.api.host.network.HttpResponse;
import org.chromium.chrome.browser.profiles.Profile;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class FeedNetworkBridgeJni implements FeedNetworkBridge.Natives {
  private static FeedNetworkBridge.Natives testInstance;

  public static final JniStaticTestMocker<FeedNetworkBridge.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.feed.FeedNetworkBridge.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.feed.FeedNetworkBridge.Natives instance) {
      if (!J.N.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public long init(FeedNetworkBridge caller, Profile profile) {
    return (long)N.MJgQejym(caller, profile);
  }

  @Override
  public void destroy(long nativeFeedNetworkBridge, FeedNetworkBridge caller) {
    N.MP03LrBC(nativeFeedNetworkBridge, caller);
  }

  @Override
  public void sendNetworkRequest(long nativeFeedNetworkBridge, FeedNetworkBridge caller, String url,
      String requestType, byte[] body, Callback<HttpResponse> resultCallback) {
    N.MKArndPP(nativeFeedNetworkBridge, caller, url, requestType, body, resultCallback);
  }

  @Override
  public void cancelRequests(long nativeFeedNetworkBridge, FeedNetworkBridge caller) {
    N.Mb1MEFzF(nativeFeedNetworkBridge, caller);
  }

  public static FeedNetworkBridge.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.feed.FeedNetworkBridge.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new FeedNetworkBridgeJni();
  }
}
