package org.chromium.chrome.browser.settings.privacy;

import J.N;
import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
public final class PrivacyPreferencesManagerJni implements PrivacyPreferencesManager.Natives {
  private static PrivacyPreferencesManager.Natives testInstance;

  public static final JniStaticTestMocker<PrivacyPreferencesManager.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.settings.privacy.PrivacyPreferencesManager.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.settings.privacy.PrivacyPreferencesManager.Natives instance) {
      if (!J.N.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public boolean canPrefetchAndPrerender() {
    return (boolean)N.MqhSOvsM();
  }

  @Override
  public boolean getNetworkPredictionManaged() {
    return (boolean)N.Mco67fkp();
  }

  @Override
  public boolean obsoleteNetworkPredictionOptionsHasUserSetting() {
    return (boolean)N.MNgxeJr6();
  }

  @Override
  public boolean getNetworkPredictionEnabled() {
    return (boolean)N.MWPZlgLZ();
  }

  @Override
  public void setNetworkPredictionEnabled(boolean enabled) {
    N.MYmjEeet(enabled);
  }

  @Override
  public boolean isMetricsReportingEnabled() {
    return (boolean)N.McRq5uT0();
  }

  @Override
  public void setMetricsReportingEnabled(boolean enabled) {
    N.MX0OGzqs(enabled);
  }

  @Override
  public boolean isMetricsReportingManaged() {
    return (boolean)N.MJZou7Yy();
  }

  public static PrivacyPreferencesManager.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.settings.privacy.PrivacyPreferencesManager.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new PrivacyPreferencesManagerJni();
  }
}
