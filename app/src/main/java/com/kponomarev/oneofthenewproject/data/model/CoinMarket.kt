package com.kponomarev.oneofthenewproject.data.model

import java.util.*

data class CoinMarket(
    val id: String,
    val symbol: String,
    val name: String,
    val image: String?,
    val currentPrice: Double?,
    val marketCap: Long?,
    val marketCapRank: Int?,
    val fullyDilutedValuation: Long?,
    val totalVolume: Long?,
    val high24h: Double?,
    val low24h: Double?,
    val priceChange24h: Double?,
    val priceChangePercentage24h: Double?,
    val marketCapChange24h: Long?,
    val marketCapChangePercentage24h: Double?,
    val circulatingSupply: Long?,
    val totalSupply: Long?,
    val maxSupply: Long?,
    val ath: Long?,
    val athChangePercentage: Double?,
    val atlDate: Date?,
    val roi: Roi?,
    val lastUpdated: Date?,
)
