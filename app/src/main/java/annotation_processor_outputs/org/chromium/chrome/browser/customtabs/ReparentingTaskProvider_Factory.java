package org.chromium.chrome.browser.customtabs;

import dagger.internal.Factory;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ReparentingTaskProvider_Factory implements Factory<ReparentingTaskProvider> {
  private static final ReparentingTaskProvider_Factory INSTANCE =
      new ReparentingTaskProvider_Factory();

  @Override
  public ReparentingTaskProvider get() {
    return provideInstance();
  }

  public static ReparentingTaskProvider provideInstance() {
    return new ReparentingTaskProvider();
  }

  public static ReparentingTaskProvider_Factory create() {
    return INSTANCE;
  }

  public static ReparentingTaskProvider newReparentingTaskProvider() {
    return new ReparentingTaskProvider();
  }
}
