package org.chromium.chrome.browser.partnerbookmarks;

import J.N;
import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class PartnerBookmarksReaderJni implements PartnerBookmarksReader.Natives {
  private static PartnerBookmarksReader.Natives testInstance;

  public static final JniStaticTestMocker<PartnerBookmarksReader.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.partnerbookmarks.PartnerBookmarksReader.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.partnerbookmarks.PartnerBookmarksReader.Natives instance) {
      if (!J.N.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public long init(PartnerBookmarksReader caller) {
    return (long)N.MQQiT1PE(caller);
  }

  @Override
  public void reset(long nativePartnerBookmarksReader, PartnerBookmarksReader caller) {
    N.MBit8Vx9(nativePartnerBookmarksReader, caller);
  }

  @Override
  public void destroy(long nativePartnerBookmarksReader, PartnerBookmarksReader caller) {
    N.Mp38r97L(nativePartnerBookmarksReader, caller);
  }

  @Override
  public long addPartnerBookmark(long nativePartnerBookmarksReader, PartnerBookmarksReader caller,
      String url, String title, boolean isFolder, long parentId, byte[] favicon, byte[] touchicon,
      boolean fetchUncachedFaviconsFromServer, int desiredFaviconSizePx,
      PartnerBookmarksReader.FetchFaviconCallback callback) {
    return (long)N.M1QiERX9(nativePartnerBookmarksReader, caller, url, title, isFolder, parentId, favicon, touchicon, fetchUncachedFaviconsFromServer, desiredFaviconSizePx, callback);
  }

  @Override
  public void partnerBookmarksCreationComplete(long nativePartnerBookmarksReader,
      PartnerBookmarksReader caller) {
    N.MZy4XMIu(nativePartnerBookmarksReader, caller);
  }

  @Override
  public String getNativeUrlString(String url) {
    return (String)N.McXhQJZC(url);
  }

  @Override
  public void disablePartnerBookmarksEditing() {
    N.McEggOd3();
  }

  public static PartnerBookmarksReader.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.partnerbookmarks.PartnerBookmarksReader.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new PartnerBookmarksReaderJni();
  }
}
