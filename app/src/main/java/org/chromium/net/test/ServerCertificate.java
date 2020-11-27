package org.chromium.net.test;

import androidx.annotation.IntDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@IntDef({
        ServerCertificate.CERT_OK, ServerCertificate.CERT_MISMATCHED_NAME,
        ServerCertificate.CERT_EXPIRED, ServerCertificate.CERT_CHAIN_WRONG_ROOT,
        ServerCertificate.CERT_COMMON_NAME_IS_DOMAIN, ServerCertificate.CERT_COMMON_NAME_ONLY,
        ServerCertificate.CERT_SHA1_LEAF, ServerCertificate.CERT_OK_BY_INTERMEDIATE,
        ServerCertificate.CERT_BAD_VALIDITY, ServerCertificate.CERT_TEST_NAMES,
        ServerCertificate.CERT_KEY_USAGE_RSA_ENCIPHERMENT,
        ServerCertificate.CERT_KEY_USAGE_RSA_DIGITAL_SIGNATURE, ServerCertificate.CERT_AUTO
})
@Retention(RetentionPolicy.SOURCE)
public @interface ServerCertificate {
    int CERT_OK = 0;
    int CERT_MISMATCHED_NAME = 1;
    int CERT_EXPIRED = 2;
    /**
     * Cross-signed certificate to test PKIX path building. Contains an intermediate cross-signed by
     * an unknown root, while the client (via TestRootStore) is expected to have a self-signed version
     * of the intermediate.
     */
    int CERT_CHAIN_WRONG_ROOT = 3;
    /**
     * Causes the testserver to use a hostname that is a domain instead of an IP.
     */
    int CERT_COMMON_NAME_IS_DOMAIN = 4;
    /**
     * A certificate that only contains a commonName, rather than also including a subjectAltName
     * extension.
     */
    int CERT_COMMON_NAME_ONLY = 5;
    /**
     * A certificate that is a leaf certificate signed with SHA-1.
     */
    int CERT_SHA1_LEAF = 6;
    /**
     * A certificate that is signed by an intermediate certificate.
     */
    int CERT_OK_BY_INTERMEDIATE = 7;
    /**
     * A certificate with invalid notBefore and notAfter times. Windows' certificate library will not
     * parse this certificate.
     */
    int CERT_BAD_VALIDITY = 8;
    /**
     * A certificate that covers a number of test names. See [test_names] in
     * net/data/ssl/scripts/ee.cnf. More may be added by editing this list and and rerunning
     * net/data/ssl/scripts/generate-test-certs.sh.
     */
    int CERT_TEST_NAMES = 9;
    /**
     * An RSA certificate with the keyUsage extension specifying that the key is only for
     * encipherment.
     */
    int CERT_KEY_USAGE_RSA_ENCIPHERMENT = 10;
    /**
     * An RSA certificate with the keyUsage extension specifying that the key is only for digital
     * signatures.
     */
    int CERT_KEY_USAGE_RSA_DIGITAL_SIGNATURE = 11;
    /**
     * A certificate will be generated at runtime. A ServerCertificateConfig passed to SetSSLConfig
     * may be used to configure the details of the generated certificate.
     */
    int CERT_AUTO = 12;
}