package org.chromium.components.search_engines;

import J.N;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class TemplateUrlServiceJni implements TemplateUrlService.Natives {
  private static TemplateUrlService.Natives testInstance;

  public static final JniStaticTestMocker<TemplateUrlService.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.components.search_engines.TemplateUrlService.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.components.search_engines.TemplateUrlService.Natives instance) {
      if (!J.N.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void load(long nativeTemplateUrlServiceAndroid, TemplateUrlService caller) {
    N.MVKcMDBb(nativeTemplateUrlServiceAndroid, caller);
  }

  @Override
  public boolean isLoaded(long nativeTemplateUrlServiceAndroid, TemplateUrlService caller) {
    return (boolean)N.M4Z0aoFH(nativeTemplateUrlServiceAndroid, caller);
  }

  @Override
  public void setUserSelectedDefaultSearchProvider(long nativeTemplateUrlServiceAndroid,
      TemplateUrlService caller, String selectedKeyword) {
    N.MxknP4iP(nativeTemplateUrlServiceAndroid, caller, selectedKeyword);
  }

  @Override
  public boolean isDefaultSearchManaged(long nativeTemplateUrlServiceAndroid,
      TemplateUrlService caller) {
    return (boolean)N.MELaF8Vs(nativeTemplateUrlServiceAndroid, caller);
  }

  @Override
  public boolean isSearchResultsPageFromDefaultSearchProvider(long nativeTemplateUrlServiceAndroid,
      TemplateUrlService caller, String url) {
    return (boolean)N.MF3JCGn0(nativeTemplateUrlServiceAndroid, caller, url);
  }

  @Override
  public boolean isSearchByImageAvailable(long nativeTemplateUrlServiceAndroid,
      TemplateUrlService caller) {
    return (boolean)N.MpyUpqFi(nativeTemplateUrlServiceAndroid, caller);
  }

  @Override
  public boolean isDefaultSearchEngineGoogle(long nativeTemplateUrlServiceAndroid,
      TemplateUrlService caller) {
    return (boolean)N.MWMFuBEz(nativeTemplateUrlServiceAndroid, caller);
  }

  @Override
  public String getUrlForSearchQuery(long nativeTemplateUrlServiceAndroid,
      TemplateUrlService caller, String query) {
    return (String)N.Mweksmrf(nativeTemplateUrlServiceAndroid, caller, query);
  }

  @Override
  public String getSearchQueryForUrl(long nativeTemplateUrlServiceAndroid,
      TemplateUrlService caller, String url) {
    return (String)N.MfK2IDmL(nativeTemplateUrlServiceAndroid, caller, url);
  }

  @Override
  public String getUrlForVoiceSearchQuery(long nativeTemplateUrlServiceAndroid,
      TemplateUrlService caller, String query) {
    return (String)N.MA0BGHUQ(nativeTemplateUrlServiceAndroid, caller, query);
  }

  @Override
  public String getUrlForContextualSearchQuery(long nativeTemplateUrlServiceAndroid,
      TemplateUrlService caller, String query, String alternateTerm, boolean shouldPrefetch,
      String protocolVersion) {
    return (String)N.MBQwEcmT(nativeTemplateUrlServiceAndroid, caller, query, alternateTerm, shouldPrefetch, protocolVersion);
  }

  @Override
  public String getSearchEngineUrlFromTemplateUrl(long nativeTemplateUrlServiceAndroid,
      TemplateUrlService caller, String keyword) {
    return (String)N.MjOvYRBS(nativeTemplateUrlServiceAndroid, caller, keyword);
  }

  @Override
  public int getSearchEngineTypeFromTemplateUrl(long nativeTemplateUrlServiceAndroid,
      TemplateUrlService caller, String keyword) {
    return (int)N.MJpD6RKI(nativeTemplateUrlServiceAndroid, caller, keyword);
  }

  @Override
  public String addSearchEngineForTesting(long nativeTemplateUrlServiceAndroid,
      TemplateUrlService caller, String keyword, int offset) {
    return (String)N.M6WGq1yo(nativeTemplateUrlServiceAndroid, caller, keyword, offset);
  }

  @Override
  public boolean setPlayAPISearchEngine(long nativeTemplateUrlServiceAndroid,
      TemplateUrlService caller, String name, String keyword, String searchUrl, String suggestUrl,
      String faviconUrl, boolean setAsDefault) {
    return (boolean)N.Mtum8rvb(nativeTemplateUrlServiceAndroid, caller, name, keyword, searchUrl, suggestUrl, faviconUrl, setAsDefault);
  }

  @Override
  public void getTemplateUrls(long nativeTemplateUrlServiceAndroid, TemplateUrlService caller,
      List<TemplateUrl> templateUrls) {
    N.MfJgqWb9(nativeTemplateUrlServiceAndroid, caller, templateUrls);
  }

  @Override
  public TemplateUrl getDefaultSearchEngine(long nativeTemplateUrlServiceAndroid,
      TemplateUrlService caller) {
    return (TemplateUrl)N.MxujzkW4(nativeTemplateUrlServiceAndroid, caller);
  }

  public static TemplateUrlService.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.components.search_engines.TemplateUrlService.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new TemplateUrlServiceJni();
  }
}
