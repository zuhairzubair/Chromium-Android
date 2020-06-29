package org.chromium.chrome.browser.customtabs.dependency_injection;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import org.chromium.chrome.browser.init.StartupTabPreloader;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class CustomTabActivityModule_ProvideStartupTabPreloaderFactory
    implements Factory<StartupTabPreloader> {
  private final CustomTabActivityModule module;

  public CustomTabActivityModule_ProvideStartupTabPreloaderFactory(CustomTabActivityModule module) {
    this.module = module;
  }

  @Override
  public StartupTabPreloader get() {
    return provideInstance(module);
  }

  public static StartupTabPreloader provideInstance(CustomTabActivityModule module) {
    return proxyProvideStartupTabPreloader(module);
  }

  public static CustomTabActivityModule_ProvideStartupTabPreloaderFactory create(
      CustomTabActivityModule module) {
    return new CustomTabActivityModule_ProvideStartupTabPreloaderFactory(module);
  }

  public static StartupTabPreloader proxyProvideStartupTabPreloader(
      CustomTabActivityModule instance) {
    return Preconditions.checkNotNull(
        instance.provideStartupTabPreloader(),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
