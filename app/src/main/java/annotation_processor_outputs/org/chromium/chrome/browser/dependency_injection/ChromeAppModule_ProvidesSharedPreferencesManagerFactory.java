package org.chromium.chrome.browser.dependency_injection;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import org.chromium.chrome.browser.preferences.SharedPreferencesManager;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ChromeAppModule_ProvidesSharedPreferencesManagerFactory
    implements Factory<SharedPreferencesManager> {
  private final ChromeAppModule module;

  public ChromeAppModule_ProvidesSharedPreferencesManagerFactory(ChromeAppModule module) {
    this.module = module;
  }

  @Override
  public SharedPreferencesManager get() {
    return provideInstance(module);
  }

  public static SharedPreferencesManager provideInstance(ChromeAppModule module) {
    return proxyProvidesSharedPreferencesManager(module);
  }

  public static ChromeAppModule_ProvidesSharedPreferencesManagerFactory create(
      ChromeAppModule module) {
    return new ChromeAppModule_ProvidesSharedPreferencesManagerFactory(module);
  }

  public static SharedPreferencesManager proxyProvidesSharedPreferencesManager(
      ChromeAppModule instance) {
    return Preconditions.checkNotNull(
        instance.providesSharedPreferencesManager(),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
