package org.chromium.chrome.browser.document;

import J.N;
import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.content_public.browser.WebContents;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class DocumentWebContentsDelegateJni implements DocumentWebContentsDelegate.Natives {
  private static DocumentWebContentsDelegate.Natives testInstance;

  public static final JniStaticTestMocker<DocumentWebContentsDelegate.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.document.DocumentWebContentsDelegate.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.document.DocumentWebContentsDelegate.Natives instance) {
      if (!J.N.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public long initialize(DocumentWebContentsDelegate caller) {
    return (long)N.M69NflN_(caller);
  }

  @Override
  public void attachContents(long nativeDocumentWebContentsDelegate,
      DocumentWebContentsDelegate caller, WebContents webContents) {
    N.MY20dsUd(nativeDocumentWebContentsDelegate, caller, webContents);
  }

  public static DocumentWebContentsDelegate.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.document.DocumentWebContentsDelegate.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new DocumentWebContentsDelegateJni();
  }
}
