package org.chromium.components.dom_distiller.core;

import J.N;
import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class DomDistillerServiceJni implements DomDistillerService.Natives {
  private static DomDistillerService.Natives testInstance;

  public static final JniStaticTestMocker<DomDistillerService.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.components.dom_distiller.core.DomDistillerService.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.components.dom_distiller.core.DomDistillerService.Natives instance) {
      if (!J.N.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public long getDistilledPagePrefsPtr(long nativeDomDistillerServiceAndroid) {
    return (long)N.MzVEzhvu(nativeDomDistillerServiceAndroid);
  }

  public static DomDistillerService.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.components.dom_distiller.core.DomDistillerService.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new DomDistillerServiceJni();
  }
}
