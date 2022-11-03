package com.kponomarev.oneofthenewproject.core.di.component

import com.kponomarev.oneofthenewproject.core.di.modules.StorageModule
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
