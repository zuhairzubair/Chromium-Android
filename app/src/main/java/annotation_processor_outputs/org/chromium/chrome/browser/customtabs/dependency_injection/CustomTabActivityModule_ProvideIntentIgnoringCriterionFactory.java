package org.chromium.chrome.browser.customtabs.dependency_injection;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import org.chromium.chrome.browser.customtabs.content.CustomTabIntentHandler;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class CustomTabActivityModule_ProvideIntentIgnoringCriterionFactory
    implements Factory<CustomTabIntentHandler.IntentIgnoringCriterion> {
  private final CustomTabActivityModule module;

  public CustomTabActivityModule_ProvideIntentIgnoringCriterionFactory(
      CustomTabActivityModule module) {
    this.module = module;
  }

  @Override
  public CustomTabIntentHandler.IntentIgnoringCriterion get() {
    return provideInstance(module);
  }

  public static CustomTabIntentHandler.IntentIgnoringCriterion provideInstance(
      CustomTabActivityModule module) {
    return proxyProvideIntentIgnoringCriterion(module);
  }

  public static CustomTabActivityModule_ProvideIntentIgnoringCriterionFactory create(
      CustomTabActivityModule module) {
    return new CustomTabActivityModule_ProvideIntentIgnoringCriterionFactory(module);
  }

  public static CustomTabIntentHandler.IntentIgnoringCriterion proxyProvideIntentIgnoringCriterion(
      CustomTabActivityModule instance) {
    return Preconditions.checkNotNull(
        instance.provideIntentIgnoringCriterion(),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
