package org.chromium.chrome.browser.customtabs;

import android.content.Context;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;
import org.chromium.chrome.browser.browserservices.BrowserServicesIntentDataProvider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class CustomTabObserver_Factory implements Factory<CustomTabObserver> {
  private final Provider<Context> appContextProvider;

  private final Provider<BrowserServicesIntentDataProvider> intentDataProvider;

  private final Provider<CustomTabsConnection> connectionProvider;

  public CustomTabObserver_Factory(
      Provider<Context> appContextProvider,
      Provider<BrowserServicesIntentDataProvider> intentDataProvider,
      Provider<CustomTabsConnection> connectionProvider) {
    this.appContextProvider = appContextProvider;
    this.intentDataProvider = intentDataProvider;
    this.connectionProvider = connectionProvider;
  }

  @Override
  public CustomTabObserver get() {
    return provideInstance(appContextProvider, intentDataProvider, connectionProvider);
  }

  public static CustomTabObserver provideInstance(
      Provider<Context> appContextProvider,
      Provider<BrowserServicesIntentDataProvider> intentDataProvider,
      Provider<CustomTabsConnection> connectionProvider) {
    return new CustomTabObserver(
        appContextProvider.get(), intentDataProvider.get(), connectionProvider.get());
  }

  public static CustomTabObserver_Factory create(
      Provider<Context> appContextProvider,
      Provider<BrowserServicesIntentDataProvider> intentDataProvider,
      Provider<CustomTabsConnection> connectionProvider) {
    return new CustomTabObserver_Factory(
        appContextProvider, intentDataProvider, connectionProvider);
  }

  public static CustomTabObserver newCustomTabObserver(
      Context appContext,
      BrowserServicesIntentDataProvider intentDataProvider,
      CustomTabsConnection connection) {
    return new CustomTabObserver(appContext, intentDataProvider, connection);
  }
}
