package org.chromium.chrome.browser.vr;

import J.N;
import android.view.Surface;
import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class ArCoreJavaUtilsJni implements ArCoreJavaUtils.Natives {
  private static ArCoreJavaUtils.Natives testInstance;

  public static final JniStaticTestMocker<ArCoreJavaUtils.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.vr.ArCoreJavaUtils.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.vr.ArCoreJavaUtils.Natives instance) {
      if (!J.N.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void onDrawingSurfaceReady(long nativeArCoreJavaUtils, ArCoreJavaUtils caller,
      Surface surface, int rotation, int width, int height) {
    N.MUHJEyBA(nativeArCoreJavaUtils, caller, surface, rotation, width, height);
  }

  @Override
  public void onDrawingSurfaceTouch(long nativeArCoreJavaUtils, ArCoreJavaUtils caller,
      boolean touching, float x, float y) {
    N.MxaxZbTC(nativeArCoreJavaUtils, caller, touching, x, y);
  }

  @Override
  public void onDrawingSurfaceDestroyed(long nativeArCoreJavaUtils, ArCoreJavaUtils caller) {
    N.MFFrfEUS(nativeArCoreJavaUtils, caller);
  }

  public static ArCoreJavaUtils.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.vr.ArCoreJavaUtils.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new ArCoreJavaUtilsJni();
  }
}
