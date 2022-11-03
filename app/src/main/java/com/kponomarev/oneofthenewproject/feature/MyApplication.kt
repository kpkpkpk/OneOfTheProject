package com.kponomarev.oneofthenewproject.feature

import android.app.Application
import com.kponomarev.oneofthenewproject.feature.di.component.AppComponent
import com.kponomarev.oneofthenewproject.feature.di.component.DaggerAppComponent

open class MyApplication : Application() {
    val appComponent: AppComponent by lazy {
        DaggerAppComponent
            .builder()
            .build()
    }
}
