package com.kponomarev.oneofthenewproject.feature.main.di

import com.kponomarev.oneofthenewproject.feature.data.api.CoinsApi

interface MainDependencies {
    val coinsApi: CoinsApi
}