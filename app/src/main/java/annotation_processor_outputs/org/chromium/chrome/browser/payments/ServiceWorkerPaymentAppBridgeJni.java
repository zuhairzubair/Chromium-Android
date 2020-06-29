package org.chromium.chrome.browser.payments;

import J.N;
import android.graphics.Bitmap;
import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.content_public.browser.WebContents;
import org.chromium.payments.mojom.PaymentDetailsModifier;
import org.chromium.payments.mojom.PaymentItem;
import org.chromium.payments.mojom.PaymentMethodData;
import org.chromium.payments.mojom.PaymentOptions;
import org.chromium.payments.mojom.PaymentShippingOption;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class ServiceWorkerPaymentAppBridgeJni implements ServiceWorkerPaymentAppBridge.Natives {
  private static ServiceWorkerPaymentAppBridge.Natives testInstance;

  public static final JniStaticTestMocker<ServiceWorkerPaymentAppBridge.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.payments.ServiceWorkerPaymentAppBridge.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.payments.ServiceWorkerPaymentAppBridge.Natives instance) {
      if (!J.N.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void getAllPaymentApps(WebContents webContents, PaymentMethodData[] methodData,
      boolean mayCrawlForInstallablePaymentApps,
      ServiceWorkerPaymentAppBridge.PaymentHandlerFinder callback) {
    N.MDzV$iTK(webContents, methodData, mayCrawlForInstallablePaymentApps, callback);
  }

  @Override
  public void hasServiceWorkerPaymentApps(
      ServiceWorkerPaymentAppBridge.HasServiceWorkerPaymentAppsCallback callback) {
    N.MCqa2KNs(callback);
  }

  @Override
  public void getServiceWorkerPaymentAppsInfo(
      ServiceWorkerPaymentAppBridge.GetServiceWorkerPaymentAppsInfoCallback callback) {
    N.MFeChwbo(callback);
  }

  @Override
  public void invokePaymentApp(WebContents webContents, long registrationId,
      String serviceWorkerScope, String topOrigin, String paymentRequestOrigin,
      String paymentRequestId, PaymentMethodData[] methodData, PaymentItem total,
      PaymentDetailsModifier[] modifiers, PaymentOptions paymentOptions,
      PaymentShippingOption[] shippingOptions, long nativePaymentHandlerObject,
      boolean isMicrotrans, PaymentInstrument.InstrumentDetailsCallback callback) {
    N.MAmyGelF(webContents, registrationId, serviceWorkerScope, topOrigin, paymentRequestOrigin, paymentRequestId, methodData, total, modifiers, paymentOptions, shippingOptions, nativePaymentHandlerObject, isMicrotrans, callback);
  }

  @Override
  public void installAndInvokePaymentApp(WebContents webContents, String topOrigin,
      String paymentRequestOrigin, String paymentRequestId, PaymentMethodData[] methodData,
      PaymentItem total, PaymentDetailsModifier[] modifiers, PaymentOptions paymentOptions,
      PaymentShippingOption[] shippingOptions, long nativePaymentHandlerObject,
      PaymentInstrument.InstrumentDetailsCallback callback, String appName, Bitmap icon,
      String swUrl, String scope, boolean useCache, String method,
      boolean supportedDelegationsShippingAddress, boolean supportedDelegationsPayerName,
      boolean supportedDelegationsPayerEmail, boolean supportedDelegationsPayerPhone) {
    N.MoJscuVf(webContents, topOrigin, paymentRequestOrigin, paymentRequestId, methodData, total, modifiers, paymentOptions, shippingOptions, nativePaymentHandlerObject, callback, appName, icon, swUrl, scope, useCache, method, supportedDelegationsShippingAddress, supportedDelegationsPayerName, supportedDelegationsPayerEmail, supportedDelegationsPayerPhone);
  }

  @Override
  public void abortPaymentApp(WebContents webContents, long registrationId,
      String serviceWorkerScope, String paymentRequestId,
      PaymentInstrument.AbortCallback callback) {
    N.MFxBX0HN(webContents, registrationId, serviceWorkerScope, paymentRequestId, callback);
  }

  @Override
  public void fireCanMakePaymentEvent(WebContents webContents, long registrationId,
      String serviceWorkerScope, String paymentRequestId, String topOrigin,
      String paymentRequestOrigin, PaymentMethodData[] methodData,
      PaymentDetailsModifier[] modifiers,
      ServiceWorkerPaymentAppBridge.PaymentHandlerFinder callback, ServiceWorkerPaymentApp app) {
    N.MpPPYkrI(webContents, registrationId, serviceWorkerScope, paymentRequestId, topOrigin, paymentRequestOrigin, methodData, modifiers, callback, app);
  }

  @Override
  public void onClosingPaymentAppWindow(WebContents webContents, int reason) {
    N.MAan0VNK(webContents, reason);
  }

  public static ServiceWorkerPaymentAppBridge.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.payments.ServiceWorkerPaymentAppBridge.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new ServiceWorkerPaymentAppBridgeJni();
  }
}
