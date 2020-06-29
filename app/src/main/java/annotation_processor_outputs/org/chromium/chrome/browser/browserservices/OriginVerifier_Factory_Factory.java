package org.chromium.chrome.browser.browserservices;

import dagger.internal.Factory;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class OriginVerifier_Factory_Factory implements Factory<OriginVerifier.Factory> {
  private static final OriginVerifier_Factory_Factory INSTANCE =
      new OriginVerifier_Factory_Factory();

  @Override
  public OriginVerifier.Factory get() {
    return provideInstance();
  }

  public static OriginVerifier.Factory provideInstance() {
    return new OriginVerifier.Factory();
  }

  public static OriginVerifier_Factory_Factory create() {
    return INSTANCE;
  }

  public static OriginVerifier.Factory newFactory() {
    return new OriginVerifier.Factory();
  }
}
