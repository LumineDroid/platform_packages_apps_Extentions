/*
 * Copyright (C) 2025 LumineDroid
 * SPDX-License-Identifier: Apache-2.0
 */

package org.luminedroid.extentions

import com.android.internal.logging.nano.MetricsProto
import com.android.settings.dashboard.DashboardFragment
import com.android.settings.R
import com.android.settings.search.BaseSearchIndexProvider
import com.android.settingslib.search.SearchIndexable

@SearchIndexable
class Extentions : DashboardFragment() {

    override fun getPreferenceScreenResId(): Int {
        return R.xml.extentions
    }

    override fun getMetricsCategory(): Int {
        return MetricsProto.MetricsEvent.LUMINEDROID
    }

    override fun getLogTag(): String {
        return TAG
    }

    companion object {
        const val CATEGORY_KEY = "com.android.settings.category.ia.extentions"

        private const val TAG = "Extentions"

        @JvmField
        val SEARCH_INDEX_DATA_PROVIDER = BaseSearchIndexProvider(R.xml.extentions)
    }
}
