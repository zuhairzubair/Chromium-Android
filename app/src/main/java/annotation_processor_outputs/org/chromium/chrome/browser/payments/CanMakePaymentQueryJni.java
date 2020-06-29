package org.chromium.chrome.browser.payments;

import J.N;
import java.lang.Override;
import java.lang.String;
import java.util.Map;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.content_public.browser.WebContents;
import org.chromium.payments.mojom.PaymentMethodData;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class CanMakePaymentQueryJni implements CanMakePaymentQuery.Natives {
  private static CanMakePaymentQuery.Natives testInstance;

  public static final JniStaticTestMocker<CanMakePaymentQuery.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.payments.CanMakePaymentQuery.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.payments.CanMakePaymentQuery.Natives instance) {
      if (!J.N.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public boolean canQuery(WebContents webContents, String topLevelOrigin, String frameOrigin,
      Map<String, PaymentMethodData> query, boolean perMethodQuota) {
    return (boolean)N.MmQ$c78j(webContents, topLevelOrigin, frameOrigin, query, perMethodQuota);
  }

  public static CanMakePaymentQuery.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.payments.CanMakePaymentQuery.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new CanMakePaymentQueryJni();
  }
}
