package org.chromium.chrome.browser.customtabs;

import dagger.internal.Factory;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ExternalIntentsPolicyProvider_Factory
    implements Factory<ExternalIntentsPolicyProvider> {
  private static final ExternalIntentsPolicyProvider_Factory INSTANCE =
      new ExternalIntentsPolicyProvider_Factory();

  @Override
  public ExternalIntentsPolicyProvider get() {
    return provideInstance();
  }

  public static ExternalIntentsPolicyProvider provideInstance() {
    return new ExternalIntentsPolicyProvider();
  }

  public static ExternalIntentsPolicyProvider_Factory create() {
    return INSTANCE;
  }

  public static ExternalIntentsPolicyProvider newExternalIntentsPolicyProvider() {
    return new ExternalIntentsPolicyProvider();
  }
}
