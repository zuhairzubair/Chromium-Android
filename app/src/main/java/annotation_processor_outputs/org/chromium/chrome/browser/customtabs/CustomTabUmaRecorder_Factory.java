package org.chromium.chrome.browser.customtabs;

import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;
import org.chromium.chrome.browser.browserservices.BrowserServicesIntentDataProvider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class CustomTabUmaRecorder_Factory implements Factory<CustomTabUmaRecorder> {
  private final Provider<BrowserServicesIntentDataProvider> intentDataProvider;

  public CustomTabUmaRecorder_Factory(
      Provider<BrowserServicesIntentDataProvider> intentDataProvider) {
    this.intentDataProvider = intentDataProvider;
  }

  @Override
  public CustomTabUmaRecorder get() {
    return provideInstance(intentDataProvider);
  }

  public static CustomTabUmaRecorder provideInstance(
      Provider<BrowserServicesIntentDataProvider> intentDataProvider) {
    return new CustomTabUmaRecorder(intentDataProvider.get());
  }

  public static CustomTabUmaRecorder_Factory create(
      Provider<BrowserServicesIntentDataProvider> intentDataProvider) {
    return new CustomTabUmaRecorder_Factory(intentDataProvider);
  }

  public static CustomTabUmaRecorder newCustomTabUmaRecorder(
      BrowserServicesIntentDataProvider intentDataProvider) {
    return new CustomTabUmaRecorder(intentDataProvider);
  }
}
