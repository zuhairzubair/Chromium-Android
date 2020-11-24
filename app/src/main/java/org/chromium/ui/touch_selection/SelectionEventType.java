
// Copyright 2020 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by
//     java_cpp_enum.py
// From
//     ../../ui/touch_selection/selection_event_type.h

package org.chromium.ui.touch_selection;

import android.support.annotation.IntDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@IntDef({
    SelectionEventType.SELECTION_HANDLES_SHOWN, SelectionEventType.SELECTION_HANDLES_MOVED,
    SelectionEventType.SELECTION_HANDLES_CLEARED, SelectionEventType.SELECTION_HANDLE_DRAG_STARTED,
    SelectionEventType.SELECTION_HANDLE_DRAG_STOPPED, SelectionEventType.INSERTION_HANDLE_SHOWN,
    SelectionEventType.INSERTION_HANDLE_MOVED, SelectionEventType.INSERTION_HANDLE_TAPPED,
    SelectionEventType.INSERTION_HANDLE_CLEARED, SelectionEventType.INSERTION_HANDLE_DRAG_STARTED,
    SelectionEventType.INSERTION_HANDLE_DRAG_STOPPED
})
@Retention(RetentionPolicy.SOURCE)
public @interface SelectionEventType {
  int SELECTION_HANDLES_SHOWN = 0;
  int SELECTION_HANDLES_MOVED = 1;
  int SELECTION_HANDLES_CLEARED = 2;
  int SELECTION_HANDLE_DRAG_STARTED = 3;
  int SELECTION_HANDLE_DRAG_STOPPED = 4;
  int INSERTION_HANDLE_SHOWN = 5;
  int INSERTION_HANDLE_MOVED = 6;
  int INSERTION_HANDLE_TAPPED = 7;
  int INSERTION_HANDLE_CLEARED = 8;
  int INSERTION_HANDLE_DRAG_STARTED = 9;
  int INSERTION_HANDLE_DRAG_STOPPED = 10;
}