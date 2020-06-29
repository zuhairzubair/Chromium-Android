package org.chromium.chrome.browser.suggestions;

import J.N;
import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class SuggestionsEventReporterBridgeJni implements SuggestionsEventReporterBridge.Natives {
  private static SuggestionsEventReporterBridge.Natives testInstance;

  public static final JniStaticTestMocker<SuggestionsEventReporterBridge.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.suggestions.SuggestionsEventReporterBridge.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.suggestions.SuggestionsEventReporterBridge.Natives instance) {
      if (!J.N.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void onPageShown(int[] categories, int[] suggestionsPerCategory,
      boolean[] isCategoryVisible) {
    N.McMDtQyi(categories, suggestionsPerCategory, isCategoryVisible);
  }

  @Override
  public void onSuggestionShown(int globalPosition, int category, int positionInCategory,
      long publishTimestampMs, float score, long fetchTimestampMs) {
    N.M2108t1w(globalPosition, category, positionInCategory, publishTimestampMs, score, fetchTimestampMs);
  }

  @Override
  public void onSuggestionOpened(int globalPosition, int category, int categoryIndex,
      int positionInCategory, long publishTimestampMs, float score, int windowOpenDisposition,
      boolean isPrefetched) {
    N.MfGTBm3G(globalPosition, category, categoryIndex, positionInCategory, publishTimestampMs, score, windowOpenDisposition, isPrefetched);
  }

  @Override
  public void onSuggestionMenuOpened(int globalPosition, int category, int positionInCategory,
      long publishTimestampMs, float score) {
    N.M8taiOzK(globalPosition, category, positionInCategory, publishTimestampMs, score);
  }

  @Override
  public void onMoreButtonShown(int category, int position) {
    N.MNMC1lVP(category, position);
  }

  @Override
  public void onMoreButtonClicked(int category, int position) {
    N.M9fKQOSr(category, position);
  }

  @Override
  public void onSurfaceOpened() {
    N.Me3ItGD8();
  }

  @Override
  public void onActivityWarmResumed() {
    N.MafSbEEd();
  }

  @Override
  public void onColdStart() {
    N.MTeayEd6();
  }

  @Override
  public void onSuggestionTargetVisited(int category, long visitTimeMs) {
    N.MO_DLXIL(category, visitTimeMs);
  }

  public static SuggestionsEventReporterBridge.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.suggestions.SuggestionsEventReporterBridge.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new SuggestionsEventReporterBridgeJni();
  }
}
