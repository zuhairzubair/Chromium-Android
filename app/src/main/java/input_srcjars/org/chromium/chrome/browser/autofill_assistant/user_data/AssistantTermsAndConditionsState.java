
// Copyright 2020 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by
//     java_cpp_enum.py
// From
//     ../../components/autofill_assistant/browser/user_data.h

package org.chromium.chrome.browser.autofill_assistant.user_data;

import androidx.annotation.IntDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@IntDef({
    AssistantTermsAndConditionsState.NOT_SELECTED, AssistantTermsAndConditionsState.ACCEPTED,
    AssistantTermsAndConditionsState.REQUIRES_REVIEW
})
@Retention(RetentionPolicy.SOURCE)
public @interface AssistantTermsAndConditionsState {
  int NOT_SELECTED = 0;
  int ACCEPTED = 1;
  int REQUIRES_REVIEW = 2;
}
