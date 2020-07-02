// Copyright 2019 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package org.chromium.chrome.browser.download.home.list.holder;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import org.chromium.chrome.browser.download.home.list.ListItem;
import org.chromium.chrome.download.R;
import org.chromium.ui.modelutil.PropertyModel;

/**
 * A {@link RecyclerView.ViewHolder} meant to display a divider at the bottom of a group card.
 */
public class CardDividerBottomViewHolder extends ListItemViewHolder {
    /**
     * Creates a new {@link CardDividerBottomViewHolder} instance.
     */
    public static CardDividerBottomViewHolder create(ViewGroup parent) {
        View view = LayoutInflater.from(parent.getContext())
                            .inflate(R.layout.download_manager_card_divider_bottom, null);
        return new CardDividerBottomViewHolder(view);
    }

    private CardDividerBottomViewHolder(View view) {
        super(view);
    }

    @Override
    public void bind(PropertyModel properties, ListItem item) {}
}