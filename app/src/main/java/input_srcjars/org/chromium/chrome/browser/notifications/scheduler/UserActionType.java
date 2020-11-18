
// Copyright 2020 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by
//     java_cpp_enum.py
// From
//     ../../chrome/browser/notifications/scheduler/public/notification_scheduler_types.h

package org.chromium.chrome.browser.notifications.scheduler;

import android.support.annotation.IntDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@IntDef({
    UserActionType.CLICK, UserActionType.BUTTON_CLICK, UserActionType.DISMISS,
    UserActionType.MAX_VALUE
})
@Retention(RetentionPolicy.SOURCE)
public @interface UserActionType {
  /**
   * The user clicks on the notification body.
   */
  int CLICK = 0;
  /**
   * The user clicks on the notification button.
   */
  int BUTTON_CLICK = 1;
  /**
   * The user dismisses the notification.
   */
  int DISMISS = 2;
  int MAX_VALUE = DISMISS;
}
