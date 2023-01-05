package com.kponomarev.oneofthenewproject.data.model

import androidx.annotation.Keep

@Keep
data class Anime(
    val id: String,
    val title: String,
    val image: String,
    val releaseDate: String?,
    val subOrDub: VoiceType,
    val url: String,
    val description: String?,
    val type: String?,
    val status: String,
    val otherName: String?,
    val totalEpisodes: Int,
    val episodes: List<Episode>
)
