package org.chromium.chrome.browser.accessibility;

import J.N;
import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class FontSizePrefsJni implements FontSizePrefs.Natives {
  private static FontSizePrefs.Natives testInstance;

  public static final JniStaticTestMocker<FontSizePrefs.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.accessibility.FontSizePrefs.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.accessibility.FontSizePrefs.Natives instance) {
      if (!J.N.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public long init(FontSizePrefs caller) {
    return (long)N.MtOl9Oto(caller);
  }

  @Override
  public void setFontScaleFactor(long nativeFontSizePrefsAndroid, FontSizePrefs caller,
      float fontScaleFactor) {
    N.Mr3oVxR_(nativeFontSizePrefsAndroid, caller, fontScaleFactor);
  }

  @Override
  public float getFontScaleFactor(long nativeFontSizePrefsAndroid, FontSizePrefs caller) {
    return (float)N.MHphDsyg(nativeFontSizePrefsAndroid, caller);
  }

  @Override
  public boolean getForceEnableZoom(long nativeFontSizePrefsAndroid, FontSizePrefs caller) {
    return (boolean)N.MOnmBKet(nativeFontSizePrefsAndroid, caller);
  }

  @Override
  public void setForceEnableZoom(long nativeFontSizePrefsAndroid, FontSizePrefs caller,
      boolean enabled) {
    N.MFeACHCG(nativeFontSizePrefsAndroid, caller, enabled);
  }

  public static FontSizePrefs.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.accessibility.FontSizePrefs.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new FontSizePrefsJni();
  }
}
