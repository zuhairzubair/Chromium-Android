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
final class ContextualSearchManagerJni implements ContextualSearchManager.Natives {
  private static ContextualSearchManager.Natives testInstance;

  public static final JniStaticTestMocker<ContextualSearchManager.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.contextualsearch.ContextualSearchManager.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.contextualsearch.ContextualSearchManager.Natives instance) {
      if (!J.N.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public long init(ContextualSearchManager caller) {
    return (long)N.MGz$jbPy(caller);
  }

  @Override
  public void destroy(long nativeContextualSearchManager, ContextualSearchManager caller) {
    N.MP0VGkxv(nativeContextualSearchManager, caller);
  }

  @Override
  public void startSearchTermResolutionRequest(long nativeContextualSearchManager,
      ContextualSearchManager caller, ContextualSearchContext contextualSearchContext,
      WebContents baseWebContents) {
    N.MciyR$hg(nativeContextualSearchManager, caller, contextualSearchContext, baseWebContents);
  }

  @Override
  public void gatherSurroundingText(long nativeContextualSearchManager,
      ContextualSearchManager caller, ContextualSearchContext contextualSearchContext,
      WebContents baseWebContents) {
    N.M5yIaSSo(nativeContextualSearchManager, caller, contextualSearchContext, baseWebContents);
  }

  @Override
  public void whitelistContextualSearchJsApiUrl(long nativeContextualSearchManager,
      ContextualSearchManager caller, String url) {
    N.M8w0BEgx(nativeContextualSearchManager, caller, url);
  }

  @Override
  public void enableContextualSearchJsApiForWebContents(long nativeContextualSearchManager,
      ContextualSearchManager caller, WebContents overlayWebContents) {
    N.MUjQ3OuO(nativeContextualSearchManager, caller, overlayWebContents);
  }

  public static ContextualSearchManager.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.contextualsearch.ContextualSearchManager.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new ContextualSearchManagerJni();
  }
}
