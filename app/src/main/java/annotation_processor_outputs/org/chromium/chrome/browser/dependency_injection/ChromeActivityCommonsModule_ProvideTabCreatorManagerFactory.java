package org.chromium.chrome.browser.dependency_injection;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import org.chromium.chrome.browser.tabmodel.TabCreatorManager;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ChromeActivityCommonsModule_ProvideTabCreatorManagerFactory
    implements Factory<TabCreatorManager> {
  private final ChromeActivityCommonsModule module;

  public ChromeActivityCommonsModule_ProvideTabCreatorManagerFactory(
      ChromeActivityCommonsModule module) {
    this.module = module;
  }

  @Override
  public TabCreatorManager get() {
    return provideInstance(module);
  }

  public static TabCreatorManager provideInstance(ChromeActivityCommonsModule module) {
    return proxyProvideTabCreatorManager(module);
  }

  public static ChromeActivityCommonsModule_ProvideTabCreatorManagerFactory create(
      ChromeActivityCommonsModule module) {
    return new ChromeActivityCommonsModule_ProvideTabCreatorManagerFactory(module);
  }

  public static TabCreatorManager proxyProvideTabCreatorManager(
      ChromeActivityCommonsModule instance) {
    return Preconditions.checkNotNull(
        instance.provideTabCreatorManager(),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
