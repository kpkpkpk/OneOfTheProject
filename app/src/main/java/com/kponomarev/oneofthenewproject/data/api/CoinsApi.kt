package com.kponomarev.oneofthenewproject.data.api

import com.kponomarev.oneofthenewproject.data.model.CoinMarket
import retrofit2.http.GET
import retrofit2.http.Query

interface CoinsApi {
    @GET("/coins/list")
    suspend fun getListAllCoins(): List<CoinMarket>

    @GET("/coins/markets")
    suspend fun getListAllMarkets(
        @Query("vs_currency") vsCurrency: String,
        @Query("ids") ids: String,
    ): List<CoinMarket>
}
