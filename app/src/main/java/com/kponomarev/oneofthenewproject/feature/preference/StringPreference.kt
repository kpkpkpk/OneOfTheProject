package com.kponomarev.oneofthenewproject.feature.preference

import android.content.SharedPreferences
import javax.inject.Inject

class StringPreference @Inject constructor(
    sharedPreferences: SharedPreferences,
    key: String,
    defaultValue: String? = null
) : BasePreference<String?>(sharedPreferences, key, defaultValue) {
    override fun set(key: String, value: String?) {
        sharedPreferences.edit().putString(key, value).apply()
    }

    override fun get(key: String, defaultValue: String?): String? {
        return sharedPreferences.getString(key, defaultValue) ?: defaultValue
    }

    override fun clear() {
        sharedPreferences.all.clear()
    }
}
