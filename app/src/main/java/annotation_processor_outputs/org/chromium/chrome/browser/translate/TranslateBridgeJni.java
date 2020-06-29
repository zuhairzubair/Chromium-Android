package org.chromium.chrome.browser.translate;

import J.N;
import java.lang.Override;
import java.lang.String;
import java.util.LinkedHashSet;
import java.util.List;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.chrome.browser.settings.languages.LanguageItem;
import org.chromium.content_public.browser.WebContents;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class TranslateBridgeJni implements TranslateBridge.Natives {
  private static TranslateBridge.Natives testInstance;

  public static final JniStaticTestMocker<TranslateBridge.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.translate.TranslateBridge.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.translate.TranslateBridge.Natives instance) {
      if (!J.N.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void manualTranslateWhenReady(WebContents webContents) {
    N.M0540rIu(webContents);
  }

  @Override
  public boolean canManuallyTranslate(WebContents webContents) {
    return (boolean)N.Mx5ZGJOG(webContents);
  }

  @Override
  public boolean shouldShowManualTranslateIPH(WebContents webContents) {
    return (boolean)N.M8WoKfWJ(webContents);
  }

  @Override
  public void setPredefinedTargetLanguage(WebContents webContents, String targetLanguage) {
    N.MJsDcRCX(webContents, targetLanguage);
  }

  @Override
  public String getTargetLanguage() {
    return (String)N.MMKf4EpW();
  }

  @Override
  public boolean isBlockedLanguage(String language) {
    return (boolean)N.MeNcRA0y(language);
  }

  @Override
  public void getModelLanguages(LinkedHashSet<String> set) {
    N.MfiRqZsy(set);
  }

  @Override
  public void resetAcceptLanguages(String defaultLocale) {
    N.Mo7FLW6m(defaultLocale);
  }

  @Override
  public void getChromeAcceptLanguages(List<LanguageItem> list) {
    N.MlwSZWfW(list);
  }

  @Override
  public void getUserAcceptLanguages(List<String> list) {
    N.MMAgYJ7_(list);
  }

  @Override
  public void updateUserAcceptLanguages(String language, boolean add) {
    N.Me60Lv4_(language, add);
  }

  @Override
  public void moveAcceptLanguage(String language, int offset) {
    N.MLlzo6h2(language, offset);
  }

  @Override
  public void setLanguageOrder(String[] codes) {
    N.Mo7xRjdk(codes);
  }

  @Override
  public boolean isBlockedLanguage2(String language) {
    return (boolean)N.MF2cC5mB(language);
  }

  @Override
  public void setLanguageBlockedState(String language, boolean blocked) {
    N.Mt0H9F3d(language, blocked);
  }

  @Override
  public boolean getExplicitLanguageAskPromptShown() {
    return (boolean)N.MLVL0hmz();
  }

  @Override
  public void setExplicitLanguageAskPromptShown(boolean shown) {
    N.ME1KHo7o(shown);
  }

  public static TranslateBridge.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.translate.TranslateBridge.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new TranslateBridgeJni();
  }
}
