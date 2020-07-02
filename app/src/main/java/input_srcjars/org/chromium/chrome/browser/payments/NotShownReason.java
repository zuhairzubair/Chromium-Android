
// Copyright 2020 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by
//     java_cpp_enum.py
// From
//     ../../components/payments/core/journey_logger.h

package org.chromium.chrome.browser.payments;

import androidx.annotation.IntDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@IntDef({
    NotShownReason.NO_MATCHING_PAYMENT_METHOD, NotShownReason.NO_SUPPORTED_PAYMENT_METHOD,
    NotShownReason.CONCURRENT_REQUESTS, NotShownReason.OTHER, NotShownReason.MAX
})
@Retention(RetentionPolicy.SOURCE)
public @interface NotShownReason {
  int NO_MATCHING_PAYMENT_METHOD = 0;
  int NO_SUPPORTED_PAYMENT_METHOD = 1;
  int CONCURRENT_REQUESTS = 2;
  int OTHER = 3;
  int MAX = 4;
}