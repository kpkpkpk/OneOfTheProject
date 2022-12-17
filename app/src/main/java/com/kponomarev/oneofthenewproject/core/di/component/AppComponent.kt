package com.kponomarev.oneofthenewproject.core.di.component

import com.kponomarev.oneofthenewproject.core.di.modules.NetworkModule
import com.kponomarev.oneofthenewproject.feature.main.di.MainActivityDependencies
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [NetworkModule::class])
interface AppComponent : MainActivityDependencies {

    @Component.Builder
    interface Builder {
        fun build(): AppComponent
    }
}
