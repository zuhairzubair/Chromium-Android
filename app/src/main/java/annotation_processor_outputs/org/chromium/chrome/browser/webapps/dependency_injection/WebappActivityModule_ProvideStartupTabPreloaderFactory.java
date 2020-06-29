package org.chromium.chrome.browser.webapps.dependency_injection;

import androidx.annotation.Nullable;
import dagger.internal.Factory;
import javax.annotation.Generated;
import org.chromium.chrome.browser.init.StartupTabPreloader;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class WebappActivityModule_ProvideStartupTabPreloaderFactory
    implements Factory<StartupTabPreloader> {
  private final WebappActivityModule module;

  public WebappActivityModule_ProvideStartupTabPreloaderFactory(WebappActivityModule module) {
    this.module = module;
  }

  @Override
  @Nullable
  public StartupTabPreloader get() {
    return provideInstance(module);
  }

  @Nullable
  public static StartupTabPreloader provideInstance(WebappActivityModule module) {
    return proxyProvideStartupTabPreloader(module);
  }

  public static WebappActivityModule_ProvideStartupTabPreloaderFactory create(
      WebappActivityModule module) {
    return new WebappActivityModule_ProvideStartupTabPreloaderFactory(module);
  }

  @Nullable
  public static StartupTabPreloader proxyProvideStartupTabPreloader(WebappActivityModule instance) {
    return instance.provideStartupTabPreloader();
  }
}
