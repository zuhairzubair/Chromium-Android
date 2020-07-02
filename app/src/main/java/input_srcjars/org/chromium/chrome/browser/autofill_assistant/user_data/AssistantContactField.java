
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
    AssistantContactField.NAME_FULL, AssistantContactField.EMAIL_ADDRESS,
    AssistantContactField.PHONE_HOME_WHOLE_NUMBER
})
@Retention(RetentionPolicy.SOURCE)
public @interface AssistantContactField {
  int NAME_FULL = 7;
  int EMAIL_ADDRESS = 9;
  int PHONE_HOME_WHOLE_NUMBER = 14;
}