// AuthenticatorStatus.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     third_party/blink/public/mojom/webauthn/authenticator.mojom
//

package org.chromium.blink.mojom;

public final class AuthenticatorStatus {
    private static final boolean IS_EXTENSIBLE = false;

    public static final int SUCCESS = 0;
    public static final int PENDING_REQUEST = 1; // SUCCESS + 1
    public static final int NOT_ALLOWED_ERROR = 2; // PENDING_REQUEST + 1
    public static final int INVALID_DOMAIN = 3; // NOT_ALLOWED_ERROR + 1
    public static final int INVALID_ICON_URL = 4; // INVALID_DOMAIN + 1
    public static final int CREDENTIAL_EXCLUDED = 5; // INVALID_ICON_URL + 1
    public static final int CREDENTIAL_NOT_RECOGNIZED = 6; // CREDENTIAL_EXCLUDED + 1
    public static final int NOT_IMPLEMENTED = 7; // CREDENTIAL_NOT_RECOGNIZED + 1
    public static final int NOT_FOCUSED = 8; // NOT_IMPLEMENTED + 1
    public static final int RESIDENT_CREDENTIALS_UNSUPPORTED = 9; // NOT_FOCUSED + 1
    public static final int USER_VERIFICATION_UNSUPPORTED = 10; // RESIDENT_CREDENTIALS_UNSUPPORTED + 1
    public static final int ALGORITHM_UNSUPPORTED = 11; // USER_VERIFICATION_UNSUPPORTED + 1
    public static final int EMPTY_ALLOW_CREDENTIALS = 12; // ALGORITHM_UNSUPPORTED + 1
    public static final int ANDROID_NOT_SUPPORTED_ERROR = 13; // EMPTY_ALLOW_CREDENTIALS + 1
    public static final int PROTECTION_POLICY_INCONSISTENT = 14; // ANDROID_NOT_SUPPORTED_ERROR + 1
    public static final int ABORT_ERROR = 15; // PROTECTION_POLICY_INCONSISTENT + 1
    public static final int OPAQUE_DOMAIN = 16; // ABORT_ERROR + 1
    public static final int INVALID_PROTOCOL = 17; // OPAQUE_DOMAIN + 1
    public static final int BAD_RELYING_PARTY_ID = 18; // INVALID_PROTOCOL + 1
    public static final int UNKNOWN_ERROR = 19; // BAD_RELYING_PARTY_ID + 1

    public static boolean isKnownValue(int value) {
        return value >= 0 && value <= 19;
    }

    public static void validate(int value) {
        if (IS_EXTENSIBLE || isKnownValue(value)) return;
        throw new org.chromium.mojo.bindings.DeserializationException("Invalid enum value.");
    }

    private AuthenticatorStatus() {}
}