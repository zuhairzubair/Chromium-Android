package org.chromium.components.signin.identitymanager;

import J.N;
import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class ProfileOAuth2TokenServiceDelegateJni implements ProfileOAuth2TokenServiceDelegate.Natives {
  private static ProfileOAuth2TokenServiceDelegate.Natives testInstance;

  public static final JniStaticTestMocker<ProfileOAuth2TokenServiceDelegate.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.components.signin.identitymanager.ProfileOAuth2TokenServiceDelegate.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.components.signin.identitymanager.ProfileOAuth2TokenServiceDelegate.Natives instance) {
      if (!J.N.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void onOAuth2TokenFetched(String authToken, boolean isTransientError,
      long nativeCallback) {
    N.MTN9MD0o(authToken, isTransientError, nativeCallback);
  }

  @Override
  public void reloadAllAccountsWithPrimaryAccountAfterSeeding(
      long nativeProfileOAuth2TokenServiceDelegateAndroid, String accountId) {
    N.M0SOBbHG(nativeProfileOAuth2TokenServiceDelegateAndroid, accountId);
  }

  public static ProfileOAuth2TokenServiceDelegate.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.components.signin.identitymanager.ProfileOAuth2TokenServiceDelegate.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new ProfileOAuth2TokenServiceDelegateJni();
  }
}
