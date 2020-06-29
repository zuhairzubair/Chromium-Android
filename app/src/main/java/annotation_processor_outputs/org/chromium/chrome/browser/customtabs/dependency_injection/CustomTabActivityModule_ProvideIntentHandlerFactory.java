package org.chromium.chrome.browser.customtabs.dependency_injection;

import dagger.Lazy;
import dagger.internal.DoubleCheck;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;
import org.chromium.chrome.browser.browserservices.trustedwebactivityui.TwaIntentHandlingStrategy;
import org.chromium.chrome.browser.customtabs.content.CustomTabIntentHandlingStrategy;
import org.chromium.chrome.browser.customtabs.content.DefaultCustomTabIntentHandlingStrategy;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class CustomTabActivityModule_ProvideIntentHandlerFactory
    implements Factory<CustomTabIntentHandlingStrategy> {
  private final CustomTabActivityModule module;

  private final Provider<DefaultCustomTabIntentHandlingStrategy> defaultHandlerProvider;

  private final Provider<TwaIntentHandlingStrategy> twaHandlerProvider;

  public CustomTabActivityModule_ProvideIntentHandlerFactory(
      CustomTabActivityModule module,
      Provider<DefaultCustomTabIntentHandlingStrategy> defaultHandlerProvider,
      Provider<TwaIntentHandlingStrategy> twaHandlerProvider) {
    this.module = module;
    this.defaultHandlerProvider = defaultHandlerProvider;
    this.twaHandlerProvider = twaHandlerProvider;
  }

  @Override
  public CustomTabIntentHandlingStrategy get() {
    return provideInstance(module, defaultHandlerProvider, twaHandlerProvider);
  }

  public static CustomTabIntentHandlingStrategy provideInstance(
      CustomTabActivityModule module,
      Provider<DefaultCustomTabIntentHandlingStrategy> defaultHandlerProvider,
      Provider<TwaIntentHandlingStrategy> twaHandlerProvider) {
    return proxyProvideIntentHandler(
        module, DoubleCheck.lazy(defaultHandlerProvider), DoubleCheck.lazy(twaHandlerProvider));
  }

  public static CustomTabActivityModule_ProvideIntentHandlerFactory create(
      CustomTabActivityModule module,
      Provider<DefaultCustomTabIntentHandlingStrategy> defaultHandlerProvider,
      Provider<TwaIntentHandlingStrategy> twaHandlerProvider) {
    return new CustomTabActivityModule_ProvideIntentHandlerFactory(
        module, defaultHandlerProvider, twaHandlerProvider);
  }

  public static CustomTabIntentHandlingStrategy proxyProvideIntentHandler(
      CustomTabActivityModule instance,
      Lazy<DefaultCustomTabIntentHandlingStrategy> defaultHandler,
      Lazy<TwaIntentHandlingStrategy> twaHandler) {
    return Preconditions.checkNotNull(
        instance.provideIntentHandler(defaultHandler, twaHandler),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
