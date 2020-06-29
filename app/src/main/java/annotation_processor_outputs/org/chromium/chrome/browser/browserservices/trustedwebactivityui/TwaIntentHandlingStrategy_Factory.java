package org.chromium.chrome.browser.browserservices.trustedwebactivityui;

import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;
import org.chromium.chrome.browser.browserservices.trustedwebactivityui.sharing.TwaSharingController;
import org.chromium.chrome.browser.customtabs.content.DefaultCustomTabIntentHandlingStrategy;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class TwaIntentHandlingStrategy_Factory implements Factory<TwaIntentHandlingStrategy> {
  private final Provider<DefaultCustomTabIntentHandlingStrategy> defaultStrategyProvider;

  private final Provider<TwaSharingController> sharingControllerProvider;

  public TwaIntentHandlingStrategy_Factory(
      Provider<DefaultCustomTabIntentHandlingStrategy> defaultStrategyProvider,
      Provider<TwaSharingController> sharingControllerProvider) {
    this.defaultStrategyProvider = defaultStrategyProvider;
    this.sharingControllerProvider = sharingControllerProvider;
  }

  @Override
  public TwaIntentHandlingStrategy get() {
    return provideInstance(defaultStrategyProvider, sharingControllerProvider);
  }

  public static TwaIntentHandlingStrategy provideInstance(
      Provider<DefaultCustomTabIntentHandlingStrategy> defaultStrategyProvider,
      Provider<TwaSharingController> sharingControllerProvider) {
    return new TwaIntentHandlingStrategy(
        defaultStrategyProvider.get(), sharingControllerProvider.get());
  }

  public static TwaIntentHandlingStrategy_Factory create(
      Provider<DefaultCustomTabIntentHandlingStrategy> defaultStrategyProvider,
      Provider<TwaSharingController> sharingControllerProvider) {
    return new TwaIntentHandlingStrategy_Factory(
        defaultStrategyProvider, sharingControllerProvider);
  }

  public static TwaIntentHandlingStrategy newTwaIntentHandlingStrategy(
      DefaultCustomTabIntentHandlingStrategy defaultStrategy,
      TwaSharingController sharingController) {
    return new TwaIntentHandlingStrategy(defaultStrategy, sharingController);
  }
}
