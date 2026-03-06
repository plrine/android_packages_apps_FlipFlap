/*
 * SPDX-FileCopyrightText: 2015 The CyanogenMod Project
 * SPDX-License-Identifier: Apache-2.0
 */
package org.lineageos.internal.util;

import android.content.Context;
import android.provider.Settings;

import com.android.internal.widget.LockPatternUtils;

import org.lineageos.providers.LineageSettings;

public class LineageLockPatternUtils extends LockPatternUtils {
    private final Context mContext;

    public LineageLockPatternUtils(Context context) {
        super(context);
        mContext = context;
    }

    public boolean shouldPassToSecurityView(int userId) {
        return Settings.System.getIntForUser(mContext.getContentResolver(),
                LineageSettings.System.LOCK_PASS_TO_SECURITY_VIEW, 0, userId) != 0;
    }

    public void setPassToSecurityView(boolean enabled, int userId) {
        Settings.System.putIntForUser(mContext.getContentResolver(),
                LineageSettings.System.LOCK_PASS_TO_SECURITY_VIEW, enabled ? 1 : 0, userId);
    }
}
