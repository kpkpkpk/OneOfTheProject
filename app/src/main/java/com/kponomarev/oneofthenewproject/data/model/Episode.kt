package com.kponomarev.oneofthenewproject.data.model

import androidx.annotation.Keep

@Keep
data class Episode(
    val id: String,
    val number: Int,
    val url: String
)
