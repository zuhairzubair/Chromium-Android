package org.chromium.chrome.browser.browserservices;

import androidx.browser.trusted.TrustedWebActivityServiceConnectionPool;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;
import org.chromium.chrome.browser.browserservices.permissiondelegation.TrustedWebActivityPermissionManager;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class TrustedWebActivityClient_Factory implements Factory<TrustedWebActivityClient> {
  private final Provider<TrustedWebActivityServiceConnectionPool> connectionProvider;

  private final Provider<TrustedWebActivityPermissionManager> delegatesManagerProvider;

  private final Provider<TrustedWebActivityUmaRecorder> recorderProvider;

  public TrustedWebActivityClient_Factory(
      Provider<TrustedWebActivityServiceConnectionPool> connectionProvider,
      Provider<TrustedWebActivityPermissionManager> delegatesManagerProvider,
      Provider<TrustedWebActivityUmaRecorder> recorderProvider) {
    this.connectionProvider = connectionProvider;
    this.delegatesManagerProvider = delegatesManagerProvider;
    this.recorderProvider = recorderProvider;
  }

  @Override
  public TrustedWebActivityClient get() {
    return provideInstance(connectionProvider, delegatesManagerProvider, recorderProvider);
  }

  public static TrustedWebActivityClient provideInstance(
      Provider<TrustedWebActivityServiceConnectionPool> connectionProvider,
      Provider<TrustedWebActivityPermissionManager> delegatesManagerProvider,
      Provider<TrustedWebActivityUmaRecorder> recorderProvider) {
    return new TrustedWebActivityClient(
        connectionProvider.get(), delegatesManagerProvider.get(), recorderProvider.get());
  }

  public static TrustedWebActivityClient_Factory create(
      Provider<TrustedWebActivityServiceConnectionPool> connectionProvider,
      Provider<TrustedWebActivityPermissionManager> delegatesManagerProvider,
      Provider<TrustedWebActivityUmaRecorder> recorderProvider) {
    return new TrustedWebActivityClient_Factory(
        connectionProvider, delegatesManagerProvider, recorderProvider);
  }

  public static TrustedWebActivityClient newTrustedWebActivityClient(
      TrustedWebActivityServiceConnectionPool connection,
      TrustedWebActivityPermissionManager delegatesManager,
      TrustedWebActivityUmaRecorder recorder) {
    return new TrustedWebActivityClient(connection, delegatesManager, recorder);
  }
}
