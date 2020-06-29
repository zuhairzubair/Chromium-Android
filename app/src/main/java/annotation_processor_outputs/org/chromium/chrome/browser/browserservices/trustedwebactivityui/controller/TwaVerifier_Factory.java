package org.chromium.chrome.browser.browserservices.trustedwebactivityui.controller;

import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;
import org.chromium.chrome.browser.browserservices.BrowserServicesIntentDataProvider;
import org.chromium.chrome.browser.browserservices.OriginVerifier;
import org.chromium.chrome.browser.customtabs.content.CustomTabActivityTabProvider;
import org.chromium.chrome.browser.lifecycle.ActivityLifecycleDispatcher;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class TwaVerifier_Factory implements Factory<TwaVerifier> {
  private final Provider<ActivityLifecycleDispatcher> lifecycleDispatcherProvider;

  private final Provider<BrowserServicesIntentDataProvider> intentDataProvider;

  private final Provider<OriginVerifier.Factory> originVerifierFactoryProvider;

  private final Provider<CustomTabActivityTabProvider> tabProvider;

  private final Provider<ClientPackageNameProvider> clientPackageNameProvider;

  public TwaVerifier_Factory(
      Provider<ActivityLifecycleDispatcher> lifecycleDispatcherProvider,
      Provider<BrowserServicesIntentDataProvider> intentDataProvider,
      Provider<OriginVerifier.Factory> originVerifierFactoryProvider,
      Provider<CustomTabActivityTabProvider> tabProvider,
      Provider<ClientPackageNameProvider> clientPackageNameProvider) {
    this.lifecycleDispatcherProvider = lifecycleDispatcherProvider;
    this.intentDataProvider = intentDataProvider;
    this.originVerifierFactoryProvider = originVerifierFactoryProvider;
    this.tabProvider = tabProvider;
    this.clientPackageNameProvider = clientPackageNameProvider;
  }

  @Override
  public TwaVerifier get() {
    return provideInstance(
        lifecycleDispatcherProvider,
        intentDataProvider,
        originVerifierFactoryProvider,
        tabProvider,
        clientPackageNameProvider);
  }

  public static TwaVerifier provideInstance(
      Provider<ActivityLifecycleDispatcher> lifecycleDispatcherProvider,
      Provider<BrowserServicesIntentDataProvider> intentDataProvider,
      Provider<OriginVerifier.Factory> originVerifierFactoryProvider,
      Provider<CustomTabActivityTabProvider> tabProvider,
      Provider<ClientPackageNameProvider> clientPackageNameProvider) {
    return new TwaVerifier(
        lifecycleDispatcherProvider.get(),
        intentDataProvider.get(),
        originVerifierFactoryProvider.get(),
        tabProvider.get(),
        clientPackageNameProvider.get());
  }

  public static TwaVerifier_Factory create(
      Provider<ActivityLifecycleDispatcher> lifecycleDispatcherProvider,
      Provider<BrowserServicesIntentDataProvider> intentDataProvider,
      Provider<OriginVerifier.Factory> originVerifierFactoryProvider,
      Provider<CustomTabActivityTabProvider> tabProvider,
      Provider<ClientPackageNameProvider> clientPackageNameProvider) {
    return new TwaVerifier_Factory(
        lifecycleDispatcherProvider,
        intentDataProvider,
        originVerifierFactoryProvider,
        tabProvider,
        clientPackageNameProvider);
  }

  public static TwaVerifier newTwaVerifier(
      ActivityLifecycleDispatcher lifecycleDispatcher,
      BrowserServicesIntentDataProvider intentDataProvider,
      OriginVerifier.Factory originVerifierFactory,
      CustomTabActivityTabProvider tabProvider,
      ClientPackageNameProvider clientPackageNameProvider) {
    return new TwaVerifier(
        lifecycleDispatcher,
        intentDataProvider,
        originVerifierFactory,
        tabProvider,
        clientPackageNameProvider);
  }
}
