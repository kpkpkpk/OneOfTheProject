package com.kponomarev.oneofthenewproject.data.model

import androidx.annotation.Keep

@Keep
data class Quotes(
    val usd: Double,
    val rub: Double,
    val eur: Double,
)
