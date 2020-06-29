package org.chromium.chrome.browser.feed;

import J.N;
import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.chrome.browser.profiles.Profile;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class FeedLoggingBridgeJni implements FeedLoggingBridge.Natives {
  private static FeedLoggingBridge.Natives testInstance;

  public static final JniStaticTestMocker<FeedLoggingBridge.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.feed.FeedLoggingBridge.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.feed.FeedLoggingBridge.Natives instance) {
      if (!J.N.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public long init(FeedLoggingBridge caller, Profile profile) {
    return (long)N.Mk2kSJ39(caller, profile);
  }

  @Override
  public void destroy(long nativeFeedLoggingBridge, FeedLoggingBridge caller) {
    N.MS58lOx7(nativeFeedLoggingBridge, caller);
  }

  @Override
  public void onContentViewed(long nativeFeedLoggingBridge, FeedLoggingBridge caller, int position,
      long publishedTimeMs, long timeContentBecameAvailableMs, float score,
      boolean isAvailableOffline) {
    N.MGPaYdSb(nativeFeedLoggingBridge, caller, position, publishedTimeMs, timeContentBecameAvailableMs, score, isAvailableOffline);
  }

  @Override
  public void onContentDismissed(long nativeFeedLoggingBridge, FeedLoggingBridge caller,
      int position, String uri, boolean wasCommitted) {
    N.MqdDeXCn(nativeFeedLoggingBridge, caller, position, uri, wasCommitted);
  }

  @Override
  public void onContentSwiped(long nativeFeedLoggingBridge, FeedLoggingBridge caller) {
    N.Mvy8AHiW(nativeFeedLoggingBridge, caller);
  }

  @Override
  public void onClientAction(long nativeFeedLoggingBridge, FeedLoggingBridge caller,
      int windowOpenDisposition, int position, long publishedTimeMs, float score,
      boolean isAvailableOffline) {
    N.M5Q$Z76s(nativeFeedLoggingBridge, caller, windowOpenDisposition, position, publishedTimeMs, score, isAvailableOffline);
  }

  @Override
  public void onContentContextMenuOpened(long nativeFeedLoggingBridge, FeedLoggingBridge caller,
      int position, long publishedTimeMs, float score) {
    N.MH7OoJqw(nativeFeedLoggingBridge, caller, position, publishedTimeMs, score);
  }

  @Override
  public void onMoreButtonViewed(long nativeFeedLoggingBridge, FeedLoggingBridge caller,
      int position) {
    N.MjGvm_uE(nativeFeedLoggingBridge, caller, position);
  }

  @Override
  public void onMoreButtonClicked(long nativeFeedLoggingBridge, FeedLoggingBridge caller,
      int position) {
    N.MJ$6Ll3X(nativeFeedLoggingBridge, caller, position);
  }

  @Override
  public void onNotInterestedInSource(long nativeFeedLoggingBridge, FeedLoggingBridge caller,
      int position, boolean wasCommitted) {
    N.MkCeB9ve(nativeFeedLoggingBridge, caller, position, wasCommitted);
  }

  @Override
  public void onNotInterestedInTopic(long nativeFeedLoggingBridge, FeedLoggingBridge caller,
      int position, boolean wasCommitted) {
    N.MjQ$0tSi(nativeFeedLoggingBridge, caller, position, wasCommitted);
  }

  @Override
  public void onOpenedWithContent(long nativeFeedLoggingBridge, FeedLoggingBridge caller,
      int timeToPopulateMs, int contentCount) {
    N.Mn65Doay(nativeFeedLoggingBridge, caller, timeToPopulateMs, contentCount);
  }

  @Override
  public void onOpenedWithNoImmediateContent(long nativeFeedLoggingBridge,
      FeedLoggingBridge caller) {
    N.MjNTWwKu(nativeFeedLoggingBridge, caller);
  }

  @Override
  public void onOpenedWithNoContent(long nativeFeedLoggingBridge, FeedLoggingBridge caller) {
    N.M3_byp5h(nativeFeedLoggingBridge, caller);
  }

  @Override
  public void onSpinnerStarted(long nativeFeedLoggingBridge, FeedLoggingBridge caller,
      int spinnerType) {
    N.MYbRmWBA(nativeFeedLoggingBridge, caller, spinnerType);
  }

  @Override
  public void onSpinnerFinished(long nativeFeedLoggingBridge, FeedLoggingBridge caller,
      long spinnerShownTimeMs, int spinnerType) {
    N.Mw1kUWkW(nativeFeedLoggingBridge, caller, spinnerShownTimeMs, spinnerType);
  }

  @Override
  public void onSpinnerDestroyedWithoutCompleting(long nativeFeedLoggingBridge,
      FeedLoggingBridge caller, long spinnerShownTimeMs, int spinnerType) {
    N.MDr1LiwV(nativeFeedLoggingBridge, caller, spinnerShownTimeMs, spinnerType);
  }

  @Override
  public void onPietFrameRenderingEvent(long nativeFeedLoggingBridge, FeedLoggingBridge caller,
      int[] pietErrorCodes) {
    N.M3Vodj$B(nativeFeedLoggingBridge, caller, pietErrorCodes);
  }

  @Override
  public void onVisualElementClicked(long nativeFeedLoggingBridge, FeedLoggingBridge caller,
      int elementType, int position, long timeContentBecameAvailableMs) {
    N.Mw4s1KH4(nativeFeedLoggingBridge, caller, elementType, position, timeContentBecameAvailableMs);
  }

  @Override
  public void onVisualElementViewed(long nativeFeedLoggingBridge, FeedLoggingBridge caller,
      int elementType, int position, long timeContentBecameAvailableMs) {
    N.M0mYFKCT(nativeFeedLoggingBridge, caller, elementType, position, timeContentBecameAvailableMs);
  }

  @Override
  public void onInternalError(long nativeFeedLoggingBridge, FeedLoggingBridge caller,
      int internalError) {
    N.MDzRqKxh(nativeFeedLoggingBridge, caller, internalError);
  }

  @Override
  public void onTokenCompleted(long nativeFeedLoggingBridge, FeedLoggingBridge caller,
      boolean wasSynthetic, int contentCount, int tokenCount) {
    N.MvFmvtGW(nativeFeedLoggingBridge, caller, wasSynthetic, contentCount, tokenCount);
  }

  @Override
  public void onTokenFailedToComplete(long nativeFeedLoggingBridge, FeedLoggingBridge caller,
      boolean wasSynthetic, int failureCount) {
    N.MyWRgb3a(nativeFeedLoggingBridge, caller, wasSynthetic, failureCount);
  }

  @Override
  public void onServerRequest(long nativeFeedLoggingBridge, FeedLoggingBridge caller,
      int requestReason) {
    N.MBwuNbN9(nativeFeedLoggingBridge, caller, requestReason);
  }

  @Override
  public void onZeroStateShown(long nativeFeedLoggingBridge, FeedLoggingBridge caller,
      int zeroStateShowReason) {
    N.MUa6wFP7(nativeFeedLoggingBridge, caller, zeroStateShowReason);
  }

  @Override
  public void onZeroStateRefreshCompleted(long nativeFeedLoggingBridge, FeedLoggingBridge caller,
      int newContentCount, int newTokenCount) {
    N.M7OpFQrM(nativeFeedLoggingBridge, caller, newContentCount, newTokenCount);
  }

  @Override
  public void onTaskFinished(long nativeFeedLoggingBridge, FeedLoggingBridge caller, int task,
      int delayTimeMs, int taskTimeMs) {
    N.MbRXRFvO(nativeFeedLoggingBridge, caller, task, delayTimeMs, taskTimeMs);
  }

  @Override
  public void onContentTargetVisited(long nativeFeedLoggingBridge, FeedLoggingBridge caller,
      long visitTimeMs, boolean isOffline, boolean returnToNtp) {
    N.MfkTTEHB(nativeFeedLoggingBridge, caller, visitTimeMs, isOffline, returnToNtp);
  }

  @Override
  public void reportScrolledAfterOpen(long nativeFeedLoggingBridge, FeedLoggingBridge caller) {
    N.MiSQvuyn(nativeFeedLoggingBridge, caller);
  }

  public static FeedLoggingBridge.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.feed.FeedLoggingBridge.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new FeedLoggingBridgeJni();
  }
}
