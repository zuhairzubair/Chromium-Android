package org.chromium.chrome.browser.browserservices.trustedwebactivityui.controller;

import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;
import org.chromium.chrome.browser.browserservices.BrowserServicesIntentDataProvider;
import org.chromium.chrome.browser.customtabs.content.CustomTabActivityTabProvider;
import org.chromium.chrome.browser.customtabs.content.TabObserverRegistrar;
import org.chromium.chrome.browser.lifecycle.ActivityLifecycleDispatcher;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class CurrentPageVerifier_Factory implements Factory<CurrentPageVerifier> {
  private final Provider<ActivityLifecycleDispatcher> lifecycleDispatcherProvider;

  private final Provider<TabObserverRegistrar> tabObserverRegistrarProvider;

  private final Provider<CustomTabActivityTabProvider> tabProvider;

  private final Provider<BrowserServicesIntentDataProvider> intentDataProvider;

  private final Provider<Verifier> delegateProvider;

  public CurrentPageVerifier_Factory(
      Provider<ActivityLifecycleDispatcher> lifecycleDispatcherProvider,
      Provider<TabObserverRegistrar> tabObserverRegistrarProvider,
      Provider<CustomTabActivityTabProvider> tabProvider,
      Provider<BrowserServicesIntentDataProvider> intentDataProvider,
      Provider<Verifier> delegateProvider) {
    this.lifecycleDispatcherProvider = lifecycleDispatcherProvider;
    this.tabObserverRegistrarProvider = tabObserverRegistrarProvider;
    this.tabProvider = tabProvider;
    this.intentDataProvider = intentDataProvider;
    this.delegateProvider = delegateProvider;
  }

  @Override
  public CurrentPageVerifier get() {
    return provideInstance(
        lifecycleDispatcherProvider,
        tabObserverRegistrarProvider,
        tabProvider,
        intentDataProvider,
        delegateProvider);
  }

  public static CurrentPageVerifier provideInstance(
      Provider<ActivityLifecycleDispatcher> lifecycleDispatcherProvider,
      Provider<TabObserverRegistrar> tabObserverRegistrarProvider,
      Provider<CustomTabActivityTabProvider> tabProvider,
      Provider<BrowserServicesIntentDataProvider> intentDataProvider,
      Provider<Verifier> delegateProvider) {
    return new CurrentPageVerifier(
        lifecycleDispatcherProvider.get(),
        tabObserverRegistrarProvider.get(),
        tabProvider.get(),
        intentDataProvider.get(),
        delegateProvider.get());
  }

  public static CurrentPageVerifier_Factory create(
      Provider<ActivityLifecycleDispatcher> lifecycleDispatcherProvider,
      Provider<TabObserverRegistrar> tabObserverRegistrarProvider,
      Provider<CustomTabActivityTabProvider> tabProvider,
      Provider<BrowserServicesIntentDataProvider> intentDataProvider,
      Provider<Verifier> delegateProvider) {
    return new CurrentPageVerifier_Factory(
        lifecycleDispatcherProvider,
        tabObserverRegistrarProvider,
        tabProvider,
        intentDataProvider,
        delegateProvider);
  }

  public static CurrentPageVerifier newCurrentPageVerifier(
      ActivityLifecycleDispatcher lifecycleDispatcher,
      TabObserverRegistrar tabObserverRegistrar,
      CustomTabActivityTabProvider tabProvider,
      BrowserServicesIntentDataProvider intentDataProvider,
      Verifier delegate) {
    return new CurrentPageVerifier(
        lifecycleDispatcher, tabObserverRegistrar, tabProvider, intentDataProvider, delegate);
  }
}
