package com.kponomarev.oneofthenewproject.feature.main.di

import com.kponomarev.oneofthenewproject.feature.main.presentation.MainActivityActor
import com.kponomarev.oneofthenewproject.feature.main.presentation.MainActivityReducer
import com.kponomarev.oneofthenewproject.feature.main.presentation.MainActivityState
import com.kponomarev.oneofthenewproject.feature.main.presentation.MainActivityStore
import dagger.Module
import dagger.Provides

@Module
class MainActivityModule {

    @Provides
    @MainActivityScope
    fun provideMainActivityStore(): MainActivityStore {
        return MainActivityStore(MainActivityState("state"), MainActivityReducer(), MainActivityActor())
    }
}
