package com.kponomarev.oneofthenewproject.feature.di.component

import com.kponomarev.oneofthenewproject.feature.di.modules.StorageModule
import com.kponomarev.oneofthenewproject.feature.login.LoginComponent
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [
    StorageModule::class
],
dependencies = [])
interface AppComponent {

    @Component.Builder
    interface Builder {
        fun build(): AppComponent
    }

    fun loginComponent(): LoginComponent.Factory
}
