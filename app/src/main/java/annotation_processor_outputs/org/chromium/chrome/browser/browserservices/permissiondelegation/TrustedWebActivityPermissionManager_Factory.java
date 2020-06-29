package org.chromium.chrome.browser.browserservices.permissiondelegation;

import android.content.Context;
import dagger.Lazy;
import dagger.internal.DoubleCheck;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class TrustedWebActivityPermissionManager_Factory
    implements Factory<TrustedWebActivityPermissionManager> {
  private final Provider<Context> contextProvider;

  private final Provider<TrustedWebActivityPermissionStore> storeProvider;

  private final Provider<NotificationChannelPreserver> preserverProvider;

  public TrustedWebActivityPermissionManager_Factory(
      Provider<Context> contextProvider,
      Provider<TrustedWebActivityPermissionStore> storeProvider,
      Provider<NotificationChannelPreserver> preserverProvider) {
    this.contextProvider = contextProvider;
    this.storeProvider = storeProvider;
    this.preserverProvider = preserverProvider;
  }

  @Override
  public TrustedWebActivityPermissionManager get() {
    return provideInstance(contextProvider, storeProvider, preserverProvider);
  }

  public static TrustedWebActivityPermissionManager provideInstance(
      Provider<Context> contextProvider,
      Provider<TrustedWebActivityPermissionStore> storeProvider,
      Provider<NotificationChannelPreserver> preserverProvider) {
    return new TrustedWebActivityPermissionManager(
        contextProvider.get(), storeProvider.get(), DoubleCheck.lazy(preserverProvider));
  }

  public static TrustedWebActivityPermissionManager_Factory create(
      Provider<Context> contextProvider,
      Provider<TrustedWebActivityPermissionStore> storeProvider,
      Provider<NotificationChannelPreserver> preserverProvider) {
    return new TrustedWebActivityPermissionManager_Factory(
        contextProvider, storeProvider, preserverProvider);
  }

  public static TrustedWebActivityPermissionManager newTrustedWebActivityPermissionManager(
      Context context,
      TrustedWebActivityPermissionStore store,
      Lazy<NotificationChannelPreserver> preserver) {
    return new TrustedWebActivityPermissionManager(context, store, preserver);
  }
}
