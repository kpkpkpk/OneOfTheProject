package com.kponomarev.oneofthenewproject.feature.data.api

import com.kponomarev.oneofthenewproject.feature.data.model.Coin
import com.kponomarev.oneofthenewproject.feature.data.model.CoinMarket
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.QueryMap

interface CoinsApi {
    @GET("coins/list")
    suspend fun getListAllCoins(): List<CoinMarket>

    @GET("coins/markets")
    suspend fun getListAllMarkets(
        @QueryMap parameters: Map<String, String>,
    ): List<CoinMarket>

    @GET("coins/{id}")
    suspend fun getCoin(
        @Path("id") id: String,
        @QueryMap parameters: Map<String, String>,
    ): Coin
}
