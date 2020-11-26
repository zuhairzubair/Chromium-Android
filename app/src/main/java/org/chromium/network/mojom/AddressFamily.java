// AddressFamily.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     services/network/public/mojom/address_family.mojom
//

package org.chromium.network.mojom;

public final class AddressFamily {
    private static final boolean IS_EXTENSIBLE = false;

    public static final int UNSPECIFIED = 0;
    public static final int IPV4 = 1; // UNSPECIFIED + 1
    public static final int IPV6 = 2; // IPV4 + 1

    public static boolean isKnownValue(int value) {
        return value >= 0 && value <= 2;
    }

    public static void validate(int value) {
        if (IS_EXTENSIBLE || isKnownValue(value)) return;
        throw new org.chromium.mojo.bindings.DeserializationException("Invalid enum value.");
    }

    private AddressFamily() {}
}