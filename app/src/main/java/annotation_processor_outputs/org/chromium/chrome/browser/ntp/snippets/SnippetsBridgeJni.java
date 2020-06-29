package org.chromium.chrome.browser.ntp.snippets;

import J.N;
import android.graphics.Bitmap;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import javax.annotation.Generated;
import org.chromium.base.Callback;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.chrome.browser.ntp.cards.SuggestionsCategoryInfo;
import org.chromium.chrome.browser.profiles.Profile;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class SnippetsBridgeJni implements SnippetsBridge.Natives {
  private static SnippetsBridge.Natives testInstance;

  public static final JniStaticTestMocker<SnippetsBridge.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.ntp.snippets.SnippetsBridge.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.ntp.snippets.SnippetsBridge.Natives instance) {
      if (!J.N.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public long init(SnippetsBridge caller, Profile profile) {
    return (long)N.MNmbKKwB(caller, profile);
  }

  @Override
  public void destroy(long nativeNTPSnippetsBridge, SnippetsBridge caller) {
    N.MYZ2ZzPu(nativeNTPSnippetsBridge, caller);
  }

  @Override
  public void reloadSuggestions(long nativeNTPSnippetsBridge, SnippetsBridge caller) {
    N.MSo4RnZR(nativeNTPSnippetsBridge, caller);
  }

  @Override
  public void remoteSuggestionsSchedulerOnPersistentSchedulerWakeUp() {
    N.M5J1okbp();
  }

  @Override
  public void remoteSuggestionsSchedulerOnBrowserUpgraded() {
    N.MtldKr1J();
  }

  @Override
  public boolean areRemoteSuggestionsEnabled(long nativeNTPSnippetsBridge, SnippetsBridge caller) {
    return (boolean)N.Mzglqvto(nativeNTPSnippetsBridge, caller);
  }

  @Override
  public int[] getCategories(long nativeNTPSnippetsBridge, SnippetsBridge caller) {
    return (int[])N.M0Zyn9rc(nativeNTPSnippetsBridge, caller);
  }

  @Override
  public int getCategoryStatus(long nativeNTPSnippetsBridge, SnippetsBridge caller, int category) {
    return (int)N.My1Mbeca(nativeNTPSnippetsBridge, caller, category);
  }

  @Override
  public SuggestionsCategoryInfo getCategoryInfo(long nativeNTPSnippetsBridge,
      SnippetsBridge caller, int category) {
    return (SuggestionsCategoryInfo)N.MWtUjmv$(nativeNTPSnippetsBridge, caller, category);
  }

  @Override
  public List<SnippetArticle> getSuggestionsForCategory(long nativeNTPSnippetsBridge,
      SnippetsBridge caller, int category) {
    return (List<SnippetArticle>)N.MTDAOBWB(nativeNTPSnippetsBridge, caller, category);
  }

  @Override
  public void fetchSuggestionImage(long nativeNTPSnippetsBridge, SnippetsBridge caller,
      int category, String idWithinCategory, Callback<Bitmap> callback) {
    N.Mna_eU$x(nativeNTPSnippetsBridge, caller, category, idWithinCategory, callback);
  }

  @Override
  public void fetchSuggestionFavicon(long nativeNTPSnippetsBridge, SnippetsBridge caller,
      int category, String idWithinCategory, int minimumSizePx, int desiredSizePx,
      Callback<Bitmap> callback) {
    N.MRdWmw06(nativeNTPSnippetsBridge, caller, category, idWithinCategory, minimumSizePx, desiredSizePx, callback);
  }

  @Override
  public void fetch(long nativeNTPSnippetsBridge, SnippetsBridge caller, int category,
      String[] knownSuggestions, Callback<List<SnippetArticle>> successCallback,
      Callback<Integer> failureCallback) {
    N.Mk$i6Y8F(nativeNTPSnippetsBridge, caller, category, knownSuggestions, successCallback, failureCallback);
  }

  @Override
  public void dismissSuggestion(long nativeNTPSnippetsBridge, SnippetsBridge caller, String url,
      int globalPosition, int category, int positionInCategory, String idWithinCategory) {
    N.M4_g98g9(nativeNTPSnippetsBridge, caller, url, globalPosition, category, positionInCategory, idWithinCategory);
  }

  @Override
  public void dismissCategory(long nativeNTPSnippetsBridge, SnippetsBridge caller, int category) {
    N.M0oGgGKI(nativeNTPSnippetsBridge, caller, category);
  }

  @Override
  public void restoreDismissedCategories(long nativeNTPSnippetsBridge, SnippetsBridge caller) {
    N.MAzyRJ9W(nativeNTPSnippetsBridge, caller);
  }

  public static SnippetsBridge.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.ntp.snippets.SnippetsBridge.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new SnippetsBridgeJni();
  }
}
