package com.kponomarev.oneofthenewproject.data.model

import androidx.annotation.Keep

@Keep
data class Roi(
    val times: Double,
    val currency: String,
    val percentage: Double,
)
