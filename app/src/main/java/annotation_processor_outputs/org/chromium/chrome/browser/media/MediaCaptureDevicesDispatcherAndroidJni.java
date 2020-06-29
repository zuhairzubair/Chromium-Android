package org.chromium.chrome.browser.media;

import J.N;
import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.content_public.browser.WebContents;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class MediaCaptureDevicesDispatcherAndroidJni implements MediaCaptureDevicesDispatcherAndroid.Natives {
  private static MediaCaptureDevicesDispatcherAndroid.Natives testInstance;

  public static final JniStaticTestMocker<MediaCaptureDevicesDispatcherAndroid.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.media.MediaCaptureDevicesDispatcherAndroid.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.media.MediaCaptureDevicesDispatcherAndroid.Natives instance) {
      if (!J.N.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public boolean isCapturingAudio(WebContents webContents) {
    return (boolean)N.MybJWOXK(webContents);
  }

  @Override
  public boolean isCapturingVideo(WebContents webContents) {
    return (boolean)N.MKIWbnaU(webContents);
  }

  @Override
  public boolean isCapturingScreen(WebContents webContents) {
    return (boolean)N.MDk3$bjp(webContents);
  }

  @Override
  public void notifyStopped(WebContents webContents) {
    N.M3xnlzVW(webContents);
  }

  public static MediaCaptureDevicesDispatcherAndroid.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.media.MediaCaptureDevicesDispatcherAndroid.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new MediaCaptureDevicesDispatcherAndroidJni();
  }
}
