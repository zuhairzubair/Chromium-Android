package org.chromium.chrome.browser.customtabs.content;

import dagger.Lazy;
import dagger.internal.DoubleCheck;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;
import org.chromium.chrome.browser.ChromeActivity;
import org.chromium.chrome.browser.browserservices.BrowserServicesActivityTabController;
import org.chromium.chrome.browser.browserservices.BrowserServicesIntentDataProvider;
import org.chromium.chrome.browser.customtabs.CloseButtonNavigator;
import org.chromium.chrome.browser.customtabs.CustomTabObserver;
import org.chromium.chrome.browser.customtabs.CustomTabsConnection;
import org.chromium.chrome.browser.fullscreen.ChromeFullscreenManager;
import org.chromium.chrome.browser.init.ChromeBrowserInitializer;
import org.chromium.chrome.browser.lifecycle.ActivityLifecycleDispatcher;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class CustomTabActivityNavigationController_Factory
    implements Factory<CustomTabActivityNavigationController> {
  private final Provider<BrowserServicesActivityTabController> tabControllerProvider;

  private final Provider<CustomTabActivityTabProvider> tabProvider;

  private final Provider<BrowserServicesIntentDataProvider> intentDataProvider;

  private final Provider<CustomTabsConnection> connectionProvider;

  private final Provider<CustomTabObserver> customTabObserverProvider;

  private final Provider<CloseButtonNavigator> closeButtonNavigatorProvider;

  private final Provider<ChromeBrowserInitializer> chromeBrowserInitializerProvider;

  private final Provider<ChromeActivity<?>> activityProvider;

  private final Provider<ActivityLifecycleDispatcher> lifecycleDispatcherProvider;

  private final Provider<ChromeFullscreenManager> fullscreenManagerProvider;

  public CustomTabActivityNavigationController_Factory(
      Provider<BrowserServicesActivityTabController> tabControllerProvider,
      Provider<CustomTabActivityTabProvider> tabProvider,
      Provider<BrowserServicesIntentDataProvider> intentDataProvider,
      Provider<CustomTabsConnection> connectionProvider,
      Provider<CustomTabObserver> customTabObserverProvider,
      Provider<CloseButtonNavigator> closeButtonNavigatorProvider,
      Provider<ChromeBrowserInitializer> chromeBrowserInitializerProvider,
      Provider<ChromeActivity<?>> activityProvider,
      Provider<ActivityLifecycleDispatcher> lifecycleDispatcherProvider,
      Provider<ChromeFullscreenManager> fullscreenManagerProvider) {
    this.tabControllerProvider = tabControllerProvider;
    this.tabProvider = tabProvider;
    this.intentDataProvider = intentDataProvider;
    this.connectionProvider = connectionProvider;
    this.customTabObserverProvider = customTabObserverProvider;
    this.closeButtonNavigatorProvider = closeButtonNavigatorProvider;
    this.chromeBrowserInitializerProvider = chromeBrowserInitializerProvider;
    this.activityProvider = activityProvider;
    this.lifecycleDispatcherProvider = lifecycleDispatcherProvider;
    this.fullscreenManagerProvider = fullscreenManagerProvider;
  }

  @Override
  public CustomTabActivityNavigationController get() {
    return provideInstance(
        tabControllerProvider,
        tabProvider,
        intentDataProvider,
        connectionProvider,
        customTabObserverProvider,
        closeButtonNavigatorProvider,
        chromeBrowserInitializerProvider,
        activityProvider,
        lifecycleDispatcherProvider,
        fullscreenManagerProvider);
  }

  public static CustomTabActivityNavigationController provideInstance(
      Provider<BrowserServicesActivityTabController> tabControllerProvider,
      Provider<CustomTabActivityTabProvider> tabProvider,
      Provider<BrowserServicesIntentDataProvider> intentDataProvider,
      Provider<CustomTabsConnection> connectionProvider,
      Provider<CustomTabObserver> customTabObserverProvider,
      Provider<CloseButtonNavigator> closeButtonNavigatorProvider,
      Provider<ChromeBrowserInitializer> chromeBrowserInitializerProvider,
      Provider<ChromeActivity<?>> activityProvider,
      Provider<ActivityLifecycleDispatcher> lifecycleDispatcherProvider,
      Provider<ChromeFullscreenManager> fullscreenManagerProvider) {
    return new CustomTabActivityNavigationController(
        tabControllerProvider.get(),
        tabProvider.get(),
        intentDataProvider.get(),
        connectionProvider.get(),
        DoubleCheck.lazy(customTabObserverProvider),
        closeButtonNavigatorProvider.get(),
        chromeBrowserInitializerProvider.get(),
        activityProvider.get(),
        lifecycleDispatcherProvider.get(),
        DoubleCheck.lazy(fullscreenManagerProvider));
  }

  public static CustomTabActivityNavigationController_Factory create(
      Provider<BrowserServicesActivityTabController> tabControllerProvider,
      Provider<CustomTabActivityTabProvider> tabProvider,
      Provider<BrowserServicesIntentDataProvider> intentDataProvider,
      Provider<CustomTabsConnection> connectionProvider,
      Provider<CustomTabObserver> customTabObserverProvider,
      Provider<CloseButtonNavigator> closeButtonNavigatorProvider,
      Provider<ChromeBrowserInitializer> chromeBrowserInitializerProvider,
      Provider<ChromeActivity<?>> activityProvider,
      Provider<ActivityLifecycleDispatcher> lifecycleDispatcherProvider,
      Provider<ChromeFullscreenManager> fullscreenManagerProvider) {
    return new CustomTabActivityNavigationController_Factory(
        tabControllerProvider,
        tabProvider,
        intentDataProvider,
        connectionProvider,
        customTabObserverProvider,
        closeButtonNavigatorProvider,
        chromeBrowserInitializerProvider,
        activityProvider,
        lifecycleDispatcherProvider,
        fullscreenManagerProvider);
  }

  public static CustomTabActivityNavigationController newCustomTabActivityNavigationController(
      BrowserServicesActivityTabController tabController,
      CustomTabActivityTabProvider tabProvider,
      BrowserServicesIntentDataProvider intentDataProvider,
      CustomTabsConnection connection,
      Lazy<CustomTabObserver> customTabObserver,
      CloseButtonNavigator closeButtonNavigator,
      ChromeBrowserInitializer chromeBrowserInitializer,
      ChromeActivity<?> activity,
      ActivityLifecycleDispatcher lifecycleDispatcher,
      Lazy<ChromeFullscreenManager> fullscreenManager) {
    return new CustomTabActivityNavigationController(
        tabController,
        tabProvider,
        intentDataProvider,
        connection,
        customTabObserver,
        closeButtonNavigator,
        chromeBrowserInitializer,
        activity,
        lifecycleDispatcher,
        fullscreenManager);
  }
}
