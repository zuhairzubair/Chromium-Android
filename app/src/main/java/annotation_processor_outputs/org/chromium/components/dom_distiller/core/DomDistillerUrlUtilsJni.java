package org.chromium.components.dom_distiller.core;

import J.N;
import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class DomDistillerUrlUtilsJni implements DomDistillerUrlUtils.Natives {
  private static DomDistillerUrlUtils.Natives testInstance;

  public static final JniStaticTestMocker<DomDistillerUrlUtils.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.components.dom_distiller.core.DomDistillerUrlUtils.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.components.dom_distiller.core.DomDistillerUrlUtils.Natives instance) {
      if (!J.N.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public String getDistillerViewUrlFromUrl(String scheme, String url) {
    return (String)N.MhGk9eKu(scheme, url);
  }

  @Override
  public String getOriginalUrlFromDistillerUrl(String viewerUrl) {
    return (String)N.M1WDPiaY(viewerUrl);
  }

  @Override
  public boolean isDistilledPage(String url) {
    return (boolean)N.Me1sexxj(url);
  }

  @Override
  public String getValueForKeyInUrl(String url, String key) {
    return (String)N.MaYR73PH(url, key);
  }

  public static DomDistillerUrlUtils.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.components.dom_distiller.core.DomDistillerUrlUtils.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new DomDistillerUrlUtilsJni();
  }
}
