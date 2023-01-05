package com.kponomarev.oneofthenewproject.data.model

import com.google.gson.annotations.SerializedName

enum class AnimeStatus {

    @SerializedName("Ongoing")
    ONGOING,
    @SerializedName("Completed")
    COMPLETED,
    @SerializedName("Not yet aired")
    NOT_YET_AIRED,
    @SerializedName("Unknown")
    UNKNOWN
}
