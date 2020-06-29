package org.chromium.chrome.browser.dependency_injection;

import android.content.Context;
import androidx.browser.trusted.TrustedWebActivityServiceConnectionPool;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ChromeAppModule_ProvidesTwaServiceConnectionManagerFactory
    implements Factory<TrustedWebActivityServiceConnectionPool> {
  private final ChromeAppModule module;

  private final Provider<Context> contextProvider;

  public ChromeAppModule_ProvidesTwaServiceConnectionManagerFactory(
      ChromeAppModule module, Provider<Context> contextProvider) {
    this.module = module;
    this.contextProvider = contextProvider;
  }

  @Override
  public TrustedWebActivityServiceConnectionPool get() {
    return provideInstance(module, contextProvider);
  }

  public static TrustedWebActivityServiceConnectionPool provideInstance(
      ChromeAppModule module, Provider<Context> contextProvider) {
    return proxyProvidesTwaServiceConnectionManager(module, contextProvider.get());
  }

  public static ChromeAppModule_ProvidesTwaServiceConnectionManagerFactory create(
      ChromeAppModule module, Provider<Context> contextProvider) {
    return new ChromeAppModule_ProvidesTwaServiceConnectionManagerFactory(module, contextProvider);
  }

  public static TrustedWebActivityServiceConnectionPool proxyProvidesTwaServiceConnectionManager(
      ChromeAppModule instance, Context context) {
    return Preconditions.checkNotNull(
        instance.providesTwaServiceConnectionManager(context),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
