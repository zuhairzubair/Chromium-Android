package org.chromium.chrome.browser.toolbar;

import J.N;
import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class LocationBarModelJni implements LocationBarModel.Natives {
  private static LocationBarModel.Natives testInstance;

  public static final JniStaticTestMocker<LocationBarModel.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.toolbar.LocationBarModel.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.toolbar.LocationBarModel.Natives instance) {
      if (!J.N.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public long init(LocationBarModel caller) {
    return (long)N.M8_Iwqb0(caller);
  }

  @Override
  public void destroy(long nativeLocationBarModelAndroid, LocationBarModel caller) {
    N.MltVHpYK(nativeLocationBarModelAndroid, caller);
  }

  @Override
  public String getFormattedFullURL(long nativeLocationBarModelAndroid, LocationBarModel caller) {
    return (String)N.MvJvjGzq(nativeLocationBarModelAndroid, caller);
  }

  @Override
  public String getURLForDisplay(long nativeLocationBarModelAndroid, LocationBarModel caller) {
    return (String)N.Ml$ZWVQn(nativeLocationBarModelAndroid, caller);
  }

  @Override
  public String getDisplaySearchTerms(long nativeLocationBarModelAndroid, LocationBarModel caller) {
    return (String)N.Mq9xeVda(nativeLocationBarModelAndroid, caller);
  }

  @Override
  public int getPageClassification(long nativeLocationBarModelAndroid, LocationBarModel caller,
      boolean isFocusedFromFakebox) {
    return (int)N.MY48gn2Q(nativeLocationBarModelAndroid, caller, isFocusedFromFakebox);
  }

  public static LocationBarModel.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.toolbar.LocationBarModel.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new LocationBarModelJni();
  }
}
