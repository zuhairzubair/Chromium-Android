package org.chromium.chrome.browser.provider;

import J.N;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Long;
import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.chrome.browser.database.SQLiteCursor;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class ChromeBrowserProviderJni implements ChromeBrowserProvider.Natives {
  private static ChromeBrowserProvider.Natives testInstance;

  public static final JniStaticTestMocker<ChromeBrowserProvider.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.provider.ChromeBrowserProvider.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.provider.ChromeBrowserProvider.Natives instance) {
      if (!J.N.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public long init(ChromeBrowserProvider caller) {
    return (long)N.MQhpB95X(caller);
  }

  @Override
  public long addBookmark(long nativeChromeBrowserProvider, ChromeBrowserProvider caller,
      String url, String title, boolean isFolder, long parentId) {
    return (long)N.MBJTm0cZ(nativeChromeBrowserProvider, caller, url, title, isFolder, parentId);
  }

  @Override
  public int removeBookmark(long nativeChromeBrowserProvider, ChromeBrowserProvider caller,
      long id) {
    return (int)N.MYCtyu3G(nativeChromeBrowserProvider, caller, id);
  }

  @Override
  public int updateBookmark(long nativeChromeBrowserProvider, ChromeBrowserProvider caller, long id,
      String url, String title, long parentId) {
    return (int)N.Mk0BzYKj(nativeChromeBrowserProvider, caller, id, url, title, parentId);
  }

  @Override
  public long addBookmarkFromAPI(long nativeChromeBrowserProvider, ChromeBrowserProvider caller,
      String url, Long created, Boolean isBookmark, Long date, byte[] favicon, String title,
      Integer visits, long parentId) {
    return (long)N.MgO3iZgV(nativeChromeBrowserProvider, caller, url, created, isBookmark, date, favicon, title, visits, parentId);
  }

  @Override
  public SQLiteCursor queryBookmarkFromAPI(long nativeChromeBrowserProvider,
      ChromeBrowserProvider caller, String[] projection, String selection, String[] selectionArgs,
      String sortOrder) {
    return (SQLiteCursor)N.MH$U74Ot(nativeChromeBrowserProvider, caller, projection, selection, selectionArgs, sortOrder);
  }

  @Override
  public int updateBookmarkFromAPI(long nativeChromeBrowserProvider, ChromeBrowserProvider caller,
      String url, Long created, Boolean isBookmark, Long date, byte[] favicon, String title,
      Integer visits, long parentId, String selection, String[] selectionArgs) {
    return (int)N.MK2xZH7V(nativeChromeBrowserProvider, caller, url, created, isBookmark, date, favicon, title, visits, parentId, selection, selectionArgs);
  }

  @Override
  public int removeBookmarkFromAPI(long nativeChromeBrowserProvider, ChromeBrowserProvider caller,
      String selection, String[] selectionArgs) {
    return (int)N.MNkmCUGs(nativeChromeBrowserProvider, caller, selection, selectionArgs);
  }

  @Override
  public int removeHistoryFromAPI(long nativeChromeBrowserProvider, ChromeBrowserProvider caller,
      String selection, String[] selectionArgs) {
    return (int)N.MioTm3rK(nativeChromeBrowserProvider, caller, selection, selectionArgs);
  }

  @Override
  public long addSearchTermFromAPI(long nativeChromeBrowserProvider, ChromeBrowserProvider caller,
      String term, Long date) {
    return (long)N.MeRMf2ng(nativeChromeBrowserProvider, caller, term, date);
  }

  @Override
  public SQLiteCursor querySearchTermFromAPI(long nativeChromeBrowserProvider,
      ChromeBrowserProvider caller, String[] projection, String selection, String[] selectionArgs,
      String sortOrder) {
    return (SQLiteCursor)N.MlS5H8vH(nativeChromeBrowserProvider, caller, projection, selection, selectionArgs, sortOrder);
  }

  @Override
  public int updateSearchTermFromAPI(long nativeChromeBrowserProvider, ChromeBrowserProvider caller,
      String search, Long date, String selection, String[] selectionArgs) {
    return (int)N.M5GGiheu(nativeChromeBrowserProvider, caller, search, date, selection, selectionArgs);
  }

  @Override
  public int removeSearchTermFromAPI(long nativeChromeBrowserProvider, ChromeBrowserProvider caller,
      String selection, String[] selectionArgs) {
    return (int)N.MFSN7pCT(nativeChromeBrowserProvider, caller, selection, selectionArgs);
  }

  public static ChromeBrowserProvider.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.provider.ChromeBrowserProvider.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new ChromeBrowserProviderJni();
  }
}
