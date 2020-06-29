package org.chromium.chrome.browser.download.items;

import J.N;
import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.components.offline_items_collection.OfflineContentProvider;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class OfflineContentAggregatorFactoryJni implements OfflineContentAggregatorFactory.Natives {
  private static OfflineContentAggregatorFactory.Natives testInstance;

  public static final JniStaticTestMocker<OfflineContentAggregatorFactory.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.download.items.OfflineContentAggregatorFactory.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.download.items.OfflineContentAggregatorFactory.Natives instance) {
      if (!J.N.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public OfflineContentProvider getOfflineContentAggregator() {
    return (OfflineContentProvider)N.Ml3x2KBq();
  }

  public static OfflineContentAggregatorFactory.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.download.items.OfflineContentAggregatorFactory.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new OfflineContentAggregatorFactoryJni();
  }
}
