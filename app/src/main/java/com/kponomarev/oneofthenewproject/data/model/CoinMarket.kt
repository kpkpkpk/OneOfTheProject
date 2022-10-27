package com.kponomarev.oneofthenewproject.data.model

import java.util.*

data class CoinMarket(
    val id: String,
    val symbol: String,
    val name: String,
    val image: String?,
    val currentPrice: Double?,
    val marketCap: Double?,
    val marketCapRank: Int?,
    val fullyDilutedValuation: Double?,
    val totalVolume: Double?,
    val high24h: Double?,
    val low24h: Double?,
    val priceChange24h: Double?,
    val priceChangePercentage24h: Double?,
    val marketCapChange24h: Double?,
    val marketCapChangePercentage24h: Double?,
    val circulatingSupply: Double?,
    val totalSupply: Double?,
    val maxSupply: Double?,
    val ath: Double?,
    val athChangePercentage: Double?,
    val atlDate: Date?,
    val roi: Roi?,
    val lastUpdated: Date?,
)
