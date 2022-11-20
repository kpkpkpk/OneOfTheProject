package com.kponomarev.oneofthenewproject.data.model

import androidx.annotation.Keep

@Keep
data class Image(
    val thumb: String,
    val small: String,
    val large: String,
)
