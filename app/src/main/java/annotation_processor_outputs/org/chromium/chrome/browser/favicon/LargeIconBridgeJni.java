package org.chromium.chrome.browser.favicon;

import J.N;
import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.chrome.browser.profiles.Profile;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class LargeIconBridgeJni implements LargeIconBridge.Natives {
  private static LargeIconBridge.Natives testInstance;

  public static final JniStaticTestMocker<LargeIconBridge.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.favicon.LargeIconBridge.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.favicon.LargeIconBridge.Natives instance) {
      if (!J.N.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public long init() {
    return (long)N.MbuUwjTx();
  }

  @Override
  public void destroy(long nativeLargeIconBridge) {
    N.MJaut_pX(nativeLargeIconBridge);
  }

  @Override
  public boolean getLargeIconForURL(long nativeLargeIconBridge, Profile profile, String pageUrl,
      int desiredSizePx, LargeIconBridge.LargeIconCallback callback) {
    return (boolean)N.MHtQtq_n(nativeLargeIconBridge, profile, pageUrl, desiredSizePx, callback);
  }

  public static LargeIconBridge.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.favicon.LargeIconBridge.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new LargeIconBridgeJni();
  }
}
