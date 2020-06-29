package org.chromium.chrome.browser.dependency_injection;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import org.chromium.chrome.browser.night_mode.SystemNightModeMonitor;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ChromeAppModule_ProvideSystemNightModeMonitorFactory
    implements Factory<SystemNightModeMonitor> {
  private final ChromeAppModule module;

  public ChromeAppModule_ProvideSystemNightModeMonitorFactory(ChromeAppModule module) {
    this.module = module;
  }

  @Override
  public SystemNightModeMonitor get() {
    return provideInstance(module);
  }

  public static SystemNightModeMonitor provideInstance(ChromeAppModule module) {
    return proxyProvideSystemNightModeMonitor(module);
  }

  public static ChromeAppModule_ProvideSystemNightModeMonitorFactory create(
      ChromeAppModule module) {
    return new ChromeAppModule_ProvideSystemNightModeMonitorFactory(module);
  }

  public static SystemNightModeMonitor proxyProvideSystemNightModeMonitor(
      ChromeAppModule instance) {
    return Preconditions.checkNotNull(
        instance.provideSystemNightModeMonitor(),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
