package com.kponomarev.oneofthenewproject.feature.data.model

import java.util.*
import com.google.gson.annotations.SerializedName
import androidx.annotation.Keep

@Keep
data class CoinMarket(
    val id: String,
    val symbol: String,
    val name: String,
    val image: String,
    @SerializedName("current_price")
    val currentPrice: Double,
    @SerializedName("market_cap")
    val marketCap: Double,
    @SerializedName("market_cap_rank")
    val marketCapRank: Int,
    @SerializedName("high_24h")
    val high24h: Double,
    @SerializedName("low_24h")
    val low24h: Double,
    @SerializedName("price_change_percentage_24h")
    val priceChangePercentage24h: Double,
    @SerializedName("last_updated")
    val lastUpdated: Date,
)
