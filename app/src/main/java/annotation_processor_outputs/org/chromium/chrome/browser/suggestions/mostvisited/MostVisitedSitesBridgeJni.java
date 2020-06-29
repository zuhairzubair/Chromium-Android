package org.chromium.chrome.browser.suggestions.mostvisited;

import J.N;
import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.chrome.browser.profiles.Profile;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class MostVisitedSitesBridgeJni implements MostVisitedSitesBridge.Natives {
  private static MostVisitedSitesBridge.Natives testInstance;

  public static final JniStaticTestMocker<MostVisitedSitesBridge.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.suggestions.mostvisited.MostVisitedSitesBridge.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.suggestions.mostvisited.MostVisitedSitesBridge.Natives instance) {
      if (!J.N.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public long init(MostVisitedSitesBridge caller, Profile profile) {
    return (long)N.M8pqI3Tk(caller, profile);
  }

  @Override
  public void destroy(long nativeMostVisitedSitesBridge, MostVisitedSitesBridge caller) {
    N.MdGxo8sV(nativeMostVisitedSitesBridge, caller);
  }

  @Override
  public void onHomepageStateChanged(long nativeMostVisitedSitesBridge,
      MostVisitedSitesBridge caller) {
    N.MtaFCH9Q(nativeMostVisitedSitesBridge, caller);
  }

  @Override
  public void setHomepageClient(long nativeMostVisitedSitesBridge, MostVisitedSitesBridge caller,
      MostVisitedSites.HomepageClient homePageClient) {
    N.M$$yjxmq(nativeMostVisitedSitesBridge, caller, homePageClient);
  }

  @Override
  public void setObserver(long nativeMostVisitedSitesBridge, MostVisitedSitesBridge caller,
      MostVisitedSitesBridge observer, int numSites) {
    N.MsZWK0fV(nativeMostVisitedSitesBridge, caller, observer, numSites);
  }

  @Override
  public void addOrRemoveBlacklistedUrl(long nativeMostVisitedSitesBridge,
      MostVisitedSitesBridge caller, String url, boolean addUrl) {
    N.MiYcPIkn(nativeMostVisitedSitesBridge, caller, url, addUrl);
  }

  @Override
  public void recordPageImpression(long nativeMostVisitedSitesBridge, MostVisitedSitesBridge caller,
      int tilesCount) {
    N.MtbOuYlk(nativeMostVisitedSitesBridge, caller, tilesCount);
  }

  @Override
  public void recordTileImpression(long nativeMostVisitedSitesBridge, MostVisitedSitesBridge caller,
      int index, int type, int iconType, int titleSource, int source, long dataGenerationTimeMs,
      String url) {
    N.MwKG6a15(nativeMostVisitedSitesBridge, caller, index, type, iconType, titleSource, source, dataGenerationTimeMs, url);
  }

  @Override
  public void recordOpenedMostVisitedItem(long nativeMostVisitedSitesBridge,
      MostVisitedSitesBridge caller, int index, int tileType, int titleSource, int source,
      long dataGenerationTimeMs) {
    N.M6eoyhxR(nativeMostVisitedSitesBridge, caller, index, tileType, titleSource, source, dataGenerationTimeMs);
  }

  public static MostVisitedSitesBridge.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.suggestions.mostvisited.MostVisitedSitesBridge.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new MostVisitedSitesBridgeJni();
  }
}
