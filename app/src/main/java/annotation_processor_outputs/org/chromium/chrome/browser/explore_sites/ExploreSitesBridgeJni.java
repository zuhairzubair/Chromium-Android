package org.chromium.chrome.browser.explore_sites;

import J.N;
import android.graphics.Bitmap;
import java.lang.Boolean;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import javax.annotation.Generated;
import org.chromium.base.Callback;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.chrome.browser.profiles.Profile;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class ExploreSitesBridgeJni implements ExploreSitesBridge.Natives {
  private static ExploreSitesBridge.Natives testInstance;

  public static final JniStaticTestMocker<ExploreSitesBridge.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.explore_sites.ExploreSitesBridge.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.explore_sites.ExploreSitesBridge.Natives instance) {
      if (!J.N.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public int getVariation() {
    return (int)N.MwBQ$0Eq();
  }

  @Override
  public int getDenseVariation() {
    return (int)N.M81abqfZ();
  }

  @Override
  public void getIcon(Profile profile, int siteID, Callback<Bitmap> callback) {
    N.MLeky4k9(profile, siteID, callback);
  }

  @Override
  public void updateCatalogFromNetwork(Profile profile, boolean isImmediateFetch,
      Callback<Boolean> callback) {
    N.MYfYpI3c(profile, isImmediateFetch, callback);
  }

  @Override
  public void getSummaryImage(Profile profile, int pixelSize, Callback<Bitmap> callback) {
    N.Mz5zXINc(profile, pixelSize, callback);
  }

  @Override
  public void blacklistSite(Profile profile, String url) {
    N.M2Xa0Bjp(profile, url);
  }

  @Override
  public void recordClick(Profile profile, String url, int type) {
    N.M3SRRqtf(profile, url, type);
  }

  @Override
  public void getCatalog(Profile profile, int source, List<ExploreSitesCategory> result,
      Callback<List<ExploreSitesCategory>> callback) {
    N.MdXzcxSm(profile, source, result, callback);
  }

  @Override
  public void initializeCatalog(Profile profile, int source) {
    N.Mr5wBIg_(profile, source);
  }

  public static ExploreSitesBridge.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.explore_sites.ExploreSitesBridge.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new ExploreSitesBridgeJni();
  }
}
