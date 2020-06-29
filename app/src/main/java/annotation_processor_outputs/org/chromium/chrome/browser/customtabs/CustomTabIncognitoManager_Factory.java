package org.chromium.chrome.browser.customtabs;

import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;
import org.chromium.chrome.browser.ChromeActivity;
import org.chromium.chrome.browser.browserservices.BrowserServicesIntentDataProvider;
import org.chromium.chrome.browser.customtabs.content.CustomTabActivityNavigationController;
import org.chromium.chrome.browser.lifecycle.ActivityLifecycleDispatcher;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class CustomTabIncognitoManager_Factory implements Factory<CustomTabIncognitoManager> {
  private final Provider<ChromeActivity<?>> customTabActivityProvider;

  private final Provider<BrowserServicesIntentDataProvider> intentDataProvider;

  private final Provider<CustomTabActivityNavigationController> navigationControllerProvider;

  private final Provider<ActivityLifecycleDispatcher> lifecycleDispatcherProvider;

  public CustomTabIncognitoManager_Factory(
      Provider<ChromeActivity<?>> customTabActivityProvider,
      Provider<BrowserServicesIntentDataProvider> intentDataProvider,
      Provider<CustomTabActivityNavigationController> navigationControllerProvider,
      Provider<ActivityLifecycleDispatcher> lifecycleDispatcherProvider) {
    this.customTabActivityProvider = customTabActivityProvider;
    this.intentDataProvider = intentDataProvider;
    this.navigationControllerProvider = navigationControllerProvider;
    this.lifecycleDispatcherProvider = lifecycleDispatcherProvider;
  }

  @Override
  public CustomTabIncognitoManager get() {
    return provideInstance(
        customTabActivityProvider,
        intentDataProvider,
        navigationControllerProvider,
        lifecycleDispatcherProvider);
  }

  public static CustomTabIncognitoManager provideInstance(
      Provider<ChromeActivity<?>> customTabActivityProvider,
      Provider<BrowserServicesIntentDataProvider> intentDataProvider,
      Provider<CustomTabActivityNavigationController> navigationControllerProvider,
      Provider<ActivityLifecycleDispatcher> lifecycleDispatcherProvider) {
    return new CustomTabIncognitoManager(
        customTabActivityProvider.get(),
        intentDataProvider.get(),
        navigationControllerProvider.get(),
        lifecycleDispatcherProvider.get());
  }

  public static CustomTabIncognitoManager_Factory create(
      Provider<ChromeActivity<?>> customTabActivityProvider,
      Provider<BrowserServicesIntentDataProvider> intentDataProvider,
      Provider<CustomTabActivityNavigationController> navigationControllerProvider,
      Provider<ActivityLifecycleDispatcher> lifecycleDispatcherProvider) {
    return new CustomTabIncognitoManager_Factory(
        customTabActivityProvider,
        intentDataProvider,
        navigationControllerProvider,
        lifecycleDispatcherProvider);
  }

  public static CustomTabIncognitoManager newCustomTabIncognitoManager(
      ChromeActivity<?> customTabActivity,
      BrowserServicesIntentDataProvider intentDataProvider,
      CustomTabActivityNavigationController navigationController,
      ActivityLifecycleDispatcher lifecycleDispatcher) {
    return new CustomTabIncognitoManager(
        customTabActivity, intentDataProvider, navigationController, lifecycleDispatcher);
  }
}
