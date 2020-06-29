package org.chromium.chrome.browser.webapps.dependency_injection;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;
import org.chromium.chrome.browser.browserservices.BrowserServicesActivityTabController;
import org.chromium.chrome.browser.webapps.WebappActivityTabController;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class WebappActivityModule_ProvideTabControllerFactory
    implements Factory<BrowserServicesActivityTabController> {
  private final WebappActivityModule module;

  private final Provider<WebappActivityTabController> webappTabControllerProvider;

  public WebappActivityModule_ProvideTabControllerFactory(
      WebappActivityModule module,
      Provider<WebappActivityTabController> webappTabControllerProvider) {
    this.module = module;
    this.webappTabControllerProvider = webappTabControllerProvider;
  }

  @Override
  public BrowserServicesActivityTabController get() {
    return provideInstance(module, webappTabControllerProvider);
  }

  public static BrowserServicesActivityTabController provideInstance(
      WebappActivityModule module,
      Provider<WebappActivityTabController> webappTabControllerProvider) {
    return proxyProvideTabController(module, webappTabControllerProvider.get());
  }

  public static WebappActivityModule_ProvideTabControllerFactory create(
      WebappActivityModule module,
      Provider<WebappActivityTabController> webappTabControllerProvider) {
    return new WebappActivityModule_ProvideTabControllerFactory(
        module, webappTabControllerProvider);
  }

  public static BrowserServicesActivityTabController proxyProvideTabController(
      WebappActivityModule instance, WebappActivityTabController webappTabController) {
    return Preconditions.checkNotNull(
        instance.provideTabController(webappTabController),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
