package com.kponomarev.oneofthenewproject.feature.data.model

import androidx.annotation.Keep

@Keep
data class Quotes(
    val usd: Double,
    val rub: Double,
    val eur: Double,
)
