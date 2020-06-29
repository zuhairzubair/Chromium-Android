package org.chromium.chrome.browser.complex_tasks.endpoint_fetcher;

import J.N;
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
final class EndpointFetcherJni implements EndpointFetcher.Natives {
  private static EndpointFetcher.Natives testInstance;

  public static final JniStaticTestMocker<EndpointFetcher.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.complex_tasks.endpoint_fetcher.EndpointFetcher.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.complex_tasks.endpoint_fetcher.EndpointFetcher.Natives instance) {
      if (!J.N.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void nativeFetch(Profile profile, String oathConsumerName, String url, String httpsMethod,
      String contentType, String[] scopes, String postData, long timeout, Callback callback) {
    N.MLBIS4O2(profile, oathConsumerName, url, httpsMethod, contentType, scopes, postData, timeout, callback);
  }

  public static EndpointFetcher.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.complex_tasks.endpoint_fetcher.EndpointFetcher.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new EndpointFetcherJni();
  }
}
