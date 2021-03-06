// DisplayMode.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     third_party/blink/public/mojom/manifest/display_mode.mojom
//

package org.chromium.blink.mojom;

public final class DisplayMode {
    private static final boolean IS_EXTENSIBLE = false;

    public static final int UNDEFINED = 0;
    public static final int BROWSER = 1; // UNDEFINED + 1
    public static final int MINIMAL_UI = 2; // BROWSER + 1
    public static final int STANDALONE = 3; // MINIMAL_UI + 1
    public static final int FULLSCREEN = 4; // STANDALONE + 1

    public static boolean isKnownValue(int value) {
        return value >= 0 && value <= 4;
    }

    public static void validate(int value) {
        if (IS_EXTENSIBLE || isKnownValue(value)) return;
        throw new org.chromium.mojo.bindings.DeserializationException("Invalid enum value.");
    }

    private DisplayMode() {}
}