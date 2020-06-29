package org.chromium.chrome.browser.bookmarks;

import J.N;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.components.bookmarks.BookmarkId;
import org.chromium.content_public.browser.WebContents;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class BookmarkBridgeJni implements BookmarkBridge.Natives {
  private static BookmarkBridge.Natives testInstance;

  public static final JniStaticTestMocker<BookmarkBridge.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.bookmarks.BookmarkBridge.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.bookmarks.BookmarkBridge.Natives instance) {
      if (!J.N.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public long getBookmarkIdForWebContents(WebContents webContents, boolean onlyEditable) {
    return (long)N.MUjtS5c8(webContents, onlyEditable);
  }

  @Override
  public BookmarkBridge.BookmarkItem getBookmarkByID(long nativeBookmarkBridge,
      BookmarkBridge caller, long id, int type) {
    return (BookmarkBridge.BookmarkItem)N.M4Ir5snM(nativeBookmarkBridge, caller, id, type);
  }

  @Override
  public void getPermanentNodeIDs(long nativeBookmarkBridge, BookmarkBridge caller,
      List<BookmarkId> bookmarksList) {
    N.MQwI6O0A(nativeBookmarkBridge, caller, bookmarksList);
  }

  @Override
  public void getTopLevelFolderParentIDs(long nativeBookmarkBridge, BookmarkBridge caller,
      List<BookmarkId> bookmarksList) {
    N.MHq3fk0e(nativeBookmarkBridge, caller, bookmarksList);
  }

  @Override
  public void getTopLevelFolderIDs(long nativeBookmarkBridge, BookmarkBridge caller,
      boolean getSpecial, boolean getNormal, List<BookmarkId> bookmarksList) {
    N.MOEaKJZM(nativeBookmarkBridge, caller, getSpecial, getNormal, bookmarksList);
  }

  @Override
  public void getAllFoldersWithDepths(long nativeBookmarkBridge, BookmarkBridge caller,
      List<BookmarkId> folderList, List<Integer> depthList) {
    N.MEqyLeo9(nativeBookmarkBridge, caller, folderList, depthList);
  }

  @Override
  public BookmarkId getRootFolderId(long nativeBookmarkBridge, BookmarkBridge caller) {
    return (BookmarkId)N.MTVYsNWF(nativeBookmarkBridge, caller);
  }

  @Override
  public BookmarkId getMobileFolderId(long nativeBookmarkBridge, BookmarkBridge caller) {
    return (BookmarkId)N.M7yxRJ0Q(nativeBookmarkBridge, caller);
  }

  @Override
  public BookmarkId getOtherFolderId(long nativeBookmarkBridge, BookmarkBridge caller) {
    return (BookmarkId)N.MG_d8ZCM(nativeBookmarkBridge, caller);
  }

  @Override
  public BookmarkId getDesktopFolderId(long nativeBookmarkBridge, BookmarkBridge caller) {
    return (BookmarkId)N.MmusspW0(nativeBookmarkBridge, caller);
  }

  @Override
  public BookmarkId getPartnerFolderId(long nativeBookmarkBridge, BookmarkBridge caller) {
    return (BookmarkId)N.MUT_xcNO(nativeBookmarkBridge, caller);
  }

  @Override
  public int getChildCount(long nativeBookmarkBridge, BookmarkBridge caller, long id, int type) {
    return (int)N.MywxQQ$n(nativeBookmarkBridge, caller, id, type);
  }

  @Override
  public void getChildIDs(long nativeBookmarkBridge, BookmarkBridge caller, long id, int type,
      boolean getFolders, boolean getBookmarks, List<BookmarkId> bookmarksList) {
    N.MjHaBU2n(nativeBookmarkBridge, caller, id, type, getFolders, getBookmarks, bookmarksList);
  }

  @Override
  public BookmarkId getChildAt(long nativeBookmarkBridge, BookmarkBridge caller, long id, int type,
      int index) {
    return (BookmarkId)N.MvzSBRAY(nativeBookmarkBridge, caller, id, type, index);
  }

  @Override
  public int getTotalBookmarkCount(long nativeBookmarkBridge, BookmarkBridge caller, long id,
      int type) {
    return (int)N.M9Wq4IA6(nativeBookmarkBridge, caller, id, type);
  }

  @Override
  public void setBookmarkTitle(long nativeBookmarkBridge, BookmarkBridge caller, long id, int type,
      String title) {
    N.MWvvdW1T(nativeBookmarkBridge, caller, id, type, title);
  }

  @Override
  public void setBookmarkUrl(long nativeBookmarkBridge, BookmarkBridge caller, long id, int type,
      String url) {
    N.MiNuz9ZT(nativeBookmarkBridge, caller, id, type, url);
  }

  @Override
  public boolean doesBookmarkExist(long nativeBookmarkBridge, BookmarkBridge caller, long id,
      int type) {
    return (boolean)N.MhzzenO8(nativeBookmarkBridge, caller, id, type);
  }

  @Override
  public void getBookmarksForFolder(long nativeBookmarkBridge, BookmarkBridge caller,
      BookmarkId folderId, BookmarkBridge.BookmarksCallback callback,
      List<BookmarkBridge.BookmarkItem> bookmarksList) {
    N.M4_aKMtg(nativeBookmarkBridge, caller, folderId, callback, bookmarksList);
  }

  @Override
  public boolean isFolderVisible(long nativeBookmarkBridge, BookmarkBridge caller, long id,
      int type) {
    return (boolean)N.MCNIYDWB(nativeBookmarkBridge, caller, id, type);
  }

  @Override
  public void getCurrentFolderHierarchy(long nativeBookmarkBridge, BookmarkBridge caller,
      BookmarkId folderId, BookmarkBridge.BookmarksCallback callback,
      List<BookmarkBridge.BookmarkItem> bookmarksList) {
    N.MbzcH$4D(nativeBookmarkBridge, caller, folderId, callback, bookmarksList);
  }

  @Override
  public BookmarkId addFolder(long nativeBookmarkBridge, BookmarkBridge caller, BookmarkId parent,
      int index, String title) {
    return (BookmarkId)N.MoWzwBNR(nativeBookmarkBridge, caller, parent, index, title);
  }

  @Override
  public void deleteBookmark(long nativeBookmarkBridge, BookmarkBridge caller,
      BookmarkId bookmarkId) {
    N.MJ2llFWZ(nativeBookmarkBridge, caller, bookmarkId);
  }

  @Override
  public void removeAllUserBookmarks(long nativeBookmarkBridge, BookmarkBridge caller) {
    N.M70Imm05(nativeBookmarkBridge, caller);
  }

  @Override
  public void moveBookmark(long nativeBookmarkBridge, BookmarkBridge caller, BookmarkId bookmarkId,
      BookmarkId newParentId, int index) {
    N.MfKsAC2S(nativeBookmarkBridge, caller, bookmarkId, newParentId, index);
  }

  @Override
  public BookmarkId addBookmark(long nativeBookmarkBridge, BookmarkBridge caller, BookmarkId parent,
      int index, String title, String url) {
    return (BookmarkId)N.Mg53Jgou(nativeBookmarkBridge, caller, parent, index, title, url);
  }

  @Override
  public void undo(long nativeBookmarkBridge, BookmarkBridge caller) {
    N.Mv0zkYXw(nativeBookmarkBridge, caller);
  }

  @Override
  public void startGroupingUndos(long nativeBookmarkBridge, BookmarkBridge caller) {
    N.MBJyw2pU(nativeBookmarkBridge, caller);
  }

  @Override
  public void endGroupingUndos(long nativeBookmarkBridge, BookmarkBridge caller) {
    N.MIekL1sa(nativeBookmarkBridge, caller);
  }

  @Override
  public void loadEmptyPartnerBookmarkShimForTesting(long nativeBookmarkBridge,
      BookmarkBridge caller) {
    N.M9OXotb$(nativeBookmarkBridge, caller);
  }

  @Override
  public void loadFakePartnerBookmarkShimForTesting(long nativeBookmarkBridge,
      BookmarkBridge caller) {
    N.MxdECLgm(nativeBookmarkBridge, caller);
  }

  @Override
  public void searchBookmarks(long nativeBookmarkBridge, BookmarkBridge caller,
      List<BookmarkId> bookmarkMatches, String query, int maxNumber) {
    N.MUcwMevE(nativeBookmarkBridge, caller, bookmarkMatches, query, maxNumber);
  }

  @Override
  public long init(BookmarkBridge caller, Profile profile) {
    return (long)N.MTRUIEfD(caller, profile);
  }

  @Override
  public boolean isDoingExtensiveChanges(long nativeBookmarkBridge, BookmarkBridge caller) {
    return (boolean)N.MHTPaGlQ(nativeBookmarkBridge, caller);
  }

  @Override
  public void destroy(long nativeBookmarkBridge, BookmarkBridge caller) {
    N.M$aEU5TZ(nativeBookmarkBridge, caller);
  }

  @Override
  public boolean isEditBookmarksEnabled(long nativeBookmarkBridge) {
    return (boolean)N.M9xtlU8J(nativeBookmarkBridge);
  }

  @Override
  public void reorderChildren(long nativeBookmarkBridge, BookmarkBridge caller, BookmarkId parent,
      long[] orderedNodes) {
    N.MgC7owSN(nativeBookmarkBridge, caller, parent, orderedNodes);
  }

  public static BookmarkBridge.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.bookmarks.BookmarkBridge.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new BookmarkBridgeJni();
  }
}
