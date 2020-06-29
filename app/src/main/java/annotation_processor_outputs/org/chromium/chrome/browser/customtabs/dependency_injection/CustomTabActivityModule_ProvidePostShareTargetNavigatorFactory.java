package org.chromium.chrome.browser.customtabs.dependency_injection;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import org.chromium.chrome.browser.webapps.WebApkPostShareTargetNavigator;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class CustomTabActivityModule_ProvidePostShareTargetNavigatorFactory
    implements Factory<WebApkPostShareTargetNavigator> {
  private final CustomTabActivityModule module;

  public CustomTabActivityModule_ProvidePostShareTargetNavigatorFactory(
      CustomTabActivityModule module) {
    this.module = module;
  }

  @Override
  public WebApkPostShareTargetNavigator get() {
    return provideInstance(module);
  }

  public static WebApkPostShareTargetNavigator provideInstance(CustomTabActivityModule module) {
    return proxyProvidePostShareTargetNavigator(module);
  }

  public static CustomTabActivityModule_ProvidePostShareTargetNavigatorFactory create(
      CustomTabActivityModule module) {
    return new CustomTabActivityModule_ProvidePostShareTargetNavigatorFactory(module);
  }

  public static WebApkPostShareTargetNavigator proxyProvidePostShareTargetNavigator(
      CustomTabActivityModule instance) {
    return Preconditions.checkNotNull(
        instance.providePostShareTargetNavigator(),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
