package org.chromium.chrome.browser.contextualsearch;

import J.N;
import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class CtrSuppressionJni implements CtrSuppression.Natives {
  private static CtrSuppression.Natives testInstance;

  public static final JniStaticTestMocker<CtrSuppression.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.contextualsearch.CtrSuppression.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.contextualsearch.CtrSuppression.Natives instance) {
      if (!J.N.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public long init(CtrSuppression caller) {
    return (long)N.MCUfMprB(caller);
  }

  @Override
  public void destroy(long nativeCtrSuppression, CtrSuppression caller) {
    N.MojC3LQ6(nativeCtrSuppression, caller);
  }

  @Override
  public void recordImpression(long nativeCtrSuppression, CtrSuppression caller, boolean wasSeen) {
    N.MLHiFNw8(nativeCtrSuppression, caller, wasSeen);
  }

  @Override
  public int getCurrentWeekNumber(long nativeCtrSuppression, CtrSuppression caller) {
    return (int)N.MYeBiXTA(nativeCtrSuppression, caller);
  }

  @Override
  public boolean hasPreviousWeekData(long nativeCtrSuppression, CtrSuppression caller) {
    return (boolean)N.Mx0n4i9m(nativeCtrSuppression, caller);
  }

  @Override
  public int getPreviousWeekImpressions(long nativeCtrSuppression, CtrSuppression caller) {
    return (int)N.MpFnMiJA(nativeCtrSuppression, caller);
  }

  @Override
  public float getPreviousWeekCtr(long nativeCtrSuppression, CtrSuppression caller) {
    return (float)N.M1uNswJh(nativeCtrSuppression, caller);
  }

  @Override
  public boolean hasPrevious28DayData(long nativeCtrSuppression, CtrSuppression caller) {
    return (boolean)N.McXNZl2s(nativeCtrSuppression, caller);
  }

  @Override
  public int getPrevious28DayImpressions(long nativeCtrSuppression, CtrSuppression caller) {
    return (int)N.MHNOba2r(nativeCtrSuppression, caller);
  }

  @Override
  public float getPrevious28DayCtr(long nativeCtrSuppression, CtrSuppression caller) {
    return (float)N.M36jqK_X(nativeCtrSuppression, caller);
  }

  public static CtrSuppression.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.contextualsearch.CtrSuppression.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new CtrSuppressionJni();
  }
}
