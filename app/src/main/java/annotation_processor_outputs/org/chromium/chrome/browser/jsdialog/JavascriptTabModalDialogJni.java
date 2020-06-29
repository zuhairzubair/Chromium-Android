package org.chromium.chrome.browser.jsdialog;

import J.N;
import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class JavascriptTabModalDialogJni implements JavascriptTabModalDialog.Natives {
  private static JavascriptTabModalDialog.Natives testInstance;

  public static final JniStaticTestMocker<JavascriptTabModalDialog.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.jsdialog.JavascriptTabModalDialog.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.jsdialog.JavascriptTabModalDialog.Natives instance) {
      if (!J.N.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void accept(long nativeJavaScriptDialogAndroid, JavascriptTabModalDialog caller,
      String prompt) {
    N.MboTlmne(nativeJavaScriptDialogAndroid, caller, prompt);
  }

  @Override
  public void cancel(long nativeJavaScriptDialogAndroid, JavascriptTabModalDialog caller,
      boolean buttonClicked) {
    N.M79Biztn(nativeJavaScriptDialogAndroid, caller, buttonClicked);
  }

  public static JavascriptTabModalDialog.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.jsdialog.JavascriptTabModalDialog.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new JavascriptTabModalDialogJni();
  }
}
