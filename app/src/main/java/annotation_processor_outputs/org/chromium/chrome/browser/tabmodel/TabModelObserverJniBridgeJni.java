package org.chromium.chrome.browser.tabmodel;

import J.N;
import java.lang.Object;
import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.chrome.browser.tab.Tab;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class TabModelObserverJniBridgeJni implements TabModelObserverJniBridge.Natives {
  private static TabModelObserverJniBridge.Natives testInstance;

  public static final JniStaticTestMocker<TabModelObserverJniBridge.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.tabmodel.TabModelObserverJniBridge.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.tabmodel.TabModelObserverJniBridge.Natives instance) {
      if (!J.N.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void didSelectTab(long nativeTabModelObserverJniBridge, TabModelObserverJniBridge caller,
      Tab tab, int type, int lastId) {
    N.M15BMjns(nativeTabModelObserverJniBridge, caller, tab, type, lastId);
  }

  @Override
  public void willCloseTab(long nativeTabModelObserverJniBridge, TabModelObserverJniBridge caller,
      Tab tab, boolean animate) {
    N.MSSvav7n(nativeTabModelObserverJniBridge, caller, tab, animate);
  }

  @Override
  public void didCloseTab(long nativeTabModelObserverJniBridge, TabModelObserverJniBridge caller,
      int tabId, boolean incognito) {
    N.MD9N_bFw(nativeTabModelObserverJniBridge, caller, tabId, incognito);
  }

  @Override
  public void willAddTab(long nativeTabModelObserverJniBridge, TabModelObserverJniBridge caller,
      Tab tab, int type) {
    N.MMKCgOHG(nativeTabModelObserverJniBridge, caller, tab, type);
  }

  @Override
  public void didAddTab(long nativeTabModelObserverJniBridge, TabModelObserverJniBridge caller,
      Tab tab, int type) {
    N.M7iC4IGa(nativeTabModelObserverJniBridge, caller, tab, type);
  }

  @Override
  public void didMoveTab(long nativeTabModelObserverJniBridge, TabModelObserverJniBridge caller,
      Tab tab, int newIndex, int curIndex) {
    N.MMKEWgan(nativeTabModelObserverJniBridge, caller, tab, newIndex, curIndex);
  }

  @Override
  public void tabPendingClosure(long nativeTabModelObserverJniBridge,
      TabModelObserverJniBridge caller, Tab tab) {
    N.MJ8c7fEV(nativeTabModelObserverJniBridge, caller, tab);
  }

  @Override
  public void tabClosureUndone(long nativeTabModelObserverJniBridge,
      TabModelObserverJniBridge caller, Tab tab) {
    N.MkEswtJX(nativeTabModelObserverJniBridge, caller, tab);
  }

  @Override
  public void tabClosureCommitted(long nativeTabModelObserverJniBridge,
      TabModelObserverJniBridge caller, Tab tab) {
    N.MRzpb9vm(nativeTabModelObserverJniBridge, caller, tab);
  }

  @Override
  public void allTabsPendingClosure(long nativeTabModelObserverJniBridge,
      TabModelObserverJniBridge caller, Object[] tabs) {
    N.M8YIOTao(nativeTabModelObserverJniBridge, caller, tabs);
  }

  @Override
  public void allTabsClosureCommitted(long nativeTabModelObserverJniBridge,
      TabModelObserverJniBridge caller) {
    N.M2XM7FhU(nativeTabModelObserverJniBridge, caller);
  }

  @Override
  public void tabRemoved(long nativeTabModelObserverJniBridge, TabModelObserverJniBridge caller,
      Tab tab) {
    N.M9V3veZz(nativeTabModelObserverJniBridge, caller, tab);
  }

  public static TabModelObserverJniBridge.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.tabmodel.TabModelObserverJniBridge.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new TabModelObserverJniBridgeJni();
  }
}
