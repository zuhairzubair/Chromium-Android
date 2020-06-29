package org.chromium.chrome.browser.dependency_injection;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import org.chromium.chrome.browser.notifications.channels.SiteChannelsManager;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ChromeAppModule_ProvidesSiteChannelsManagerFactory
    implements Factory<SiteChannelsManager> {
  private final ChromeAppModule module;

  public ChromeAppModule_ProvidesSiteChannelsManagerFactory(ChromeAppModule module) {
    this.module = module;
  }

  @Override
  public SiteChannelsManager get() {
    return provideInstance(module);
  }

  public static SiteChannelsManager provideInstance(ChromeAppModule module) {
    return proxyProvidesSiteChannelsManager(module);
  }

  public static ChromeAppModule_ProvidesSiteChannelsManagerFactory create(ChromeAppModule module) {
    return new ChromeAppModule_ProvidesSiteChannelsManagerFactory(module);
  }

  public static SiteChannelsManager proxyProvidesSiteChannelsManager(ChromeAppModule instance) {
    return Preconditions.checkNotNull(
        instance.providesSiteChannelsManager(),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
