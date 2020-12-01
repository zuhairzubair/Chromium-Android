package org.chromium.components.search_engines;

import J.N;
import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
public final class TemplateUrlJni implements TemplateUrl.Natives {
  private static TemplateUrl.Natives testInstance;

  public static final JniStaticTestMocker<TemplateUrl.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.components.search_engines.TemplateUrl.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.components.search_engines.TemplateUrl.Natives instance) {
      if (!J.N.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public String getShortName(long templateUrlPtr) {
    return (String)N.M35ewi23(templateUrlPtr);
  }

  @Override
  public String getKeyword(long templateUrlPtr) {
    return (String)N.M74Ymq6T(templateUrlPtr);
  }

  @Override
  public boolean isPrepopulatedOrCreatedByPolicy(long templateUrlPtr) {
    return (boolean)N.M_Gh_h3K(templateUrlPtr);
  }

  @Override
  public long getLastVisitedTime(long templateUrlPtr) {
    return (long)N.MzOF1_dp(templateUrlPtr);
  }

  @Override
  public int getPrepopulatedId(long templateUrlPtr) {
    return (int)N.MhwmJ882(templateUrlPtr);
  }

  @Override
  public String getURL(long templateUrlPtr) {
    return (String)N.M_$aUIIC(templateUrlPtr);
  }

  public static TemplateUrl.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.components.search_engines.TemplateUrl.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new TemplateUrlJni();
  }
}
