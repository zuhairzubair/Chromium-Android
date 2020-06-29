package org.chromium.chrome.browser.webapps;

import android.app.Activity;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;
import org.chromium.chrome.browser.browserservices.trustedwebactivityui.TwaFinishHandler;
import org.chromium.chrome.browser.customtabs.content.TabObserverRegistrar;
import org.chromium.chrome.browser.lifecycle.ActivityLifecycleDispatcher;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class SplashController_Factory implements Factory<SplashController> {
  private final Provider<Activity> activityProvider;

  private final Provider<ActivityLifecycleDispatcher> lifecycleDispatcherProvider;

  private final Provider<TabObserverRegistrar> tabObserverRegistrarProvider;

  private final Provider<TwaFinishHandler> finishHandlerProvider;

  public SplashController_Factory(
      Provider<Activity> activityProvider,
      Provider<ActivityLifecycleDispatcher> lifecycleDispatcherProvider,
      Provider<TabObserverRegistrar> tabObserverRegistrarProvider,
      Provider<TwaFinishHandler> finishHandlerProvider) {
    this.activityProvider = activityProvider;
    this.lifecycleDispatcherProvider = lifecycleDispatcherProvider;
    this.tabObserverRegistrarProvider = tabObserverRegistrarProvider;
    this.finishHandlerProvider = finishHandlerProvider;
  }

  @Override
  public SplashController get() {
    return provideInstance(
        activityProvider,
        lifecycleDispatcherProvider,
        tabObserverRegistrarProvider,
        finishHandlerProvider);
  }

  public static SplashController provideInstance(
      Provider<Activity> activityProvider,
      Provider<ActivityLifecycleDispatcher> lifecycleDispatcherProvider,
      Provider<TabObserverRegistrar> tabObserverRegistrarProvider,
      Provider<TwaFinishHandler> finishHandlerProvider) {
    return new SplashController(
        activityProvider.get(),
        lifecycleDispatcherProvider.get(),
        tabObserverRegistrarProvider.get(),
        finishHandlerProvider.get());
  }

  public static SplashController_Factory create(
      Provider<Activity> activityProvider,
      Provider<ActivityLifecycleDispatcher> lifecycleDispatcherProvider,
      Provider<TabObserverRegistrar> tabObserverRegistrarProvider,
      Provider<TwaFinishHandler> finishHandlerProvider) {
    return new SplashController_Factory(
        activityProvider,
        lifecycleDispatcherProvider,
        tabObserverRegistrarProvider,
        finishHandlerProvider);
  }

  public static SplashController newSplashController(
      Activity activity,
      ActivityLifecycleDispatcher lifecycleDispatcher,
      TabObserverRegistrar tabObserverRegistrar,
      TwaFinishHandler finishHandler) {
    return new SplashController(activity, lifecycleDispatcher, tabObserverRegistrar, finishHandler);
  }
}
