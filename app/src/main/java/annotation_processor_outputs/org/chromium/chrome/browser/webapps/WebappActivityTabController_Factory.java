package org.chromium.chrome.browser.webapps;

import dagger.Lazy;
import dagger.internal.DoubleCheck;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;
import org.chromium.chrome.browser.ActivityTabProvider;
import org.chromium.chrome.browser.ChromeActivity;
import org.chromium.chrome.browser.WebContentsFactory;
import org.chromium.chrome.browser.customtabs.CustomTabDelegateFactory;
import org.chromium.chrome.browser.customtabs.CustomTabTabPersistencePolicy;
import org.chromium.chrome.browser.customtabs.content.CustomTabActivityTabFactory;
import org.chromium.chrome.browser.customtabs.content.CustomTabActivityTabProvider;
import org.chromium.chrome.browser.customtabs.content.TabObserverRegistrar;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class WebappActivityTabController_Factory
    implements Factory<WebappActivityTabController> {
  private final Provider<ChromeActivity<?>> activityProvider;

  private final Provider<CustomTabDelegateFactory> tabDelegateFactoryProvider;

  private final Provider<ActivityTabProvider> activityTabProvider;

  private final Provider<TabObserverRegistrar> tabObserverRegistrarProvider;

  private final Provider<CustomTabTabPersistencePolicy> persistencePolicyProvider;

  private final Provider<CustomTabActivityTabFactory> tabFactoryProvider;

  private final Provider<WebContentsFactory> webContentsFactoryProvider;

  private final Provider<CustomTabActivityTabProvider> tabProvider;

  public WebappActivityTabController_Factory(
      Provider<ChromeActivity<?>> activityProvider,
      Provider<CustomTabDelegateFactory> tabDelegateFactoryProvider,
      Provider<ActivityTabProvider> activityTabProvider,
      Provider<TabObserverRegistrar> tabObserverRegistrarProvider,
      Provider<CustomTabTabPersistencePolicy> persistencePolicyProvider,
      Provider<CustomTabActivityTabFactory> tabFactoryProvider,
      Provider<WebContentsFactory> webContentsFactoryProvider,
      Provider<CustomTabActivityTabProvider> tabProvider) {
    this.activityProvider = activityProvider;
    this.tabDelegateFactoryProvider = tabDelegateFactoryProvider;
    this.activityTabProvider = activityTabProvider;
    this.tabObserverRegistrarProvider = tabObserverRegistrarProvider;
    this.persistencePolicyProvider = persistencePolicyProvider;
    this.tabFactoryProvider = tabFactoryProvider;
    this.webContentsFactoryProvider = webContentsFactoryProvider;
    this.tabProvider = tabProvider;
  }

  @Override
  public WebappActivityTabController get() {
    return provideInstance(
        activityProvider,
        tabDelegateFactoryProvider,
        activityTabProvider,
        tabObserverRegistrarProvider,
        persistencePolicyProvider,
        tabFactoryProvider,
        webContentsFactoryProvider,
        tabProvider);
  }

  public static WebappActivityTabController provideInstance(
      Provider<ChromeActivity<?>> activityProvider,
      Provider<CustomTabDelegateFactory> tabDelegateFactoryProvider,
      Provider<ActivityTabProvider> activityTabProvider,
      Provider<TabObserverRegistrar> tabObserverRegistrarProvider,
      Provider<CustomTabTabPersistencePolicy> persistencePolicyProvider,
      Provider<CustomTabActivityTabFactory> tabFactoryProvider,
      Provider<WebContentsFactory> webContentsFactoryProvider,
      Provider<CustomTabActivityTabProvider> tabProvider) {
    return new WebappActivityTabController(
        activityProvider.get(),
        DoubleCheck.lazy(tabDelegateFactoryProvider),
        activityTabProvider.get(),
        tabObserverRegistrarProvider.get(),
        persistencePolicyProvider.get(),
        tabFactoryProvider.get(),
        webContentsFactoryProvider.get(),
        tabProvider.get());
  }

  public static WebappActivityTabController_Factory create(
      Provider<ChromeActivity<?>> activityProvider,
      Provider<CustomTabDelegateFactory> tabDelegateFactoryProvider,
      Provider<ActivityTabProvider> activityTabProvider,
      Provider<TabObserverRegistrar> tabObserverRegistrarProvider,
      Provider<CustomTabTabPersistencePolicy> persistencePolicyProvider,
      Provider<CustomTabActivityTabFactory> tabFactoryProvider,
      Provider<WebContentsFactory> webContentsFactoryProvider,
      Provider<CustomTabActivityTabProvider> tabProvider) {
    return new WebappActivityTabController_Factory(
        activityProvider,
        tabDelegateFactoryProvider,
        activityTabProvider,
        tabObserverRegistrarProvider,
        persistencePolicyProvider,
        tabFactoryProvider,
        webContentsFactoryProvider,
        tabProvider);
  }

  public static WebappActivityTabController newWebappActivityTabController(
      ChromeActivity<?> activity,
      Lazy<CustomTabDelegateFactory> tabDelegateFactory,
      ActivityTabProvider activityTabProvider,
      TabObserverRegistrar tabObserverRegistrar,
      CustomTabTabPersistencePolicy persistencePolicy,
      CustomTabActivityTabFactory tabFactory,
      WebContentsFactory webContentsFactory,
      CustomTabActivityTabProvider tabProvider) {
    return new WebappActivityTabController(
        activity,
        tabDelegateFactory,
        activityTabProvider,
        tabObserverRegistrar,
        persistencePolicy,
        tabFactory,
        webContentsFactory,
        tabProvider);
  }
}
