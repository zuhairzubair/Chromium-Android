package org.chromium.chrome.browser.payments;

import J.N;
import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.content_public.browser.WebContents;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class JourneyLoggerJni implements JourneyLogger.Natives {
  private static JourneyLogger.Natives testInstance;

  public static final JniStaticTestMocker<JourneyLogger.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.payments.JourneyLogger.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.payments.JourneyLogger.Natives instance) {
      if (!J.N.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public long initJourneyLoggerAndroid(JourneyLogger caller, boolean isIncognito,
      WebContents webContents) {
    return (long)N.MUPGOxnM(caller, isIncognito, webContents);
  }

  @Override
  public void destroy(long nativeJourneyLoggerAndroid, JourneyLogger caller) {
    N.MbEI4XUl(nativeJourneyLoggerAndroid, caller);
  }

  @Override
  public void setNumberOfSuggestionsShown(long nativeJourneyLoggerAndroid, JourneyLogger caller,
      int section, int number, boolean hasCompleteSuggestion) {
    N.M2ZMNVEU(nativeJourneyLoggerAndroid, caller, section, number, hasCompleteSuggestion);
  }

  @Override
  public void incrementSelectionChanges(long nativeJourneyLoggerAndroid, JourneyLogger caller,
      int section) {
    N.Minh94DW(nativeJourneyLoggerAndroid, caller, section);
  }

  @Override
  public void incrementSelectionEdits(long nativeJourneyLoggerAndroid, JourneyLogger caller,
      int section) {
    N.MEEUAdzR(nativeJourneyLoggerAndroid, caller, section);
  }

  @Override
  public void incrementSelectionAdds(long nativeJourneyLoggerAndroid, JourneyLogger caller,
      int section) {
    N.Ms$nM9AY(nativeJourneyLoggerAndroid, caller, section);
  }

  @Override
  public void setCanMakePaymentValue(long nativeJourneyLoggerAndroid, JourneyLogger caller,
      boolean value) {
    N.MSk8HwD4(nativeJourneyLoggerAndroid, caller, value);
  }

  @Override
  public void setHasEnrolledInstrumentValue(long nativeJourneyLoggerAndroid, JourneyLogger caller,
      boolean value) {
    N.MC8IFKnD(nativeJourneyLoggerAndroid, caller, value);
  }

  @Override
  public void setEventOccurred(long nativeJourneyLoggerAndroid, JourneyLogger caller, int event) {
    N.M6oiJryG(nativeJourneyLoggerAndroid, caller, event);
  }

  @Override
  public void setRequestedInformation(long nativeJourneyLoggerAndroid, JourneyLogger caller,
      boolean requestShipping, boolean requestEmail, boolean requestPhone, boolean requestName) {
    N.MelRlGGS(nativeJourneyLoggerAndroid, caller, requestShipping, requestEmail, requestPhone, requestName);
  }

  @Override
  public void setRequestedPaymentMethodTypes(long nativeJourneyLoggerAndroid, JourneyLogger caller,
      boolean requestedBasicCard, boolean requestedMethodGoogle, boolean requestedMethodOther) {
    N.McG0ZzXh(nativeJourneyLoggerAndroid, caller, requestedBasicCard, requestedMethodGoogle, requestedMethodOther);
  }

  @Override
  public void setCompleted(long nativeJourneyLoggerAndroid, JourneyLogger caller) {
    N.MYXbS3Jf(nativeJourneyLoggerAndroid, caller);
  }

  @Override
  public void setAborted(long nativeJourneyLoggerAndroid, JourneyLogger caller, int reason) {
    N.MMkYOH60(nativeJourneyLoggerAndroid, caller, reason);
  }

  @Override
  public void setNotShown(long nativeJourneyLoggerAndroid, JourneyLogger caller, int reason) {
    N.M8JUcVwx(nativeJourneyLoggerAndroid, caller, reason);
  }

  @Override
  public void recordTransactionAmount(long nativeJourneyLoggerAndroid, JourneyLogger caller,
      String currency, String value, boolean completed) {
    N.MFGtTYYQ(nativeJourneyLoggerAndroid, caller, currency, value, completed);
  }

  @Override
  public void setTriggerTime(long nativeJourneyLoggerAndroid, JourneyLogger caller) {
    N.MxIWaF2G(nativeJourneyLoggerAndroid, caller);
  }

  public static JourneyLogger.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.payments.JourneyLogger.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new JourneyLoggerJni();
  }
}
