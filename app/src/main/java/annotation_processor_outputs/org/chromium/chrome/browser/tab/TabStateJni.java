package org.chromium.chrome.browser.tab;

import J.N;
import java.lang.Override;
import java.lang.String;
import java.nio.ByteBuffer;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.content_public.browser.WebContents;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class TabStateJni implements TabState.Natives {
  private static TabState.Natives testInstance;

  public static final JniStaticTestMocker<TabState.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.tab.TabState.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(org.chromium.chrome.browser.tab.TabState.Natives instance) {
      if (!J.N.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public WebContents restoreContentsFromByteBuffer(ByteBuffer buffer, int savedStateVersion,
      boolean initiallyHidden) {
    return (WebContents)N.MICPd5BY(buffer, savedStateVersion, initiallyHidden);
  }

  @Override
  public ByteBuffer getContentsStateAsByteBuffer(Tab tab) {
    return (ByteBuffer)N.MZObK2iK(tab);
  }

  @Override
  public ByteBuffer deleteNavigationEntries(ByteBuffer state, int saveStateVersion,
      long predicate) {
    return (ByteBuffer)N.MVpvmEdB(state, saveStateVersion, predicate);
  }

  @Override
  public ByteBuffer createSingleNavigationStateAsByteBuffer(String url, String referrerUrl,
      int referrerPolicy, String initiatorOrigin, boolean isIncognito) {
    return (ByteBuffer)N.MYB6o14Y(url, referrerUrl, referrerPolicy, initiatorOrigin, isIncognito);
  }

  @Override
  public String getDisplayTitleFromByteBuffer(ByteBuffer state, int savedStateVersion) {
    return (String)N.M7EZHstc(state, savedStateVersion);
  }

  @Override
  public String getVirtualUrlFromByteBuffer(ByteBuffer state, int savedStateVersion) {
    return (String)N.Moc0rhMh(state, savedStateVersion);
  }

  @Override
  public void createHistoricalTab(ByteBuffer state, int savedStateVersion) {
    N.MJZmKGx8(state, savedStateVersion);
  }

  @Override
  public void createHistoricalTabFromContents(WebContents webContents) {
    N.MgW5XdfE(webContents);
  }

  public static TabState.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.tab.TabState.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new TabStateJni();
  }
}
