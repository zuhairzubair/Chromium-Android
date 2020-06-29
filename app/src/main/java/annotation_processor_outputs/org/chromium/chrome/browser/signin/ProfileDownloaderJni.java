package org.chromium.chrome.browser.signin;

import J.N;
import android.graphics.Bitmap;
import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.chrome.browser.profiles.Profile;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class ProfileDownloaderJni implements ProfileDownloader.Natives {
  private static ProfileDownloader.Natives testInstance;

  public static final JniStaticTestMocker<ProfileDownloader.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.signin.ProfileDownloader.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.signin.ProfileDownloader.Natives instance) {
      if (!J.N.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void startFetchingAccountInfoFor(Profile profile, String accountId, int imageSidePixels,
      boolean isPreSignin) {
    N.ME3$rLSB(profile, accountId, imageSidePixels, isPreSignin);
  }

  @Override
  public String getCachedFullNameForPrimaryAccount(Profile profile) {
    return (String)N.Miyhw4y6(profile);
  }

  @Override
  public String getCachedGivenNameForPrimaryAccount(Profile profile) {
    return (String)N.MsU14RgE(profile);
  }

  @Override
  public Bitmap getCachedAvatarForPrimaryAccount(Profile profile) {
    return (Bitmap)N.M$DSsw6s(profile);
  }

  public static ProfileDownloader.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.signin.ProfileDownloader.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new ProfileDownloaderJni();
  }
}
