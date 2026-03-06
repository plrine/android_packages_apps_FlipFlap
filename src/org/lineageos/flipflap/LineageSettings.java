/**
 * Copyright (C) 2023 The LibreMobileOS Foundation
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.lineageos.providers;

import android.provider.Settings;
import android.util.Log;


/**
 * LineageSettings contains LineageOS specific preferences in System, Secure, and Global.
 */
public final class LineageSettings {
    private static final String TAG = "LineageSettings";

    /**
     * System settings, containing miscellaneous LineageOS system preferences. This table holds simple
     * name/value pairs. There are convenience functions for accessing individual settings entries.
     */
    public static final class System extends Settings.NameValueTable {
        // region System Settings

        /**
         * Whether keyguard will direct show security view (0 = false, 1 = true)
         * @hide
         */
        public static final String LOCK_PASS_TO_SECURITY_VIEW = "lock_screen_pass_to_security_view";
        // endregion System Settings
    }
}