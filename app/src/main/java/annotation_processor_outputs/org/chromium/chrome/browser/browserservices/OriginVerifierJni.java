package org.chromium.chrome.browser.browserservices;

import J.N;
import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.content_public.browser.WebContents;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class OriginVerifierJni implements OriginVerifier.Natives {
  private static OriginVerifier.Natives testInstance;

  public static final JniStaticTestMocker<OriginVerifier.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.browserservices.OriginVerifier.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.browserservices.OriginVerifier.Natives instance) {
      if (!J.N.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public long init(OriginVerifier caller, WebContents webContents, Profile profile) {
    return (long)N.MIsZKhfQ(caller, webContents, profile);
  }

  @Override
  public boolean verifyOrigin(long nativeOriginVerifier, OriginVerifier caller, String packageName,
      String signatureFingerprint, String origin, String relationship) {
    return (boolean)N.Mr9N0pbv(nativeOriginVerifier, caller, packageName, signatureFingerprint, origin, relationship);
  }

  @Override
  public void destroy(long nativeOriginVerifier, OriginVerifier caller) {
    N.M5qOsuVc(nativeOriginVerifier, caller);
  }

  public static OriginVerifier.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.browserservices.OriginVerifier.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new OriginVerifierJni();
  }
}
