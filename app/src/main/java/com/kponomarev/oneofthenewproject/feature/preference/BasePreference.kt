package com.kponomarev.oneofthenewproject.feature.preference

import android.content.SharedPreferences

abstract class BasePreference<T>(
    protected val sharedPreferences: SharedPreferences,
    protected val key: String,
    protected val defaultValue: T
) : Preference<T> {

    override fun clear() {
        sharedPreferences.edit().remove(key).apply()
    }
}
