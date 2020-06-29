package org.chromium.chrome.browser.feed;

import J.N;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.Callback;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.chrome.browser.profiles.Profile;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class FeedOfflineBridgeJni implements FeedOfflineBridge.Natives {
  private static FeedOfflineBridge.Natives testInstance;

  public static final JniStaticTestMocker<FeedOfflineBridge.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.feed.FeedOfflineBridge.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.feed.FeedOfflineBridge.Natives instance) {
      if (!J.N.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public long init(FeedOfflineBridge caller, Profile profile) {
    return (long)N.MaGrAjgz(caller, profile);
  }

  @Override
  public void destroy(long nativeFeedOfflineBridge, FeedOfflineBridge caller) {
    N.MKWj9Aql(nativeFeedOfflineBridge, caller);
  }

  @Override
  public Object getOfflineId(long nativeFeedOfflineBridge, FeedOfflineBridge caller, String url) {
    return (Object)N.M$2$8xNi(nativeFeedOfflineBridge, caller, url);
  }

  @Override
  public void getOfflineStatus(long nativeFeedOfflineBridge, FeedOfflineBridge caller,
      String[] urlsToRetrieve, Callback<String[]> urlListConsumer) {
    N.Ml8HyDyp(nativeFeedOfflineBridge, caller, urlsToRetrieve, urlListConsumer);
  }

  @Override
  public void onContentRemoved(long nativeFeedOfflineBridge, FeedOfflineBridge caller,
      String[] urlsRemoved) {
    N.McSRYN66(nativeFeedOfflineBridge, caller, urlsRemoved);
  }

  @Override
  public void onNewContentReceived(long nativeFeedOfflineBridge, FeedOfflineBridge caller) {
    N.Mhsm9OvK(nativeFeedOfflineBridge, caller);
  }

  @Override
  public void onNoListeners(long nativeFeedOfflineBridge, FeedOfflineBridge caller) {
    N.Mt170tkS(nativeFeedOfflineBridge, caller);
  }

  @Override
  public void appendContentMetadata(long nativeFeedOfflineBridge, FeedOfflineBridge caller,
      String url, String title, long timePublishedMs, String imageUrl, String publisher,
      String faviconUrl, String snippet) {
    N.MfN7x4DK(nativeFeedOfflineBridge, caller, url, title, timePublishedMs, imageUrl, publisher, faviconUrl, snippet);
  }

  @Override
  public void onGetKnownContentDone(long nativeFeedOfflineBridge, FeedOfflineBridge caller) {
    N.MxzlwGPP(nativeFeedOfflineBridge, caller);
  }

  public static FeedOfflineBridge.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.feed.FeedOfflineBridge.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new FeedOfflineBridgeJni();
  }
}
