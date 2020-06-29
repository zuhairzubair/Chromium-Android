package org.chromium.chrome.browser.dependency_injection;

import android.app.Activity;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ChromeActivityCommonsModule_ProvideActivityFactory implements Factory<Activity> {
  private final ChromeActivityCommonsModule module;

  public ChromeActivityCommonsModule_ProvideActivityFactory(ChromeActivityCommonsModule module) {
    this.module = module;
  }

  @Override
  public Activity get() {
    return provideInstance(module);
  }

  public static Activity provideInstance(ChromeActivityCommonsModule module) {
    return proxyProvideActivity(module);
  }

  public static ChromeActivityCommonsModule_ProvideActivityFactory create(
      ChromeActivityCommonsModule module) {
    return new ChromeActivityCommonsModule_ProvideActivityFactory(module);
  }

  public static Activity proxyProvideActivity(ChromeActivityCommonsModule instance) {
    return Preconditions.checkNotNull(
        instance.provideActivity(), "Cannot return null from a non-@Nullable @Provides method");
  }
}
