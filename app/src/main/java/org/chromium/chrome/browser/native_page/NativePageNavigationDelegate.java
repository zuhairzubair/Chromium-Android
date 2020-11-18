// Copyright 2018 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package org.chromium.chrome.browser.native_page;

import android.support.annotation.Nullable;

import org.chromium.chrome.browser.incognito.IncognitoUtils;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.content_public.browser.LoadUrlParams;

/**
 * Interface exposing to the common methods to navigate to content shown in native page UIs.
 */
public interface NativePageNavigationDelegate {
    /** @return Whether context menus should allow the option to open a link in incognito. */
    default boolean isOpenInIncognitoEnabled() {
        return IncognitoUtils.isIncognitoModeEnabled();
    }

    /** @return Whether context menus should allow the option to open a link in a new window. */
    boolean isOpenInNewWindowEnabled();

    /** Opens the help page in the current tab. */
    default void navigateToHelpPage() {} // Does nothing.

    /**
     * Opens an URL with the desired disposition.
     * @return The tab where the URL is being loaded, if it is accessible. Cases where no tab is
     * returned include opening incognito tabs or opening the URL in a new window.
     */
    @Nullable
    Tab openUrl(int windowOpenDisposition, LoadUrlParams loadUrlParams);
}
