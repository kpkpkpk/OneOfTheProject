package com.kponomarev.oneofthenewproject.feature.di

import android.content.Context
import com.kponomarev.oneofthenewproject.feature.login.LoginComponent
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [StorageModule::class, AppSubComponents::class, ])
interface AppComponent {

    @Component.Factory
    interface Factory {
        fun create(@BindsInstance context: Context): AppComponent
    }

    fun loginComponent(): LoginComponent.Factory
}
