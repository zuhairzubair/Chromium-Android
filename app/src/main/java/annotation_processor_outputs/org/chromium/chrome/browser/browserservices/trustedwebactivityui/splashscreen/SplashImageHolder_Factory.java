package org.chromium.chrome.browser.browserservices.trustedwebactivityui.splashscreen;

import dagger.internal.Factory;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class SplashImageHolder_Factory implements Factory<SplashImageHolder> {
  private static final SplashImageHolder_Factory INSTANCE = new SplashImageHolder_Factory();

  @Override
  public SplashImageHolder get() {
    return provideInstance();
  }

  public static SplashImageHolder provideInstance() {
    return new SplashImageHolder();
  }

  public static SplashImageHolder_Factory create() {
    return INSTANCE;
  }

  public static SplashImageHolder newSplashImageHolder() {
    return new SplashImageHolder();
  }
}
