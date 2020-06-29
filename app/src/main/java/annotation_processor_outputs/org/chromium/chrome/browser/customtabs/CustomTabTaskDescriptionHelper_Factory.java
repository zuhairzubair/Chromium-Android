package org.chromium.chrome.browser.customtabs;

import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;
import org.chromium.chrome.browser.ChromeActivity;
import org.chromium.chrome.browser.browserservices.BrowserServicesIntentDataProvider;
import org.chromium.chrome.browser.customtabs.content.CustomTabActivityTabProvider;
import org.chromium.chrome.browser.customtabs.content.TabObserverRegistrar;
import org.chromium.chrome.browser.lifecycle.ActivityLifecycleDispatcher;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class CustomTabTaskDescriptionHelper_Factory
    implements Factory<CustomTabTaskDescriptionHelper> {
  private final Provider<ChromeActivity<?>> activityProvider;

  private final Provider<CustomTabActivityTabProvider> tabProvider;

  private final Provider<TabObserverRegistrar> tabObserverRegistrarProvider;

  private final Provider<BrowserServicesIntentDataProvider> intentDataProvider;

  private final Provider<ActivityLifecycleDispatcher> activityLifecycleDispatcherProvider;

  public CustomTabTaskDescriptionHelper_Factory(
      Provider<ChromeActivity<?>> activityProvider,
      Provider<CustomTabActivityTabProvider> tabProvider,
      Provider<TabObserverRegistrar> tabObserverRegistrarProvider,
      Provider<BrowserServicesIntentDataProvider> intentDataProvider,
      Provider<ActivityLifecycleDispatcher> activityLifecycleDispatcherProvider) {
    this.activityProvider = activityProvider;
    this.tabProvider = tabProvider;
    this.tabObserverRegistrarProvider = tabObserverRegistrarProvider;
    this.intentDataProvider = intentDataProvider;
    this.activityLifecycleDispatcherProvider = activityLifecycleDispatcherProvider;
  }

  @Override
  public CustomTabTaskDescriptionHelper get() {
    return provideInstance(
        activityProvider,
        tabProvider,
        tabObserverRegistrarProvider,
        intentDataProvider,
        activityLifecycleDispatcherProvider);
  }

  public static CustomTabTaskDescriptionHelper provideInstance(
      Provider<ChromeActivity<?>> activityProvider,
      Provider<CustomTabActivityTabProvider> tabProvider,
      Provider<TabObserverRegistrar> tabObserverRegistrarProvider,
      Provider<BrowserServicesIntentDataProvider> intentDataProvider,
      Provider<ActivityLifecycleDispatcher> activityLifecycleDispatcherProvider) {
    return new CustomTabTaskDescriptionHelper(
        activityProvider.get(),
        tabProvider.get(),
        tabObserverRegistrarProvider.get(),
        intentDataProvider.get(),
        activityLifecycleDispatcherProvider.get());
  }

  public static CustomTabTaskDescriptionHelper_Factory create(
      Provider<ChromeActivity<?>> activityProvider,
      Provider<CustomTabActivityTabProvider> tabProvider,
      Provider<TabObserverRegistrar> tabObserverRegistrarProvider,
      Provider<BrowserServicesIntentDataProvider> intentDataProvider,
      Provider<ActivityLifecycleDispatcher> activityLifecycleDispatcherProvider) {
    return new CustomTabTaskDescriptionHelper_Factory(
        activityProvider,
        tabProvider,
        tabObserverRegistrarProvider,
        intentDataProvider,
        activityLifecycleDispatcherProvider);
  }

  public static CustomTabTaskDescriptionHelper newCustomTabTaskDescriptionHelper(
      ChromeActivity<?> activity,
      CustomTabActivityTabProvider tabProvider,
      TabObserverRegistrar tabObserverRegistrar,
      BrowserServicesIntentDataProvider intentDataProvider,
      ActivityLifecycleDispatcher activityLifecycleDispatcher) {
    return new CustomTabTaskDescriptionHelper(
        activity,
        tabProvider,
        tabObserverRegistrar,
        intentDataProvider,
        activityLifecycleDispatcher);
  }
}
