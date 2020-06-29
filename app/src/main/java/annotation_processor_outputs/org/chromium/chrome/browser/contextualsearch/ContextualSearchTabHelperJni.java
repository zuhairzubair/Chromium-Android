package org.chromium.chrome.browser.contextualsearch;

import J.N;
import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.content_public.browser.WebContents;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class ContextualSearchTabHelperJni implements ContextualSearchTabHelper.Natives {
  private static ContextualSearchTabHelper.Natives testInstance;

  public static final JniStaticTestMocker<ContextualSearchTabHelper.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.contextualsearch.ContextualSearchTabHelper.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.contextualsearch.ContextualSearchTabHelper.Natives instance) {
      if (!J.N.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public long init(ContextualSearchTabHelper caller, Profile profile) {
    return (long)N.MjIbQ3pN(caller, profile);
  }

  @Override
  public void installUnhandledTapNotifierIfNeeded(long nativeContextualSearchTabHelper,
      ContextualSearchTabHelper caller, WebContents webContents, float pxToDpScaleFactor) {
    N.MGn2PSB6(nativeContextualSearchTabHelper, caller, webContents, pxToDpScaleFactor);
  }

  @Override
  public void destroy(long nativeContextualSearchTabHelper, ContextualSearchTabHelper caller) {
    N.M4Z1OGVX(nativeContextualSearchTabHelper, caller);
  }

  public static ContextualSearchTabHelper.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.contextualsearch.ContextualSearchTabHelper.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new ContextualSearchTabHelperJni();
  }
}
