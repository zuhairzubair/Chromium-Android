package org.chromium.chrome.browser.browserservices.permissiondelegation;

import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;
import org.chromium.chrome.browser.notifications.channels.SiteChannelsManager;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class NotificationChannelPreserver_Factory
    implements Factory<NotificationChannelPreserver> {
  private final Provider<TrustedWebActivityPermissionStore> storeProvider;

  private final Provider<SiteChannelsManager> siteChannelsManagerProvider;

  public NotificationChannelPreserver_Factory(
      Provider<TrustedWebActivityPermissionStore> storeProvider,
      Provider<SiteChannelsManager> siteChannelsManagerProvider) {
    this.storeProvider = storeProvider;
    this.siteChannelsManagerProvider = siteChannelsManagerProvider;
  }

  @Override
  public NotificationChannelPreserver get() {
    return provideInstance(storeProvider, siteChannelsManagerProvider);
  }

  public static NotificationChannelPreserver provideInstance(
      Provider<TrustedWebActivityPermissionStore> storeProvider,
      Provider<SiteChannelsManager> siteChannelsManagerProvider) {
    return new NotificationChannelPreserver(storeProvider.get(), siteChannelsManagerProvider.get());
  }

  public static NotificationChannelPreserver_Factory create(
      Provider<TrustedWebActivityPermissionStore> storeProvider,
      Provider<SiteChannelsManager> siteChannelsManagerProvider) {
    return new NotificationChannelPreserver_Factory(storeProvider, siteChannelsManagerProvider);
  }

  public static NotificationChannelPreserver newNotificationChannelPreserver(
      TrustedWebActivityPermissionStore store, SiteChannelsManager siteChannelsManager) {
    return new NotificationChannelPreserver(store, siteChannelsManager);
  }
}
