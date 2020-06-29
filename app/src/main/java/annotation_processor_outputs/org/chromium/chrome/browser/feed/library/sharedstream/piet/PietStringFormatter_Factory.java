package org.chromium.chrome.browser.feed.library.sharedstream.piet;

import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;
import org.chromium.chrome.browser.feed.library.common.time.Clock;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class PietStringFormatter_Factory implements Factory<PietStringFormatter> {
  private final Provider<Clock> clockProvider;

  public PietStringFormatter_Factory(Provider<Clock> clockProvider) {
    this.clockProvider = clockProvider;
  }

  @Override
  public PietStringFormatter get() {
    return provideInstance(clockProvider);
  }

  public static PietStringFormatter provideInstance(Provider<Clock> clockProvider) {
    return new PietStringFormatter(clockProvider.get());
  }

  public static PietStringFormatter_Factory create(Provider<Clock> clockProvider) {
    return new PietStringFormatter_Factory(clockProvider);
  }

  public static PietStringFormatter newPietStringFormatter(Clock clock) {
    return new PietStringFormatter(clock);
  }
}
