package org.chromium.chrome.browser.send_tab_to_self;

import J.N;
import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.chrome.browser.profiles.Profile;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class SendTabToSelfModelObserverBridgeJni implements SendTabToSelfModelObserverBridge.Natives {
  private static SendTabToSelfModelObserverBridge.Natives testInstance;

  public static final JniStaticTestMocker<SendTabToSelfModelObserverBridge.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.send_tab_to_self.SendTabToSelfModelObserverBridge.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.send_tab_to_self.SendTabToSelfModelObserverBridge.Natives instance) {
      if (!J.N.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public long init(SendTabToSelfModelObserverBridge bridge, Profile profile) {
    return (long)N.Ml35vDpA(bridge, profile);
  }

  @Override
  public void destroy(long nativeSendTabToSelfModelObserverBridge) {
    N.MxsOoJES(nativeSendTabToSelfModelObserverBridge);
  }

  public static SendTabToSelfModelObserverBridge.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.send_tab_to_self.SendTabToSelfModelObserverBridge.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new SendTabToSelfModelObserverBridgeJni();
  }
}
