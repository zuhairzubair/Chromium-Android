
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
    FeatureModuleInstallation.DFM_BACKGROUND_INSTALLATION_REQUESTED,
    FeatureModuleInstallation.DFM_FOREGROUND_INSTALLATION_SUCCEEDED,
    FeatureModuleInstallation.DFM_FOREGROUND_INSTALLATION_FAILED,
    FeatureModuleInstallation.DFM_ALREADY_INSTALLED, FeatureModuleInstallation.MAX_VALUE
})
@Retention(RetentionPolicy.SOURCE)
public @interface FeatureModuleInstallation {
  int DFM_BACKGROUND_INSTALLATION_REQUESTED = 0;
  int DFM_FOREGROUND_INSTALLATION_SUCCEEDED = 1;
  int DFM_FOREGROUND_INSTALLATION_FAILED = 2;
  int DFM_ALREADY_INSTALLED = 3;
  int MAX_VALUE = DFM_ALREADY_INSTALLED;
}
