package org.chromium.chrome.browser.customtabs;

import android.content.Context;
import dagger.Lazy;
import dagger.internal.DoubleCheck;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;
import org.chromium.chrome.browser.browserservices.trustedwebactivityui.splashscreen.SplashImageHolder;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class CustomTabsClientFileProcessor_Factory
    implements Factory<CustomTabsClientFileProcessor> {
  private final Provider<Context> contextProvider;

  private final Provider<SplashImageHolder> twaSplashImageHolderProvider;

  public CustomTabsClientFileProcessor_Factory(
      Provider<Context> contextProvider, Provider<SplashImageHolder> twaSplashImageHolderProvider) {
    this.contextProvider = contextProvider;
    this.twaSplashImageHolderProvider = twaSplashImageHolderProvider;
  }

  @Override
  public CustomTabsClientFileProcessor get() {
    return provideInstance(contextProvider, twaSplashImageHolderProvider);
  }

  public static CustomTabsClientFileProcessor provideInstance(
      Provider<Context> contextProvider, Provider<SplashImageHolder> twaSplashImageHolderProvider) {
    return new CustomTabsClientFileProcessor(
        contextProvider.get(), DoubleCheck.lazy(twaSplashImageHolderProvider));
  }

  public static CustomTabsClientFileProcessor_Factory create(
      Provider<Context> contextProvider, Provider<SplashImageHolder> twaSplashImageHolderProvider) {
    return new CustomTabsClientFileProcessor_Factory(contextProvider, twaSplashImageHolderProvider);
  }

  public static CustomTabsClientFileProcessor newCustomTabsClientFileProcessor(
      Context context, Lazy<SplashImageHolder> twaSplashImageHolder) {
    return new CustomTabsClientFileProcessor(context, twaSplashImageHolder);
  }
}
