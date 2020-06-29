package org.chromium.chrome.browser.settings.password;

import J.N;
import android.content.Context;
import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.Callback;
import org.chromium.base.IntStringCallback;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class PasswordUIViewJni implements PasswordUIView.Natives {
  private static PasswordUIView.Natives testInstance;

  public static final JniStaticTestMocker<PasswordUIView.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.settings.password.PasswordUIView.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.settings.password.PasswordUIView.Natives instance) {
      if (!J.N.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public long init(PasswordUIView caller) {
    return (long)N.MPy98VzA(caller);
  }

  @Override
  public void updatePasswordLists(long nativePasswordUIViewAndroid, PasswordUIView caller) {
    N.MFwb$l5I(nativePasswordUIViewAndroid, caller);
  }

  @Override
  public SavedPasswordEntry getSavedPasswordEntry(long nativePasswordUIViewAndroid,
      PasswordUIView caller, int index) {
    return (SavedPasswordEntry)N.MkpaSRql(nativePasswordUIViewAndroid, caller, index);
  }

  @Override
  public String getSavedPasswordException(long nativePasswordUIViewAndroid, PasswordUIView caller,
      int index) {
    return (String)N.MFoc4PD_(nativePasswordUIViewAndroid, caller, index);
  }

  @Override
  public void handleRemoveSavedPasswordEntry(long nativePasswordUIViewAndroid,
      PasswordUIView caller, int index) {
    N.MsDhhiSY(nativePasswordUIViewAndroid, caller, index);
  }

  @Override
  public void handleRemoveSavedPasswordException(long nativePasswordUIViewAndroid,
      PasswordUIView caller, int index) {
    N.Mzy4Be54(nativePasswordUIViewAndroid, caller, index);
  }

  @Override
  public String getAccountDashboardURL() {
    return (String)N.MeZ_2Xbh();
  }

  @Override
  public boolean hasAccountForLeakCheckRequest() {
    return (boolean)N.MuIjGnbS();
  }

  @Override
  public void destroy(long nativePasswordUIViewAndroid, PasswordUIView caller) {
    N.MwbMQ4bX(nativePasswordUIViewAndroid, caller);
  }

  @Override
  public void handleSerializePasswords(long nativePasswordUIViewAndroid, PasswordUIView caller,
      String targetPath, IntStringCallback successCallback, Callback<String> errorCallback) {
    N.M8dBBMZT(nativePasswordUIViewAndroid, caller, targetPath, successCallback, errorCallback);
  }

  @Override
  public void handleShowPasswordEntryEditingView(long nativePasswordUIViewAndroid,
      PasswordUIView caller, Context context, int index) {
    N.MXIaOrCc(nativePasswordUIViewAndroid, caller, context, index);
  }

  public static PasswordUIView.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.settings.password.PasswordUIView.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new PasswordUIViewJni();
  }
}
