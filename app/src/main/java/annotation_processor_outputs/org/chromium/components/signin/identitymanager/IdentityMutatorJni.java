package org.chromium.components.signin.identitymanager;

import J.N;
import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.components.signin.base.CoreAccountId;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class IdentityMutatorJni implements IdentityMutator.Natives {
  private static IdentityMutator.Natives testInstance;

  public static final JniStaticTestMocker<IdentityMutator.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.components.signin.identitymanager.IdentityMutator.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.components.signin.identitymanager.IdentityMutator.Natives instance) {
      if (!J.N.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public boolean setPrimaryAccount(long nativeJniIdentityMutator, CoreAccountId accountId) {
    return (boolean)N.MASdubqY(nativeJniIdentityMutator, accountId);
  }

  @Override
  public boolean clearPrimaryAccount(long nativeJniIdentityMutator, int action, int sourceMetric,
      int deleteMetric) {
    return (boolean)N.Mw3X2cb0(nativeJniIdentityMutator, action, sourceMetric, deleteMetric);
  }

  @Override
  public void reloadAllAccountsFromSystemWithPrimaryAccount(long nativeJniIdentityMutator,
      CoreAccountId accountId) {
    N.McMy7mwQ(nativeJniIdentityMutator, accountId);
  }

  public static IdentityMutator.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.components.signin.identitymanager.IdentityMutator.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new IdentityMutatorJni();
  }
}
