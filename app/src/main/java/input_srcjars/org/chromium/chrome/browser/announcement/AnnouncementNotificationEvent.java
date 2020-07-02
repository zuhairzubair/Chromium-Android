
// Copyright 2020 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by
//     java_cpp_enum.py
// From
//     ../../chrome/browser/updates/announcement_notification/announcement_notification_metrics.h

package org.chromium.chrome.browser.announcement;

import androidx.annotation.IntDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@IntDef({
    AnnouncementNotificationEvent.START, AnnouncementNotificationEvent.SHOWN,
    AnnouncementNotificationEvent.CLICK, AnnouncementNotificationEvent.CLOSE,
    AnnouncementNotificationEvent.ACK, AnnouncementNotificationEvent.OPEN,
    AnnouncementNotificationEvent.MAX_VALUE
})
@Retention(RetentionPolicy.SOURCE)
public @interface AnnouncementNotificationEvent {
  /**
   * Starts to check whether to show announcement notification.
   */
  int START = 0;
  /**
   * Notification is shown.
   */
  int SHOWN = 1;
  /**
   * Notification is clicked.
   */
  int CLICK = 2;
  /**
   * Notification is closed.
   */
  int CLOSE = 3;
  /**
   * The acknowledge button is clicked.
   */
  int ACK = 4;
  /**
   * The open button is clicked.
   */
  int OPEN = 5;
  int MAX_VALUE = OPEN;
}