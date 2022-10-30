package com.kponomarev.oneofthenewproject.feature.data.model

import androidx.annotation.Keep

@Keep
data class Roi(
    val times: Double,
    val currency: String,
    val percentage: Double,
)
