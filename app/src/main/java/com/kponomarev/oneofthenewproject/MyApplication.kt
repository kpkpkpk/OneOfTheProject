package com.kponomarev.oneofthenewproject

import android.app.Application
import com.kponomarev.oneofthenewproject.core.di.component.AppComponent
import com.kponomarev.oneofthenewproject.core.di.component.DaggerAppComponent
import com.kponomarev.oneofthenewproject.feature.main.di.DaggerMainActivityComponent
import com.kponomarev.oneofthenewproject.feature.main.di.MainActivityComponent

class MyApplication : Application() {

    private val appComponent: AppComponent by lazy {
        DaggerAppComponent.builder().build()
    }

    val mainActivityComponent: MainActivityComponent by lazy {
        DaggerMainActivityComponent.builder()
            .mainActivityDependencies(appComponent)
            .build()
    }
}
