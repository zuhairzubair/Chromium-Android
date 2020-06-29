package org.chromium.chrome.browser.autofill;

import J.N;
import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class PhoneNumberUtilJni implements PhoneNumberUtil.Natives {
  private static PhoneNumberUtil.Natives testInstance;

  public static final JniStaticTestMocker<PhoneNumberUtil.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.autofill.PhoneNumberUtil.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.autofill.PhoneNumberUtil.Natives instance) {
      if (!J.N.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public String formatForDisplay(String phoneNumber, String countryCode) {
    return (String)N.MDrtwxb3(phoneNumber, countryCode);
  }

  @Override
  public String formatForResponse(String phoneNumber) {
    return (String)N.MntwGN0J(phoneNumber);
  }

  @Override
  public boolean isPossibleNumber(String phoneNumber, String countryCode) {
    return (boolean)N.MgAmKYAu(phoneNumber, countryCode);
  }

  public static PhoneNumberUtil.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.autofill.PhoneNumberUtil.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new PhoneNumberUtilJni();
  }
}
