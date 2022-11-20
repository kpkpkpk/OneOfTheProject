package com.kponomarev.oneofthenewproject.data.model

import com.google.gson.annotations.SerializedName
import java.util.*
import androidx.annotation.Keep

@Keep
data class Coin(
    val id: String,
    val symbol: String,
    val name: String,
    @SerializedName("hashing_algorithm")
    val hashingAlgorithm: String,
    val image: Image,
    @SerializedName("genesis_date")
    val genesisDate: Date,
    @SerializedName("market_cap_rank")
    val marketCapRank: Int,
    @SerializedName("current_price")
    val currentPrice: Quotes,
    @SerializedName("total_volume")
    val totalVolume: Quotes,
    @SerializedName("high_24h")
    val high24h: Quotes,
    @SerializedName("low_24h")
    val low24h: Quotes,
    @SerializedName("price_change_percentage_24h")
    val priceChangePercentage24h: Double,
    @SerializedName("last_updated")
    val lastUpdated: Date,
)
