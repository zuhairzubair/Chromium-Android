package org.chromium.chrome.browser.browserservices.trustedwebactivityui;

import dagger.Lazy;
import dagger.internal.DoubleCheck;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;
import org.chromium.chrome.browser.browserservices.BrowserServicesIntentDataProvider;
import org.chromium.chrome.browser.browserservices.TrustedWebActivityUmaRecorder;
import org.chromium.chrome.browser.browserservices.trustedwebactivityui.controller.ClientPackageNameProvider;
import org.chromium.chrome.browser.browserservices.trustedwebactivityui.controller.CurrentPageVerifier;
import org.chromium.chrome.browser.browserservices.trustedwebactivityui.controller.TrustedWebActivityBrowserControlsVisibilityManager;
import org.chromium.chrome.browser.browserservices.trustedwebactivityui.controller.TrustedWebActivityDisclosureController;
import org.chromium.chrome.browser.browserservices.trustedwebactivityui.controller.TrustedWebActivityOpenTimeRecorder;
import org.chromium.chrome.browser.browserservices.trustedwebactivityui.controller.TwaRegistrar;
import org.chromium.chrome.browser.browserservices.trustedwebactivityui.controller.Verifier;
import org.chromium.chrome.browser.browserservices.trustedwebactivityui.splashscreen.TwaSplashController;
import org.chromium.chrome.browser.browserservices.trustedwebactivityui.view.TrustedWebActivityDisclosureView;
import org.chromium.chrome.browser.customtabs.CustomTabStatusBarColorProvider;
import org.chromium.chrome.browser.customtabs.CustomTabsConnection;
import org.chromium.chrome.browser.customtabs.ExternalIntentsPolicyProvider;
import org.chromium.chrome.browser.customtabs.content.CustomTabActivityNavigationController;
import org.chromium.chrome.browser.customtabs.features.ImmersiveModeController;
import org.chromium.chrome.browser.customtabs.features.toolbar.CustomTabToolbarColorController;
import org.chromium.chrome.browser.lifecycle.ActivityLifecycleDispatcher;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class TrustedWebActivityCoordinator_Factory
    implements Factory<TrustedWebActivityCoordinator> {
  private final Provider<TrustedWebActivityDisclosureController> disclosureControllerProvider;

  private final Provider<TrustedWebActivityDisclosureView> disclosureViewProvider;

  private final Provider<TrustedWebActivityOpenTimeRecorder> openTimeRecorderProvider;

  private final Provider<CurrentPageVerifier> currentPageVerifierProvider;

  private final Provider<Verifier> verifierProvider;

  private final Provider<CustomTabActivityNavigationController> navigationControllerProvider;

  private final Provider<ExternalIntentsPolicyProvider> externalIntentsPolicyProvider;

  private final Provider<TwaSplashController> splashControllerProvider;

  private final Provider<BrowserServicesIntentDataProvider> intentDataProvider;

  private final Provider<TrustedWebActivityUmaRecorder> umaRecorderProvider;

  private final Provider<CustomTabToolbarColorController> toolbarColorControllerProvider;

  private final Provider<CustomTabStatusBarColorProvider> statusBarColorProvider;

  private final Provider<ActivityLifecycleDispatcher> lifecycleDispatcherProvider;

  private final Provider<TrustedWebActivityBrowserControlsVisibilityManager>
      browserControlsVisibilityManagerProvider;

  private final Provider<ImmersiveModeController> immersiveModeControllerProvider;

  private final Provider<TwaRegistrar> twaRegistrarProvider;

  private final Provider<ClientPackageNameProvider> clientPackageNameProvider;

  private final Provider<CustomTabsConnection> customTabsConnectionProvider;

  public TrustedWebActivityCoordinator_Factory(
      Provider<TrustedWebActivityDisclosureController> disclosureControllerProvider,
      Provider<TrustedWebActivityDisclosureView> disclosureViewProvider,
      Provider<TrustedWebActivityOpenTimeRecorder> openTimeRecorderProvider,
      Provider<CurrentPageVerifier> currentPageVerifierProvider,
      Provider<Verifier> verifierProvider,
      Provider<CustomTabActivityNavigationController> navigationControllerProvider,
      Provider<ExternalIntentsPolicyProvider> externalIntentsPolicyProvider,
      Provider<TwaSplashController> splashControllerProvider,
      Provider<BrowserServicesIntentDataProvider> intentDataProvider,
      Provider<TrustedWebActivityUmaRecorder> umaRecorderProvider,
      Provider<CustomTabToolbarColorController> toolbarColorControllerProvider,
      Provider<CustomTabStatusBarColorProvider> statusBarColorProvider,
      Provider<ActivityLifecycleDispatcher> lifecycleDispatcherProvider,
      Provider<TrustedWebActivityBrowserControlsVisibilityManager>
          browserControlsVisibilityManagerProvider,
      Provider<ImmersiveModeController> immersiveModeControllerProvider,
      Provider<TwaRegistrar> twaRegistrarProvider,
      Provider<ClientPackageNameProvider> clientPackageNameProvider,
      Provider<CustomTabsConnection> customTabsConnectionProvider) {
    this.disclosureControllerProvider = disclosureControllerProvider;
    this.disclosureViewProvider = disclosureViewProvider;
    this.openTimeRecorderProvider = openTimeRecorderProvider;
    this.currentPageVerifierProvider = currentPageVerifierProvider;
    this.verifierProvider = verifierProvider;
    this.navigationControllerProvider = navigationControllerProvider;
    this.externalIntentsPolicyProvider = externalIntentsPolicyProvider;
    this.splashControllerProvider = splashControllerProvider;
    this.intentDataProvider = intentDataProvider;
    this.umaRecorderProvider = umaRecorderProvider;
    this.toolbarColorControllerProvider = toolbarColorControllerProvider;
    this.statusBarColorProvider = statusBarColorProvider;
    this.lifecycleDispatcherProvider = lifecycleDispatcherProvider;
    this.browserControlsVisibilityManagerProvider = browserControlsVisibilityManagerProvider;
    this.immersiveModeControllerProvider = immersiveModeControllerProvider;
    this.twaRegistrarProvider = twaRegistrarProvider;
    this.clientPackageNameProvider = clientPackageNameProvider;
    this.customTabsConnectionProvider = customTabsConnectionProvider;
  }

  @Override
  public TrustedWebActivityCoordinator get() {
    return provideInstance(
        disclosureControllerProvider,
        disclosureViewProvider,
        openTimeRecorderProvider,
        currentPageVerifierProvider,
        verifierProvider,
        navigationControllerProvider,
        externalIntentsPolicyProvider,
        splashControllerProvider,
        intentDataProvider,
        umaRecorderProvider,
        toolbarColorControllerProvider,
        statusBarColorProvider,
        lifecycleDispatcherProvider,
        browserControlsVisibilityManagerProvider,
        immersiveModeControllerProvider,
        twaRegistrarProvider,
        clientPackageNameProvider,
        customTabsConnectionProvider);
  }

  public static TrustedWebActivityCoordinator provideInstance(
      Provider<TrustedWebActivityDisclosureController> disclosureControllerProvider,
      Provider<TrustedWebActivityDisclosureView> disclosureViewProvider,
      Provider<TrustedWebActivityOpenTimeRecorder> openTimeRecorderProvider,
      Provider<CurrentPageVerifier> currentPageVerifierProvider,
      Provider<Verifier> verifierProvider,
      Provider<CustomTabActivityNavigationController> navigationControllerProvider,
      Provider<ExternalIntentsPolicyProvider> externalIntentsPolicyProvider,
      Provider<TwaSplashController> splashControllerProvider,
      Provider<BrowserServicesIntentDataProvider> intentDataProvider,
      Provider<TrustedWebActivityUmaRecorder> umaRecorderProvider,
      Provider<CustomTabToolbarColorController> toolbarColorControllerProvider,
      Provider<CustomTabStatusBarColorProvider> statusBarColorProvider,
      Provider<ActivityLifecycleDispatcher> lifecycleDispatcherProvider,
      Provider<TrustedWebActivityBrowserControlsVisibilityManager>
          browserControlsVisibilityManagerProvider,
      Provider<ImmersiveModeController> immersiveModeControllerProvider,
      Provider<TwaRegistrar> twaRegistrarProvider,
      Provider<ClientPackageNameProvider> clientPackageNameProvider,
      Provider<CustomTabsConnection> customTabsConnectionProvider) {
    return new TrustedWebActivityCoordinator(
        disclosureControllerProvider.get(),
        disclosureViewProvider.get(),
        openTimeRecorderProvider.get(),
        currentPageVerifierProvider.get(),
        verifierProvider.get(),
        navigationControllerProvider.get(),
        externalIntentsPolicyProvider.get(),
        DoubleCheck.lazy(splashControllerProvider),
        intentDataProvider.get(),
        umaRecorderProvider.get(),
        toolbarColorControllerProvider.get(),
        statusBarColorProvider.get(),
        lifecycleDispatcherProvider.get(),
        browserControlsVisibilityManagerProvider.get(),
        DoubleCheck.lazy(immersiveModeControllerProvider),
        twaRegistrarProvider.get(),
        clientPackageNameProvider.get(),
        customTabsConnectionProvider.get());
  }

  public static TrustedWebActivityCoordinator_Factory create(
      Provider<TrustedWebActivityDisclosureController> disclosureControllerProvider,
      Provider<TrustedWebActivityDisclosureView> disclosureViewProvider,
      Provider<TrustedWebActivityOpenTimeRecorder> openTimeRecorderProvider,
      Provider<CurrentPageVerifier> currentPageVerifierProvider,
      Provider<Verifier> verifierProvider,
      Provider<CustomTabActivityNavigationController> navigationControllerProvider,
      Provider<ExternalIntentsPolicyProvider> externalIntentsPolicyProvider,
      Provider<TwaSplashController> splashControllerProvider,
      Provider<BrowserServicesIntentDataProvider> intentDataProvider,
      Provider<TrustedWebActivityUmaRecorder> umaRecorderProvider,
      Provider<CustomTabToolbarColorController> toolbarColorControllerProvider,
      Provider<CustomTabStatusBarColorProvider> statusBarColorProvider,
      Provider<ActivityLifecycleDispatcher> lifecycleDispatcherProvider,
      Provider<TrustedWebActivityBrowserControlsVisibilityManager>
          browserControlsVisibilityManagerProvider,
      Provider<ImmersiveModeController> immersiveModeControllerProvider,
      Provider<TwaRegistrar> twaRegistrarProvider,
      Provider<ClientPackageNameProvider> clientPackageNameProvider,
      Provider<CustomTabsConnection> customTabsConnectionProvider) {
    return new TrustedWebActivityCoordinator_Factory(
        disclosureControllerProvider,
        disclosureViewProvider,
        openTimeRecorderProvider,
        currentPageVerifierProvider,
        verifierProvider,
        navigationControllerProvider,
        externalIntentsPolicyProvider,
        splashControllerProvider,
        intentDataProvider,
        umaRecorderProvider,
        toolbarColorControllerProvider,
        statusBarColorProvider,
        lifecycleDispatcherProvider,
        browserControlsVisibilityManagerProvider,
        immersiveModeControllerProvider,
        twaRegistrarProvider,
        clientPackageNameProvider,
        customTabsConnectionProvider);
  }

  public static TrustedWebActivityCoordinator newTrustedWebActivityCoordinator(
      TrustedWebActivityDisclosureController disclosureController,
      TrustedWebActivityDisclosureView disclosureView,
      TrustedWebActivityOpenTimeRecorder openTimeRecorder,
      CurrentPageVerifier currentPageVerifier,
      Verifier verifier,
      CustomTabActivityNavigationController navigationController,
      ExternalIntentsPolicyProvider externalIntentsPolicyProvider,
      Lazy<TwaSplashController> splashController,
      BrowserServicesIntentDataProvider intentDataProvider,
      TrustedWebActivityUmaRecorder umaRecorder,
      CustomTabToolbarColorController toolbarColorController,
      CustomTabStatusBarColorProvider statusBarColorProvider,
      ActivityLifecycleDispatcher lifecycleDispatcher,
      TrustedWebActivityBrowserControlsVisibilityManager browserControlsVisibilityManager,
      Lazy<ImmersiveModeController> immersiveModeController,
      TwaRegistrar twaRegistrar,
      ClientPackageNameProvider clientPackageNameProvider,
      CustomTabsConnection customTabsConnection) {
    return new TrustedWebActivityCoordinator(
        disclosureController,
        disclosureView,
        openTimeRecorder,
        currentPageVerifier,
        verifier,
        navigationController,
        externalIntentsPolicyProvider,
        splashController,
        intentDataProvider,
        umaRecorder,
        toolbarColorController,
        statusBarColorProvider,
        lifecycleDispatcher,
        browserControlsVisibilityManager,
        immersiveModeController,
        twaRegistrar,
        clientPackageNameProvider,
        customTabsConnection);
  }
}
