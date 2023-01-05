package com.kponomarev.oneofthenewproject.data.api

import com.kponomarev.oneofthenewproject.data.model.Anime
import retrofit2.http.GET
import retrofit2.http.Path

interface ConsumetApi {

    @GET("gogoanime/anime/{id}")
    suspend fun getFullAnimeInfo(
        @Path("id") id: String
    ): Anime
}
