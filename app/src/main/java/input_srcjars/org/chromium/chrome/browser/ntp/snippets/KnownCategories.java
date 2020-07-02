
// Copyright 2020 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by
//     java_cpp_enum.py
// From
//     ../../components/ntp_snippets/category.h

package org.chromium.chrome.browser.ntp.snippets;

import androidx.annotation.IntDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@IntDef({
    KnownCategories.RECENT_TABS_DEPRECATED, KnownCategories.DOWNLOADS_DEPRECATED,
    KnownCategories.BOOKMARKS_DEPRECATED, KnownCategories.PHYSICAL_WEB_PAGES_DEPRECATED,
    KnownCategories.FOREIGN_TABS_DEPRECATED, KnownCategories.READING_LIST,
    KnownCategories.LOCAL_CATEGORIES_COUNT, KnownCategories.REMOTE_CATEGORIES_OFFSET,
    KnownCategories.ARTICLES, KnownCategories.LAST_KNOWN_REMOTE_CATEGORY
})
@Retention(RetentionPolicy.SOURCE)
public @interface KnownCategories {
  /**
   * Pages recently downloaded during normal navigation.
   */
  int RECENT_TABS_DEPRECATED = 0;
  /**
   * Pages downloaded by the user for offline consumption.
   */
  int DOWNLOADS_DEPRECATED = 1;
  /**
   * Recently used bookmarks.
   */
  int BOOKMARKS_DEPRECATED = 2;
  /**
   * Physical Web page available in the vicinity.
   */
  int PHYSICAL_WEB_PAGES_DEPRECATED = 3;
  /**
   * Pages recently browsed to on other devices.
   */
  int FOREIGN_TABS_DEPRECATED = 4;
  /**
   * Pages from the user reading list.
   */
  int READING_LIST = 5;
  /**
   * ****************** INSERT NEW LOCAL CATEGORIES HERE! ****************** Existing categories are
   * persisted and they must never be removed. This may happen implicitly, e.g. when an older
   * version without some local category is installed. Follows the last local category.
   */
  int LOCAL_CATEGORIES_COUNT = 6;
  /**
   * Remote categories come after this.
   */
  int REMOTE_CATEGORIES_OFFSET = 10000;
  /**
   * Articles for you.
   */
  int ARTICLES = 10001;
  /**
   * Categories 10002-10008 are defined on the server. ****************** INSERT NEW REMOTE
   * CATEGORIES HERE! ****************** Update the list on the server first. Here specify the ID
   * explicitly. Tracks the last known remote category
   */
  int LAST_KNOWN_REMOTE_CATEGORY = 10001;
}