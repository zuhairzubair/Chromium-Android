package org.chromium.chrome.browser.customtabs.dependency_injection;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import org.chromium.chrome.browser.browserservices.BrowserServicesIntentDataProvider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class CustomTabActivityModule_ProvidesBrowserServicesIntentDataProviderFactory
    implements Factory<BrowserServicesIntentDataProvider> {
  private final CustomTabActivityModule module;

  public CustomTabActivityModule_ProvidesBrowserServicesIntentDataProviderFactory(
      CustomTabActivityModule module) {
    this.module = module;
  }

  @Override
  public BrowserServicesIntentDataProvider get() {
    return provideInstance(module);
  }

  public static BrowserServicesIntentDataProvider provideInstance(CustomTabActivityModule module) {
    return proxyProvidesBrowserServicesIntentDataProvider(module);
  }

  public static CustomTabActivityModule_ProvidesBrowserServicesIntentDataProviderFactory create(
      CustomTabActivityModule module) {
    return new CustomTabActivityModule_ProvidesBrowserServicesIntentDataProviderFactory(module);
  }

  public static BrowserServicesIntentDataProvider proxyProvidesBrowserServicesIntentDataProvider(
      CustomTabActivityModule instance) {
    return Preconditions.checkNotNull(
        instance.providesBrowserServicesIntentDataProvider(),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
