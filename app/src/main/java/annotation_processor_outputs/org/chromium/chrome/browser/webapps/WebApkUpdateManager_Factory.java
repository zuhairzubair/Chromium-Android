package org.chromium.chrome.browser.webapps;

import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;
import org.chromium.chrome.browser.ChromeActivity;
import org.chromium.chrome.browser.lifecycle.ActivityLifecycleDispatcher;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class WebApkUpdateManager_Factory implements Factory<WebApkUpdateManager> {
  private final Provider<ChromeActivity<?>> activityProvider;

  private final Provider<ActivityLifecycleDispatcher> lifecycleDispatcherProvider;

  public WebApkUpdateManager_Factory(
      Provider<ChromeActivity<?>> activityProvider,
      Provider<ActivityLifecycleDispatcher> lifecycleDispatcherProvider) {
    this.activityProvider = activityProvider;
    this.lifecycleDispatcherProvider = lifecycleDispatcherProvider;
  }

  @Override
  public WebApkUpdateManager get() {
    return provideInstance(activityProvider, lifecycleDispatcherProvider);
  }

  public static WebApkUpdateManager provideInstance(
      Provider<ChromeActivity<?>> activityProvider,
      Provider<ActivityLifecycleDispatcher> lifecycleDispatcherProvider) {
    return new WebApkUpdateManager(activityProvider.get(), lifecycleDispatcherProvider.get());
  }

  public static WebApkUpdateManager_Factory create(
      Provider<ChromeActivity<?>> activityProvider,
      Provider<ActivityLifecycleDispatcher> lifecycleDispatcherProvider) {
    return new WebApkUpdateManager_Factory(activityProvider, lifecycleDispatcherProvider);
  }

  public static WebApkUpdateManager newWebApkUpdateManager(
      ChromeActivity<?> activity, ActivityLifecycleDispatcher lifecycleDispatcher) {
    return new WebApkUpdateManager(activity, lifecycleDispatcher);
  }
}
