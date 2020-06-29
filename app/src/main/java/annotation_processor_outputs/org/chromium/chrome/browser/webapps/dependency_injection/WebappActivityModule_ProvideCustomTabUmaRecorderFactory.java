package org.chromium.chrome.browser.webapps.dependency_injection;

import androidx.annotation.Nullable;
import dagger.internal.Factory;
import javax.annotation.Generated;
import org.chromium.chrome.browser.customtabs.CustomTabUmaRecorder;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class WebappActivityModule_ProvideCustomTabUmaRecorderFactory
    implements Factory<CustomTabUmaRecorder> {
  private final WebappActivityModule module;

  public WebappActivityModule_ProvideCustomTabUmaRecorderFactory(WebappActivityModule module) {
    this.module = module;
  }

  @Override
  @Nullable
  public CustomTabUmaRecorder get() {
    return provideInstance(module);
  }

  @Nullable
  public static CustomTabUmaRecorder provideInstance(WebappActivityModule module) {
    return proxyProvideCustomTabUmaRecorder(module);
  }

  public static WebappActivityModule_ProvideCustomTabUmaRecorderFactory create(
      WebappActivityModule module) {
    return new WebappActivityModule_ProvideCustomTabUmaRecorderFactory(module);
  }

  @Nullable
  public static CustomTabUmaRecorder proxyProvideCustomTabUmaRecorder(
      WebappActivityModule instance) {
    return instance.provideCustomTabUmaRecorder();
  }
}
