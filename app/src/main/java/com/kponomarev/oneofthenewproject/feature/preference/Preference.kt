package com.kponomarev.oneofthenewproject.feature.preference

interface Preference<T> {
    fun set(key: String, value: T)
    fun get(key: String, defaultValue: T): T
    fun clear()
}
