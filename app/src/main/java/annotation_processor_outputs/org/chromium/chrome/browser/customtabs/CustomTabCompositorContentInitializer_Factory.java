package org.chromium.chrome.browser.customtabs;

import dagger.Lazy;
import dagger.internal.DoubleCheck;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;
import org.chromium.chrome.browser.ChromeActivity;
import org.chromium.chrome.browser.compositor.CompositorViewHolder;
import org.chromium.chrome.browser.lifecycle.ActivityLifecycleDispatcher;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class CustomTabCompositorContentInitializer_Factory
    implements Factory<CustomTabCompositorContentInitializer> {
  private final Provider<ActivityLifecycleDispatcher> lifecycleDispatcherProvider;

  private final Provider<ChromeActivity<?>> activityProvider;

  private final Provider<CompositorViewHolder> compositorViewHolderProvider;

  public CustomTabCompositorContentInitializer_Factory(
      Provider<ActivityLifecycleDispatcher> lifecycleDispatcherProvider,
      Provider<ChromeActivity<?>> activityProvider,
      Provider<CompositorViewHolder> compositorViewHolderProvider) {
    this.lifecycleDispatcherProvider = lifecycleDispatcherProvider;
    this.activityProvider = activityProvider;
    this.compositorViewHolderProvider = compositorViewHolderProvider;
  }

  @Override
  public CustomTabCompositorContentInitializer get() {
    return provideInstance(
        lifecycleDispatcherProvider, activityProvider, compositorViewHolderProvider);
  }

  public static CustomTabCompositorContentInitializer provideInstance(
      Provider<ActivityLifecycleDispatcher> lifecycleDispatcherProvider,
      Provider<ChromeActivity<?>> activityProvider,
      Provider<CompositorViewHolder> compositorViewHolderProvider) {
    return new CustomTabCompositorContentInitializer(
        lifecycleDispatcherProvider.get(),
        activityProvider.get(),
        DoubleCheck.lazy(compositorViewHolderProvider));
  }

  public static CustomTabCompositorContentInitializer_Factory create(
      Provider<ActivityLifecycleDispatcher> lifecycleDispatcherProvider,
      Provider<ChromeActivity<?>> activityProvider,
      Provider<CompositorViewHolder> compositorViewHolderProvider) {
    return new CustomTabCompositorContentInitializer_Factory(
        lifecycleDispatcherProvider, activityProvider, compositorViewHolderProvider);
  }

  public static CustomTabCompositorContentInitializer newCustomTabCompositorContentInitializer(
      ActivityLifecycleDispatcher lifecycleDispatcher,
      ChromeActivity<?> activity,
      Lazy<CompositorViewHolder> compositorViewHolder) {
    return new CustomTabCompositorContentInitializer(
        lifecycleDispatcher, activity, compositorViewHolder);
  }
}
