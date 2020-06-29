package org.chromium.chrome.browser.contextualsearch;

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
final class ContextualSearchRankerLoggerImplJni implements ContextualSearchRankerLoggerImpl.Natives {
  private static ContextualSearchRankerLoggerImpl.Natives testInstance;

  public static final JniStaticTestMocker<ContextualSearchRankerLoggerImpl.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.contextualsearch.ContextualSearchRankerLoggerImpl.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.contextualsearch.ContextualSearchRankerLoggerImpl.Natives instance) {
      if (!J.N.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public long init(ContextualSearchRankerLoggerImpl caller) {
    return (long)N.MONRFPb7(caller);
  }

  @Override
  public void destroy(long nativeContextualSearchRankerLoggerImpl,
      ContextualSearchRankerLoggerImpl caller) {
    N.MyXGbTBk(nativeContextualSearchRankerLoggerImpl, caller);
  }

  @Override
  public void logInt32(long nativeContextualSearchRankerLoggerImpl,
      ContextualSearchRankerLoggerImpl caller, String featureString, int value) {
    N.Mwcn3_wo(nativeContextualSearchRankerLoggerImpl, caller, featureString, value);
  }

  @Override
  public void setupLoggingAndRanker(long nativeContextualSearchRankerLoggerImpl,
      ContextualSearchRankerLoggerImpl caller, WebContents basePageWebContents) {
    N.MvT1I8Nb(nativeContextualSearchRankerLoggerImpl, caller, basePageWebContents);
  }

  @Override
  public int runInference(long nativeContextualSearchRankerLoggerImpl,
      ContextualSearchRankerLoggerImpl caller) {
    return (int)N.MCvhnrxJ(nativeContextualSearchRankerLoggerImpl, caller);
  }

  @Override
  public void writeLogAndReset(long nativeContextualSearchRankerLoggerImpl,
      ContextualSearchRankerLoggerImpl caller) {
    N.Mocie1e2(nativeContextualSearchRankerLoggerImpl, caller);
  }

  @Override
  public boolean isQueryEnabled(long nativeContextualSearchRankerLoggerImpl,
      ContextualSearchRankerLoggerImpl caller) {
    return (boolean)N.MT7Jqfn9(nativeContextualSearchRankerLoggerImpl, caller);
  }

  public static ContextualSearchRankerLoggerImpl.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.contextualsearch.ContextualSearchRankerLoggerImpl.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new ContextualSearchRankerLoggerImplJni();
  }
}
