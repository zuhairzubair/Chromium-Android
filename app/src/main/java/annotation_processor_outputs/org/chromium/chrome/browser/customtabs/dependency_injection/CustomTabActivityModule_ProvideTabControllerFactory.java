package org.chromium.chrome.browser.customtabs.dependency_injection;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;
import org.chromium.chrome.browser.browserservices.BrowserServicesActivityTabController;
import org.chromium.chrome.browser.customtabs.content.CustomTabActivityTabController;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class CustomTabActivityModule_ProvideTabControllerFactory
    implements Factory<BrowserServicesActivityTabController> {
  private final CustomTabActivityModule module;

  private final Provider<CustomTabActivityTabController> customTabActivityTabControllerProvider;

  public CustomTabActivityModule_ProvideTabControllerFactory(
      CustomTabActivityModule module,
      Provider<CustomTabActivityTabController> customTabActivityTabControllerProvider) {
    this.module = module;
    this.customTabActivityTabControllerProvider = customTabActivityTabControllerProvider;
  }

  @Override
  public BrowserServicesActivityTabController get() {
    return provideInstance(module, customTabActivityTabControllerProvider);
  }

  public static BrowserServicesActivityTabController provideInstance(
      CustomTabActivityModule module,
      Provider<CustomTabActivityTabController> customTabActivityTabControllerProvider) {
    return proxyProvideTabController(module, customTabActivityTabControllerProvider.get());
  }

  public static CustomTabActivityModule_ProvideTabControllerFactory create(
      CustomTabActivityModule module,
      Provider<CustomTabActivityTabController> customTabActivityTabControllerProvider) {
    return new CustomTabActivityModule_ProvideTabControllerFactory(
        module, customTabActivityTabControllerProvider);
  }

  public static BrowserServicesActivityTabController proxyProvideTabController(
      CustomTabActivityModule instance,
      CustomTabActivityTabController customTabActivityTabController) {
    return Preconditions.checkNotNull(
        instance.provideTabController(customTabActivityTabController),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
