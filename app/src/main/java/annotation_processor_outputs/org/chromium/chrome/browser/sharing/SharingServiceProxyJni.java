package org.chromium.chrome.browser.sharing;

import J.N;
import java.lang.Integer;
import java.lang.Override;
import java.lang.Runnable;
import java.lang.String;
import java.util.ArrayList;
import javax.annotation.Generated;
import org.chromium.base.Callback;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.chrome.browser.profiles.Profile;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class SharingServiceProxyJni implements SharingServiceProxy.Natives {
  private static SharingServiceProxy.Natives testInstance;

  public static final JniStaticTestMocker<SharingServiceProxy.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.sharing.SharingServiceProxy.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.sharing.SharingServiceProxy.Natives instance) {
      if (!J.N.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void initSharingService(Profile profile) {
    N.MI$va2Pq(profile);
  }

  @Override
  public void sendSharedClipboardMessage(long nativeSharingServiceProxyAndroid, String guid,
      String text, int retries, Callback<Integer> callback) {
    N.ML9GlI7W(nativeSharingServiceProxyAndroid, guid, text, retries, callback);
  }

  @Override
  public void getDeviceCandidates(long nativeSharingServiceProxyAndroid,
      ArrayList<SharingServiceProxy.DeviceInfo> deviceInfo, int requiredFeature) {
    N.MScf15Ou(nativeSharingServiceProxyAndroid, deviceInfo, requiredFeature);
  }

  @Override
  public void addDeviceCandidatesInitializedObserver(long nativeSharingServiceProxyAndroid,
      Runnable runnable) {
    N.MBEvP57R(nativeSharingServiceProxyAndroid, runnable);
  }

  public static SharingServiceProxy.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.sharing.SharingServiceProxy.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new SharingServiceProxyJni();
  }
}
