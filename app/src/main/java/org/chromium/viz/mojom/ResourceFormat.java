// ResourceFormat.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     services/viz/public/mojom/compositing/transferable_resource.mojom
//

package org.chromium.viz.mojom;

public final class ResourceFormat {
    private static final boolean IS_EXTENSIBLE = false;

    public static final int RGBA_8888 = 0;
    public static final int RGBA_4444 = 1; // RGBA_8888 + 1
    public static final int BGRA_8888 = 2; // RGBA_4444 + 1
    public static final int ALPHA_8 = 3; // BGRA_8888 + 1
    public static final int LUMINANCE_8 = 4; // ALPHA_8 + 1
    public static final int RGB_565 = 5; // LUMINANCE_8 + 1
    public static final int BGR_565 = 6; // RGB_565 + 1
    public static final int ETC1 = 7; // BGR_565 + 1
    public static final int RED_8 = 8; // ETC1 + 1
    public static final int RG_88 = 9; // RED_8 + 1
    public static final int LUMINANCE_F16 = 10; // RG_88 + 1
    public static final int RGBA_F16 = 11; // LUMINANCE_F16 + 1
    public static final int R16_EXT = 12; // RGBA_F16 + 1
    public static final int RGBX_8888 = 13; // R16_EXT + 1
    public static final int BGRX_8888 = 14; // RGBX_8888 + 1
    public static final int RGBX_1010102 = 15; // BGRX_8888 + 1
    public static final int BGRX_1010102 = 16; // RGBX_1010102 + 1
    public static final int YVU_420 = 17; // BGRX_1010102 + 1
    public static final int YUV_420_BIPLANAR = 18; // YVU_420 + 1
    public static final int P010 = 19; // YUV_420_BIPLANAR + 1

    public static boolean isKnownValue(int value) {
        return value >= 0 && value <= 19;
    }

    public static void validate(int value) {
        if (IS_EXTENSIBLE || isKnownValue(value)) return;
        throw new org.chromium.mojo.bindings.DeserializationException("Invalid enum value.");
    }

    private ResourceFormat() {}
}