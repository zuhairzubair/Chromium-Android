
// Copyright 2020 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by
//     java_cpp_enum.py
// From
//     ../../components/autofill_assistant/browser/viewport_mode.h

package org.chromium.chrome.browser.autofill_assistant;

import androidx.annotation.IntDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@IntDef({
    AssistantViewportMode.NO_RESIZE, AssistantViewportMode.RESIZE_LAYOUT_VIEWPORT,
    AssistantViewportMode.RESIZE_VISUAL_VIEWPORT
})
@Retention(RetentionPolicy.SOURCE)
public @interface AssistantViewportMode {
  /**
   * Don't resize the layout nor visual viewport.
   */
  int NO_RESIZE = 0;
  /**
   * Resize the layout viewport by the peek height of the sheet.
   */
  int RESIZE_LAYOUT_VIEWPORT = 1;
  /**
   * Resize the visual viewport by the height of the sheet.
   */
  int RESIZE_VISUAL_VIEWPORT = 2;
}