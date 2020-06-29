package org.chromium.chrome.browser.dependency_injection;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import org.chromium.chrome.browser.ui.system.StatusBarColorController;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ChromeActivityCommonsModule_ProvideStatusBarColorControllerFactory
    implements Factory<StatusBarColorController> {
  private final ChromeActivityCommonsModule module;

  public ChromeActivityCommonsModule_ProvideStatusBarColorControllerFactory(
      ChromeActivityCommonsModule module) {
    this.module = module;
  }

  @Override
  public StatusBarColorController get() {
    return provideInstance(module);
  }

  public static StatusBarColorController provideInstance(ChromeActivityCommonsModule module) {
    return proxyProvideStatusBarColorController(module);
  }

  public static ChromeActivityCommonsModule_ProvideStatusBarColorControllerFactory create(
      ChromeActivityCommonsModule module) {
    return new ChromeActivityCommonsModule_ProvideStatusBarColorControllerFactory(module);
  }

  public static StatusBarColorController proxyProvideStatusBarColorController(
      ChromeActivityCommonsModule instance) {
    return Preconditions.checkNotNull(
        instance.provideStatusBarColorController(),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
