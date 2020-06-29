package org.chromium.chrome.browser.customtabs.dynamicmodule;

import dagger.Lazy;
import dagger.internal.DoubleCheck;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;
import org.chromium.chrome.browser.browserservices.BrowserServicesIntentDataProvider;
import org.chromium.chrome.browser.customtabs.features.toolbar.CustomTabToolbarCoordinator;
import org.chromium.chrome.browser.fullscreen.ChromeFullscreenManager;
import org.chromium.chrome.browser.lifecycle.ActivityLifecycleDispatcher;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DynamicModuleToolbarController_Factory
    implements Factory<DynamicModuleToolbarController> {
  private final Provider<ChromeFullscreenManager> fullscreenManagerProvider;

  private final Provider<BrowserServicesIntentDataProvider> intentDataProvider;

  private final Provider<ActivityLifecycleDispatcher> activityLifecycleDispatcherProvider;

  private final Provider<CustomTabToolbarCoordinator> toolbarCoordinatorProvider;

  public DynamicModuleToolbarController_Factory(
      Provider<ChromeFullscreenManager> fullscreenManagerProvider,
      Provider<BrowserServicesIntentDataProvider> intentDataProvider,
      Provider<ActivityLifecycleDispatcher> activityLifecycleDispatcherProvider,
      Provider<CustomTabToolbarCoordinator> toolbarCoordinatorProvider) {
    this.fullscreenManagerProvider = fullscreenManagerProvider;
    this.intentDataProvider = intentDataProvider;
    this.activityLifecycleDispatcherProvider = activityLifecycleDispatcherProvider;
    this.toolbarCoordinatorProvider = toolbarCoordinatorProvider;
  }

  @Override
  public DynamicModuleToolbarController get() {
    return provideInstance(
        fullscreenManagerProvider,
        intentDataProvider,
        activityLifecycleDispatcherProvider,
        toolbarCoordinatorProvider);
  }

  public static DynamicModuleToolbarController provideInstance(
      Provider<ChromeFullscreenManager> fullscreenManagerProvider,
      Provider<BrowserServicesIntentDataProvider> intentDataProvider,
      Provider<ActivityLifecycleDispatcher> activityLifecycleDispatcherProvider,
      Provider<CustomTabToolbarCoordinator> toolbarCoordinatorProvider) {
    return new DynamicModuleToolbarController(
        DoubleCheck.lazy(fullscreenManagerProvider),
        intentDataProvider.get(),
        activityLifecycleDispatcherProvider.get(),
        toolbarCoordinatorProvider.get());
  }

  public static DynamicModuleToolbarController_Factory create(
      Provider<ChromeFullscreenManager> fullscreenManagerProvider,
      Provider<BrowserServicesIntentDataProvider> intentDataProvider,
      Provider<ActivityLifecycleDispatcher> activityLifecycleDispatcherProvider,
      Provider<CustomTabToolbarCoordinator> toolbarCoordinatorProvider) {
    return new DynamicModuleToolbarController_Factory(
        fullscreenManagerProvider,
        intentDataProvider,
        activityLifecycleDispatcherProvider,
        toolbarCoordinatorProvider);
  }

  public static DynamicModuleToolbarController newDynamicModuleToolbarController(
      Lazy<ChromeFullscreenManager> fullscreenManager,
      BrowserServicesIntentDataProvider intentDataProvider,
      ActivityLifecycleDispatcher activityLifecycleDispatcher,
      CustomTabToolbarCoordinator toolbarCoordinator) {
    return new DynamicModuleToolbarController(
        fullscreenManager, intentDataProvider, activityLifecycleDispatcher, toolbarCoordinator);
  }
}
