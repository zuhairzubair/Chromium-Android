package org.chromium.chrome.browser.dependency_injection;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import org.chromium.chrome.browser.browserservices.permissiondelegation.TrustedWebActivityPermissionStore;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ChromeAppModule_ProvidesTwaPermissionStoreFactory
    implements Factory<TrustedWebActivityPermissionStore> {
  private final ChromeAppModule module;

  public ChromeAppModule_ProvidesTwaPermissionStoreFactory(ChromeAppModule module) {
    this.module = module;
  }

  @Override
  public TrustedWebActivityPermissionStore get() {
    return provideInstance(module);
  }

  public static TrustedWebActivityPermissionStore provideInstance(ChromeAppModule module) {
    return proxyProvidesTwaPermissionStore(module);
  }

  public static ChromeAppModule_ProvidesTwaPermissionStoreFactory create(ChromeAppModule module) {
    return new ChromeAppModule_ProvidesTwaPermissionStoreFactory(module);
  }

  public static TrustedWebActivityPermissionStore proxyProvidesTwaPermissionStore(
      ChromeAppModule instance) {
    return Preconditions.checkNotNull(
        instance.providesTwaPermissionStore(),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
