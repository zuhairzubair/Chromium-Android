package org.chromium.chrome.browser.browserservices;

import dagger.internal.Factory;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ClientAppBroadcastReceiver_Factory
    implements Factory<ClientAppBroadcastReceiver> {
  private static final ClientAppBroadcastReceiver_Factory INSTANCE =
      new ClientAppBroadcastReceiver_Factory();

  @Override
  public ClientAppBroadcastReceiver get() {
    return provideInstance();
  }

  public static ClientAppBroadcastReceiver provideInstance() {
    return new ClientAppBroadcastReceiver();
  }

  public static ClientAppBroadcastReceiver_Factory create() {
    return INSTANCE;
  }

  public static ClientAppBroadcastReceiver newClientAppBroadcastReceiver() {
    return new ClientAppBroadcastReceiver();
  }
}
