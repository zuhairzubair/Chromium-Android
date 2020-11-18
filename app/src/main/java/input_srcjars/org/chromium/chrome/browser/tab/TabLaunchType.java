
// Copyright 2020 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by
//     java_cpp_enum.py
// From
//     ../../chrome/browser/ui/android/tab_model/tab_model.h

package org.chromium.chrome.browser.tab;

import android.support.annotation.IntDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@IntDef({
    TabLaunchType.FROM_LINK, TabLaunchType.FROM_EXTERNAL_APP, TabLaunchType.FROM_CHROME_UI,
    TabLaunchType.FROM_RESTORE, TabLaunchType.FROM_LONGPRESS_FOREGROUND,
    TabLaunchType.FROM_LONGPRESS_BACKGROUND, TabLaunchType.FROM_REPARENTING,
    TabLaunchType.FROM_LAUNCHER_SHORTCUT, TabLaunchType.FROM_SPECULATIVE_BACKGROUND_CREATION,
    TabLaunchType.FROM_BROWSER_ACTIONS, TabLaunchType.FROM_LAUNCH_NEW_INCOGNITO_TAB,
    TabLaunchType.FROM_STARTUP, TabLaunchType.FROM_START_SURFACE, TabLaunchType.SIZE
})
@Retention(RetentionPolicy.SOURCE)
public @interface TabLaunchType {
  /**
   * Opened from a link. Sets up a relationship between the newly created tab and its parent.
   */
  int FROM_LINK = 0;
  /**
   * Opened by an external app.
   */
  int FROM_EXTERNAL_APP = 1;
  /**
   * Catch-all for Tabs opened by Chrome UI not covered by more specific TabLaunchTypes. Examples
   * include: - Tabs created by the options menu. - Tabs created via the New Tab button in the tab
   * stack overview. - Tabs created via Push Notifications. - Tabs opened via a keyboard shortcut.
   */
  int FROM_CHROME_UI = 2;
  /**
   * Opened during the restoration process on startup or when merging two instances of Chrome in
   * Android N+ multi-instance mode.
   */
  int FROM_RESTORE = 3;
  /**
   * Opened from the long press context menu. Will be brought to the foreground. Like
   * FROM_CHROME_UI, but also sets up a parent/child relationship like FROM_LINK.
   */
  int FROM_LONGPRESS_FOREGROUND = 4;
  /**
   * Opened from the long press context menu. Will not be brought to the foreground. Like
   * FROM_CHROME_UI, but also sets up a parent/child relationship like FROM_LINK.
   */
  int FROM_LONGPRESS_BACKGROUND = 5;
  /**
   * Changed windows by moving from one activity to another. Will be opened in the foreground.
   */
  int FROM_REPARENTING = 6;
  /**
   * Opened from a launcher shortcut.
   */
  int FROM_LAUNCHER_SHORTCUT = 7;
  /**
   * The tab is created by CCT in the background and detached from ChromeActivity.
   */
  int FROM_SPECULATIVE_BACKGROUND_CREATION = 8;
  /**
   * Opened in the background from Browser Actions context menu.
   */
  int FROM_BROWSER_ACTIONS = 9;
  /**
   * Opened by an external application launching a new Chrome incognito tab.
   */
  int FROM_LAUNCH_NEW_INCOGNITO_TAB = 10;
  /**
   * Opened a non-restored tab during the startup process
   */
  int FROM_STARTUP = 11;
  /**
   * Opened from the start surface.
   */
  int FROM_START_SURFACE = 12;
  /**
   * Must be last.
   */
  int SIZE = 13;
}
