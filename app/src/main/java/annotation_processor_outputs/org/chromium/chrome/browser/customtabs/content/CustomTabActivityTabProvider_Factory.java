package org.chromium.chrome.browser.customtabs.content;

import dagger.internal.Factory;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class CustomTabActivityTabProvider_Factory
    implements Factory<CustomTabActivityTabProvider> {
  private static final CustomTabActivityTabProvider_Factory INSTANCE =
      new CustomTabActivityTabProvider_Factory();

  @Override
  public CustomTabActivityTabProvider get() {
    return provideInstance();
  }

  public static CustomTabActivityTabProvider provideInstance() {
    return new CustomTabActivityTabProvider();
  }

  public static CustomTabActivityTabProvider_Factory create() {
    return INSTANCE;
  }

  public static CustomTabActivityTabProvider newCustomTabActivityTabProvider() {
    return new CustomTabActivityTabProvider();
  }
}
