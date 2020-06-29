package org.chromium.chrome.browser.browserservices;

import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;
import org.chromium.chrome.browser.init.ChromeBrowserInitializer;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class TrustedWebActivityUmaRecorder_Factory
    implements Factory<TrustedWebActivityUmaRecorder> {
  private final Provider<ChromeBrowserInitializer> browserInitializerProvider;

  public TrustedWebActivityUmaRecorder_Factory(
      Provider<ChromeBrowserInitializer> browserInitializerProvider) {
    this.browserInitializerProvider = browserInitializerProvider;
  }

  @Override
  public TrustedWebActivityUmaRecorder get() {
    return provideInstance(browserInitializerProvider);
  }

  public static TrustedWebActivityUmaRecorder provideInstance(
      Provider<ChromeBrowserInitializer> browserInitializerProvider) {
    return new TrustedWebActivityUmaRecorder(browserInitializerProvider.get());
  }

  public static TrustedWebActivityUmaRecorder_Factory create(
      Provider<ChromeBrowserInitializer> browserInitializerProvider) {
    return new TrustedWebActivityUmaRecorder_Factory(browserInitializerProvider);
  }

  public static TrustedWebActivityUmaRecorder newTrustedWebActivityUmaRecorder(
      ChromeBrowserInitializer browserInitializer) {
    return new TrustedWebActivityUmaRecorder(browserInitializer);
  }
}
