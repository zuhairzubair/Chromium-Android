package org.chromium.chrome.browser.customtabs.features.toolbar;

import android.content.Context;
import dagger.Lazy;
import dagger.internal.DoubleCheck;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;
import org.chromium.chrome.browser.ChromeActivity;
import org.chromium.chrome.browser.browserservices.BrowserServicesActivityTabController;
import org.chromium.chrome.browser.browserservices.BrowserServicesIntentDataProvider;
import org.chromium.chrome.browser.customtabs.CloseButtonVisibilityManager;
import org.chromium.chrome.browser.customtabs.CustomTabCompositorContentInitializer;
import org.chromium.chrome.browser.customtabs.CustomTabUmaRecorder;
import org.chromium.chrome.browser.customtabs.CustomTabsConnection;
import org.chromium.chrome.browser.customtabs.content.CustomTabActivityNavigationController;
import org.chromium.chrome.browser.customtabs.content.CustomTabActivityTabProvider;
import org.chromium.chrome.browser.fullscreen.ChromeFullscreenManager;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class CustomTabToolbarCoordinator_Factory
    implements Factory<CustomTabToolbarCoordinator> {
  private final Provider<BrowserServicesIntentDataProvider> intentDataProvider;

  private final Provider<CustomTabUmaRecorder> umaRecorderProvider;

  private final Provider<CustomTabActivityTabProvider> tabProvider;

  private final Provider<CustomTabsConnection> connectionProvider;

  private final Provider<ChromeActivity<?>> activityProvider;

  private final Provider<Context> appContextProvider;

  private final Provider<BrowserServicesActivityTabController> tabControllerProvider;

  private final Provider<ChromeFullscreenManager> fullscreenManagerProvider;

  private final Provider<CustomTabActivityNavigationController> navigationControllerProvider;

  private final Provider<CloseButtonVisibilityManager> closeButtonVisibilityManagerProvider;

  private final Provider<CustomTabBrowserControlsVisibilityDelegate> visibilityDelegateProvider;

  private final Provider<CustomTabCompositorContentInitializer>
      compositorContentInitializerProvider;

  private final Provider<CustomTabToolbarColorController> toolbarColorControllerProvider;

  public CustomTabToolbarCoordinator_Factory(
      Provider<BrowserServicesIntentDataProvider> intentDataProvider,
      Provider<CustomTabUmaRecorder> umaRecorderProvider,
      Provider<CustomTabActivityTabProvider> tabProvider,
      Provider<CustomTabsConnection> connectionProvider,
      Provider<ChromeActivity<?>> activityProvider,
      Provider<Context> appContextProvider,
      Provider<BrowserServicesActivityTabController> tabControllerProvider,
      Provider<ChromeFullscreenManager> fullscreenManagerProvider,
      Provider<CustomTabActivityNavigationController> navigationControllerProvider,
      Provider<CloseButtonVisibilityManager> closeButtonVisibilityManagerProvider,
      Provider<CustomTabBrowserControlsVisibilityDelegate> visibilityDelegateProvider,
      Provider<CustomTabCompositorContentInitializer> compositorContentInitializerProvider,
      Provider<CustomTabToolbarColorController> toolbarColorControllerProvider) {
    this.intentDataProvider = intentDataProvider;
    this.umaRecorderProvider = umaRecorderProvider;
    this.tabProvider = tabProvider;
    this.connectionProvider = connectionProvider;
    this.activityProvider = activityProvider;
    this.appContextProvider = appContextProvider;
    this.tabControllerProvider = tabControllerProvider;
    this.fullscreenManagerProvider = fullscreenManagerProvider;
    this.navigationControllerProvider = navigationControllerProvider;
    this.closeButtonVisibilityManagerProvider = closeButtonVisibilityManagerProvider;
    this.visibilityDelegateProvider = visibilityDelegateProvider;
    this.compositorContentInitializerProvider = compositorContentInitializerProvider;
    this.toolbarColorControllerProvider = toolbarColorControllerProvider;
  }

  @Override
  public CustomTabToolbarCoordinator get() {
    return provideInstance(
        intentDataProvider,
        umaRecorderProvider,
        tabProvider,
        connectionProvider,
        activityProvider,
        appContextProvider,
        tabControllerProvider,
        fullscreenManagerProvider,
        navigationControllerProvider,
        closeButtonVisibilityManagerProvider,
        visibilityDelegateProvider,
        compositorContentInitializerProvider,
        toolbarColorControllerProvider);
  }

  public static CustomTabToolbarCoordinator provideInstance(
      Provider<BrowserServicesIntentDataProvider> intentDataProvider,
      Provider<CustomTabUmaRecorder> umaRecorderProvider,
      Provider<CustomTabActivityTabProvider> tabProvider,
      Provider<CustomTabsConnection> connectionProvider,
      Provider<ChromeActivity<?>> activityProvider,
      Provider<Context> appContextProvider,
      Provider<BrowserServicesActivityTabController> tabControllerProvider,
      Provider<ChromeFullscreenManager> fullscreenManagerProvider,
      Provider<CustomTabActivityNavigationController> navigationControllerProvider,
      Provider<CloseButtonVisibilityManager> closeButtonVisibilityManagerProvider,
      Provider<CustomTabBrowserControlsVisibilityDelegate> visibilityDelegateProvider,
      Provider<CustomTabCompositorContentInitializer> compositorContentInitializerProvider,
      Provider<CustomTabToolbarColorController> toolbarColorControllerProvider) {
    return new CustomTabToolbarCoordinator(
        intentDataProvider.get(),
        umaRecorderProvider.get(),
        tabProvider.get(),
        connectionProvider.get(),
        activityProvider.get(),
        appContextProvider.get(),
        tabControllerProvider.get(),
        DoubleCheck.lazy(fullscreenManagerProvider),
        navigationControllerProvider.get(),
        closeButtonVisibilityManagerProvider.get(),
        visibilityDelegateProvider.get(),
        compositorContentInitializerProvider.get(),
        toolbarColorControllerProvider.get());
  }

  public static CustomTabToolbarCoordinator_Factory create(
      Provider<BrowserServicesIntentDataProvider> intentDataProvider,
      Provider<CustomTabUmaRecorder> umaRecorderProvider,
      Provider<CustomTabActivityTabProvider> tabProvider,
      Provider<CustomTabsConnection> connectionProvider,
      Provider<ChromeActivity<?>> activityProvider,
      Provider<Context> appContextProvider,
      Provider<BrowserServicesActivityTabController> tabControllerProvider,
      Provider<ChromeFullscreenManager> fullscreenManagerProvider,
      Provider<CustomTabActivityNavigationController> navigationControllerProvider,
      Provider<CloseButtonVisibilityManager> closeButtonVisibilityManagerProvider,
      Provider<CustomTabBrowserControlsVisibilityDelegate> visibilityDelegateProvider,
      Provider<CustomTabCompositorContentInitializer> compositorContentInitializerProvider,
      Provider<CustomTabToolbarColorController> toolbarColorControllerProvider) {
    return new CustomTabToolbarCoordinator_Factory(
        intentDataProvider,
        umaRecorderProvider,
        tabProvider,
        connectionProvider,
        activityProvider,
        appContextProvider,
        tabControllerProvider,
        fullscreenManagerProvider,
        navigationControllerProvider,
        closeButtonVisibilityManagerProvider,
        visibilityDelegateProvider,
        compositorContentInitializerProvider,
        toolbarColorControllerProvider);
  }

  public static CustomTabToolbarCoordinator newCustomTabToolbarCoordinator(
      BrowserServicesIntentDataProvider intentDataProvider,
      CustomTabUmaRecorder umaRecorder,
      CustomTabActivityTabProvider tabProvider,
      CustomTabsConnection connection,
      ChromeActivity<?> activity,
      Context appContext,
      BrowserServicesActivityTabController tabController,
      Lazy<ChromeFullscreenManager> fullscreenManager,
      CustomTabActivityNavigationController navigationController,
      CloseButtonVisibilityManager closeButtonVisibilityManager,
      CustomTabBrowserControlsVisibilityDelegate visibilityDelegate,
      CustomTabCompositorContentInitializer compositorContentInitializer,
      CustomTabToolbarColorController toolbarColorController) {
    return new CustomTabToolbarCoordinator(
        intentDataProvider,
        umaRecorder,
        tabProvider,
        connection,
        activity,
        appContext,
        tabController,
        fullscreenManager,
        navigationController,
        closeButtonVisibilityManager,
        visibilityDelegate,
        compositorContentInitializer,
        toolbarColorController);
  }
}
