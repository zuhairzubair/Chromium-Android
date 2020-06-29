package org.chromium.chrome.browser.feed;

import J.N;
import java.lang.Boolean;
import java.lang.Override;
import java.lang.String;
import java.lang.Void;
import javax.annotation.Generated;
import org.chromium.base.Callback;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.chrome.browser.profiles.Profile;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class FeedJournalBridgeJni implements FeedJournalBridge.Natives {
  private static FeedJournalBridge.Natives testInstance;

  public static final JniStaticTestMocker<FeedJournalBridge.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.feed.FeedJournalBridge.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.feed.FeedJournalBridge.Natives instance) {
      if (!J.N.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public long init(FeedJournalBridge caller, Profile profile) {
    return (long)N.MwZk$9JB(caller, profile);
  }

  @Override
  public void destroy(long nativeFeedJournalBridge, FeedJournalBridge caller) {
    N.MarPf8cc(nativeFeedJournalBridge, caller);
  }

  @Override
  public void loadJournal(long nativeFeedJournalBridge, FeedJournalBridge caller,
      String journalName, Callback<byte[][]> successCallback, Callback<Void> failureCallback) {
    N.MgfVdXhE(nativeFeedJournalBridge, caller, journalName, successCallback, failureCallback);
  }

  @Override
  public void commitJournalMutation(long nativeFeedJournalBridge, FeedJournalBridge caller,
      Callback<Boolean> callback) {
    N.MZN_ZnLz(nativeFeedJournalBridge, caller, callback);
  }

  @Override
  public void startJournalMutation(long nativeFeedJournalBridge, FeedJournalBridge caller,
      String journalName) {
    N.MG_0AdKn(nativeFeedJournalBridge, caller, journalName);
  }

  @Override
  public void deleteJournalMutation(long nativeFeedJournalBridge, FeedJournalBridge caller) {
    N.Mbq0oH4Z(nativeFeedJournalBridge, caller);
  }

  @Override
  public void addAppendOperation(long nativeFeedJournalBridge, FeedJournalBridge caller,
      byte[] value) {
    N.MgYNPo4p(nativeFeedJournalBridge, caller, value);
  }

  @Override
  public void addCopyOperation(long nativeFeedJournalBridge, FeedJournalBridge caller,
      String toJournalName) {
    N.MJEilh4$(nativeFeedJournalBridge, caller, toJournalName);
  }

  @Override
  public void addDeleteOperation(long nativeFeedJournalBridge, FeedJournalBridge caller) {
    N.MnIrColc(nativeFeedJournalBridge, caller);
  }

  @Override
  public void doesJournalExist(long nativeFeedJournalBridge, FeedJournalBridge caller,
      String journalName, Callback<Boolean> successCallback, Callback<Void> failureCallback) {
    N.MfO1UP5u(nativeFeedJournalBridge, caller, journalName, successCallback, failureCallback);
  }

  @Override
  public void loadAllJournalKeys(long nativeFeedJournalBridge, FeedJournalBridge caller,
      Callback<String[]> successCallback, Callback<Void> failureCallback) {
    N.MrEnIIPF(nativeFeedJournalBridge, caller, successCallback, failureCallback);
  }

  @Override
  public void deleteAllJournals(long nativeFeedJournalBridge, FeedJournalBridge caller,
      Callback<Boolean> callback) {
    N.MUvOp297(nativeFeedJournalBridge, caller, callback);
  }

  public static FeedJournalBridge.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.feed.FeedJournalBridge.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new FeedJournalBridgeJni();
  }
}
