/*
 * SPDX-FileCopyrightText: 2015 The CyanogenMod Project
 * SPDX-License-Identifier: Apache-2.0
 */

package flipflap.content;

import android.Manifest;

/**
 * LineageOS specific intent definition class.
 */
public class Intent {

    /**
     * Broadcast action: lid state changed
     */
    public static final String ACTION_LID_STATE_CHANGED =
            "flipflap.intent.action.LID_STATE_CHANGED";

    /**
     * This field is part of the intent {@link #ACTION_LID_STATE_CHANGED}.
     * Intent extra field for the state of lid/cover
     */
    public static final String EXTRA_LID_STATE =
            "flipflap.intent.extra.LID_STATE";

}
