package org.chromium.chrome.browser.browserservices.trustedwebactivityui.sharing;

import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;
import org.chromium.chrome.browser.browserservices.TrustedWebActivityUmaRecorder;
import org.chromium.chrome.browser.browserservices.trustedwebactivityui.controller.TwaVerifier;
import org.chromium.chrome.browser.customtabs.content.CustomTabActivityNavigationController;
import org.chromium.chrome.browser.customtabs.content.CustomTabActivityTabProvider;
import org.chromium.chrome.browser.webapps.WebApkPostShareTargetNavigator;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class TwaSharingController_Factory implements Factory<TwaSharingController> {
  private final Provider<CustomTabActivityTabProvider> tabProvider;

  private final Provider<CustomTabActivityNavigationController> navigationControllerProvider;

  private final Provider<WebApkPostShareTargetNavigator> postNavigatorProvider;

  private final Provider<TwaVerifier> verifierDelegateProvider;

  private final Provider<TrustedWebActivityUmaRecorder> umaRecorderProvider;

  public TwaSharingController_Factory(
      Provider<CustomTabActivityTabProvider> tabProvider,
      Provider<CustomTabActivityNavigationController> navigationControllerProvider,
      Provider<WebApkPostShareTargetNavigator> postNavigatorProvider,
      Provider<TwaVerifier> verifierDelegateProvider,
      Provider<TrustedWebActivityUmaRecorder> umaRecorderProvider) {
    this.tabProvider = tabProvider;
    this.navigationControllerProvider = navigationControllerProvider;
    this.postNavigatorProvider = postNavigatorProvider;
    this.verifierDelegateProvider = verifierDelegateProvider;
    this.umaRecorderProvider = umaRecorderProvider;
  }

  @Override
  public TwaSharingController get() {
    return provideInstance(
        tabProvider,
        navigationControllerProvider,
        postNavigatorProvider,
        verifierDelegateProvider,
        umaRecorderProvider);
  }

  public static TwaSharingController provideInstance(
      Provider<CustomTabActivityTabProvider> tabProvider,
      Provider<CustomTabActivityNavigationController> navigationControllerProvider,
      Provider<WebApkPostShareTargetNavigator> postNavigatorProvider,
      Provider<TwaVerifier> verifierDelegateProvider,
      Provider<TrustedWebActivityUmaRecorder> umaRecorderProvider) {
    return new TwaSharingController(
        tabProvider.get(),
        navigationControllerProvider.get(),
        postNavigatorProvider.get(),
        verifierDelegateProvider.get(),
        umaRecorderProvider.get());
  }

  public static TwaSharingController_Factory create(
      Provider<CustomTabActivityTabProvider> tabProvider,
      Provider<CustomTabActivityNavigationController> navigationControllerProvider,
      Provider<WebApkPostShareTargetNavigator> postNavigatorProvider,
      Provider<TwaVerifier> verifierDelegateProvider,
      Provider<TrustedWebActivityUmaRecorder> umaRecorderProvider) {
    return new TwaSharingController_Factory(
        tabProvider,
        navigationControllerProvider,
        postNavigatorProvider,
        verifierDelegateProvider,
        umaRecorderProvider);
  }

  public static TwaSharingController newTwaSharingController(
      CustomTabActivityTabProvider tabProvider,
      CustomTabActivityNavigationController navigationController,
      WebApkPostShareTargetNavigator postNavigator,
      TwaVerifier verifierDelegate,
      TrustedWebActivityUmaRecorder umaRecorder) {
    return new TwaSharingController(
        tabProvider, navigationController, postNavigator, verifierDelegate, umaRecorder);
  }
}
