package org.chromium.chrome.browser.customtabs.dependency_injection;

import dagger.Lazy;
import dagger.internal.DoubleCheck;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;
import org.chromium.chrome.browser.browserservices.trustedwebactivityui.controller.TwaVerifier;
import org.chromium.chrome.browser.browserservices.trustedwebactivityui.controller.Verifier;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class CustomTabActivityModule_ProvideVerifierDelegateFactory
    implements Factory<Verifier> {
  private final CustomTabActivityModule module;

  private final Provider<TwaVerifier> twaVerifierDelegateProvider;

  public CustomTabActivityModule_ProvideVerifierDelegateFactory(
      CustomTabActivityModule module, Provider<TwaVerifier> twaVerifierDelegateProvider) {
    this.module = module;
    this.twaVerifierDelegateProvider = twaVerifierDelegateProvider;
  }

  @Override
  public Verifier get() {
    return provideInstance(module, twaVerifierDelegateProvider);
  }

  public static Verifier provideInstance(
      CustomTabActivityModule module, Provider<TwaVerifier> twaVerifierDelegateProvider) {
    return proxyProvideVerifierDelegate(module, DoubleCheck.lazy(twaVerifierDelegateProvider));
  }

  public static CustomTabActivityModule_ProvideVerifierDelegateFactory create(
      CustomTabActivityModule module, Provider<TwaVerifier> twaVerifierDelegateProvider) {
    return new CustomTabActivityModule_ProvideVerifierDelegateFactory(
        module, twaVerifierDelegateProvider);
  }

  public static Verifier proxyProvideVerifierDelegate(
      CustomTabActivityModule instance, Lazy<TwaVerifier> twaVerifierDelegate) {
    return Preconditions.checkNotNull(
        instance.provideVerifierDelegate(twaVerifierDelegate),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
