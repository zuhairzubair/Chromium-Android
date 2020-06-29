package org.chromium.chrome.browser.customtabs.features.toolbar;

import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;
import org.chromium.chrome.browser.ChromeActivity;
import org.chromium.chrome.browser.browserservices.BrowserServicesIntentDataProvider;
import org.chromium.chrome.browser.customtabs.content.CustomTabActivityTabProvider;
import org.chromium.chrome.browser.customtabs.content.TabObserverRegistrar;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class CustomTabToolbarColorController_Factory
    implements Factory<CustomTabToolbarColorController> {
  private final Provider<BrowserServicesIntentDataProvider> intentDataProvider;

  private final Provider<ChromeActivity<?>> activityProvider;

  private final Provider<CustomTabActivityTabProvider> tabProvider;

  private final Provider<TabObserverRegistrar> tabObserverRegistrarProvider;

  public CustomTabToolbarColorController_Factory(
      Provider<BrowserServicesIntentDataProvider> intentDataProvider,
      Provider<ChromeActivity<?>> activityProvider,
      Provider<CustomTabActivityTabProvider> tabProvider,
      Provider<TabObserverRegistrar> tabObserverRegistrarProvider) {
    this.intentDataProvider = intentDataProvider;
    this.activityProvider = activityProvider;
    this.tabProvider = tabProvider;
    this.tabObserverRegistrarProvider = tabObserverRegistrarProvider;
  }

  @Override
  public CustomTabToolbarColorController get() {
    return provideInstance(
        intentDataProvider, activityProvider, tabProvider, tabObserverRegistrarProvider);
  }

  public static CustomTabToolbarColorController provideInstance(
      Provider<BrowserServicesIntentDataProvider> intentDataProvider,
      Provider<ChromeActivity<?>> activityProvider,
      Provider<CustomTabActivityTabProvider> tabProvider,
      Provider<TabObserverRegistrar> tabObserverRegistrarProvider) {
    return new CustomTabToolbarColorController(
        intentDataProvider.get(),
        activityProvider.get(),
        tabProvider.get(),
        tabObserverRegistrarProvider.get());
  }

  public static CustomTabToolbarColorController_Factory create(
      Provider<BrowserServicesIntentDataProvider> intentDataProvider,
      Provider<ChromeActivity<?>> activityProvider,
      Provider<CustomTabActivityTabProvider> tabProvider,
      Provider<TabObserverRegistrar> tabObserverRegistrarProvider) {
    return new CustomTabToolbarColorController_Factory(
        intentDataProvider, activityProvider, tabProvider, tabObserverRegistrarProvider);
  }

  public static CustomTabToolbarColorController newCustomTabToolbarColorController(
      BrowserServicesIntentDataProvider intentDataProvider,
      ChromeActivity<?> activity,
      CustomTabActivityTabProvider tabProvider,
      TabObserverRegistrar tabObserverRegistrar) {
    return new CustomTabToolbarColorController(
        intentDataProvider, activity, tabProvider, tabObserverRegistrar);
  }
}
