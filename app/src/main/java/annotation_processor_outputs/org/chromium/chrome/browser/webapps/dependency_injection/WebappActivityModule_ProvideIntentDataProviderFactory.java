package org.chromium.chrome.browser.webapps.dependency_injection;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import org.chromium.chrome.browser.browserservices.BrowserServicesIntentDataProvider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class WebappActivityModule_ProvideIntentDataProviderFactory
    implements Factory<BrowserServicesIntentDataProvider> {
  private final WebappActivityModule module;

  public WebappActivityModule_ProvideIntentDataProviderFactory(WebappActivityModule module) {
    this.module = module;
  }

  @Override
  public BrowserServicesIntentDataProvider get() {
    return provideInstance(module);
  }

  public static BrowserServicesIntentDataProvider provideInstance(WebappActivityModule module) {
    return proxyProvideIntentDataProvider(module);
  }

  public static WebappActivityModule_ProvideIntentDataProviderFactory create(
      WebappActivityModule module) {
    return new WebappActivityModule_ProvideIntentDataProviderFactory(module);
  }

  public static BrowserServicesIntentDataProvider proxyProvideIntentDataProvider(
      WebappActivityModule instance) {
    return Preconditions.checkNotNull(
        instance.provideIntentDataProvider(),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
