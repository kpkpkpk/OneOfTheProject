package com.kponomarev.oneofthenewproject.core.preference

interface Preference<T> {
    fun set(key: String, value: T)
    fun get(key: String, defaultValue: T): T
    fun clear()
}
