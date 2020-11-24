// CredentialManagerError.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     third_party/blink/public/mojom/credentialmanager/credential_manager.mojom
//

package org.chromium.blink.mojom;

public final class CredentialManagerError {
    private static final boolean IS_EXTENSIBLE = false;

    public static final int SUCCESS = 0;
    public static final int PENDING_REQUEST = 1; // SUCCESS + 1
    public static final int PASSWORD_STORE_UNAVAILABLE = 2; // PENDING_REQUEST + 1
    public static final int NOT_ALLOWED = 3; // PASSWORD_STORE_UNAVAILABLE + 1
    public static final int INVALID_DOMAIN = 4; // NOT_ALLOWED + 1
    public static final int INVALID_ICON_URL = 5; // INVALID_DOMAIN + 1
    public static final int CREDENTIAL_EXCLUDED = 6; // INVALID_ICON_URL + 1
    public static final int CREDENTIAL_NOT_RECOGNIZED = 7; // CREDENTIAL_EXCLUDED + 1
    public static final int NOT_IMPLEMENTED = 8; // CREDENTIAL_NOT_RECOGNIZED + 1
    public static final int NOT_FOCUSED = 9; // NOT_IMPLEMENTED + 1
    public static final int RESIDENT_CREDENTIALS_UNSUPPORTED = 10; // NOT_FOCUSED + 1
    public static final int PROTECTION_POLICY_INCONSISTENT = 11; // RESIDENT_CREDENTIALS_UNSUPPORTED + 1
    public static final int ANDROID_ALGORITHM_UNSUPPORTED = 12; // PROTECTION_POLICY_INCONSISTENT + 1
    public static final int ANDROID_EMPTY_ALLOW_CREDENTIALS = 13; // ANDROID_ALGORITHM_UNSUPPORTED + 1
    public static final int ANDROID_NOT_SUPPORTED_ERROR = 14; // ANDROID_EMPTY_ALLOW_CREDENTIALS + 1
    public static final int ANDROID_USER_VERIFICATION_UNSUPPORTED = 15; // ANDROID_NOT_SUPPORTED_ERROR + 1
    public static final int ABORT = 16; // ANDROID_USER_VERIFICATION_UNSUPPORTED + 1
    public static final int OPAQUE_DOMAIN = 17; // ABORT + 1
    public static final int INVALID_PROTOCOL = 18; // OPAQUE_DOMAIN + 1
    public static final int BAD_RELYING_PARTY_ID = 19; // INVALID_PROTOCOL + 1
    public static final int UNKNOWN = 20; // BAD_RELYING_PARTY_ID + 1

    public static boolean isKnownValue(int value) {
        return value >= 0 && value <= 20;
    }

    public static void validate(int value) {
        if (IS_EXTENSIBLE || isKnownValue(value)) return;
        throw new org.chromium.mojo.bindings.DeserializationException("Invalid enum value.");
    }

    private CredentialManagerError() {}
}