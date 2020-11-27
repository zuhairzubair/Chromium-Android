package org.chromium.components.dom_distiller.core;

import J.N;
import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class DistilledPagePrefsJni implements DistilledPagePrefs.Natives {
  private static DistilledPagePrefs.Natives testInstance;

  public static final JniStaticTestMocker<DistilledPagePrefs.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.components.dom_distiller.core.DistilledPagePrefs.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.components.dom_distiller.core.DistilledPagePrefs.Natives instance) {
      if (!J.N.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public long init(DistilledPagePrefs caller, long distilledPagePrefPtr) {
    return (long)N.MazIrxOm(caller, distilledPagePrefPtr);
  }

  @Override
  public void setFontFamily(long nativeDistilledPagePrefsAndroid, DistilledPagePrefs caller,
      int fontFamily) {
    N.MfkxLC88(nativeDistilledPagePrefsAndroid, caller, fontFamily);
  }

  @Override
  public int getFontFamily(long nativeDistilledPagePrefsAndroid, DistilledPagePrefs caller) {
    return (int)N.MSGVGQGo(nativeDistilledPagePrefsAndroid, caller);
  }

  @Override
  public void setTheme(long nativeDistilledPagePrefsAndroid, DistilledPagePrefs caller, int theme) {
    N.MJBehZGI(nativeDistilledPagePrefsAndroid, caller, theme);
  }

  @Override
  public int getTheme(long nativeDistilledPagePrefsAndroid, DistilledPagePrefs caller) {
    return (int)N.Mi1cN$gk(nativeDistilledPagePrefsAndroid, caller);
  }

  @Override
  public void setFontScaling(long nativeDistilledPagePrefsAndroid, DistilledPagePrefs caller,
      float scaling) {
    N.MaB$bTgz(nativeDistilledPagePrefsAndroid, caller, scaling);
  }

  @Override
  public float getFontScaling(long nativeDistilledPagePrefsAndroid, DistilledPagePrefs caller) {
    return (float)N.MGNXZIUg(nativeDistilledPagePrefsAndroid, caller);
  }

  @Override
  public void addObserver(long nativeDistilledPagePrefsAndroid, DistilledPagePrefs caller,
      long nativeObserverPtr) {
    N.MznRD745(nativeDistilledPagePrefsAndroid, caller, nativeObserverPtr);
  }

  @Override
  public void removeObserver(long nativeDistilledPagePrefsAndroid, DistilledPagePrefs caller,
      long nativeObserverPtr) {
    N.M_HmEv0F(nativeDistilledPagePrefsAndroid, caller, nativeObserverPtr);
  }

  @Override
  public long initObserverAndroid(DistilledPagePrefs.DistilledPagePrefsObserverWrapper caller) {
    return (long)N.MxAdC41V(caller);
  }

  @Override
  public void destroyObserverAndroid(long nativeDistilledPagePrefsObserverAndroid) {
    N.MGXAfNxO(nativeDistilledPagePrefsObserverAndroid);
  }

  public static DistilledPagePrefs.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.components.dom_distiller.core.DistilledPagePrefs.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new DistilledPagePrefsJni();
  }
}
