package com.kponomarev.oneofthenewproject.core.di.component

import com.kponomarev.oneofthenewproject.core.di.modules.NetworkModule
import com.kponomarev.oneofthenewproject.core.di.modules.StorageModule
import com.kponomarev.oneofthenewproject.feature.main.di.MainDependencies
import dagger.Component
import javax.inject.Singleton

@Component(modules = [StorageModule::class, NetworkModule::class])
interface AppComponent : MainDependencies {

    @Component.Builder
    interface Builder {
        fun build(): AppComponent
    }

}
