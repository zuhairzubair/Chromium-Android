package org.chromium.chrome.browser.dependency_injection;

import androidx.browser.trusted.TrustedWebActivityServiceConnectionPool;
import dagger.internal.DoubleCheck;
import dagger.internal.MemoizedSentinel;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;
import org.chromium.chrome.browser.AppHooksModule;
import org.chromium.chrome.browser.AppHooksModule_ProvideCustomTabsConnectionFactory;
import org.chromium.chrome.browser.AppHooksModule_ProvideExternalAuthUtilsFactory;
import org.chromium.chrome.browser.AppHooksModule_ProvideMultiWindowUtilsFactory;
import org.chromium.chrome.browser.WebContentsFactory;
import org.chromium.chrome.browser.browserservices.BrowserServicesActivityTabController;
import org.chromium.chrome.browser.browserservices.BrowserServicesStore;
import org.chromium.chrome.browser.browserservices.ClearDataDialogResultRecorder;
import org.chromium.chrome.browser.browserservices.OriginVerifier;
import org.chromium.chrome.browser.browserservices.SessionDataHolder;
import org.chromium.chrome.browser.browserservices.TrustedWebActivityClient;
import org.chromium.chrome.browser.browserservices.TrustedWebActivityUmaRecorder;
import org.chromium.chrome.browser.browserservices.permissiondelegation.NotificationChannelPreserver;
import org.chromium.chrome.browser.browserservices.permissiondelegation.NotificationChannelPreserver_Factory;
import org.chromium.chrome.browser.browserservices.permissiondelegation.NotificationPermissionUpdater;
import org.chromium.chrome.browser.browserservices.permissiondelegation.TrustedWebActivityPermissionManager;
import org.chromium.chrome.browser.browserservices.permissiondelegation.TrustedWebActivityPermissionStore;
import org.chromium.chrome.browser.browserservices.trustedwebactivityui.TrustedWebActivityCoordinator;
import org.chromium.chrome.browser.browserservices.trustedwebactivityui.TrustedWebActivityModel;
import org.chromium.chrome.browser.browserservices.trustedwebactivityui.TwaFinishHandler;
import org.chromium.chrome.browser.browserservices.trustedwebactivityui.TwaIntentHandlingStrategy;
import org.chromium.chrome.browser.browserservices.trustedwebactivityui.controller.ClientAppDataRecorder;
import org.chromium.chrome.browser.browserservices.trustedwebactivityui.controller.ClientAppDataRecorder_Factory;
import org.chromium.chrome.browser.browserservices.trustedwebactivityui.controller.ClientPackageNameProvider;
import org.chromium.chrome.browser.browserservices.trustedwebactivityui.controller.CurrentPageVerifier;
import org.chromium.chrome.browser.browserservices.trustedwebactivityui.controller.TrustedWebActivityBrowserControlsVisibilityManager;
import org.chromium.chrome.browser.browserservices.trustedwebactivityui.controller.TrustedWebActivityDisclosureController;
import org.chromium.chrome.browser.browserservices.trustedwebactivityui.controller.TrustedWebActivityDisclosureController_Factory;
import org.chromium.chrome.browser.browserservices.trustedwebactivityui.controller.TrustedWebActivityOpenTimeRecorder;
import org.chromium.chrome.browser.browserservices.trustedwebactivityui.controller.TrustedWebActivityOpenTimeRecorder_Factory;
import org.chromium.chrome.browser.browserservices.trustedwebactivityui.controller.TwaRegistrar;
import org.chromium.chrome.browser.browserservices.trustedwebactivityui.controller.TwaVerifier;
import org.chromium.chrome.browser.browserservices.trustedwebactivityui.controller.Verifier;
import org.chromium.chrome.browser.browserservices.trustedwebactivityui.sharing.TwaSharingController;
import org.chromium.chrome.browser.browserservices.trustedwebactivityui.splashscreen.SplashImageHolder;
import org.chromium.chrome.browser.browserservices.trustedwebactivityui.splashscreen.TwaSplashController;
import org.chromium.chrome.browser.browserservices.trustedwebactivityui.view.TrustedWebActivityDisclosureView;
import org.chromium.chrome.browser.browserservices.trustedwebactivityui.view.TrustedWebActivityDisclosureView_Factory;
import org.chromium.chrome.browser.compositor.CompositorViewHolder;
import org.chromium.chrome.browser.customtabs.CloseButtonNavigator;
import org.chromium.chrome.browser.customtabs.CloseButtonVisibilityManager;
import org.chromium.chrome.browser.customtabs.CustomTabActivityClientConnectionKeeper;
import org.chromium.chrome.browser.customtabs.CustomTabActivityLifecycleUmaTracker;
import org.chromium.chrome.browser.customtabs.CustomTabBottomBarDelegate;
import org.chromium.chrome.browser.customtabs.CustomTabCompositorContentInitializer;
import org.chromium.chrome.browser.customtabs.CustomTabDelegateFactory;
import org.chromium.chrome.browser.customtabs.CustomTabIncognitoManager;
import org.chromium.chrome.browser.customtabs.CustomTabNavigationEventObserver;
import org.chromium.chrome.browser.customtabs.CustomTabObserver;
import org.chromium.chrome.browser.customtabs.CustomTabSessionHandler;
import org.chromium.chrome.browser.customtabs.CustomTabStatusBarColorProvider;
import org.chromium.chrome.browser.customtabs.CustomTabTabPersistencePolicy;
import org.chromium.chrome.browser.customtabs.CustomTabTaskDescriptionHelper;
import org.chromium.chrome.browser.customtabs.CustomTabTopBarDelegate;
import org.chromium.chrome.browser.customtabs.CustomTabUmaRecorder;
import org.chromium.chrome.browser.customtabs.CustomTabsClientFileProcessor;
import org.chromium.chrome.browser.customtabs.CustomTabsConnection;
import org.chromium.chrome.browser.customtabs.ExternalIntentsPolicyProvider;
import org.chromium.chrome.browser.customtabs.ExternalIntentsPolicyProvider_Factory;
import org.chromium.chrome.browser.customtabs.ReparentingTaskProvider;
import org.chromium.chrome.browser.customtabs.content.CustomTabActivityNavigationController;
import org.chromium.chrome.browser.customtabs.content.CustomTabActivityTabController;
import org.chromium.chrome.browser.customtabs.content.CustomTabActivityTabFactory;
import org.chromium.chrome.browser.customtabs.content.CustomTabActivityTabProvider;
import org.chromium.chrome.browser.customtabs.content.CustomTabActivityTabProvider_Factory;
import org.chromium.chrome.browser.customtabs.content.CustomTabIntentHandler;
import org.chromium.chrome.browser.customtabs.content.CustomTabIntentHandlingStrategy;
import org.chromium.chrome.browser.customtabs.content.DefaultCustomTabIntentHandlingStrategy;
import org.chromium.chrome.browser.customtabs.content.TabObserverRegistrar;
import org.chromium.chrome.browser.customtabs.dependency_injection.CustomTabActivityComponent;
import org.chromium.chrome.browser.customtabs.dependency_injection.CustomTabActivityModule;
import org.chromium.chrome.browser.customtabs.dependency_injection.CustomTabActivityModule_ProvideClientAppDataRegisterFactory;
import org.chromium.chrome.browser.customtabs.dependency_injection.CustomTabActivityModule_ProvideIntentHandlerFactory;
import org.chromium.chrome.browser.customtabs.dependency_injection.CustomTabActivityModule_ProvideIntentIgnoringCriterionFactory;
import org.chromium.chrome.browser.customtabs.dependency_injection.CustomTabActivityModule_ProvideNightModeControllerFactory;
import org.chromium.chrome.browser.customtabs.dependency_injection.CustomTabActivityModule_ProvidePostShareTargetNavigatorFactory;
import org.chromium.chrome.browser.customtabs.dependency_injection.CustomTabActivityModule_ProvideStartupTabPreloaderFactory;
import org.chromium.chrome.browser.customtabs.dependency_injection.CustomTabActivityModule_ProvideTabControllerFactory;
import org.chromium.chrome.browser.customtabs.dependency_injection.CustomTabActivityModule_ProvideVerifierDelegateFactory;
import org.chromium.chrome.browser.customtabs.dependency_injection.CustomTabActivityModule_ProvidesBrowserServicesIntentDataProviderFactory;
import org.chromium.chrome.browser.customtabs.dynamicmodule.ActivityDelegate;
import org.chromium.chrome.browser.customtabs.dynamicmodule.DynamicModuleCoordinator;
import org.chromium.chrome.browser.customtabs.dynamicmodule.DynamicModulePageLoadObserver;
import org.chromium.chrome.browser.customtabs.dynamicmodule.DynamicModuleToolbarController;
import org.chromium.chrome.browser.customtabs.features.ImmersiveModeController;
import org.chromium.chrome.browser.customtabs.features.toolbar.CustomTabBrowserControlsVisibilityDelegate;
import org.chromium.chrome.browser.customtabs.features.toolbar.CustomTabToolbarColorController;
import org.chromium.chrome.browser.customtabs.features.toolbar.CustomTabToolbarCoordinator;
import org.chromium.chrome.browser.externalauth.ExternalAuthUtils;
import org.chromium.chrome.browser.fullscreen.ChromeFullscreenManager;
import org.chromium.chrome.browser.preferences.SharedPreferencesManager;
import org.chromium.chrome.browser.ui.messages.snackbar.SnackbarManager;
import org.chromium.chrome.browser.webapps.SplashController;
import org.chromium.chrome.browser.webapps.WebApkPostShareTargetNavigator;
import org.chromium.chrome.browser.webapps.WebApkUpdateManager;
import org.chromium.chrome.browser.webapps.WebappActivityTabController;
import org.chromium.chrome.browser.webapps.dependency_injection.WebappActivityComponent;
import org.chromium.chrome.browser.webapps.dependency_injection.WebappActivityModule;
import org.chromium.chrome.browser.webapps.dependency_injection.WebappActivityModule_ProvideIntentDataProviderFactory;
import org.chromium.chrome.browser.webapps.dependency_injection.WebappActivityModule_ProvideTabControllerFactory;
import org.chromium.ui.base.ActivityWindowAndroid;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DaggerChromeAppComponent implements ChromeAppComponent {
  private volatile Provider<SharedPreferencesManager> providesSharedPreferencesManagerProvider;

  private volatile TrustedWebActivityUmaRecorder trustedWebActivityUmaRecorder;

  private volatile Object trustedWebActivityPermissionManager = new MemoizedSentinel();

  private volatile Object trustedWebActivityPermissionStore = new MemoizedSentinel();

  private volatile Provider<NotificationChannelPreserver> notificationChannelPreserverProvider;

  private volatile Object notificationChannelPreserver = new MemoizedSentinel();

  private volatile Object notificationPermissionUpdater = new MemoizedSentinel();

  private volatile Object trustedWebActivityClient = new MemoizedSentinel();

  private volatile Object trustedWebActivityServiceConnectionPool = new MemoizedSentinel();

  private volatile Object customTabsClientFileProcessor = new MemoizedSentinel();

  private volatile Provider<SplashImageHolder> splashImageHolderProvider;

  private volatile Object splashImageHolder = new MemoizedSentinel();

  private volatile Object sessionDataHolder = new MemoizedSentinel();

  private volatile Provider<CustomTabsConnection> provideCustomTabsConnectionProvider;

  private ChromeAppModule chromeAppModule;

  private AppHooksModule appHooksModule;

  private DaggerChromeAppComponent(Builder builder) {
    initialize(builder);
  }

  public static Builder builder() {
    return new Builder();
  }

  public static ChromeAppComponent create() {
    return new Builder().build();
  }

  private Provider<SharedPreferencesManager> getSharedPreferencesManagerProvider() {
    Object local = providesSharedPreferencesManagerProvider;
    if (local == null) {
      local = new SwitchingProvider<>(0);
      providesSharedPreferencesManagerProvider = (Provider<SharedPreferencesManager>) local;
    }
    return (Provider<SharedPreferencesManager>) local;
  }

  private TrustedWebActivityUmaRecorder getTrustedWebActivityUmaRecorder() {
    Object local = trustedWebActivityUmaRecorder;
    if (local == null) {
      local =
          new TrustedWebActivityUmaRecorder(
              ChromeAppModule_ProvideChromeBrowserInitializerFactory
                  .proxyProvideChromeBrowserInitializer(chromeAppModule));
      trustedWebActivityUmaRecorder = (TrustedWebActivityUmaRecorder) local;
    }
    return (TrustedWebActivityUmaRecorder) local;
  }

  private TrustedWebActivityPermissionStore getTrustedWebActivityPermissionStore() {
    Object local = trustedWebActivityPermissionStore;
    if (local instanceof MemoizedSentinel) {
      synchronized (local) {
        local = trustedWebActivityPermissionStore;
        if (local instanceof MemoizedSentinel) {
          local =
              ChromeAppModule_ProvidesTwaPermissionStoreFactory.proxyProvidesTwaPermissionStore(
                  chromeAppModule);
          trustedWebActivityPermissionStore =
              DoubleCheck.reentrantCheck(trustedWebActivityPermissionStore, local);
        }
      }
    }
    return (TrustedWebActivityPermissionStore) local;
  }

  private NotificationChannelPreserver getNotificationChannelPreserver() {
    Object local = notificationChannelPreserver;
    if (local instanceof MemoizedSentinel) {
      synchronized (local) {
        local = notificationChannelPreserver;
        if (local instanceof MemoizedSentinel) {
          local =
              NotificationChannelPreserver_Factory.newNotificationChannelPreserver(
                  getTrustedWebActivityPermissionStore(),
                  ChromeAppModule_ProvidesSiteChannelsManagerFactory
                      .proxyProvidesSiteChannelsManager(chromeAppModule));
          notificationChannelPreserver =
              DoubleCheck.reentrantCheck(notificationChannelPreserver, local);
        }
      }
    }
    return (NotificationChannelPreserver) local;
  }

  private Provider<NotificationChannelPreserver> getNotificationChannelPreserverProvider() {
    Object local = notificationChannelPreserverProvider;
    if (local == null) {
      local = new SwitchingProvider<>(1);
      notificationChannelPreserverProvider = (Provider<NotificationChannelPreserver>) local;
    }
    return (Provider<NotificationChannelPreserver>) local;
  }

  private TrustedWebActivityServiceConnectionPool getTrustedWebActivityServiceConnectionPool() {
    Object local = trustedWebActivityServiceConnectionPool;
    if (local instanceof MemoizedSentinel) {
      synchronized (local) {
        local = trustedWebActivityServiceConnectionPool;
        if (local instanceof MemoizedSentinel) {
          local =
              ChromeAppModule_ProvidesTwaServiceConnectionManagerFactory
                  .proxyProvidesTwaServiceConnectionManager(
                      chromeAppModule,
                      ChromeAppModule_ProvideContextFactory.proxyProvideContext(chromeAppModule));
          trustedWebActivityServiceConnectionPool =
              DoubleCheck.reentrantCheck(trustedWebActivityServiceConnectionPool, local);
        }
      }
    }
    return (TrustedWebActivityServiceConnectionPool) local;
  }

  private SplashImageHolder getSplashImageHolder() {
    Object local = splashImageHolder;
    if (local instanceof MemoizedSentinel) {
      synchronized (local) {
        local = splashImageHolder;
        if (local instanceof MemoizedSentinel) {
          local = new SplashImageHolder();
          splashImageHolder = DoubleCheck.reentrantCheck(splashImageHolder, local);
        }
      }
    }
    return (SplashImageHolder) local;
  }

  private Provider<SplashImageHolder> getSplashImageHolderProvider() {
    Object local = splashImageHolderProvider;
    if (local == null) {
      local = new SwitchingProvider<>(2);
      splashImageHolderProvider = (Provider<SplashImageHolder>) local;
    }
    return (Provider<SplashImageHolder>) local;
  }

  private Provider<CustomTabsConnection> getCustomTabsConnectionProvider() {
    Object local = provideCustomTabsConnectionProvider;
    if (local == null) {
      local = new SwitchingProvider<>(3);
      provideCustomTabsConnectionProvider = (Provider<CustomTabsConnection>) local;
    }
    return (Provider<CustomTabsConnection>) local;
  }

  @SuppressWarnings("unchecked")
  private void initialize(final Builder builder) {
    this.chromeAppModule = builder.chromeAppModule;
    this.appHooksModule = builder.appHooksModule;
  }

  @Override
  public CustomTabsConnection resolveCustomTabsConnection() {
    return AppHooksModule_ProvideCustomTabsConnectionFactory.proxyProvideCustomTabsConnection();
  }

  @Override
  public SharedPreferencesManager resolveSharedPreferencesManager() {
    return ChromeAppModule_ProvidesSharedPreferencesManagerFactory
        .proxyProvidesSharedPreferencesManager(chromeAppModule);
  }

  @Override
  public ClearDataDialogResultRecorder resolveTwaClearDataDialogRecorder() {
    return new ClearDataDialogResultRecorder(
        DoubleCheck.lazy(getSharedPreferencesManagerProvider()),
        ChromeAppModule_ProvideChromeBrowserInitializerFactory.proxyProvideChromeBrowserInitializer(
            chromeAppModule),
        getTrustedWebActivityUmaRecorder());
  }

  @Override
  public TrustedWebActivityPermissionManager resolveTwaPermissionManager() {
    Object local = trustedWebActivityPermissionManager;
    if (local instanceof MemoizedSentinel) {
      synchronized (local) {
        local = trustedWebActivityPermissionManager;
        if (local instanceof MemoizedSentinel) {
          local =
              new TrustedWebActivityPermissionManager(
                  ChromeAppModule_ProvideContextFactory.proxyProvideContext(chromeAppModule),
                  getTrustedWebActivityPermissionStore(),
                  DoubleCheck.lazy(getNotificationChannelPreserverProvider()));
          trustedWebActivityPermissionManager =
              DoubleCheck.reentrantCheck(trustedWebActivityPermissionManager, local);
        }
      }
    }
    return (TrustedWebActivityPermissionManager) local;
  }

  @Override
  public NotificationPermissionUpdater resolveTwaPermissionUpdater() {
    Object local = notificationPermissionUpdater;
    if (local instanceof MemoizedSentinel) {
      synchronized (local) {
        local = notificationPermissionUpdater;
        if (local instanceof MemoizedSentinel) {
          local =
              new NotificationPermissionUpdater(
                  resolveTwaPermissionManager(), resolveTrustedWebActivityClient());
          notificationPermissionUpdater =
              DoubleCheck.reentrantCheck(notificationPermissionUpdater, local);
        }
      }
    }
    return (NotificationPermissionUpdater) local;
  }

  @Override
  public TrustedWebActivityClient resolveTrustedWebActivityClient() {
    Object local = trustedWebActivityClient;
    if (local instanceof MemoizedSentinel) {
      synchronized (local) {
        local = trustedWebActivityClient;
        if (local instanceof MemoizedSentinel) {
          local =
              new TrustedWebActivityClient(
                  getTrustedWebActivityServiceConnectionPool(),
                  resolveTwaPermissionManager(),
                  getTrustedWebActivityUmaRecorder());
          trustedWebActivityClient = DoubleCheck.reentrantCheck(trustedWebActivityClient, local);
        }
      }
    }
    return (TrustedWebActivityClient) local;
  }

  @Override
  public ExternalAuthUtils resolveExternalAuthUtils() {
    return AppHooksModule_ProvideExternalAuthUtilsFactory.proxyProvideExternalAuthUtils(
        appHooksModule);
  }

  @Override
  public CustomTabsClientFileProcessor resolveCustomTabsFileProcessor() {
    Object local = customTabsClientFileProcessor;
    if (local instanceof MemoizedSentinel) {
      synchronized (local) {
        local = customTabsClientFileProcessor;
        if (local instanceof MemoizedSentinel) {
          local =
              new CustomTabsClientFileProcessor(
                  ChromeAppModule_ProvideContextFactory.proxyProvideContext(chromeAppModule),
                  DoubleCheck.lazy(getSplashImageHolderProvider()));
          customTabsClientFileProcessor =
              DoubleCheck.reentrantCheck(customTabsClientFileProcessor, local);
        }
      }
    }
    return (CustomTabsClientFileProcessor) local;
  }

  @Override
  public SessionDataHolder resolveSessionDataHolder() {
    Object local = sessionDataHolder;
    if (local instanceof MemoizedSentinel) {
      synchronized (local) {
        local = sessionDataHolder;
        if (local instanceof MemoizedSentinel) {
          local = new SessionDataHolder(DoubleCheck.lazy(getCustomTabsConnectionProvider()));
          sessionDataHolder = DoubleCheck.reentrantCheck(sessionDataHolder, local);
        }
      }
    }
    return (SessionDataHolder) local;
  }

  @Override
  public ChromeActivityComponent createChromeActivityComponent(ChromeActivityCommonsModule module) {
    return new ChromeActivityComponentImpl(module);
  }

  @Override
  public CustomTabActivityComponent createCustomTabActivityComponent(
      ChromeActivityCommonsModule module, CustomTabActivityModule customTabActivityModule) {
    return new CustomTabActivityComponentImpl(module, customTabActivityModule);
  }

  @Override
  public WebappActivityComponent createWebappActivityComponent(
      ChromeActivityCommonsModule module, WebappActivityModule webappActivityModule) {
    return new WebappActivityComponentImpl(module, webappActivityModule);
  }

  public static final class Builder {
    private ChromeAppModule chromeAppModule;

    private AppHooksModule appHooksModule;

    private Builder() {}

    public ChromeAppComponent build() {
      if (chromeAppModule == null) {
        this.chromeAppModule = new ChromeAppModule();
      }
      if (appHooksModule == null) {
        this.appHooksModule = new AppHooksModule();
      }
      return new DaggerChromeAppComponent(this);
    }

    public Builder chromeAppModule(ChromeAppModule chromeAppModule) {
      this.chromeAppModule = Preconditions.checkNotNull(chromeAppModule);
      return this;
    }

    public Builder appHooksModule(AppHooksModule appHooksModule) {
      this.appHooksModule = Preconditions.checkNotNull(appHooksModule);
      return this;
    }
  }

  private final class ChromeActivityComponentImpl implements ChromeActivityComponent {
    private ChromeActivityComponentImpl(ChromeActivityCommonsModule module) {}

    @Override
    public ChromeAppComponent getParent() {
      return DaggerChromeAppComponent.this;
    }
  }

  private final class CustomTabActivityComponentImpl implements CustomTabActivityComponent {
    private volatile Object customTabActivityNavigationController = new MemoizedSentinel();

    private volatile Provider<CustomTabObserver> customTabObserverProvider;

    private volatile Object customTabObserver = new MemoizedSentinel();

    private volatile Object closeButtonNavigator = new MemoizedSentinel();

    private volatile Provider<ChromeFullscreenManager> provideChromeFullscreenManagerProvider;

    private volatile Object customTabActivityTabFactory = new MemoizedSentinel();

    private volatile Provider<ActivityWindowAndroid> provideActivityWindowAndroidProvider;

    private volatile Provider<CustomTabDelegateFactory> customTabDelegateFactoryProvider;

    private volatile Object customTabActivityTabProvider = new MemoizedSentinel();

    private volatile Object customTabCompositorContentInitializer = new MemoizedSentinel();

    private volatile Provider<CompositorViewHolder> provideCompositorViewHolderProvider;

    private volatile Object customTabDelegateFactory = new MemoizedSentinel();

    private volatile Object customTabBrowserControlsVisibilityDelegate = new MemoizedSentinel();

    private volatile Object externalIntentsPolicyProvider = new MemoizedSentinel();

    private volatile Object customTabStatusBarColorProvider = new MemoizedSentinel();

    private volatile Object customTabToolbarColorController = new MemoizedSentinel();

    private volatile Object customTabTaskDescriptionHelper = new MemoizedSentinel();

    private volatile Object customTabToolbarCoordinator = new MemoizedSentinel();

    private volatile Object closeButtonVisibilityManager = new MemoizedSentinel();

    private volatile Object tabObserverRegistrar = new MemoizedSentinel();

    private volatile Object twaFinishHandler = new MemoizedSentinel();

    private volatile Object trustedWebActivityCoordinator = new MemoizedSentinel();

    private volatile Object browserServicesStore = new MemoizedSentinel();

    private volatile Object trustedWebActivityModel = new MemoizedSentinel();

    private volatile Object currentPageVerifier = new MemoizedSentinel();

    private volatile Provider<TwaVerifier> twaVerifierProvider;

    private volatile Object twaVerifier = new MemoizedSentinel();

    private volatile OriginVerifier.Factory factory;

    private volatile Object clientPackageNameProvider = new MemoizedSentinel();

    private volatile Object trustedWebActivityDisclosureView = new MemoizedSentinel();

    private volatile Provider<SnackbarManager> provideSnackbarManagerProvider;

    private volatile Object trustedWebActivityOpenTimeRecorder = new MemoizedSentinel();

    private volatile Provider<TwaSplashController> twaSplashControllerProvider;

    private volatile Object trustedWebActivityBrowserControlsVisibilityManager =
        new MemoizedSentinel();

    private volatile Provider<ImmersiveModeController> immersiveModeControllerProvider;

    private volatile Provider<ClientAppDataRecorder> clientAppDataRecorderProvider;

    private volatile Object clientAppDataRecorder = new MemoizedSentinel();

    private volatile Object dynamicModuleToolbarController = new MemoizedSentinel();

    private volatile Object dynamicModuleCoordinator = new MemoizedSentinel();

    private volatile Provider<CustomTabTopBarDelegate> customTabTopBarDelegateProvider;

    private volatile Object customTabTopBarDelegate = new MemoizedSentinel();

    private volatile Provider<CustomTabBottomBarDelegate> customTabBottomBarDelegateProvider;

    private volatile Provider<DynamicModuleToolbarController>
        dynamicModuleToolbarControllerProvider;

    private volatile Object customTabBottomBarDelegate = new MemoizedSentinel();

    private volatile Object customTabActivityTabController = new MemoizedSentinel();

    private volatile WebContentsFactory webContentsFactory;

    private volatile Object customTabNavigationEventObserver = new MemoizedSentinel();

    private volatile Object customTabActivityLifecycleUmaTracker = new MemoizedSentinel();

    private volatile Object customTabIntentHandler = new MemoizedSentinel();

    private volatile Provider<DefaultCustomTabIntentHandlingStrategy>
        defaultCustomTabIntentHandlingStrategyProvider;

    private volatile Object defaultCustomTabIntentHandlingStrategy = new MemoizedSentinel();

    private volatile Provider<TwaIntentHandlingStrategy> twaIntentHandlingStrategyProvider;

    private volatile Object twaIntentHandlingStrategy = new MemoizedSentinel();

    private volatile Object twaSharingController = new MemoizedSentinel();

    private volatile WebApkPostShareTargetNavigator webApkPostShareTargetNavigator;

    private volatile Object customTabIncognitoManager = new MemoizedSentinel();

    private volatile Object customTabUmaRecorder = new MemoizedSentinel();

    private volatile Object customTabSessionHandler = new MemoizedSentinel();

    private volatile Provider<CustomTabToolbarCoordinator> customTabToolbarCoordinatorProvider;

    private volatile Object customTabActivityClientConnectionKeeper = new MemoizedSentinel();

    private volatile Object immersiveModeController = new MemoizedSentinel();

    private volatile Object customTabTabPersistencePolicy = new MemoizedSentinel();

    private CustomTabActivityModule customTabActivityModule;

    private ChromeActivityCommonsModule chromeActivityCommonsModule;

    private CustomTabActivityComponentImpl(
        ChromeActivityCommonsModule module, CustomTabActivityModule customTabActivityModule) {
      initialize(module, customTabActivityModule);
    }

    private BrowserServicesActivityTabController getBrowserServicesActivityTabController() {
      return CustomTabActivityModule_ProvideTabControllerFactory.proxyProvideTabController(
          customTabActivityModule, resolveTabController());
    }

    private CustomTabObserver getCustomTabObserver() {
      Object local = customTabObserver;
      if (local instanceof MemoizedSentinel) {
        synchronized (local) {
          local = customTabObserver;
          if (local instanceof MemoizedSentinel) {
            local =
                new CustomTabObserver(
                    ChromeAppModule_ProvideContextFactory.proxyProvideContext(
                        DaggerChromeAppComponent.this.chromeAppModule),
                    CustomTabActivityModule_ProvidesBrowserServicesIntentDataProviderFactory
                        .proxyProvidesBrowserServicesIntentDataProvider(customTabActivityModule),
                    AppHooksModule_ProvideCustomTabsConnectionFactory
                        .proxyProvideCustomTabsConnection());
            customTabObserver = DoubleCheck.reentrantCheck(customTabObserver, local);
          }
        }
      }
      return (CustomTabObserver) local;
    }

    private Provider<CustomTabObserver> getCustomTabObserverProvider() {
      Object local = customTabObserverProvider;
      if (local == null) {
        local = new SwitchingProvider<>(0);
        customTabObserverProvider = (Provider<CustomTabObserver>) local;
      }
      return (Provider<CustomTabObserver>) local;
    }

    private CloseButtonNavigator getCloseButtonNavigator() {
      Object local = closeButtonNavigator;
      if (local instanceof MemoizedSentinel) {
        synchronized (local) {
          local = closeButtonNavigator;
          if (local instanceof MemoizedSentinel) {
            local =
                new CloseButtonNavigator(
                    getBrowserServicesActivityTabController(),
                    resolveTabProvider(),
                    CustomTabActivityModule_ProvidesBrowserServicesIntentDataProviderFactory
                        .proxyProvidesBrowserServicesIntentDataProvider(customTabActivityModule));
            closeButtonNavigator = DoubleCheck.reentrantCheck(closeButtonNavigator, local);
          }
        }
      }
      return (CloseButtonNavigator) local;
    }

    private Provider<ChromeFullscreenManager> getChromeFullscreenManagerProvider() {
      Object local = provideChromeFullscreenManagerProvider;
      if (local == null) {
        local = new SwitchingProvider<>(1);
        provideChromeFullscreenManagerProvider = (Provider<ChromeFullscreenManager>) local;
      }
      return (Provider<ChromeFullscreenManager>) local;
    }

    private Provider<ActivityWindowAndroid> getActivityWindowAndroidProvider() {
      Object local = provideActivityWindowAndroidProvider;
      if (local == null) {
        local = new SwitchingProvider<>(2);
        provideActivityWindowAndroidProvider = (Provider<ActivityWindowAndroid>) local;
      }
      return (Provider<ActivityWindowAndroid>) local;
    }

    private Provider<CustomTabDelegateFactory> getCustomTabDelegateFactoryProvider() {
      Object local = customTabDelegateFactoryProvider;
      if (local == null) {
        local = new SwitchingProvider<>(3);
        customTabDelegateFactoryProvider = (Provider<CustomTabDelegateFactory>) local;
      }
      return (Provider<CustomTabDelegateFactory>) local;
    }

    private Provider<CompositorViewHolder> getCompositorViewHolderProvider() {
      Object local = provideCompositorViewHolderProvider;
      if (local == null) {
        local = new SwitchingProvider<>(4);
        provideCompositorViewHolderProvider = (Provider<CompositorViewHolder>) local;
      }
      return (Provider<CompositorViewHolder>) local;
    }

    private CustomTabBrowserControlsVisibilityDelegate
        getCustomTabBrowserControlsVisibilityDelegate() {
      Object local = customTabBrowserControlsVisibilityDelegate;
      if (local instanceof MemoizedSentinel) {
        synchronized (local) {
          local = customTabBrowserControlsVisibilityDelegate;
          if (local instanceof MemoizedSentinel) {
            local =
                new CustomTabBrowserControlsVisibilityDelegate(
                    DoubleCheck.lazy(getChromeFullscreenManagerProvider()),
                    ChromeActivityCommonsModule_ProvideActivityTabProviderFactory
                        .proxyProvideActivityTabProvider(chromeActivityCommonsModule));
            customTabBrowserControlsVisibilityDelegate =
                DoubleCheck.reentrantCheck(customTabBrowserControlsVisibilityDelegate, local);
          }
        }
      }
      return (CustomTabBrowserControlsVisibilityDelegate) local;
    }

    private ExternalIntentsPolicyProvider getExternalIntentsPolicyProvider() {
      Object local = externalIntentsPolicyProvider;
      if (local instanceof MemoizedSentinel) {
        synchronized (local) {
          local = externalIntentsPolicyProvider;
          if (local instanceof MemoizedSentinel) {
            local = ExternalIntentsPolicyProvider_Factory.newExternalIntentsPolicyProvider();
            externalIntentsPolicyProvider =
                DoubleCheck.reentrantCheck(externalIntentsPolicyProvider, local);
          }
        }
      }
      return (ExternalIntentsPolicyProvider) local;
    }

    private CloseButtonVisibilityManager getCloseButtonVisibilityManager() {
      Object local = closeButtonVisibilityManager;
      if (local instanceof MemoizedSentinel) {
        synchronized (local) {
          local = closeButtonVisibilityManager;
          if (local instanceof MemoizedSentinel) {
            local =
                new CloseButtonVisibilityManager(
                    CustomTabActivityModule_ProvidesBrowserServicesIntentDataProviderFactory
                        .proxyProvidesBrowserServicesIntentDataProvider(customTabActivityModule));
            closeButtonVisibilityManager =
                DoubleCheck.reentrantCheck(closeButtonVisibilityManager, local);
          }
        }
      }
      return (CloseButtonVisibilityManager) local;
    }

    private BrowserServicesStore getBrowserServicesStore() {
      Object local = browserServicesStore;
      if (local instanceof MemoizedSentinel) {
        synchronized (local) {
          local = browserServicesStore;
          if (local instanceof MemoizedSentinel) {
            local =
                new BrowserServicesStore(
                    ChromeAppModule_ProvidesSharedPreferencesManagerFactory
                        .proxyProvidesSharedPreferencesManager(
                            DaggerChromeAppComponent.this.chromeAppModule));
            browserServicesStore = DoubleCheck.reentrantCheck(browserServicesStore, local);
          }
        }
      }
      return (BrowserServicesStore) local;
    }

    private TrustedWebActivityModel getTrustedWebActivityModel() {
      Object local = trustedWebActivityModel;
      if (local instanceof MemoizedSentinel) {
        synchronized (local) {
          local = trustedWebActivityModel;
          if (local instanceof MemoizedSentinel) {
            local = new TrustedWebActivityModel();
            trustedWebActivityModel = DoubleCheck.reentrantCheck(trustedWebActivityModel, local);
          }
        }
      }
      return (TrustedWebActivityModel) local;
    }

    private OriginVerifier.Factory getFactory() {
      Object local = factory;
      if (local == null) {
        local = new OriginVerifier.Factory();
        factory = (OriginVerifier.Factory) local;
      }
      return (OriginVerifier.Factory) local;
    }

    private ClientPackageNameProvider getClientPackageNameProvider() {
      Object local = clientPackageNameProvider;
      if (local instanceof MemoizedSentinel) {
        synchronized (local) {
          local = clientPackageNameProvider;
          if (local instanceof MemoizedSentinel) {
            local =
                new ClientPackageNameProvider(
                    ChromeActivityCommonsModule_ProvideChromeActivityFactory
                        .proxyProvideChromeActivity(chromeActivityCommonsModule),
                    ChromeActivityCommonsModule_ProvideLifecycleDispatcherFactory
                        .proxyProvideLifecycleDispatcher(chromeActivityCommonsModule),
                    CustomTabActivityModule_ProvidesBrowserServicesIntentDataProviderFactory
                        .proxyProvidesBrowserServicesIntentDataProvider(customTabActivityModule),
                    AppHooksModule_ProvideCustomTabsConnectionFactory
                        .proxyProvideCustomTabsConnection());
            clientPackageNameProvider =
                DoubleCheck.reentrantCheck(clientPackageNameProvider, local);
          }
        }
      }
      return (ClientPackageNameProvider) local;
    }

    private TwaVerifier getTwaVerifier() {
      Object local = twaVerifier;
      if (local instanceof MemoizedSentinel) {
        synchronized (local) {
          local = twaVerifier;
          if (local instanceof MemoizedSentinel) {
            local =
                new TwaVerifier(
                    ChromeActivityCommonsModule_ProvideLifecycleDispatcherFactory
                        .proxyProvideLifecycleDispatcher(chromeActivityCommonsModule),
                    CustomTabActivityModule_ProvidesBrowserServicesIntentDataProviderFactory
                        .proxyProvidesBrowserServicesIntentDataProvider(customTabActivityModule),
                    getFactory(),
                    resolveTabProvider(),
                    getClientPackageNameProvider());
            twaVerifier = DoubleCheck.reentrantCheck(twaVerifier, local);
          }
        }
      }
      return (TwaVerifier) local;
    }

    private Provider<TwaVerifier> getTwaVerifierProvider() {
      Object local = twaVerifierProvider;
      if (local == null) {
        local = new SwitchingProvider<>(5);
        twaVerifierProvider = (Provider<TwaVerifier>) local;
      }
      return (Provider<TwaVerifier>) local;
    }

    private Verifier getVerifier() {
      return CustomTabActivityModule_ProvideVerifierDelegateFactory.proxyProvideVerifierDelegate(
          customTabActivityModule, DoubleCheck.lazy(getTwaVerifierProvider()));
    }

    private CurrentPageVerifier getCurrentPageVerifier() {
      Object local = currentPageVerifier;
      if (local instanceof MemoizedSentinel) {
        synchronized (local) {
          local = currentPageVerifier;
          if (local instanceof MemoizedSentinel) {
            local =
                new CurrentPageVerifier(
                    ChromeActivityCommonsModule_ProvideLifecycleDispatcherFactory
                        .proxyProvideLifecycleDispatcher(chromeActivityCommonsModule),
                    resolveTabObserverRegistrar(),
                    resolveTabProvider(),
                    CustomTabActivityModule_ProvidesBrowserServicesIntentDataProviderFactory
                        .proxyProvidesBrowserServicesIntentDataProvider(customTabActivityModule),
                    getVerifier());
            currentPageVerifier = DoubleCheck.reentrantCheck(currentPageVerifier, local);
          }
        }
      }
      return (CurrentPageVerifier) local;
    }

    private TrustedWebActivityDisclosureController getTrustedWebActivityDisclosureController() {
      return TrustedWebActivityDisclosureController_Factory
          .newTrustedWebActivityDisclosureController(
              getBrowserServicesStore(),
              getTrustedWebActivityModel(),
              ChromeActivityCommonsModule_ProvideLifecycleDispatcherFactory
                  .proxyProvideLifecycleDispatcher(chromeActivityCommonsModule),
              getCurrentPageVerifier(),
              DaggerChromeAppComponent.this.getTrustedWebActivityUmaRecorder(),
              getClientPackageNameProvider());
    }

    private Provider<SnackbarManager> getSnackbarManagerProvider() {
      Object local = provideSnackbarManagerProvider;
      if (local == null) {
        local = new SwitchingProvider<>(6);
        provideSnackbarManagerProvider = (Provider<SnackbarManager>) local;
      }
      return (Provider<SnackbarManager>) local;
    }

    private TrustedWebActivityDisclosureView getTrustedWebActivityDisclosureView() {
      Object local = trustedWebActivityDisclosureView;
      if (local instanceof MemoizedSentinel) {
        synchronized (local) {
          local = trustedWebActivityDisclosureView;
          if (local instanceof MemoizedSentinel) {
            local =
                TrustedWebActivityDisclosureView_Factory.newTrustedWebActivityDisclosureView(
                    ChromeActivityCommonsModule_ProvideResourcesFactory.proxyProvideResources(
                        chromeActivityCommonsModule),
                    DoubleCheck.lazy(getSnackbarManagerProvider()),
                    getTrustedWebActivityModel(),
                    ChromeActivityCommonsModule_ProvideLifecycleDispatcherFactory
                        .proxyProvideLifecycleDispatcher(chromeActivityCommonsModule));
            trustedWebActivityDisclosureView =
                DoubleCheck.reentrantCheck(trustedWebActivityDisclosureView, local);
          }
        }
      }
      return (TrustedWebActivityDisclosureView) local;
    }

    private TrustedWebActivityOpenTimeRecorder getTrustedWebActivityOpenTimeRecorder() {
      Object local = trustedWebActivityOpenTimeRecorder;
      if (local instanceof MemoizedSentinel) {
        synchronized (local) {
          local = trustedWebActivityOpenTimeRecorder;
          if (local instanceof MemoizedSentinel) {
            local =
                TrustedWebActivityOpenTimeRecorder_Factory.newTrustedWebActivityOpenTimeRecorder(
                    ChromeActivityCommonsModule_ProvideLifecycleDispatcherFactory
                        .proxyProvideLifecycleDispatcher(chromeActivityCommonsModule),
                    getCurrentPageVerifier(),
                    DaggerChromeAppComponent.this.getTrustedWebActivityUmaRecorder(),
                    ChromeActivityCommonsModule_ProvideActivityTabProviderFactory
                        .proxyProvideActivityTabProvider(chromeActivityCommonsModule));
            trustedWebActivityOpenTimeRecorder =
                DoubleCheck.reentrantCheck(trustedWebActivityOpenTimeRecorder, local);
          }
        }
      }
      return (TrustedWebActivityOpenTimeRecorder) local;
    }

    private TwaSplashController getTwaSplashController() {
      return new TwaSplashController(
          resolveSplashController(),
          ChromeActivityCommonsModule_ProvideActivityFactory.proxyProvideActivity(
              chromeActivityCommonsModule),
          ChromeActivityCommonsModule_ProvideActivityWindowAndroidFactory
              .proxyProvideActivityWindowAndroid(chromeActivityCommonsModule),
          ChromeActivityCommonsModule_ProvideLifecycleDispatcherFactory
              .proxyProvideLifecycleDispatcher(chromeActivityCommonsModule),
          ChromeActivityCommonsModule_ProvideScreenOrientationProviderFactory
              .proxyProvideScreenOrientationProvider(chromeActivityCommonsModule),
          DaggerChromeAppComponent.this.getSplashImageHolder(),
          CustomTabActivityModule_ProvidesBrowserServicesIntentDataProviderFactory
              .proxyProvidesBrowserServicesIntentDataProvider(customTabActivityModule));
    }

    private Provider<TwaSplashController> getTwaSplashControllerProvider() {
      Object local = twaSplashControllerProvider;
      if (local == null) {
        local = new SwitchingProvider<>(7);
        twaSplashControllerProvider = (Provider<TwaSplashController>) local;
      }
      return (Provider<TwaSplashController>) local;
    }

    private TrustedWebActivityBrowserControlsVisibilityManager
        getTrustedWebActivityBrowserControlsVisibilityManager() {
      Object local = trustedWebActivityBrowserControlsVisibilityManager;
      if (local instanceof MemoizedSentinel) {
        synchronized (local) {
          local = trustedWebActivityBrowserControlsVisibilityManager;
          if (local instanceof MemoizedSentinel) {
            local =
                new TrustedWebActivityBrowserControlsVisibilityManager(
                    resolveTabObserverRegistrar(),
                    resolveTabProvider(),
                    resolveToolbarCoordinator(),
                    getCloseButtonVisibilityManager(),
                    CustomTabActivityModule_ProvidesBrowserServicesIntentDataProviderFactory
                        .proxyProvidesBrowserServicesIntentDataProvider(customTabActivityModule));
            trustedWebActivityBrowserControlsVisibilityManager =
                DoubleCheck.reentrantCheck(
                    trustedWebActivityBrowserControlsVisibilityManager, local);
          }
        }
      }
      return (TrustedWebActivityBrowserControlsVisibilityManager) local;
    }

    private Provider<ImmersiveModeController> getImmersiveModeControllerProvider() {
      Object local = immersiveModeControllerProvider;
      if (local == null) {
        local = new SwitchingProvider<>(8);
        immersiveModeControllerProvider = (Provider<ImmersiveModeController>) local;
      }
      return (Provider<ImmersiveModeController>) local;
    }

    private ClientAppDataRecorder getClientAppDataRecorder() {
      Object local = clientAppDataRecorder;
      if (local instanceof MemoizedSentinel) {
        synchronized (local) {
          local = clientAppDataRecorder;
          if (local instanceof MemoizedSentinel) {
            local =
                ClientAppDataRecorder_Factory.newClientAppDataRecorder(
                    ChromeAppModule_ProvideContextFactory.proxyProvideContext(
                        DaggerChromeAppComponent.this.chromeAppModule),
                    CustomTabActivityModule_ProvideClientAppDataRegisterFactory
                        .proxyProvideClientAppDataRegister(customTabActivityModule));
            clientAppDataRecorder = DoubleCheck.reentrantCheck(clientAppDataRecorder, local);
          }
        }
      }
      return (ClientAppDataRecorder) local;
    }

    private Provider<ClientAppDataRecorder> getClientAppDataRecorderProvider() {
      Object local = clientAppDataRecorderProvider;
      if (local == null) {
        local = new SwitchingProvider<>(9);
        clientAppDataRecorderProvider = (Provider<ClientAppDataRecorder>) local;
      }
      return (Provider<ClientAppDataRecorder>) local;
    }

    private TwaRegistrar getTwaRegistrar() {
      return new TwaRegistrar(
          ChromeAppModule_ProvideContextFactory.proxyProvideContext(
              DaggerChromeAppComponent.this.chromeAppModule),
          DaggerChromeAppComponent.this.resolveTwaPermissionUpdater(),
          DoubleCheck.lazy(getClientAppDataRecorderProvider()));
    }

    private ActivityDelegate getActivityDelegate() {
      return new ActivityDelegate(
          ChromeActivityCommonsModule_ProvideChromeActivityFactory.proxyProvideChromeActivity(
              chromeActivityCommonsModule),
          ChromeActivityCommonsModule_ProvideLifecycleDispatcherFactory
              .proxyProvideLifecycleDispatcher(chromeActivityCommonsModule));
    }

    private CustomTabTopBarDelegate getCustomTabTopBarDelegate() {
      Object local = customTabTopBarDelegate;
      if (local instanceof MemoizedSentinel) {
        synchronized (local) {
          local = customTabTopBarDelegate;
          if (local instanceof MemoizedSentinel) {
            local =
                new CustomTabTopBarDelegate(
                    ChromeActivityCommonsModule_ProvideChromeActivityFactory
                        .proxyProvideChromeActivity(chromeActivityCommonsModule));
            customTabTopBarDelegate = DoubleCheck.reentrantCheck(customTabTopBarDelegate, local);
          }
        }
      }
      return (CustomTabTopBarDelegate) local;
    }

    private Provider<CustomTabTopBarDelegate> getCustomTabTopBarDelegateProvider() {
      Object local = customTabTopBarDelegateProvider;
      if (local == null) {
        local = new SwitchingProvider<>(10);
        customTabTopBarDelegateProvider = (Provider<CustomTabTopBarDelegate>) local;
      }
      return (Provider<CustomTabTopBarDelegate>) local;
    }

    private Provider<CustomTabBottomBarDelegate> getCustomTabBottomBarDelegateProvider() {
      Object local = customTabBottomBarDelegateProvider;
      if (local == null) {
        local = new SwitchingProvider<>(11);
        customTabBottomBarDelegateProvider = (Provider<CustomTabBottomBarDelegate>) local;
      }
      return (Provider<CustomTabBottomBarDelegate>) local;
    }

    private Provider<DynamicModuleToolbarController> getDynamicModuleToolbarControllerProvider() {
      Object local = dynamicModuleToolbarControllerProvider;
      if (local == null) {
        local = new SwitchingProvider<>(12);
        dynamicModuleToolbarControllerProvider = (Provider<DynamicModuleToolbarController>) local;
      }
      return (Provider<DynamicModuleToolbarController>) local;
    }

    private DynamicModulePageLoadObserver getDynamicModulePageLoadObserver() {
      return new DynamicModulePageLoadObserver(
          ChromeActivityCommonsModule_ProvideActivityTabProviderFactory
              .proxyProvideActivityTabProvider(chromeActivityCommonsModule));
    }

    private WebContentsFactory getWebContentsFactory() {
      Object local = webContentsFactory;
      if (local == null) {
        local = new WebContentsFactory();
        webContentsFactory = (WebContentsFactory) local;
      }
      return (WebContentsFactory) local;
    }

    private CustomTabNavigationEventObserver getCustomTabNavigationEventObserver() {
      Object local = customTabNavigationEventObserver;
      if (local instanceof MemoizedSentinel) {
        synchronized (local) {
          local = customTabNavigationEventObserver;
          if (local instanceof MemoizedSentinel) {
            local =
                new CustomTabNavigationEventObserver(
                    CustomTabActivityModule_ProvidesBrowserServicesIntentDataProviderFactory
                        .proxyProvidesBrowserServicesIntentDataProvider(customTabActivityModule),
                    AppHooksModule_ProvideCustomTabsConnectionFactory
                        .proxyProvideCustomTabsConnection());
            customTabNavigationEventObserver =
                DoubleCheck.reentrantCheck(customTabNavigationEventObserver, local);
          }
        }
      }
      return (CustomTabNavigationEventObserver) local;
    }

    private DefaultCustomTabIntentHandlingStrategy getDefaultCustomTabIntentHandlingStrategy() {
      Object local = defaultCustomTabIntentHandlingStrategy;
      if (local instanceof MemoizedSentinel) {
        synchronized (local) {
          local = defaultCustomTabIntentHandlingStrategy;
          if (local instanceof MemoizedSentinel) {
            local =
                new DefaultCustomTabIntentHandlingStrategy(
                    resolveTabProvider(),
                    resolveNavigationController(),
                    getCustomTabNavigationEventObserver(),
                    DoubleCheck.lazy(getCustomTabObserverProvider()));
            defaultCustomTabIntentHandlingStrategy =
                DoubleCheck.reentrantCheck(defaultCustomTabIntentHandlingStrategy, local);
          }
        }
      }
      return (DefaultCustomTabIntentHandlingStrategy) local;
    }

    private Provider<DefaultCustomTabIntentHandlingStrategy>
        getDefaultCustomTabIntentHandlingStrategyProvider() {
      Object local = defaultCustomTabIntentHandlingStrategyProvider;
      if (local == null) {
        local = new SwitchingProvider<>(13);
        defaultCustomTabIntentHandlingStrategyProvider =
            (Provider<DefaultCustomTabIntentHandlingStrategy>) local;
      }
      return (Provider<DefaultCustomTabIntentHandlingStrategy>) local;
    }

    private WebApkPostShareTargetNavigator getWebApkPostShareTargetNavigator() {
      Object local = webApkPostShareTargetNavigator;
      if (local == null) {
        local =
            CustomTabActivityModule_ProvidePostShareTargetNavigatorFactory
                .proxyProvidePostShareTargetNavigator(customTabActivityModule);
        webApkPostShareTargetNavigator = (WebApkPostShareTargetNavigator) local;
      }
      return (WebApkPostShareTargetNavigator) local;
    }

    private TwaSharingController getTwaSharingController() {
      Object local = twaSharingController;
      if (local instanceof MemoizedSentinel) {
        synchronized (local) {
          local = twaSharingController;
          if (local instanceof MemoizedSentinel) {
            local =
                new TwaSharingController(
                    resolveTabProvider(),
                    resolveNavigationController(),
                    getWebApkPostShareTargetNavigator(),
                    getTwaVerifier(),
                    DaggerChromeAppComponent.this.getTrustedWebActivityUmaRecorder());
            twaSharingController = DoubleCheck.reentrantCheck(twaSharingController, local);
          }
        }
      }
      return (TwaSharingController) local;
    }

    private TwaIntentHandlingStrategy getTwaIntentHandlingStrategy() {
      Object local = twaIntentHandlingStrategy;
      if (local instanceof MemoizedSentinel) {
        synchronized (local) {
          local = twaIntentHandlingStrategy;
          if (local instanceof MemoizedSentinel) {
            local =
                new TwaIntentHandlingStrategy(
                    getDefaultCustomTabIntentHandlingStrategy(), getTwaSharingController());
            twaIntentHandlingStrategy =
                DoubleCheck.reentrantCheck(twaIntentHandlingStrategy, local);
          }
        }
      }
      return (TwaIntentHandlingStrategy) local;
    }

    private Provider<TwaIntentHandlingStrategy> getTwaIntentHandlingStrategyProvider() {
      Object local = twaIntentHandlingStrategyProvider;
      if (local == null) {
        local = new SwitchingProvider<>(14);
        twaIntentHandlingStrategyProvider = (Provider<TwaIntentHandlingStrategy>) local;
      }
      return (Provider<TwaIntentHandlingStrategy>) local;
    }

    private CustomTabIntentHandlingStrategy getCustomTabIntentHandlingStrategy() {
      return CustomTabActivityModule_ProvideIntentHandlerFactory.proxyProvideIntentHandler(
          customTabActivityModule,
          DoubleCheck.lazy(getDefaultCustomTabIntentHandlingStrategyProvider()),
          DoubleCheck.lazy(getTwaIntentHandlingStrategyProvider()));
    }

    private Provider<CustomTabToolbarCoordinator> getCustomTabToolbarCoordinatorProvider() {
      Object local = customTabToolbarCoordinatorProvider;
      if (local == null) {
        local = new SwitchingProvider<>(15);
        customTabToolbarCoordinatorProvider = (Provider<CustomTabToolbarCoordinator>) local;
      }
      return (Provider<CustomTabToolbarCoordinator>) local;
    }

    @SuppressWarnings("unchecked")
    private void initialize(
        final ChromeActivityCommonsModule module,
        final CustomTabActivityModule customTabActivityModule) {
      this.customTabActivityModule = Preconditions.checkNotNull(customTabActivityModule);
      this.chromeActivityCommonsModule = Preconditions.checkNotNull(module);
    }

    @Override
    public ChromeAppComponent getParent() {
      return DaggerChromeAppComponent.this;
    }

    @Override
    public CustomTabActivityNavigationController resolveNavigationController() {
      Object local = customTabActivityNavigationController;
      if (local instanceof MemoizedSentinel) {
        synchronized (local) {
          local = customTabActivityNavigationController;
          if (local instanceof MemoizedSentinel) {
            local =
                new CustomTabActivityNavigationController(
                    getBrowserServicesActivityTabController(),
                    resolveTabProvider(),
                    CustomTabActivityModule_ProvidesBrowserServicesIntentDataProviderFactory
                        .proxyProvidesBrowserServicesIntentDataProvider(customTabActivityModule),
                    AppHooksModule_ProvideCustomTabsConnectionFactory
                        .proxyProvideCustomTabsConnection(),
                    DoubleCheck.lazy(getCustomTabObserverProvider()),
                    getCloseButtonNavigator(),
                    ChromeAppModule_ProvideChromeBrowserInitializerFactory
                        .proxyProvideChromeBrowserInitializer(
                            DaggerChromeAppComponent.this.chromeAppModule),
                    ChromeActivityCommonsModule_ProvideChromeActivityFactory
                        .proxyProvideChromeActivity(chromeActivityCommonsModule),
                    ChromeActivityCommonsModule_ProvideLifecycleDispatcherFactory
                        .proxyProvideLifecycleDispatcher(chromeActivityCommonsModule),
                    DoubleCheck.lazy(getChromeFullscreenManagerProvider()));
            customTabActivityNavigationController =
                DoubleCheck.reentrantCheck(customTabActivityNavigationController, local);
          }
        }
      }
      return (CustomTabActivityNavigationController) local;
    }

    @Override
    public CustomTabActivityTabFactory resolveTabFactory() {
      Object local = customTabActivityTabFactory;
      if (local instanceof MemoizedSentinel) {
        synchronized (local) {
          local = customTabActivityTabFactory;
          if (local instanceof MemoizedSentinel) {
            local =
                new CustomTabActivityTabFactory(
                    ChromeActivityCommonsModule_ProvideChromeActivityFactory
                        .proxyProvideChromeActivity(chromeActivityCommonsModule),
                    resolveTabPersistencePolicy(),
                    DoubleCheck.lazy(getActivityWindowAndroidProvider()),
                    DoubleCheck.lazy(getCustomTabDelegateFactoryProvider()),
                    CustomTabActivityModule_ProvidesBrowserServicesIntentDataProviderFactory
                        .proxyProvidesBrowserServicesIntentDataProvider(customTabActivityModule),
                    CustomTabActivityModule_ProvideStartupTabPreloaderFactory
                        .proxyProvideStartupTabPreloader(customTabActivityModule));
            customTabActivityTabFactory =
                DoubleCheck.reentrantCheck(customTabActivityTabFactory, local);
          }
        }
      }
      return (CustomTabActivityTabFactory) local;
    }

    @Override
    public CustomTabActivityTabProvider resolveTabProvider() {
      Object local = customTabActivityTabProvider;
      if (local instanceof MemoizedSentinel) {
        synchronized (local) {
          local = customTabActivityTabProvider;
          if (local instanceof MemoizedSentinel) {
            local = CustomTabActivityTabProvider_Factory.newCustomTabActivityTabProvider();
            customTabActivityTabProvider =
                DoubleCheck.reentrantCheck(customTabActivityTabProvider, local);
          }
        }
      }
      return (CustomTabActivityTabProvider) local;
    }

    @Override
    public CustomTabCompositorContentInitializer resolveCompositorContentInitializer() {
      Object local = customTabCompositorContentInitializer;
      if (local instanceof MemoizedSentinel) {
        synchronized (local) {
          local = customTabCompositorContentInitializer;
          if (local instanceof MemoizedSentinel) {
            local =
                new CustomTabCompositorContentInitializer(
                    ChromeActivityCommonsModule_ProvideLifecycleDispatcherFactory
                        .proxyProvideLifecycleDispatcher(chromeActivityCommonsModule),
                    ChromeActivityCommonsModule_ProvideChromeActivityFactory
                        .proxyProvideChromeActivity(chromeActivityCommonsModule),
                    DoubleCheck.lazy(getCompositorViewHolderProvider()));
            customTabCompositorContentInitializer =
                DoubleCheck.reentrantCheck(customTabCompositorContentInitializer, local);
          }
        }
      }
      return (CustomTabCompositorContentInitializer) local;
    }

    @Override
    public CustomTabDelegateFactory resolveTabDelegateFactory() {
      Object local = customTabDelegateFactory;
      if (local instanceof MemoizedSentinel) {
        synchronized (local) {
          local = customTabDelegateFactory;
          if (local instanceof MemoizedSentinel) {
            local =
                new CustomTabDelegateFactory(
                    ChromeActivityCommonsModule_ProvideChromeActivityFactory
                        .proxyProvideChromeActivity(chromeActivityCommonsModule),
                    CustomTabActivityModule_ProvidesBrowserServicesIntentDataProviderFactory
                        .proxyProvidesBrowserServicesIntentDataProvider(customTabActivityModule),
                    getCustomTabBrowserControlsVisibilityDelegate(),
                    AppHooksModule_ProvideExternalAuthUtilsFactory.proxyProvideExternalAuthUtils(
                        DaggerChromeAppComponent.this.appHooksModule),
                    AppHooksModule_ProvideMultiWindowUtilsFactory.proxyProvideMultiWindowUtils(
                        DaggerChromeAppComponent.this.appHooksModule),
                    getExternalIntentsPolicyProvider());
            customTabDelegateFactory = DoubleCheck.reentrantCheck(customTabDelegateFactory, local);
          }
        }
      }
      return (CustomTabDelegateFactory) local;
    }

    @Override
    public CustomTabStatusBarColorProvider resolveCustomTabStatusBarColorProvider() {
      Object local = customTabStatusBarColorProvider;
      if (local instanceof MemoizedSentinel) {
        synchronized (local) {
          local = customTabStatusBarColorProvider;
          if (local instanceof MemoizedSentinel) {
            local =
                new CustomTabStatusBarColorProvider(
                    CustomTabActivityModule_ProvidesBrowserServicesIntentDataProviderFactory
                        .proxyProvidesBrowserServicesIntentDataProvider(customTabActivityModule),
                    ChromeActivityCommonsModule_ProvideStatusBarColorControllerFactory
                        .proxyProvideStatusBarColorController(chromeActivityCommonsModule));
            customTabStatusBarColorProvider =
                DoubleCheck.reentrantCheck(customTabStatusBarColorProvider, local);
          }
        }
      }
      return (CustomTabStatusBarColorProvider) local;
    }

    @Override
    public CustomTabToolbarColorController resolveToolbarColorController() {
      Object local = customTabToolbarColorController;
      if (local instanceof MemoizedSentinel) {
        synchronized (local) {
          local = customTabToolbarColorController;
          if (local instanceof MemoizedSentinel) {
            local =
                new CustomTabToolbarColorController(
                    CustomTabActivityModule_ProvidesBrowserServicesIntentDataProviderFactory
                        .proxyProvidesBrowserServicesIntentDataProvider(customTabActivityModule),
                    ChromeActivityCommonsModule_ProvideChromeActivityFactory
                        .proxyProvideChromeActivity(chromeActivityCommonsModule),
                    resolveTabProvider(),
                    resolveTabObserverRegistrar());
            customTabToolbarColorController =
                DoubleCheck.reentrantCheck(customTabToolbarColorController, local);
          }
        }
      }
      return (CustomTabToolbarColorController) local;
    }

    @Override
    public CustomTabTaskDescriptionHelper resolveTaskDescriptionHelper() {
      Object local = customTabTaskDescriptionHelper;
      if (local instanceof MemoizedSentinel) {
        synchronized (local) {
          local = customTabTaskDescriptionHelper;
          if (local instanceof MemoizedSentinel) {
            local =
                new CustomTabTaskDescriptionHelper(
                    ChromeActivityCommonsModule_ProvideChromeActivityFactory
                        .proxyProvideChromeActivity(chromeActivityCommonsModule),
                    resolveTabProvider(),
                    resolveTabObserverRegistrar(),
                    CustomTabActivityModule_ProvidesBrowserServicesIntentDataProviderFactory
                        .proxyProvidesBrowserServicesIntentDataProvider(customTabActivityModule),
                    ChromeActivityCommonsModule_ProvideLifecycleDispatcherFactory
                        .proxyProvideLifecycleDispatcher(chromeActivityCommonsModule));
            customTabTaskDescriptionHelper =
                DoubleCheck.reentrantCheck(customTabTaskDescriptionHelper, local);
          }
        }
      }
      return (CustomTabTaskDescriptionHelper) local;
    }

    @Override
    public CustomTabToolbarCoordinator resolveToolbarCoordinator() {
      Object local = customTabToolbarCoordinator;
      if (local instanceof MemoizedSentinel) {
        synchronized (local) {
          local = customTabToolbarCoordinator;
          if (local instanceof MemoizedSentinel) {
            local =
                new CustomTabToolbarCoordinator(
                    CustomTabActivityModule_ProvidesBrowserServicesIntentDataProviderFactory
                        .proxyProvidesBrowserServicesIntentDataProvider(customTabActivityModule),
                    resolveCustomTabUmaRecorder(),
                    resolveTabProvider(),
                    AppHooksModule_ProvideCustomTabsConnectionFactory
                        .proxyProvideCustomTabsConnection(),
                    ChromeActivityCommonsModule_ProvideChromeActivityFactory
                        .proxyProvideChromeActivity(chromeActivityCommonsModule),
                    ChromeAppModule_ProvideContextFactory.proxyProvideContext(
                        DaggerChromeAppComponent.this.chromeAppModule),
                    getBrowserServicesActivityTabController(),
                    DoubleCheck.lazy(getChromeFullscreenManagerProvider()),
                    resolveNavigationController(),
                    getCloseButtonVisibilityManager(),
                    getCustomTabBrowserControlsVisibilityDelegate(),
                    resolveCompositorContentInitializer(),
                    resolveToolbarColorController());
            customTabToolbarCoordinator =
                DoubleCheck.reentrantCheck(customTabToolbarCoordinator, local);
          }
        }
      }
      return (CustomTabToolbarCoordinator) local;
    }

    @Override
    public SplashController resolveSplashController() {
      return new SplashController(
          ChromeActivityCommonsModule_ProvideActivityFactory.proxyProvideActivity(
              chromeActivityCommonsModule),
          ChromeActivityCommonsModule_ProvideLifecycleDispatcherFactory
              .proxyProvideLifecycleDispatcher(chromeActivityCommonsModule),
          resolveTabObserverRegistrar(),
          resolveTwaFinishHandler());
    }

    @Override
    public TabObserverRegistrar resolveTabObserverRegistrar() {
      Object local = tabObserverRegistrar;
      if (local instanceof MemoizedSentinel) {
        synchronized (local) {
          local = tabObserverRegistrar;
          if (local instanceof MemoizedSentinel) {
            local =
                new TabObserverRegistrar(
                    ChromeActivityCommonsModule_ProvideLifecycleDispatcherFactory
                        .proxyProvideLifecycleDispatcher(chromeActivityCommonsModule),
                    resolveTabProvider());
            tabObserverRegistrar = DoubleCheck.reentrantCheck(tabObserverRegistrar, local);
          }
        }
      }
      return (TabObserverRegistrar) local;
    }

    @Override
    public TwaFinishHandler resolveTwaFinishHandler() {
      Object local = twaFinishHandler;
      if (local instanceof MemoizedSentinel) {
        synchronized (local) {
          local = twaFinishHandler;
          if (local instanceof MemoizedSentinel) {
            local =
                new TwaFinishHandler(
                    ChromeActivityCommonsModule_ProvideChromeActivityFactory
                        .proxyProvideChromeActivity(chromeActivityCommonsModule),
                    CustomTabActivityModule_ProvidesBrowserServicesIntentDataProviderFactory
                        .proxyProvidesBrowserServicesIntentDataProvider(customTabActivityModule),
                    AppHooksModule_ProvideCustomTabsConnectionFactory
                        .proxyProvideCustomTabsConnection());
            twaFinishHandler = DoubleCheck.reentrantCheck(twaFinishHandler, local);
          }
        }
      }
      return (TwaFinishHandler) local;
    }

    @Override
    public TrustedWebActivityCoordinator resolveTrustedWebActivityCoordinator() {
      Object local = trustedWebActivityCoordinator;
      if (local instanceof MemoizedSentinel) {
        synchronized (local) {
          local = trustedWebActivityCoordinator;
          if (local instanceof MemoizedSentinel) {
            local =
                new TrustedWebActivityCoordinator(
                    getTrustedWebActivityDisclosureController(),
                    getTrustedWebActivityDisclosureView(),
                    getTrustedWebActivityOpenTimeRecorder(),
                    getCurrentPageVerifier(),
                    getVerifier(),
                    resolveNavigationController(),
                    getExternalIntentsPolicyProvider(),
                    DoubleCheck.lazy(getTwaSplashControllerProvider()),
                    CustomTabActivityModule_ProvidesBrowserServicesIntentDataProviderFactory
                        .proxyProvidesBrowserServicesIntentDataProvider(customTabActivityModule),
                    DaggerChromeAppComponent.this.getTrustedWebActivityUmaRecorder(),
                    resolveToolbarColorController(),
                    resolveCustomTabStatusBarColorProvider(),
                    ChromeActivityCommonsModule_ProvideLifecycleDispatcherFactory
                        .proxyProvideLifecycleDispatcher(chromeActivityCommonsModule),
                    getTrustedWebActivityBrowserControlsVisibilityManager(),
                    DoubleCheck.lazy(getImmersiveModeControllerProvider()),
                    getTwaRegistrar(),
                    getClientPackageNameProvider(),
                    AppHooksModule_ProvideCustomTabsConnectionFactory
                        .proxyProvideCustomTabsConnection());
            trustedWebActivityCoordinator =
                DoubleCheck.reentrantCheck(trustedWebActivityCoordinator, local);
          }
        }
      }
      return (TrustedWebActivityCoordinator) local;
    }

    @Override
    public DynamicModuleToolbarController resolveDynamicModuleToolbarController() {
      Object local = dynamicModuleToolbarController;
      if (local instanceof MemoizedSentinel) {
        synchronized (local) {
          local = dynamicModuleToolbarController;
          if (local instanceof MemoizedSentinel) {
            local =
                new DynamicModuleToolbarController(
                    DoubleCheck.lazy(getChromeFullscreenManagerProvider()),
                    CustomTabActivityModule_ProvidesBrowserServicesIntentDataProviderFactory
                        .proxyProvidesBrowserServicesIntentDataProvider(customTabActivityModule),
                    ChromeActivityCommonsModule_ProvideLifecycleDispatcherFactory
                        .proxyProvideLifecycleDispatcher(chromeActivityCommonsModule),
                    resolveToolbarCoordinator());
            dynamicModuleToolbarController =
                DoubleCheck.reentrantCheck(dynamicModuleToolbarController, local);
          }
        }
      }
      return (DynamicModuleToolbarController) local;
    }

    @Override
    public DynamicModuleCoordinator resolveDynamicModuleCoordinator() {
      Object local = dynamicModuleCoordinator;
      if (local instanceof MemoizedSentinel) {
        synchronized (local) {
          local = dynamicModuleCoordinator;
          if (local instanceof MemoizedSentinel) {
            local =
                new DynamicModuleCoordinator(
                    CustomTabActivityModule_ProvidesBrowserServicesIntentDataProviderFactory
                        .proxyProvidesBrowserServicesIntentDataProvider(customTabActivityModule),
                    getCloseButtonNavigator(),
                    resolveTabObserverRegistrar(),
                    ChromeActivityCommonsModule_ProvideLifecycleDispatcherFactory
                        .proxyProvideLifecycleDispatcher(chromeActivityCommonsModule),
                    resolveNavigationController(),
                    getActivityDelegate(),
                    DoubleCheck.lazy(getCustomTabTopBarDelegateProvider()),
                    DoubleCheck.lazy(getCustomTabBottomBarDelegateProvider()),
                    DoubleCheck.lazy(getChromeFullscreenManagerProvider()),
                    DoubleCheck.lazy(getDynamicModuleToolbarControllerProvider()),
                    AppHooksModule_ProvideCustomTabsConnectionFactory
                        .proxyProvideCustomTabsConnection(),
                    ChromeActivityCommonsModule_ProvideChromeActivityFactory
                        .proxyProvideChromeActivity(chromeActivityCommonsModule),
                    resolveTabProvider(),
                    getDynamicModulePageLoadObserver());
            dynamicModuleCoordinator = DoubleCheck.reentrantCheck(dynamicModuleCoordinator, local);
          }
        }
      }
      return (DynamicModuleCoordinator) local;
    }

    @Override
    public CustomTabBottomBarDelegate resolveBottomBarDelegate() {
      Object local = customTabBottomBarDelegate;
      if (local instanceof MemoizedSentinel) {
        synchronized (local) {
          local = customTabBottomBarDelegate;
          if (local instanceof MemoizedSentinel) {
            local =
                new CustomTabBottomBarDelegate(
                    ChromeActivityCommonsModule_ProvideChromeActivityFactory
                        .proxyProvideChromeActivity(chromeActivityCommonsModule),
                    CustomTabActivityModule_ProvidesBrowserServicesIntentDataProviderFactory
                        .proxyProvidesBrowserServicesIntentDataProvider(customTabActivityModule),
                    ChromeActivityCommonsModule_ProvideChromeFullscreenManagerFactory
                        .proxyProvideChromeFullscreenManager(chromeActivityCommonsModule),
                    CustomTabActivityModule_ProvideNightModeControllerFactory
                        .proxyProvideNightModeController(customTabActivityModule),
                    ChromeAppModule_ProvideSystemNightModeMonitorFactory
                        .proxyProvideSystemNightModeMonitor(
                            DaggerChromeAppComponent.this.chromeAppModule),
                    resolveCompositorContentInitializer());
            customTabBottomBarDelegate =
                DoubleCheck.reentrantCheck(customTabBottomBarDelegate, local);
          }
        }
      }
      return (CustomTabBottomBarDelegate) local;
    }

    @Override
    public CustomTabActivityTabController resolveTabController() {
      Object local = customTabActivityTabController;
      if (local instanceof MemoizedSentinel) {
        synchronized (local) {
          local = customTabActivityTabController;
          if (local instanceof MemoizedSentinel) {
            local =
                new CustomTabActivityTabController(
                    ChromeActivityCommonsModule_ProvideChromeActivityFactory
                        .proxyProvideChromeActivity(chromeActivityCommonsModule),
                    DoubleCheck.lazy(getCustomTabDelegateFactoryProvider()),
                    AppHooksModule_ProvideCustomTabsConnectionFactory
                        .proxyProvideCustomTabsConnection(),
                    CustomTabActivityModule_ProvidesBrowserServicesIntentDataProviderFactory
                        .proxyProvidesBrowserServicesIntentDataProvider(customTabActivityModule),
                    ChromeActivityCommonsModule_ProvideActivityTabProviderFactory
                        .proxyProvideActivityTabProvider(chromeActivityCommonsModule),
                    resolveTabObserverRegistrar(),
                    DoubleCheck.lazy(getCompositorViewHolderProvider()),
                    ChromeActivityCommonsModule_ProvideLifecycleDispatcherFactory
                        .proxyProvideLifecycleDispatcher(chromeActivityCommonsModule),
                    ChromeAppModule_ProvideWarmupManagerFactory.proxyProvideWarmupManager(
                        DaggerChromeAppComponent.this.chromeAppModule),
                    resolveTabPersistencePolicy(),
                    resolveTabFactory(),
                    DoubleCheck.lazy(getCustomTabObserverProvider()),
                    getWebContentsFactory(),
                    getCustomTabNavigationEventObserver(),
                    resolveTabProvider(),
                    CustomTabActivityModule_ProvideStartupTabPreloaderFactory
                        .proxyProvideStartupTabPreloader(customTabActivityModule),
                    new ReparentingTaskProvider());
            customTabActivityTabController =
                DoubleCheck.reentrantCheck(customTabActivityTabController, local);
          }
        }
      }
      return (CustomTabActivityTabController) local;
    }

    @Override
    public CustomTabActivityLifecycleUmaTracker resolveUmaTracker() {
      Object local = customTabActivityLifecycleUmaTracker;
      if (local instanceof MemoizedSentinel) {
        synchronized (local) {
          local = customTabActivityLifecycleUmaTracker;
          if (local instanceof MemoizedSentinel) {
            local =
                new CustomTabActivityLifecycleUmaTracker(
                    ChromeActivityCommonsModule_ProvideLifecycleDispatcherFactory
                        .proxyProvideLifecycleDispatcher(chromeActivityCommonsModule),
                    ChromeActivityCommonsModule_ProvideChromeActivityFactory
                        .proxyProvideChromeActivity(chromeActivityCommonsModule),
                    CustomTabActivityModule_ProvidesBrowserServicesIntentDataProviderFactory
                        .proxyProvidesBrowserServicesIntentDataProvider(customTabActivityModule),
                    AppHooksModule_ProvideCustomTabsConnectionFactory
                        .proxyProvideCustomTabsConnection());
            customTabActivityLifecycleUmaTracker =
                DoubleCheck.reentrantCheck(customTabActivityLifecycleUmaTracker, local);
          }
        }
      }
      return (CustomTabActivityLifecycleUmaTracker) local;
    }

    @Override
    public CustomTabIntentHandler resolveIntentHandler() {
      Object local = customTabIntentHandler;
      if (local instanceof MemoizedSentinel) {
        synchronized (local) {
          local = customTabIntentHandler;
          if (local instanceof MemoizedSentinel) {
            local =
                new CustomTabIntentHandler(
                    resolveTabProvider(),
                    CustomTabActivityModule_ProvidesBrowserServicesIntentDataProviderFactory
                        .proxyProvidesBrowserServicesIntentDataProvider(customTabActivityModule),
                    getCustomTabIntentHandlingStrategy(),
                    CustomTabActivityModule_ProvideIntentIgnoringCriterionFactory
                        .proxyProvideIntentIgnoringCriterion(customTabActivityModule),
                    ChromeActivityCommonsModule_ProvideContextFactory.proxyProvideContext(
                        chromeActivityCommonsModule));
            customTabIntentHandler = DoubleCheck.reentrantCheck(customTabIntentHandler, local);
          }
        }
      }
      return (CustomTabIntentHandler) local;
    }

    @Override
    public CustomTabIncognitoManager resolveCustomTabIncognitoManager() {
      Object local = customTabIncognitoManager;
      if (local instanceof MemoizedSentinel) {
        synchronized (local) {
          local = customTabIncognitoManager;
          if (local instanceof MemoizedSentinel) {
            local =
                new CustomTabIncognitoManager(
                    ChromeActivityCommonsModule_ProvideChromeActivityFactory
                        .proxyProvideChromeActivity(chromeActivityCommonsModule),
                    CustomTabActivityModule_ProvidesBrowserServicesIntentDataProviderFactory
                        .proxyProvidesBrowserServicesIntentDataProvider(customTabActivityModule),
                    resolveNavigationController(),
                    ChromeActivityCommonsModule_ProvideLifecycleDispatcherFactory
                        .proxyProvideLifecycleDispatcher(chromeActivityCommonsModule));
            customTabIncognitoManager =
                DoubleCheck.reentrantCheck(customTabIncognitoManager, local);
          }
        }
      }
      return (CustomTabIncognitoManager) local;
    }

    @Override
    public CustomTabUmaRecorder resolveCustomTabUmaRecorder() {
      Object local = customTabUmaRecorder;
      if (local instanceof MemoizedSentinel) {
        synchronized (local) {
          local = customTabUmaRecorder;
          if (local instanceof MemoizedSentinel) {
            local =
                new CustomTabUmaRecorder(
                    CustomTabActivityModule_ProvidesBrowserServicesIntentDataProviderFactory
                        .proxyProvidesBrowserServicesIntentDataProvider(customTabActivityModule));
            customTabUmaRecorder = DoubleCheck.reentrantCheck(customTabUmaRecorder, local);
          }
        }
      }
      return (CustomTabUmaRecorder) local;
    }

    @Override
    public CustomTabSessionHandler resolveSessionHandler() {
      Object local = customTabSessionHandler;
      if (local instanceof MemoizedSentinel) {
        synchronized (local) {
          local = customTabSessionHandler;
          if (local instanceof MemoizedSentinel) {
            local =
                new CustomTabSessionHandler(
                    CustomTabActivityModule_ProvidesBrowserServicesIntentDataProviderFactory
                        .proxyProvidesBrowserServicesIntentDataProvider(customTabActivityModule),
                    resolveTabProvider(),
                    DoubleCheck.lazy(getCustomTabToolbarCoordinatorProvider()),
                    DoubleCheck.lazy(getCustomTabBottomBarDelegateProvider()),
                    resolveIntentHandler(),
                    AppHooksModule_ProvideCustomTabsConnectionFactory
                        .proxyProvideCustomTabsConnection(),
                    ChromeActivityCommonsModule_ProvideActivityFactory.proxyProvideActivity(
                        chromeActivityCommonsModule),
                    ChromeActivityCommonsModule_ProvideLifecycleDispatcherFactory
                        .proxyProvideLifecycleDispatcher(chromeActivityCommonsModule),
                    DaggerChromeAppComponent.this.resolveSessionDataHolder());
            customTabSessionHandler = DoubleCheck.reentrantCheck(customTabSessionHandler, local);
          }
        }
      }
      return (CustomTabSessionHandler) local;
    }

    @Override
    public CustomTabActivityClientConnectionKeeper resolveConnectionKeeper() {
      Object local = customTabActivityClientConnectionKeeper;
      if (local instanceof MemoizedSentinel) {
        synchronized (local) {
          local = customTabActivityClientConnectionKeeper;
          if (local instanceof MemoizedSentinel) {
            local =
                new CustomTabActivityClientConnectionKeeper(
                    AppHooksModule_ProvideCustomTabsConnectionFactory
                        .proxyProvideCustomTabsConnection(),
                    CustomTabActivityModule_ProvidesBrowserServicesIntentDataProviderFactory
                        .proxyProvidesBrowserServicesIntentDataProvider(customTabActivityModule),
                    ChromeActivityCommonsModule_ProvideLifecycleDispatcherFactory
                        .proxyProvideLifecycleDispatcher(chromeActivityCommonsModule),
                    resolveTabProvider());
            customTabActivityClientConnectionKeeper =
                DoubleCheck.reentrantCheck(customTabActivityClientConnectionKeeper, local);
          }
        }
      }
      return (CustomTabActivityClientConnectionKeeper) local;
    }

    @Override
    public ImmersiveModeController resolveImmersiveModeController() {
      Object local = immersiveModeController;
      if (local instanceof MemoizedSentinel) {
        synchronized (local) {
          local = immersiveModeController;
          if (local instanceof MemoizedSentinel) {
            local =
                new ImmersiveModeController(
                    ChromeActivityCommonsModule_ProvideLifecycleDispatcherFactory
                        .proxyProvideLifecycleDispatcher(chromeActivityCommonsModule),
                    ChromeActivityCommonsModule_ProvideActivityFactory.proxyProvideActivity(
                        chromeActivityCommonsModule));
            immersiveModeController = DoubleCheck.reentrantCheck(immersiveModeController, local);
          }
        }
      }
      return (ImmersiveModeController) local;
    }

    @Override
    public CustomTabTabPersistencePolicy resolveTabPersistencePolicy() {
      Object local = customTabTabPersistencePolicy;
      if (local instanceof MemoizedSentinel) {
        synchronized (local) {
          local = customTabTabPersistencePolicy;
          if (local instanceof MemoizedSentinel) {
            local =
                new CustomTabTabPersistencePolicy(
                    ChromeActivityCommonsModule_ProvideChromeActivityFactory
                        .proxyProvideChromeActivity(chromeActivityCommonsModule));
            customTabTabPersistencePolicy =
                DoubleCheck.reentrantCheck(customTabTabPersistencePolicy, local);
          }
        }
      }
      return (CustomTabTabPersistencePolicy) local;
    }

    @Override
    public ReparentingTaskProvider resolveReparentingTaskProvider() {
      return new ReparentingTaskProvider();
    }

    private final class SwitchingProvider<T> implements Provider<T> {
      private final int id;

      SwitchingProvider(int id) {
        this.id = id;
      }

      @SuppressWarnings("unchecked")
      @Override
      public T get() {
        switch (id) {
          case 0: // org.chromium.chrome.browser.customtabs.CustomTabObserver
            return (T) getCustomTabObserver();

          case 1: // org.chromium.chrome.browser.fullscreen.ChromeFullscreenManager
            return (T)
                ChromeActivityCommonsModule_ProvideChromeFullscreenManagerFactory
                    .proxyProvideChromeFullscreenManager(chromeActivityCommonsModule);

          case 2: // org.chromium.ui.base.ActivityWindowAndroid
            return (T)
                ChromeActivityCommonsModule_ProvideActivityWindowAndroidFactory
                    .proxyProvideActivityWindowAndroid(chromeActivityCommonsModule);

          case 3: // org.chromium.chrome.browser.customtabs.CustomTabDelegateFactory
            return (T) resolveTabDelegateFactory();

          case 4: // org.chromium.chrome.browser.compositor.CompositorViewHolder
            return (T)
                ChromeActivityCommonsModule_ProvideCompositorViewHolderFactory
                    .proxyProvideCompositorViewHolder(chromeActivityCommonsModule);

          case 5: // org.chromium.chrome.browser.browserservices.trustedwebactivityui.controller.TwaVerifier
            return (T) getTwaVerifier();

          case 6: // org.chromium.chrome.browser.ui.messages.snackbar.SnackbarManager
            return (T)
                ChromeActivityCommonsModule_ProvideSnackbarManagerFactory
                    .proxyProvideSnackbarManager(chromeActivityCommonsModule);

          case 7: // org.chromium.chrome.browser.browserservices.trustedwebactivityui.splashscreen.TwaSplashController
            return (T) getTwaSplashController();

          case 8: // org.chromium.chrome.browser.customtabs.features.ImmersiveModeController
            return (T) resolveImmersiveModeController();

          case 9: // org.chromium.chrome.browser.browserservices.trustedwebactivityui.controller.ClientAppDataRecorder
            return (T) getClientAppDataRecorder();

          case 10: // org.chromium.chrome.browser.customtabs.CustomTabTopBarDelegate
            return (T) getCustomTabTopBarDelegate();

          case 11: // org.chromium.chrome.browser.customtabs.CustomTabBottomBarDelegate
            return (T) resolveBottomBarDelegate();

          case 12: // org.chromium.chrome.browser.customtabs.dynamicmodule.DynamicModuleToolbarController
            return (T) resolveDynamicModuleToolbarController();

          case 13: // org.chromium.chrome.browser.customtabs.content.DefaultCustomTabIntentHandlingStrategy
            return (T) getDefaultCustomTabIntentHandlingStrategy();

          case 14: // org.chromium.chrome.browser.browserservices.trustedwebactivityui.TwaIntentHandlingStrategy
            return (T) getTwaIntentHandlingStrategy();

          case 15: // org.chromium.chrome.browser.customtabs.features.toolbar.CustomTabToolbarCoordinator
            return (T) resolveToolbarCoordinator();
          default:
            throw new AssertionError(id);
        }
      }
    }
  }

  private final class WebappActivityComponentImpl implements WebappActivityComponent {
    private volatile Object customTabActivityNavigationController = new MemoizedSentinel();

    private volatile Provider<CustomTabObserver> customTabObserverProvider;

    private volatile Object customTabObserver = new MemoizedSentinel();

    private volatile Object closeButtonNavigator = new MemoizedSentinel();

    private volatile Provider<ChromeFullscreenManager> provideChromeFullscreenManagerProvider;

    private volatile Object customTabActivityTabFactory = new MemoizedSentinel();

    private volatile Object customTabTabPersistencePolicy = new MemoizedSentinel();

    private volatile Provider<ActivityWindowAndroid> provideActivityWindowAndroidProvider;

    private volatile Provider<CustomTabDelegateFactory> customTabDelegateFactoryProvider;

    private volatile Object customTabActivityTabProvider = new MemoizedSentinel();

    private volatile Object customTabCompositorContentInitializer = new MemoizedSentinel();

    private volatile Provider<CompositorViewHolder> provideCompositorViewHolderProvider;

    private volatile Object customTabDelegateFactory = new MemoizedSentinel();

    private volatile Object customTabBrowserControlsVisibilityDelegate = new MemoizedSentinel();

    private volatile Object externalIntentsPolicyProvider = new MemoizedSentinel();

    private volatile Object customTabStatusBarColorProvider = new MemoizedSentinel();

    private volatile Object customTabToolbarColorController = new MemoizedSentinel();

    private volatile Object customTabTaskDescriptionHelper = new MemoizedSentinel();

    private volatile Object customTabToolbarCoordinator = new MemoizedSentinel();

    private volatile Object closeButtonVisibilityManager = new MemoizedSentinel();

    private volatile Object tabObserverRegistrar = new MemoizedSentinel();

    private volatile Object twaFinishHandler = new MemoizedSentinel();

    private volatile Object trustedWebActivityBrowserControlsVisibilityManager =
        new MemoizedSentinel();

    private volatile Object webappActivityTabController = new MemoizedSentinel();

    private volatile WebContentsFactory webContentsFactory;

    private volatile Object webApkUpdateManager = new MemoizedSentinel();

    private WebappActivityModule webappActivityModule;

    private ChromeActivityCommonsModule chromeActivityCommonsModule;

    private WebappActivityComponentImpl(
        ChromeActivityCommonsModule module, WebappActivityModule webappActivityModule) {
      initialize(module, webappActivityModule);
    }

    private BrowserServicesActivityTabController getBrowserServicesActivityTabController() {
      return WebappActivityModule_ProvideTabControllerFactory.proxyProvideTabController(
          webappActivityModule, resolveTabController());
    }

    private CustomTabObserver getCustomTabObserver() {
      Object local = customTabObserver;
      if (local instanceof MemoizedSentinel) {
        synchronized (local) {
          local = customTabObserver;
          if (local instanceof MemoizedSentinel) {
            local =
                new CustomTabObserver(
                    ChromeAppModule_ProvideContextFactory.proxyProvideContext(
                        DaggerChromeAppComponent.this.chromeAppModule),
                    WebappActivityModule_ProvideIntentDataProviderFactory
                        .proxyProvideIntentDataProvider(webappActivityModule),
                    AppHooksModule_ProvideCustomTabsConnectionFactory
                        .proxyProvideCustomTabsConnection());
            customTabObserver = DoubleCheck.reentrantCheck(customTabObserver, local);
          }
        }
      }
      return (CustomTabObserver) local;
    }

    private Provider<CustomTabObserver> getCustomTabObserverProvider() {
      Object local = customTabObserverProvider;
      if (local == null) {
        local = new SwitchingProvider<>(0);
        customTabObserverProvider = (Provider<CustomTabObserver>) local;
      }
      return (Provider<CustomTabObserver>) local;
    }

    private CloseButtonNavigator getCloseButtonNavigator() {
      Object local = closeButtonNavigator;
      if (local instanceof MemoizedSentinel) {
        synchronized (local) {
          local = closeButtonNavigator;
          if (local instanceof MemoizedSentinel) {
            local =
                new CloseButtonNavigator(
                    getBrowserServicesActivityTabController(),
                    resolveTabProvider(),
                    WebappActivityModule_ProvideIntentDataProviderFactory
                        .proxyProvideIntentDataProvider(webappActivityModule));
            closeButtonNavigator = DoubleCheck.reentrantCheck(closeButtonNavigator, local);
          }
        }
      }
      return (CloseButtonNavigator) local;
    }

    private Provider<ChromeFullscreenManager> getChromeFullscreenManagerProvider() {
      Object local = provideChromeFullscreenManagerProvider;
      if (local == null) {
        local = new SwitchingProvider<>(1);
        provideChromeFullscreenManagerProvider = (Provider<ChromeFullscreenManager>) local;
      }
      return (Provider<ChromeFullscreenManager>) local;
    }

    private CustomTabTabPersistencePolicy getCustomTabTabPersistencePolicy() {
      Object local = customTabTabPersistencePolicy;
      if (local instanceof MemoizedSentinel) {
        synchronized (local) {
          local = customTabTabPersistencePolicy;
          if (local instanceof MemoizedSentinel) {
            local =
                new CustomTabTabPersistencePolicy(
                    ChromeActivityCommonsModule_ProvideChromeActivityFactory
                        .proxyProvideChromeActivity(chromeActivityCommonsModule));
            customTabTabPersistencePolicy =
                DoubleCheck.reentrantCheck(customTabTabPersistencePolicy, local);
          }
        }
      }
      return (CustomTabTabPersistencePolicy) local;
    }

    private Provider<ActivityWindowAndroid> getActivityWindowAndroidProvider() {
      Object local = provideActivityWindowAndroidProvider;
      if (local == null) {
        local = new SwitchingProvider<>(2);
        provideActivityWindowAndroidProvider = (Provider<ActivityWindowAndroid>) local;
      }
      return (Provider<ActivityWindowAndroid>) local;
    }

    private Provider<CustomTabDelegateFactory> getCustomTabDelegateFactoryProvider() {
      Object local = customTabDelegateFactoryProvider;
      if (local == null) {
        local = new SwitchingProvider<>(3);
        customTabDelegateFactoryProvider = (Provider<CustomTabDelegateFactory>) local;
      }
      return (Provider<CustomTabDelegateFactory>) local;
    }

    private Provider<CompositorViewHolder> getCompositorViewHolderProvider() {
      Object local = provideCompositorViewHolderProvider;
      if (local == null) {
        local = new SwitchingProvider<>(4);
        provideCompositorViewHolderProvider = (Provider<CompositorViewHolder>) local;
      }
      return (Provider<CompositorViewHolder>) local;
    }

    private CustomTabBrowserControlsVisibilityDelegate
        getCustomTabBrowserControlsVisibilityDelegate() {
      Object local = customTabBrowserControlsVisibilityDelegate;
      if (local instanceof MemoizedSentinel) {
        synchronized (local) {
          local = customTabBrowserControlsVisibilityDelegate;
          if (local instanceof MemoizedSentinel) {
            local =
                new CustomTabBrowserControlsVisibilityDelegate(
                    DoubleCheck.lazy(getChromeFullscreenManagerProvider()),
                    ChromeActivityCommonsModule_ProvideActivityTabProviderFactory
                        .proxyProvideActivityTabProvider(chromeActivityCommonsModule));
            customTabBrowserControlsVisibilityDelegate =
                DoubleCheck.reentrantCheck(customTabBrowserControlsVisibilityDelegate, local);
          }
        }
      }
      return (CustomTabBrowserControlsVisibilityDelegate) local;
    }

    private ExternalIntentsPolicyProvider getExternalIntentsPolicyProvider() {
      Object local = externalIntentsPolicyProvider;
      if (local instanceof MemoizedSentinel) {
        synchronized (local) {
          local = externalIntentsPolicyProvider;
          if (local instanceof MemoizedSentinel) {
            local = ExternalIntentsPolicyProvider_Factory.newExternalIntentsPolicyProvider();
            externalIntentsPolicyProvider =
                DoubleCheck.reentrantCheck(externalIntentsPolicyProvider, local);
          }
        }
      }
      return (ExternalIntentsPolicyProvider) local;
    }

    private CloseButtonVisibilityManager getCloseButtonVisibilityManager() {
      Object local = closeButtonVisibilityManager;
      if (local instanceof MemoizedSentinel) {
        synchronized (local) {
          local = closeButtonVisibilityManager;
          if (local instanceof MemoizedSentinel) {
            local =
                new CloseButtonVisibilityManager(
                    WebappActivityModule_ProvideIntentDataProviderFactory
                        .proxyProvideIntentDataProvider(webappActivityModule));
            closeButtonVisibilityManager =
                DoubleCheck.reentrantCheck(closeButtonVisibilityManager, local);
          }
        }
      }
      return (CloseButtonVisibilityManager) local;
    }

    private WebContentsFactory getWebContentsFactory() {
      Object local = webContentsFactory;
      if (local == null) {
        local = new WebContentsFactory();
        webContentsFactory = (WebContentsFactory) local;
      }
      return (WebContentsFactory) local;
    }

    @SuppressWarnings("unchecked")
    private void initialize(
        final ChromeActivityCommonsModule module, final WebappActivityModule webappActivityModule) {
      this.webappActivityModule = Preconditions.checkNotNull(webappActivityModule);
      this.chromeActivityCommonsModule = Preconditions.checkNotNull(module);
    }

    @Override
    public ChromeAppComponent getParent() {
      return DaggerChromeAppComponent.this;
    }

    @Override
    public CustomTabActivityNavigationController resolveNavigationController() {
      Object local = customTabActivityNavigationController;
      if (local instanceof MemoizedSentinel) {
        synchronized (local) {
          local = customTabActivityNavigationController;
          if (local instanceof MemoizedSentinel) {
            local =
                new CustomTabActivityNavigationController(
                    getBrowserServicesActivityTabController(),
                    resolveTabProvider(),
                    WebappActivityModule_ProvideIntentDataProviderFactory
                        .proxyProvideIntentDataProvider(webappActivityModule),
                    AppHooksModule_ProvideCustomTabsConnectionFactory
                        .proxyProvideCustomTabsConnection(),
                    DoubleCheck.lazy(getCustomTabObserverProvider()),
                    getCloseButtonNavigator(),
                    ChromeAppModule_ProvideChromeBrowserInitializerFactory
                        .proxyProvideChromeBrowserInitializer(
                            DaggerChromeAppComponent.this.chromeAppModule),
                    ChromeActivityCommonsModule_ProvideChromeActivityFactory
                        .proxyProvideChromeActivity(chromeActivityCommonsModule),
                    ChromeActivityCommonsModule_ProvideLifecycleDispatcherFactory
                        .proxyProvideLifecycleDispatcher(chromeActivityCommonsModule),
                    DoubleCheck.lazy(getChromeFullscreenManagerProvider()));
            customTabActivityNavigationController =
                DoubleCheck.reentrantCheck(customTabActivityNavigationController, local);
          }
        }
      }
      return (CustomTabActivityNavigationController) local;
    }

    @Override
    public CustomTabActivityTabFactory resolveTabFactory() {
      Object local = customTabActivityTabFactory;
      if (local instanceof MemoizedSentinel) {
        synchronized (local) {
          local = customTabActivityTabFactory;
          if (local instanceof MemoizedSentinel) {
            local =
                new CustomTabActivityTabFactory(
                    ChromeActivityCommonsModule_ProvideChromeActivityFactory
                        .proxyProvideChromeActivity(chromeActivityCommonsModule),
                    getCustomTabTabPersistencePolicy(),
                    DoubleCheck.lazy(getActivityWindowAndroidProvider()),
                    DoubleCheck.lazy(getCustomTabDelegateFactoryProvider()),
                    WebappActivityModule_ProvideIntentDataProviderFactory
                        .proxyProvideIntentDataProvider(webappActivityModule),
                    webappActivityModule.provideStartupTabPreloader());
            customTabActivityTabFactory =
                DoubleCheck.reentrantCheck(customTabActivityTabFactory, local);
          }
        }
      }
      return (CustomTabActivityTabFactory) local;
    }

    @Override
    public CustomTabActivityTabProvider resolveTabProvider() {
      Object local = customTabActivityTabProvider;
      if (local instanceof MemoizedSentinel) {
        synchronized (local) {
          local = customTabActivityTabProvider;
          if (local instanceof MemoizedSentinel) {
            local = CustomTabActivityTabProvider_Factory.newCustomTabActivityTabProvider();
            customTabActivityTabProvider =
                DoubleCheck.reentrantCheck(customTabActivityTabProvider, local);
          }
        }
      }
      return (CustomTabActivityTabProvider) local;
    }

    @Override
    public CustomTabCompositorContentInitializer resolveCompositorContentInitializer() {
      Object local = customTabCompositorContentInitializer;
      if (local instanceof MemoizedSentinel) {
        synchronized (local) {
          local = customTabCompositorContentInitializer;
          if (local instanceof MemoizedSentinel) {
            local =
                new CustomTabCompositorContentInitializer(
                    ChromeActivityCommonsModule_ProvideLifecycleDispatcherFactory
                        .proxyProvideLifecycleDispatcher(chromeActivityCommonsModule),
                    ChromeActivityCommonsModule_ProvideChromeActivityFactory
                        .proxyProvideChromeActivity(chromeActivityCommonsModule),
                    DoubleCheck.lazy(getCompositorViewHolderProvider()));
            customTabCompositorContentInitializer =
                DoubleCheck.reentrantCheck(customTabCompositorContentInitializer, local);
          }
        }
      }
      return (CustomTabCompositorContentInitializer) local;
    }

    @Override
    public CustomTabDelegateFactory resolveTabDelegateFactory() {
      Object local = customTabDelegateFactory;
      if (local instanceof MemoizedSentinel) {
        synchronized (local) {
          local = customTabDelegateFactory;
          if (local instanceof MemoizedSentinel) {
            local =
                new CustomTabDelegateFactory(
                    ChromeActivityCommonsModule_ProvideChromeActivityFactory
                        .proxyProvideChromeActivity(chromeActivityCommonsModule),
                    WebappActivityModule_ProvideIntentDataProviderFactory
                        .proxyProvideIntentDataProvider(webappActivityModule),
                    getCustomTabBrowserControlsVisibilityDelegate(),
                    AppHooksModule_ProvideExternalAuthUtilsFactory.proxyProvideExternalAuthUtils(
                        DaggerChromeAppComponent.this.appHooksModule),
                    AppHooksModule_ProvideMultiWindowUtilsFactory.proxyProvideMultiWindowUtils(
                        DaggerChromeAppComponent.this.appHooksModule),
                    getExternalIntentsPolicyProvider());
            customTabDelegateFactory = DoubleCheck.reentrantCheck(customTabDelegateFactory, local);
          }
        }
      }
      return (CustomTabDelegateFactory) local;
    }

    @Override
    public CustomTabStatusBarColorProvider resolveCustomTabStatusBarColorProvider() {
      Object local = customTabStatusBarColorProvider;
      if (local instanceof MemoizedSentinel) {
        synchronized (local) {
          local = customTabStatusBarColorProvider;
          if (local instanceof MemoizedSentinel) {
            local =
                new CustomTabStatusBarColorProvider(
                    WebappActivityModule_ProvideIntentDataProviderFactory
                        .proxyProvideIntentDataProvider(webappActivityModule),
                    ChromeActivityCommonsModule_ProvideStatusBarColorControllerFactory
                        .proxyProvideStatusBarColorController(chromeActivityCommonsModule));
            customTabStatusBarColorProvider =
                DoubleCheck.reentrantCheck(customTabStatusBarColorProvider, local);
          }
        }
      }
      return (CustomTabStatusBarColorProvider) local;
    }

    @Override
    public CustomTabToolbarColorController resolveToolbarColorController() {
      Object local = customTabToolbarColorController;
      if (local instanceof MemoizedSentinel) {
        synchronized (local) {
          local = customTabToolbarColorController;
          if (local instanceof MemoizedSentinel) {
            local =
                new CustomTabToolbarColorController(
                    WebappActivityModule_ProvideIntentDataProviderFactory
                        .proxyProvideIntentDataProvider(webappActivityModule),
                    ChromeActivityCommonsModule_ProvideChromeActivityFactory
                        .proxyProvideChromeActivity(chromeActivityCommonsModule),
                    resolveTabProvider(),
                    resolveTabObserverRegistrar());
            customTabToolbarColorController =
                DoubleCheck.reentrantCheck(customTabToolbarColorController, local);
          }
        }
      }
      return (CustomTabToolbarColorController) local;
    }

    @Override
    public CustomTabTaskDescriptionHelper resolveTaskDescriptionHelper() {
      Object local = customTabTaskDescriptionHelper;
      if (local instanceof MemoizedSentinel) {
        synchronized (local) {
          local = customTabTaskDescriptionHelper;
          if (local instanceof MemoizedSentinel) {
            local =
                new CustomTabTaskDescriptionHelper(
                    ChromeActivityCommonsModule_ProvideChromeActivityFactory
                        .proxyProvideChromeActivity(chromeActivityCommonsModule),
                    resolveTabProvider(),
                    resolveTabObserverRegistrar(),
                    WebappActivityModule_ProvideIntentDataProviderFactory
                        .proxyProvideIntentDataProvider(webappActivityModule),
                    ChromeActivityCommonsModule_ProvideLifecycleDispatcherFactory
                        .proxyProvideLifecycleDispatcher(chromeActivityCommonsModule));
            customTabTaskDescriptionHelper =
                DoubleCheck.reentrantCheck(customTabTaskDescriptionHelper, local);
          }
        }
      }
      return (CustomTabTaskDescriptionHelper) local;
    }

    @Override
    public CustomTabToolbarCoordinator resolveToolbarCoordinator() {
      Object local = customTabToolbarCoordinator;
      if (local instanceof MemoizedSentinel) {
        synchronized (local) {
          local = customTabToolbarCoordinator;
          if (local instanceof MemoizedSentinel) {
            local =
                new CustomTabToolbarCoordinator(
                    WebappActivityModule_ProvideIntentDataProviderFactory
                        .proxyProvideIntentDataProvider(webappActivityModule),
                    webappActivityModule.provideCustomTabUmaRecorder(),
                    resolveTabProvider(),
                    AppHooksModule_ProvideCustomTabsConnectionFactory
                        .proxyProvideCustomTabsConnection(),
                    ChromeActivityCommonsModule_ProvideChromeActivityFactory
                        .proxyProvideChromeActivity(chromeActivityCommonsModule),
                    ChromeAppModule_ProvideContextFactory.proxyProvideContext(
                        DaggerChromeAppComponent.this.chromeAppModule),
                    getBrowserServicesActivityTabController(),
                    DoubleCheck.lazy(getChromeFullscreenManagerProvider()),
                    resolveNavigationController(),
                    getCloseButtonVisibilityManager(),
                    getCustomTabBrowserControlsVisibilityDelegate(),
                    resolveCompositorContentInitializer(),
                    resolveToolbarColorController());
            customTabToolbarCoordinator =
                DoubleCheck.reentrantCheck(customTabToolbarCoordinator, local);
          }
        }
      }
      return (CustomTabToolbarCoordinator) local;
    }

    @Override
    public SplashController resolveSplashController() {
      return new SplashController(
          ChromeActivityCommonsModule_ProvideActivityFactory.proxyProvideActivity(
              chromeActivityCommonsModule),
          ChromeActivityCommonsModule_ProvideLifecycleDispatcherFactory
              .proxyProvideLifecycleDispatcher(chromeActivityCommonsModule),
          resolveTabObserverRegistrar(),
          resolveTwaFinishHandler());
    }

    @Override
    public TabObserverRegistrar resolveTabObserverRegistrar() {
      Object local = tabObserverRegistrar;
      if (local instanceof MemoizedSentinel) {
        synchronized (local) {
          local = tabObserverRegistrar;
          if (local instanceof MemoizedSentinel) {
            local =
                new TabObserverRegistrar(
                    ChromeActivityCommonsModule_ProvideLifecycleDispatcherFactory
                        .proxyProvideLifecycleDispatcher(chromeActivityCommonsModule),
                    resolveTabProvider());
            tabObserverRegistrar = DoubleCheck.reentrantCheck(tabObserverRegistrar, local);
          }
        }
      }
      return (TabObserverRegistrar) local;
    }

    @Override
    public TwaFinishHandler resolveTwaFinishHandler() {
      Object local = twaFinishHandler;
      if (local instanceof MemoizedSentinel) {
        synchronized (local) {
          local = twaFinishHandler;
          if (local instanceof MemoizedSentinel) {
            local =
                new TwaFinishHandler(
                    ChromeActivityCommonsModule_ProvideChromeActivityFactory
                        .proxyProvideChromeActivity(chromeActivityCommonsModule),
                    WebappActivityModule_ProvideIntentDataProviderFactory
                        .proxyProvideIntentDataProvider(webappActivityModule),
                    AppHooksModule_ProvideCustomTabsConnectionFactory
                        .proxyProvideCustomTabsConnection());
            twaFinishHandler = DoubleCheck.reentrantCheck(twaFinishHandler, local);
          }
        }
      }
      return (TwaFinishHandler) local;
    }

    @Override
    public TrustedWebActivityBrowserControlsVisibilityManager
        resolveBrowserControlsVisibilityManager() {
      Object local = trustedWebActivityBrowserControlsVisibilityManager;
      if (local instanceof MemoizedSentinel) {
        synchronized (local) {
          local = trustedWebActivityBrowserControlsVisibilityManager;
          if (local instanceof MemoizedSentinel) {
            local =
                new TrustedWebActivityBrowserControlsVisibilityManager(
                    resolveTabObserverRegistrar(),
                    resolveTabProvider(),
                    resolveToolbarCoordinator(),
                    getCloseButtonVisibilityManager(),
                    WebappActivityModule_ProvideIntentDataProviderFactory
                        .proxyProvideIntentDataProvider(webappActivityModule));
            trustedWebActivityBrowserControlsVisibilityManager =
                DoubleCheck.reentrantCheck(
                    trustedWebActivityBrowserControlsVisibilityManager, local);
          }
        }
      }
      return (TrustedWebActivityBrowserControlsVisibilityManager) local;
    }

    @Override
    public WebappActivityTabController resolveTabController() {
      Object local = webappActivityTabController;
      if (local instanceof MemoizedSentinel) {
        synchronized (local) {
          local = webappActivityTabController;
          if (local instanceof MemoizedSentinel) {
            local =
                new WebappActivityTabController(
                    ChromeActivityCommonsModule_ProvideChromeActivityFactory
                        .proxyProvideChromeActivity(chromeActivityCommonsModule),
                    DoubleCheck.lazy(getCustomTabDelegateFactoryProvider()),
                    ChromeActivityCommonsModule_ProvideActivityTabProviderFactory
                        .proxyProvideActivityTabProvider(chromeActivityCommonsModule),
                    resolveTabObserverRegistrar(),
                    getCustomTabTabPersistencePolicy(),
                    resolveTabFactory(),
                    getWebContentsFactory(),
                    resolveTabProvider());
            webappActivityTabController =
                DoubleCheck.reentrantCheck(webappActivityTabController, local);
          }
        }
      }
      return (WebappActivityTabController) local;
    }

    @Override
    public WebApkUpdateManager resolveWebApkUpdateManager() {
      Object local = webApkUpdateManager;
      if (local instanceof MemoizedSentinel) {
        synchronized (local) {
          local = webApkUpdateManager;
          if (local instanceof MemoizedSentinel) {
            local =
                new WebApkUpdateManager(
                    ChromeActivityCommonsModule_ProvideChromeActivityFactory
                        .proxyProvideChromeActivity(chromeActivityCommonsModule),
                    ChromeActivityCommonsModule_ProvideLifecycleDispatcherFactory
                        .proxyProvideLifecycleDispatcher(chromeActivityCommonsModule));
            webApkUpdateManager = DoubleCheck.reentrantCheck(webApkUpdateManager, local);
          }
        }
      }
      return (WebApkUpdateManager) local;
    }

    private final class SwitchingProvider<T> implements Provider<T> {
      private final int id;

      SwitchingProvider(int id) {
        this.id = id;
      }

      @SuppressWarnings("unchecked")
      @Override
      public T get() {
        switch (id) {
          case 0: // org.chromium.chrome.browser.customtabs.CustomTabObserver
            return (T) getCustomTabObserver();

          case 1: // org.chromium.chrome.browser.fullscreen.ChromeFullscreenManager
            return (T)
                ChromeActivityCommonsModule_ProvideChromeFullscreenManagerFactory
                    .proxyProvideChromeFullscreenManager(chromeActivityCommonsModule);

          case 2: // org.chromium.ui.base.ActivityWindowAndroid
            return (T)
                ChromeActivityCommonsModule_ProvideActivityWindowAndroidFactory
                    .proxyProvideActivityWindowAndroid(chromeActivityCommonsModule);

          case 3: // org.chromium.chrome.browser.customtabs.CustomTabDelegateFactory
            return (T) resolveTabDelegateFactory();

          case 4: // org.chromium.chrome.browser.compositor.CompositorViewHolder
            return (T)
                ChromeActivityCommonsModule_ProvideCompositorViewHolderFactory
                    .proxyProvideCompositorViewHolder(chromeActivityCommonsModule);
          default:
            throw new AssertionError(id);
        }
      }
    }
  }

  private final class SwitchingProvider<T> implements Provider<T> {
    private final int id;

    SwitchingProvider(int id) {
      this.id = id;
    }

    @SuppressWarnings("unchecked")
    @Override
    public T get() {
      switch (id) {
        case 0: // org.chromium.chrome.browser.preferences.SharedPreferencesManager
          return (T)
              ChromeAppModule_ProvidesSharedPreferencesManagerFactory
                  .proxyProvidesSharedPreferencesManager(chromeAppModule);

        case 1: // org.chromium.chrome.browser.browserservices.permissiondelegation.NotificationChannelPreserver
          return (T) getNotificationChannelPreserver();

        case 2: // org.chromium.chrome.browser.browserservices.trustedwebactivityui.splashscreen.SplashImageHolder
          return (T) getSplashImageHolder();

        case 3: // org.chromium.chrome.browser.customtabs.CustomTabsConnection
          return (T)
              AppHooksModule_ProvideCustomTabsConnectionFactory.proxyProvideCustomTabsConnection();
        default:
          throw new AssertionError(id);
      }
    }
  }
}
