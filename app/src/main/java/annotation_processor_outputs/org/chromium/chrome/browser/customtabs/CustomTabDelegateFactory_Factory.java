package org.chromium.chrome.browser.customtabs;

import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;
import org.chromium.chrome.browser.ChromeActivity;
import org.chromium.chrome.browser.browserservices.BrowserServicesIntentDataProvider;
import org.chromium.chrome.browser.customtabs.features.toolbar.CustomTabBrowserControlsVisibilityDelegate;
import org.chromium.chrome.browser.externalauth.ExternalAuthUtils;
import org.chromium.chrome.browser.multiwindow.MultiWindowUtils;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class CustomTabDelegateFactory_Factory implements Factory<CustomTabDelegateFactory> {
  private final Provider<ChromeActivity<?>> activityProvider;

  private final Provider<BrowserServicesIntentDataProvider> intentDataProvider;

  private final Provider<CustomTabBrowserControlsVisibilityDelegate> visibilityDelegateProvider;

  private final Provider<ExternalAuthUtils> authUtilsProvider;

  private final Provider<MultiWindowUtils> multiWindowUtilsProvider;

  private final Provider<ExternalIntentsPolicyProvider> externalIntentsPolicyProvider;

  public CustomTabDelegateFactory_Factory(
      Provider<ChromeActivity<?>> activityProvider,
      Provider<BrowserServicesIntentDataProvider> intentDataProvider,
      Provider<CustomTabBrowserControlsVisibilityDelegate> visibilityDelegateProvider,
      Provider<ExternalAuthUtils> authUtilsProvider,
      Provider<MultiWindowUtils> multiWindowUtilsProvider,
      Provider<ExternalIntentsPolicyProvider> externalIntentsPolicyProvider) {
    this.activityProvider = activityProvider;
    this.intentDataProvider = intentDataProvider;
    this.visibilityDelegateProvider = visibilityDelegateProvider;
    this.authUtilsProvider = authUtilsProvider;
    this.multiWindowUtilsProvider = multiWindowUtilsProvider;
    this.externalIntentsPolicyProvider = externalIntentsPolicyProvider;
  }

  @Override
  public CustomTabDelegateFactory get() {
    return provideInstance(
        activityProvider,
        intentDataProvider,
        visibilityDelegateProvider,
        authUtilsProvider,
        multiWindowUtilsProvider,
        externalIntentsPolicyProvider);
  }

  public static CustomTabDelegateFactory provideInstance(
      Provider<ChromeActivity<?>> activityProvider,
      Provider<BrowserServicesIntentDataProvider> intentDataProvider,
      Provider<CustomTabBrowserControlsVisibilityDelegate> visibilityDelegateProvider,
      Provider<ExternalAuthUtils> authUtilsProvider,
      Provider<MultiWindowUtils> multiWindowUtilsProvider,
      Provider<ExternalIntentsPolicyProvider> externalIntentsPolicyProvider) {
    return new CustomTabDelegateFactory(
        activityProvider.get(),
        intentDataProvider.get(),
        visibilityDelegateProvider.get(),
        authUtilsProvider.get(),
        multiWindowUtilsProvider.get(),
        externalIntentsPolicyProvider.get());
  }

  public static CustomTabDelegateFactory_Factory create(
      Provider<ChromeActivity<?>> activityProvider,
      Provider<BrowserServicesIntentDataProvider> intentDataProvider,
      Provider<CustomTabBrowserControlsVisibilityDelegate> visibilityDelegateProvider,
      Provider<ExternalAuthUtils> authUtilsProvider,
      Provider<MultiWindowUtils> multiWindowUtilsProvider,
      Provider<ExternalIntentsPolicyProvider> externalIntentsPolicyProvider) {
    return new CustomTabDelegateFactory_Factory(
        activityProvider,
        intentDataProvider,
        visibilityDelegateProvider,
        authUtilsProvider,
        multiWindowUtilsProvider,
        externalIntentsPolicyProvider);
  }

  public static CustomTabDelegateFactory newCustomTabDelegateFactory(
      ChromeActivity<?> activity,
      BrowserServicesIntentDataProvider intentDataProvider,
      CustomTabBrowserControlsVisibilityDelegate visibilityDelegate,
      ExternalAuthUtils authUtils,
      MultiWindowUtils multiWindowUtils,
      ExternalIntentsPolicyProvider externalIntentsPolicyProvider) {
    return new CustomTabDelegateFactory(
        activity,
        intentDataProvider,
        visibilityDelegate,
        authUtils,
        multiWindowUtils,
        externalIntentsPolicyProvider);
  }
}
