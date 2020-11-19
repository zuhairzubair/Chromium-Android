package org.chromium.chrome.browser.util;

import J.N;
import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
public final class UrlUtilitiesJni implements UrlUtilities.Natives {
  private static UrlUtilities.Natives testInstance;

  public static final JniStaticTestMocker<UrlUtilities.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.util.UrlUtilities.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.util.UrlUtilities.Natives instance) {
      if (!J.N.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public boolean isDownloadable(String url) {
    return (boolean)N.MrpytcIO(url);
  }

  @Override
  public boolean isValidForIntentFallbackNavigation(String url) {
    return (boolean)N.MJqwa9HZ(url);
  }

  @Override
  public boolean isAcceptedScheme(String url) {
    return (boolean)N.Mu6gb3ob(url);
  }

  @Override
  public boolean sameDomainOrHost(String primaryUrl, String secondaryUrl,
      boolean includePrivateRegistries) {
    return (boolean)N.MH09o68m(primaryUrl, secondaryUrl, includePrivateRegistries);
  }

  @Override
  public String getDomainAndRegistry(String url, boolean includePrivateRegistries) {
    return (String)N.MawEEkqq(url, includePrivateRegistries);
  }

  @Override
  public boolean isGoogleDomainUrl(String url, boolean allowNonStandardPort) {
    return (boolean)N.M4MMOKwz(url, allowNonStandardPort);
  }

  @Override
  public boolean isGoogleSubDomainUrl(String url) {
    return (boolean)N.M6KSYv$W(url);
  }

  @Override
  public boolean isGoogleSearchUrl(String url) {
    return (boolean)N.MCF9pcXT(url);
  }

  @Override
  public boolean isGoogleHomePageUrl(String url) {
    return (boolean)N.MlgcEupS(url);
  }

  @Override
  public boolean isUrlWithinScope(String url, String scopeUrl) {
    return (boolean)N.Mtj_QJ9N(url, scopeUrl);
  }

  @Override
  public boolean urlsMatchIgnoringFragments(String url, String url2) {
    return (boolean)N.Mg099ygs(url, url2);
  }

  @Override
  public boolean urlsFragmentsDiffer(String url, String url2) {
    return (boolean)N.MBdP6SoS(url, url2);
  }

  public static UrlUtilities.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.util.UrlUtilities.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new UrlUtilitiesJni();
  }
}
