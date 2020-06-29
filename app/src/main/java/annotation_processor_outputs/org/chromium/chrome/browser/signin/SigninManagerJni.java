package org.chromium.chrome.browser.signin;

import J.N;
import java.lang.Boolean;
import java.lang.Override;
import java.lang.Runnable;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.Callback;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.components.signin.base.CoreAccountInfo;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class SigninManagerJni implements SigninManager.Natives {
  private static SigninManager.Natives testInstance;

  public static final JniStaticTestMocker<SigninManager.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.signin.SigninManager.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.signin.SigninManager.Natives instance) {
      if (!J.N.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public boolean isSigninAllowedByPolicy(long nativeSigninManagerAndroid) {
    return (boolean)N.ML2H3J_j(nativeSigninManagerAndroid);
  }

  @Override
  public boolean isForceSigninEnabled(long nativeSigninManagerAndroid) {
    return (boolean)N.MPGEx92r(nativeSigninManagerAndroid);
  }

  @Override
  public String extractDomainName(String email) {
    return (String)N.MMMBrndt(email);
  }

  @Override
  public void fetchAndApplyCloudPolicy(long nativeSigninManagerAndroid, CoreAccountInfo account,
      Runnable callback) {
    N.MIxJzPV2(nativeSigninManagerAndroid, account, callback);
  }

  @Override
  public void stopApplyingCloudPolicy(long nativeSigninManagerAndroid) {
    N.Ma7$PdIR(nativeSigninManagerAndroid);
  }

  @Override
  public void isAccountManaged(long nativeSigninManagerAndroid, CoreAccountInfo account,
      Callback<Boolean> callback) {
    N.MDiKN8ah(nativeSigninManagerAndroid, account, callback);
  }

  @Override
  public String getManagementDomain(long nativeSigninManagerAndroid) {
    return (String)N.M4Lnd8Lh(nativeSigninManagerAndroid);
  }

  @Override
  public void wipeProfileData(long nativeSigninManagerAndroid, Runnable callback) {
    N.MPgeVXVd(nativeSigninManagerAndroid, callback);
  }

  @Override
  public void wipeGoogleServiceWorkerCaches(long nativeSigninManagerAndroid, Runnable callback) {
    N.M8qgqQLs(nativeSigninManagerAndroid, callback);
  }

  public static SigninManager.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.signin.SigninManager.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new SigninManagerJni();
  }
}
