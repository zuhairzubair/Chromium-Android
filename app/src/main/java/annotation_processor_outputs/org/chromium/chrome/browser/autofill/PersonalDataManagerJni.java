package org.chromium.chrome.browser.autofill;

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
final class PersonalDataManagerJni implements PersonalDataManager.Natives {
  private static PersonalDataManager.Natives testInstance;

  public static final JniStaticTestMocker<PersonalDataManager.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.autofill.PersonalDataManager.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.autofill.PersonalDataManager.Natives instance) {
      if (!J.N.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public long init(PersonalDataManager caller) {
    return (long)N.MQw_0Q1A(caller);
  }

  @Override
  public boolean isDataLoaded(long nativePersonalDataManagerAndroid, PersonalDataManager caller) {
    return (boolean)N.Melg71WL(nativePersonalDataManagerAndroid, caller);
  }

  @Override
  public String[] getProfileGUIDsForSettings(long nativePersonalDataManagerAndroid,
      PersonalDataManager caller) {
    return (String[])N.M4q3jK16(nativePersonalDataManagerAndroid, caller);
  }

  @Override
  public String[] getProfileGUIDsToSuggest(long nativePersonalDataManagerAndroid,
      PersonalDataManager caller) {
    return (String[])N.M2$wnjuR(nativePersonalDataManagerAndroid, caller);
  }

  @Override
  public String[] getProfileLabelsForSettings(long nativePersonalDataManagerAndroid,
      PersonalDataManager caller) {
    return (String[])N.M6XJvXko(nativePersonalDataManagerAndroid, caller);
  }

  @Override
  public String[] getProfileLabelsToSuggest(long nativePersonalDataManagerAndroid,
      PersonalDataManager caller, boolean includeNameInLabel, boolean includeOrganizationInLabel,
      boolean includeCountryInLabel) {
    return (String[])N.MfY8Rzvb(nativePersonalDataManagerAndroid, caller, includeNameInLabel, includeOrganizationInLabel, includeCountryInLabel);
  }

  @Override
  public PersonalDataManager.AutofillProfile getProfileByGUID(long nativePersonalDataManagerAndroid,
      PersonalDataManager caller, String guid) {
    return (PersonalDataManager.AutofillProfile)N.M172IO7Q(nativePersonalDataManagerAndroid, caller, guid);
  }

  @Override
  public String setProfile(long nativePersonalDataManagerAndroid, PersonalDataManager caller,
      PersonalDataManager.AutofillProfile profile) {
    return (String)N.MgzFcfQz(nativePersonalDataManagerAndroid, caller, profile);
  }

  @Override
  public String setProfileToLocal(long nativePersonalDataManagerAndroid, PersonalDataManager caller,
      PersonalDataManager.AutofillProfile profile) {
    return (String)N.McRRW$S3(nativePersonalDataManagerAndroid, caller, profile);
  }

  @Override
  public String getShippingAddressLabelWithCountryForPaymentRequest(
      long nativePersonalDataManagerAndroid, PersonalDataManager caller,
      PersonalDataManager.AutofillProfile profile) {
    return (String)N.MGJNOClH(nativePersonalDataManagerAndroid, caller, profile);
  }

  @Override
  public String getShippingAddressLabelWithoutCountryForPaymentRequest(
      long nativePersonalDataManagerAndroid, PersonalDataManager caller,
      PersonalDataManager.AutofillProfile profile) {
    return (String)N.MGlLlw0K(nativePersonalDataManagerAndroid, caller, profile);
  }

  @Override
  public String getBillingAddressLabelForPaymentRequest(long nativePersonalDataManagerAndroid,
      PersonalDataManager caller, PersonalDataManager.AutofillProfile profile) {
    return (String)N.My71lPBY(nativePersonalDataManagerAndroid, caller, profile);
  }

  @Override
  public String[] getCreditCardGUIDsForSettings(long nativePersonalDataManagerAndroid,
      PersonalDataManager caller) {
    return (String[])N.MQERVwyl(nativePersonalDataManagerAndroid, caller);
  }

  @Override
  public String[] getCreditCardGUIDsToSuggest(long nativePersonalDataManagerAndroid,
      PersonalDataManager caller, boolean includeServerCards) {
    return (String[])N.M00Q2SNr(nativePersonalDataManagerAndroid, caller, includeServerCards);
  }

  @Override
  public PersonalDataManager.CreditCard getCreditCardByGUID(long nativePersonalDataManagerAndroid,
      PersonalDataManager caller, String guid) {
    return (PersonalDataManager.CreditCard)N.M3g2doJx(nativePersonalDataManagerAndroid, caller, guid);
  }

  @Override
  public PersonalDataManager.CreditCard getCreditCardForNumber(
      long nativePersonalDataManagerAndroid, PersonalDataManager caller, String cardNumber) {
    return (PersonalDataManager.CreditCard)N.MHzz0BSK(nativePersonalDataManagerAndroid, caller, cardNumber);
  }

  @Override
  public String setCreditCard(long nativePersonalDataManagerAndroid, PersonalDataManager caller,
      PersonalDataManager.CreditCard card) {
    return (String)N.M7sdleUt(nativePersonalDataManagerAndroid, caller, card);
  }

  @Override
  public void updateServerCardBillingAddress(long nativePersonalDataManagerAndroid,
      PersonalDataManager caller, PersonalDataManager.CreditCard card) {
    N.MmUEbunT(nativePersonalDataManagerAndroid, caller, card);
  }

  @Override
  public String getBasicCardIssuerNetwork(long nativePersonalDataManagerAndroid,
      PersonalDataManager caller, String cardNumber, boolean emptyIfInvalid) {
    return (String)N.My_CbjBa(nativePersonalDataManagerAndroid, caller, cardNumber, emptyIfInvalid);
  }

  @Override
  public void addServerCreditCardForTest(long nativePersonalDataManagerAndroid,
      PersonalDataManager caller, PersonalDataManager.CreditCard card) {
    N.MOjDlXyN(nativePersonalDataManagerAndroid, caller, card);
  }

  @Override
  public void removeByGUID(long nativePersonalDataManagerAndroid, PersonalDataManager caller,
      String guid) {
    N.MIAwuIe5(nativePersonalDataManagerAndroid, caller, guid);
  }

  @Override
  public void recordAndLogProfileUse(long nativePersonalDataManagerAndroid,
      PersonalDataManager caller, String guid) {
    N.MT65YYp8(nativePersonalDataManagerAndroid, caller, guid);
  }

  @Override
  public void setProfileUseStatsForTesting(long nativePersonalDataManagerAndroid,
      PersonalDataManager caller, String guid, int count, long date) {
    N.MbT$88om(nativePersonalDataManagerAndroid, caller, guid, count, date);
  }

  @Override
  public int getProfileUseCountForTesting(long nativePersonalDataManagerAndroid,
      PersonalDataManager caller, String guid) {
    return (int)N.MPsh3Wtr(nativePersonalDataManagerAndroid, caller, guid);
  }

  @Override
  public long getProfileUseDateForTesting(long nativePersonalDataManagerAndroid,
      PersonalDataManager caller, String guid) {
    return (long)N.M$LxG5ps(nativePersonalDataManagerAndroid, caller, guid);
  }

  @Override
  public void recordAndLogCreditCardUse(long nativePersonalDataManagerAndroid,
      PersonalDataManager caller, String guid) {
    N.M4tBhXBK(nativePersonalDataManagerAndroid, caller, guid);
  }

  @Override
  public void setCreditCardUseStatsForTesting(long nativePersonalDataManagerAndroid,
      PersonalDataManager caller, String guid, int count, long date) {
    N.MSD7TTQX(nativePersonalDataManagerAndroid, caller, guid, count, date);
  }

  @Override
  public int getCreditCardUseCountForTesting(long nativePersonalDataManagerAndroid,
      PersonalDataManager caller, String guid) {
    return (int)N.ME9H80nX(nativePersonalDataManagerAndroid, caller, guid);
  }

  @Override
  public long getCreditCardUseDateForTesting(long nativePersonalDataManagerAndroid,
      PersonalDataManager caller, String guid) {
    return (long)N.Mvbj_PRk(nativePersonalDataManagerAndroid, caller, guid);
  }

  @Override
  public long getCurrentDateForTesting(long nativePersonalDataManagerAndroid,
      PersonalDataManager caller) {
    return (long)N.MbGlIVXT(nativePersonalDataManagerAndroid, caller);
  }

  @Override
  public void clearUnmaskedCache(long nativePersonalDataManagerAndroid, PersonalDataManager caller,
      String guid) {
    N.MSOj73VL(nativePersonalDataManagerAndroid, caller, guid);
  }

  @Override
  public void getFullCardForPaymentRequest(long nativePersonalDataManagerAndroid,
      PersonalDataManager caller, WebContents webContents, PersonalDataManager.CreditCard card,
      PersonalDataManager.FullCardRequestDelegate delegate) {
    N.M_6hrjIQ(nativePersonalDataManagerAndroid, caller, webContents, card, delegate);
  }

  @Override
  public void loadRulesForAddressNormalization(long nativePersonalDataManagerAndroid,
      PersonalDataManager caller, String regionCode) {
    N.Mj65Bkg_(nativePersonalDataManagerAndroid, caller, regionCode);
  }

  @Override
  public void loadRulesForSubKeys(long nativePersonalDataManagerAndroid, PersonalDataManager caller,
      String regionCode) {
    N.M4kIHYDl(nativePersonalDataManagerAndroid, caller, regionCode);
  }

  @Override
  public void startAddressNormalization(long nativePersonalDataManagerAndroid,
      PersonalDataManager caller, PersonalDataManager.AutofillProfile profile, int timeoutSeconds,
      PersonalDataManager.NormalizedAddressRequestDelegate delegate) {
    N.M7ysHTTC(nativePersonalDataManagerAndroid, caller, profile, timeoutSeconds, delegate);
  }

  @Override
  public void startRegionSubKeysRequest(long nativePersonalDataManagerAndroid,
      PersonalDataManager caller, String regionCode, int timeoutSeconds,
      PersonalDataManager.GetSubKeysRequestDelegate delegate) {
    N.M8TAYWBI(nativePersonalDataManagerAndroid, caller, regionCode, timeoutSeconds, delegate);
  }

  @Override
  public boolean hasProfiles(long nativePersonalDataManagerAndroid) {
    return (boolean)N.M0BDCcME(nativePersonalDataManagerAndroid);
  }

  @Override
  public boolean hasCreditCards(long nativePersonalDataManagerAndroid) {
    return (boolean)N.MqzvN0Eh(nativePersonalDataManagerAndroid);
  }

  @Override
  public boolean isAutofillManaged() {
    return (boolean)N.MdaA9Qvf();
  }

  @Override
  public boolean isAutofillProfileManaged() {
    return (boolean)N.MCL0OG9d();
  }

  @Override
  public boolean isAutofillCreditCardManaged() {
    return (boolean)N.MbTLtWkf();
  }

  @Override
  public boolean isPaymentsIntegrationEnabled() {
    return (boolean)N.M4NdKhmj();
  }

  @Override
  public void setPaymentsIntegrationEnabled(boolean enable) {
    N.MIN2Dr59(enable);
  }

  @Override
  public String toCountryCode(String countryName) {
    return (String)N.MK6I_IbV(countryName);
  }

  @Override
  public void cancelPendingGetSubKeys(long nativePersonalDataManagerAndroid) {
    N.MCBooW5W(nativePersonalDataManagerAndroid);
  }

  @Override
  public void setSyncServiceForTesting(long nativePersonalDataManagerAndroid) {
    N.MstCCrUn(nativePersonalDataManagerAndroid);
  }

  public static PersonalDataManager.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.autofill.PersonalDataManager.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new PersonalDataManagerJni();
  }
}
