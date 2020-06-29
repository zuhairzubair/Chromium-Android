package org.chromium.chrome.browser.customtabs;

import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;
import org.chromium.chrome.browser.browserservices.BrowserServicesActivityTabController;
import org.chromium.chrome.browser.browserservices.BrowserServicesIntentDataProvider;
import org.chromium.chrome.browser.customtabs.content.CustomTabActivityTabProvider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class CloseButtonNavigator_Factory implements Factory<CloseButtonNavigator> {
  private final Provider<BrowserServicesActivityTabController> tabControllerProvider;

  private final Provider<CustomTabActivityTabProvider> tabProvider;

  private final Provider<BrowserServicesIntentDataProvider> intentDataProvider;

  public CloseButtonNavigator_Factory(
      Provider<BrowserServicesActivityTabController> tabControllerProvider,
      Provider<CustomTabActivityTabProvider> tabProvider,
      Provider<BrowserServicesIntentDataProvider> intentDataProvider) {
    this.tabControllerProvider = tabControllerProvider;
    this.tabProvider = tabProvider;
    this.intentDataProvider = intentDataProvider;
  }

  @Override
  public CloseButtonNavigator get() {
    return provideInstance(tabControllerProvider, tabProvider, intentDataProvider);
  }

  public static CloseButtonNavigator provideInstance(
      Provider<BrowserServicesActivityTabController> tabControllerProvider,
      Provider<CustomTabActivityTabProvider> tabProvider,
      Provider<BrowserServicesIntentDataProvider> intentDataProvider) {
    return new CloseButtonNavigator(
        tabControllerProvider.get(), tabProvider.get(), intentDataProvider.get());
  }

  public static CloseButtonNavigator_Factory create(
      Provider<BrowserServicesActivityTabController> tabControllerProvider,
      Provider<CustomTabActivityTabProvider> tabProvider,
      Provider<BrowserServicesIntentDataProvider> intentDataProvider) {
    return new CloseButtonNavigator_Factory(tabControllerProvider, tabProvider, intentDataProvider);
  }

  public static CloseButtonNavigator newCloseButtonNavigator(
      BrowserServicesActivityTabController tabController,
      CustomTabActivityTabProvider tabProvider,
      BrowserServicesIntentDataProvider intentDataProvider) {
    return new CloseButtonNavigator(tabController, tabProvider, intentDataProvider);
  }
}
