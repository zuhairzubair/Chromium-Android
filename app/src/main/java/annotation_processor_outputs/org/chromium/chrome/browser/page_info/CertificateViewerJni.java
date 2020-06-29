package org.chromium.chrome.browser.page_info;

import J.N;
import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class CertificateViewerJni implements CertificateViewer.Natives {
  private static CertificateViewer.Natives testInstance;

  public static final JniStaticTestMocker<CertificateViewer.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.page_info.CertificateViewer.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.page_info.CertificateViewer.Natives instance) {
      if (!J.N.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public String getCertIssuedToText() {
    return (String)N.M5pYmpQY();
  }

  @Override
  public String getCertInfoCommonNameText() {
    return (String)N.M4hdCqVP();
  }

  @Override
  public String getCertInfoOrganizationText() {
    return (String)N.ML$Id2$r();
  }

  @Override
  public String getCertInfoSerialNumberText() {
    return (String)N.MM_MxPQr();
  }

  @Override
  public String getCertInfoOrganizationUnitText() {
    return (String)N.MPC7XSD8();
  }

  @Override
  public String getCertIssuedByText() {
    return (String)N.MUt2rDXf();
  }

  @Override
  public String getCertValidityText() {
    return (String)N.MLqm8avW();
  }

  @Override
  public String getCertIssuedOnText() {
    return (String)N.Mr5OqkYg();
  }

  @Override
  public String getCertExpiresOnText() {
    return (String)N.MgRy9Cx2();
  }

  @Override
  public String getCertFingerprintsText() {
    return (String)N.MEGCGZiV();
  }

  @Override
  public String getCertSHA256FingerprintText() {
    return (String)N.MaoyqkG2();
  }

  @Override
  public String getCertSHA1FingerprintText() {
    return (String)N.MQ238bKU();
  }

  @Override
  public String getCertExtensionText() {
    return (String)N.M1q5eMK9();
  }

  @Override
  public String getCertSANText() {
    return (String)N.MGYyyTvf();
  }

  public static CertificateViewer.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.page_info.CertificateViewer.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new CertificateViewerJni();
  }
}
