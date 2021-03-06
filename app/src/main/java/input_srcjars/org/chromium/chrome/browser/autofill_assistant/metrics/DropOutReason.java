
// Copyright 2020 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by
//     java_cpp_enum.py
// From
//     ../../components/autofill_assistant/browser/metrics.h

package org.chromium.chrome.browser.autofill_assistant.metrics;

import android.support.annotation.IntDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@IntDef({
    DropOutReason.AA_START, DropOutReason.AUTOSTART_TIMEOUT, DropOutReason.NO_SCRIPTS,
    DropOutReason.CUSTOM_TAB_CLOSED, DropOutReason.DECLINED, DropOutReason.SHEET_CLOSED,
    DropOutReason.SCRIPT_FAILED, DropOutReason.NAVIGATION, DropOutReason.OVERLAY_STOP,
    DropOutReason.PR_FAILED, DropOutReason.CONTENT_DESTROYED, DropOutReason.RENDER_PROCESS_GONE,
    DropOutReason.INTERSTITIAL_PAGE, DropOutReason.SCRIPT_SHUTDOWN,
    DropOutReason.SAFETY_NET_TERMINATE, DropOutReason.TAB_DETACHED, DropOutReason.TAB_CHANGED,
    DropOutReason.GET_SCRIPTS_FAILED, DropOutReason.GET_SCRIPTS_UNPARSABLE,
    DropOutReason.NO_INITIAL_SCRIPTS, DropOutReason.DFM_INSTALL_FAILED, DropOutReason.MAX_VALUE
})
@Retention(RetentionPolicy.SOURCE)
public @interface DropOutReason {
  int AA_START = 0;
  int AUTOSTART_TIMEOUT = 1;
  int NO_SCRIPTS = 2;
  int CUSTOM_TAB_CLOSED = 3;
  int DECLINED = 4;
  int SHEET_CLOSED = 5;
  int SCRIPT_FAILED = 6;
  int NAVIGATION = 7;
  int OVERLAY_STOP = 8;
  int PR_FAILED = 9;
  int CONTENT_DESTROYED = 10;
  int RENDER_PROCESS_GONE = 11;
  int INTERSTITIAL_PAGE = 12;
  int SCRIPT_SHUTDOWN = 13;
  int SAFETY_NET_TERMINATE = 14;
  int TAB_DETACHED = 15;
  int TAB_CHANGED = 16;
  int GET_SCRIPTS_FAILED = 17;
  int GET_SCRIPTS_UNPARSABLE = 18;
  int NO_INITIAL_SCRIPTS = 19;
  int DFM_INSTALL_FAILED = 20;
  int MAX_VALUE = DFM_INSTALL_FAILED;
}
