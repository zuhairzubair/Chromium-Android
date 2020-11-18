
// Copyright 2020 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by
//     java_cpp_enum.py
// From
//     ../../components/favicon_base/favicon_types.h

package org.chromium.chrome.browser.favicon;

import android.support.annotation.IntDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@IntDef({
    IconType.INVALID, IconType.FAVICON, IconType.TOUCH_ICON, IconType.TOUCH_PRECOMPOSED_ICON,
    IconType.WEB_MANIFEST_ICON, IconType.MAX, IconType.COUNT
})
@Retention(RetentionPolicy.SOURCE)
public @interface IconType {
  int INVALID = 0;
  int FAVICON = 1;
  int TOUCH_ICON = 2;
  int TOUCH_PRECOMPOSED_ICON = 3;
  int WEB_MANIFEST_ICON = 4;
  int MAX = 4;
  int COUNT = 5;
}
