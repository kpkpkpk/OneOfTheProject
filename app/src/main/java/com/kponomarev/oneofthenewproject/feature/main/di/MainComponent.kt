package com.kponomarev.oneofthenewproject.feature.main.di

import com.kponomarev.oneofthenewproject.feature.data.api.CoinsApi
import dagger.Component

@MainScope
@Component(dependencies = [MainDependencies::class])
interface MainComponent {

    val coinsApi: CoinsApi

    @Component.Builder
    interface Builder {
        fun mainDependencies(dependencies: MainDependencies): Builder
        fun build(): MainComponent
    }
}