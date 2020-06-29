package org.chromium.chrome.browser.customtabs.content;

import dagger.Lazy;
import dagger.internal.DoubleCheck;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;
import org.chromium.chrome.browser.ChromeActivity;
import org.chromium.chrome.browser.browserservices.BrowserServicesIntentDataProvider;
import org.chromium.chrome.browser.customtabs.CustomTabDelegateFactory;
import org.chromium.chrome.browser.customtabs.CustomTabTabPersistencePolicy;
import org.chromium.chrome.browser.init.StartupTabPreloader;
import org.chromium.ui.base.ActivityWindowAndroid;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class CustomTabActivityTabFactory_Factory
    implements Factory<CustomTabActivityTabFactory> {
  private final Provider<ChromeActivity<?>> activityProvider;

  private final Provider<CustomTabTabPersistencePolicy> persistencePolicyProvider;

  private final Provider<ActivityWindowAndroid> activityWindowAndroidProvider;

  private final Provider<CustomTabDelegateFactory> customTabDelegateFactoryProvider;

  private final Provider<BrowserServicesIntentDataProvider> intentDataProvider;

  private final Provider<StartupTabPreloader> startupTabPreloaderProvider;

  public CustomTabActivityTabFactory_Factory(
      Provider<ChromeActivity<?>> activityProvider,
      Provider<CustomTabTabPersistencePolicy> persistencePolicyProvider,
      Provider<ActivityWindowAndroid> activityWindowAndroidProvider,
      Provider<CustomTabDelegateFactory> customTabDelegateFactoryProvider,
      Provider<BrowserServicesIntentDataProvider> intentDataProvider,
      Provider<StartupTabPreloader> startupTabPreloaderProvider) {
    this.activityProvider = activityProvider;
    this.persistencePolicyProvider = persistencePolicyProvider;
    this.activityWindowAndroidProvider = activityWindowAndroidProvider;
    this.customTabDelegateFactoryProvider = customTabDelegateFactoryProvider;
    this.intentDataProvider = intentDataProvider;
    this.startupTabPreloaderProvider = startupTabPreloaderProvider;
  }

  @Override
  public CustomTabActivityTabFactory get() {
    return provideInstance(
        activityProvider,
        persistencePolicyProvider,
        activityWindowAndroidProvider,
        customTabDelegateFactoryProvider,
        intentDataProvider,
        startupTabPreloaderProvider);
  }

  public static CustomTabActivityTabFactory provideInstance(
      Provider<ChromeActivity<?>> activityProvider,
      Provider<CustomTabTabPersistencePolicy> persistencePolicyProvider,
      Provider<ActivityWindowAndroid> activityWindowAndroidProvider,
      Provider<CustomTabDelegateFactory> customTabDelegateFactoryProvider,
      Provider<BrowserServicesIntentDataProvider> intentDataProvider,
      Provider<StartupTabPreloader> startupTabPreloaderProvider) {
    return new CustomTabActivityTabFactory(
        activityProvider.get(),
        persistencePolicyProvider.get(),
        DoubleCheck.lazy(activityWindowAndroidProvider),
        DoubleCheck.lazy(customTabDelegateFactoryProvider),
        intentDataProvider.get(),
        startupTabPreloaderProvider.get());
  }

  public static CustomTabActivityTabFactory_Factory create(
      Provider<ChromeActivity<?>> activityProvider,
      Provider<CustomTabTabPersistencePolicy> persistencePolicyProvider,
      Provider<ActivityWindowAndroid> activityWindowAndroidProvider,
      Provider<CustomTabDelegateFactory> customTabDelegateFactoryProvider,
      Provider<BrowserServicesIntentDataProvider> intentDataProvider,
      Provider<StartupTabPreloader> startupTabPreloaderProvider) {
    return new CustomTabActivityTabFactory_Factory(
        activityProvider,
        persistencePolicyProvider,
        activityWindowAndroidProvider,
        customTabDelegateFactoryProvider,
        intentDataProvider,
        startupTabPreloaderProvider);
  }

  public static CustomTabActivityTabFactory newCustomTabActivityTabFactory(
      ChromeActivity<?> activity,
      CustomTabTabPersistencePolicy persistencePolicy,
      Lazy<ActivityWindowAndroid> activityWindowAndroid,
      Lazy<CustomTabDelegateFactory> customTabDelegateFactory,
      BrowserServicesIntentDataProvider intentDataProvider,
      StartupTabPreloader startupTabPreloader) {
    return new CustomTabActivityTabFactory(
        activity,
        persistencePolicy,
        activityWindowAndroid,
        customTabDelegateFactory,
        intentDataProvider,
        startupTabPreloader);
  }
}
