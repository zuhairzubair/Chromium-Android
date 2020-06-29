package org.chromium.chrome.browser.customtabs.dependency_injection;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import org.chromium.chrome.browser.customtabs.CustomTabNightModeStateController;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class CustomTabActivityModule_ProvideNightModeControllerFactory
    implements Factory<CustomTabNightModeStateController> {
  private final CustomTabActivityModule module;

  public CustomTabActivityModule_ProvideNightModeControllerFactory(CustomTabActivityModule module) {
    this.module = module;
  }

  @Override
  public CustomTabNightModeStateController get() {
    return provideInstance(module);
  }

  public static CustomTabNightModeStateController provideInstance(CustomTabActivityModule module) {
    return proxyProvideNightModeController(module);
  }

  public static CustomTabActivityModule_ProvideNightModeControllerFactory create(
      CustomTabActivityModule module) {
    return new CustomTabActivityModule_ProvideNightModeControllerFactory(module);
  }

  public static CustomTabNightModeStateController proxyProvideNightModeController(
      CustomTabActivityModule instance) {
    return Preconditions.checkNotNull(
        instance.provideNightModeController(),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
