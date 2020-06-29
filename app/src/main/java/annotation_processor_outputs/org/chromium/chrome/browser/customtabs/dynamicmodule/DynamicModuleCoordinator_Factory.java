package org.chromium.chrome.browser.customtabs.dynamicmodule;

import dagger.Lazy;
import dagger.internal.DoubleCheck;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;
import org.chromium.chrome.browser.ChromeActivity;
import org.chromium.chrome.browser.browserservices.BrowserServicesIntentDataProvider;
import org.chromium.chrome.browser.customtabs.CloseButtonNavigator;
import org.chromium.chrome.browser.customtabs.CustomTabBottomBarDelegate;
import org.chromium.chrome.browser.customtabs.CustomTabTopBarDelegate;
import org.chromium.chrome.browser.customtabs.CustomTabsConnection;
import org.chromium.chrome.browser.customtabs.content.CustomTabActivityNavigationController;
import org.chromium.chrome.browser.customtabs.content.CustomTabActivityTabProvider;
import org.chromium.chrome.browser.customtabs.content.TabObserverRegistrar;
import org.chromium.chrome.browser.fullscreen.ChromeFullscreenManager;
import org.chromium.chrome.browser.lifecycle.ActivityLifecycleDispatcher;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DynamicModuleCoordinator_Factory implements Factory<DynamicModuleCoordinator> {
  private final Provider<BrowserServicesIntentDataProvider> intentDataProvider;

  private final Provider<CloseButtonNavigator> closeButtonNavigatorProvider;

  private final Provider<TabObserverRegistrar> tabObserverRegistrarProvider;

  private final Provider<ActivityLifecycleDispatcher> activityLifecycleDispatcherProvider;

  private final Provider<CustomTabActivityNavigationController> navigationControllerProvider;

  private final Provider<ActivityDelegate> activityDelegateProvider;

  private final Provider<CustomTabTopBarDelegate> topBarDelegateProvider;

  private final Provider<CustomTabBottomBarDelegate> bottomBarDelegateProvider;

  private final Provider<ChromeFullscreenManager> fullscreenManagerProvider;

  private final Provider<DynamicModuleToolbarController> toolbarControllerProvider;

  private final Provider<CustomTabsConnection> connectionProvider;

  private final Provider<ChromeActivity<?>> activityProvider;

  private final Provider<CustomTabActivityTabProvider> tabProvider;

  private final Provider<DynamicModulePageLoadObserver> pageLoadObserverProvider;

  public DynamicModuleCoordinator_Factory(
      Provider<BrowserServicesIntentDataProvider> intentDataProvider,
      Provider<CloseButtonNavigator> closeButtonNavigatorProvider,
      Provider<TabObserverRegistrar> tabObserverRegistrarProvider,
      Provider<ActivityLifecycleDispatcher> activityLifecycleDispatcherProvider,
      Provider<CustomTabActivityNavigationController> navigationControllerProvider,
      Provider<ActivityDelegate> activityDelegateProvider,
      Provider<CustomTabTopBarDelegate> topBarDelegateProvider,
      Provider<CustomTabBottomBarDelegate> bottomBarDelegateProvider,
      Provider<ChromeFullscreenManager> fullscreenManagerProvider,
      Provider<DynamicModuleToolbarController> toolbarControllerProvider,
      Provider<CustomTabsConnection> connectionProvider,
      Provider<ChromeActivity<?>> activityProvider,
      Provider<CustomTabActivityTabProvider> tabProvider,
      Provider<DynamicModulePageLoadObserver> pageLoadObserverProvider) {
    this.intentDataProvider = intentDataProvider;
    this.closeButtonNavigatorProvider = closeButtonNavigatorProvider;
    this.tabObserverRegistrarProvider = tabObserverRegistrarProvider;
    this.activityLifecycleDispatcherProvider = activityLifecycleDispatcherProvider;
    this.navigationControllerProvider = navigationControllerProvider;
    this.activityDelegateProvider = activityDelegateProvider;
    this.topBarDelegateProvider = topBarDelegateProvider;
    this.bottomBarDelegateProvider = bottomBarDelegateProvider;
    this.fullscreenManagerProvider = fullscreenManagerProvider;
    this.toolbarControllerProvider = toolbarControllerProvider;
    this.connectionProvider = connectionProvider;
    this.activityProvider = activityProvider;
    this.tabProvider = tabProvider;
    this.pageLoadObserverProvider = pageLoadObserverProvider;
  }

  @Override
  public DynamicModuleCoordinator get() {
    return provideInstance(
        intentDataProvider,
        closeButtonNavigatorProvider,
        tabObserverRegistrarProvider,
        activityLifecycleDispatcherProvider,
        navigationControllerProvider,
        activityDelegateProvider,
        topBarDelegateProvider,
        bottomBarDelegateProvider,
        fullscreenManagerProvider,
        toolbarControllerProvider,
        connectionProvider,
        activityProvider,
        tabProvider,
        pageLoadObserverProvider);
  }

  public static DynamicModuleCoordinator provideInstance(
      Provider<BrowserServicesIntentDataProvider> intentDataProvider,
      Provider<CloseButtonNavigator> closeButtonNavigatorProvider,
      Provider<TabObserverRegistrar> tabObserverRegistrarProvider,
      Provider<ActivityLifecycleDispatcher> activityLifecycleDispatcherProvider,
      Provider<CustomTabActivityNavigationController> navigationControllerProvider,
      Provider<ActivityDelegate> activityDelegateProvider,
      Provider<CustomTabTopBarDelegate> topBarDelegateProvider,
      Provider<CustomTabBottomBarDelegate> bottomBarDelegateProvider,
      Provider<ChromeFullscreenManager> fullscreenManagerProvider,
      Provider<DynamicModuleToolbarController> toolbarControllerProvider,
      Provider<CustomTabsConnection> connectionProvider,
      Provider<ChromeActivity<?>> activityProvider,
      Provider<CustomTabActivityTabProvider> tabProvider,
      Provider<DynamicModulePageLoadObserver> pageLoadObserverProvider) {
    return new DynamicModuleCoordinator(
        intentDataProvider.get(),
        closeButtonNavigatorProvider.get(),
        tabObserverRegistrarProvider.get(),
        activityLifecycleDispatcherProvider.get(),
        navigationControllerProvider.get(),
        activityDelegateProvider.get(),
        DoubleCheck.lazy(topBarDelegateProvider),
        DoubleCheck.lazy(bottomBarDelegateProvider),
        DoubleCheck.lazy(fullscreenManagerProvider),
        DoubleCheck.lazy(toolbarControllerProvider),
        connectionProvider.get(),
        activityProvider.get(),
        tabProvider.get(),
        pageLoadObserverProvider.get());
  }

  public static DynamicModuleCoordinator_Factory create(
      Provider<BrowserServicesIntentDataProvider> intentDataProvider,
      Provider<CloseButtonNavigator> closeButtonNavigatorProvider,
      Provider<TabObserverRegistrar> tabObserverRegistrarProvider,
      Provider<ActivityLifecycleDispatcher> activityLifecycleDispatcherProvider,
      Provider<CustomTabActivityNavigationController> navigationControllerProvider,
      Provider<ActivityDelegate> activityDelegateProvider,
      Provider<CustomTabTopBarDelegate> topBarDelegateProvider,
      Provider<CustomTabBottomBarDelegate> bottomBarDelegateProvider,
      Provider<ChromeFullscreenManager> fullscreenManagerProvider,
      Provider<DynamicModuleToolbarController> toolbarControllerProvider,
      Provider<CustomTabsConnection> connectionProvider,
      Provider<ChromeActivity<?>> activityProvider,
      Provider<CustomTabActivityTabProvider> tabProvider,
      Provider<DynamicModulePageLoadObserver> pageLoadObserverProvider) {
    return new DynamicModuleCoordinator_Factory(
        intentDataProvider,
        closeButtonNavigatorProvider,
        tabObserverRegistrarProvider,
        activityLifecycleDispatcherProvider,
        navigationControllerProvider,
        activityDelegateProvider,
        topBarDelegateProvider,
        bottomBarDelegateProvider,
        fullscreenManagerProvider,
        toolbarControllerProvider,
        connectionProvider,
        activityProvider,
        tabProvider,
        pageLoadObserverProvider);
  }

  public static DynamicModuleCoordinator newDynamicModuleCoordinator(
      BrowserServicesIntentDataProvider intentDataProvider,
      CloseButtonNavigator closeButtonNavigator,
      TabObserverRegistrar tabObserverRegistrar,
      ActivityLifecycleDispatcher activityLifecycleDispatcher,
      CustomTabActivityNavigationController navigationController,
      ActivityDelegate activityDelegate,
      Lazy<CustomTabTopBarDelegate> topBarDelegate,
      Lazy<CustomTabBottomBarDelegate> bottomBarDelegate,
      Lazy<ChromeFullscreenManager> fullscreenManager,
      Lazy<DynamicModuleToolbarController> toolbarController,
      CustomTabsConnection connection,
      ChromeActivity<?> activity,
      CustomTabActivityTabProvider tabProvider,
      DynamicModulePageLoadObserver pageLoadObserver) {
    return new DynamicModuleCoordinator(
        intentDataProvider,
        closeButtonNavigator,
        tabObserverRegistrar,
        activityLifecycleDispatcher,
        navigationController,
        activityDelegate,
        topBarDelegate,
        bottomBarDelegate,
        fullscreenManager,
        toolbarController,
        connection,
        activity,
        tabProvider,
        pageLoadObserver);
  }
}
