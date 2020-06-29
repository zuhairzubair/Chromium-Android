package org.chromium.chrome.browser.customtabs;

import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;
import org.chromium.chrome.browser.ChromeActivity;
import org.chromium.chrome.browser.browserservices.BrowserServicesIntentDataProvider;
import org.chromium.chrome.browser.fullscreen.ChromeFullscreenManager;
import org.chromium.chrome.browser.night_mode.SystemNightModeMonitor;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class CustomTabBottomBarDelegate_Factory
    implements Factory<CustomTabBottomBarDelegate> {
  private final Provider<ChromeActivity<?>> activityProvider;

  private final Provider<BrowserServicesIntentDataProvider> dataProvider;

  private final Provider<ChromeFullscreenManager> fullscreenManagerProvider;

  private final Provider<CustomTabNightModeStateController> nightModeStateControllerProvider;

  private final Provider<SystemNightModeMonitor> systemNightModeMonitorProvider;

  private final Provider<CustomTabCompositorContentInitializer>
      compositorContentInitializerProvider;

  public CustomTabBottomBarDelegate_Factory(
      Provider<ChromeActivity<?>> activityProvider,
      Provider<BrowserServicesIntentDataProvider> dataProvider,
      Provider<ChromeFullscreenManager> fullscreenManagerProvider,
      Provider<CustomTabNightModeStateController> nightModeStateControllerProvider,
      Provider<SystemNightModeMonitor> systemNightModeMonitorProvider,
      Provider<CustomTabCompositorContentInitializer> compositorContentInitializerProvider) {
    this.activityProvider = activityProvider;
    this.dataProvider = dataProvider;
    this.fullscreenManagerProvider = fullscreenManagerProvider;
    this.nightModeStateControllerProvider = nightModeStateControllerProvider;
    this.systemNightModeMonitorProvider = systemNightModeMonitorProvider;
    this.compositorContentInitializerProvider = compositorContentInitializerProvider;
  }

  @Override
  public CustomTabBottomBarDelegate get() {
    return provideInstance(
        activityProvider,
        dataProvider,
        fullscreenManagerProvider,
        nightModeStateControllerProvider,
        systemNightModeMonitorProvider,
        compositorContentInitializerProvider);
  }

  public static CustomTabBottomBarDelegate provideInstance(
      Provider<ChromeActivity<?>> activityProvider,
      Provider<BrowserServicesIntentDataProvider> dataProvider,
      Provider<ChromeFullscreenManager> fullscreenManagerProvider,
      Provider<CustomTabNightModeStateController> nightModeStateControllerProvider,
      Provider<SystemNightModeMonitor> systemNightModeMonitorProvider,
      Provider<CustomTabCompositorContentInitializer> compositorContentInitializerProvider) {
    return new CustomTabBottomBarDelegate(
        activityProvider.get(),
        dataProvider.get(),
        fullscreenManagerProvider.get(),
        nightModeStateControllerProvider.get(),
        systemNightModeMonitorProvider.get(),
        compositorContentInitializerProvider.get());
  }

  public static CustomTabBottomBarDelegate_Factory create(
      Provider<ChromeActivity<?>> activityProvider,
      Provider<BrowserServicesIntentDataProvider> dataProvider,
      Provider<ChromeFullscreenManager> fullscreenManagerProvider,
      Provider<CustomTabNightModeStateController> nightModeStateControllerProvider,
      Provider<SystemNightModeMonitor> systemNightModeMonitorProvider,
      Provider<CustomTabCompositorContentInitializer> compositorContentInitializerProvider) {
    return new CustomTabBottomBarDelegate_Factory(
        activityProvider,
        dataProvider,
        fullscreenManagerProvider,
        nightModeStateControllerProvider,
        systemNightModeMonitorProvider,
        compositorContentInitializerProvider);
  }

  public static CustomTabBottomBarDelegate newCustomTabBottomBarDelegate(
      ChromeActivity<?> activity,
      BrowserServicesIntentDataProvider dataProvider,
      ChromeFullscreenManager fullscreenManager,
      CustomTabNightModeStateController nightModeStateController,
      SystemNightModeMonitor systemNightModeMonitor,
      CustomTabCompositorContentInitializer compositorContentInitializer) {
    return new CustomTabBottomBarDelegate(
        activity,
        dataProvider,
        fullscreenManager,
        nightModeStateController,
        systemNightModeMonitor,
        compositorContentInitializer);
  }
}
