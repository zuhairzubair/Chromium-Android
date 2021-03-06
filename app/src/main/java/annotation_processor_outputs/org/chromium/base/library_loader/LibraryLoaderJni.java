package org.chromium.base.library_loader;

import J.N;
import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.annotations.MainDex;

@Generated("org.chromium.jni_generator.JniProcessor")
@MainDex
@CheckDiscard("crbug.com/993421")
final class LibraryLoaderJni implements LibraryLoader.Natives {
  private static LibraryLoader.Natives testInstance;

  public static final JniStaticTestMocker<LibraryLoader.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.base.library_loader.LibraryLoader.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.base.library_loader.LibraryLoader.Natives instance) {
      if (!J.N.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public boolean libraryLoaded(int processType) {
    return (boolean)N.M81WqFvs(processType);
  }

  @Override
  public void registerNonMainDexJni() {
    N.MIOj213u();
  }

  @Override
  public void recordRendererLibraryLoadTime(long libraryLoadTime) {
    N.MiAWbgCC(libraryLoadTime);
  }

  @Override
  public String getVersionNumber() {
    return (String)N.M$HdV9JM();
  }

  public static LibraryLoader.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.base.library_loader.LibraryLoader.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(true);
    return new LibraryLoaderJni();
  }
}
