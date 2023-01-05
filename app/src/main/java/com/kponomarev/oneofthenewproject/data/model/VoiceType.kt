package com.kponomarev.oneofthenewproject.data.model

import com.google.gson.annotations.SerializedName

enum class VoiceType {
    @SerializedName("sub")
    SUBTITLES,
    @SerializedName("dub")
    DUBBING()
}
