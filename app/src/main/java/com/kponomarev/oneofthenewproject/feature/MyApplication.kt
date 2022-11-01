package com.kponomarev.oneofthenewproject.feature

import android.app.Application
import com.kponomarev.oneofthenewproject.feature.di.AppComponent
import com.kponomarev.oneofthenewproject.feature.di.DaggerAppComponent

open class MyApplication : Application() {
    val appComponent: AppComponent by lazy {
        DaggerAppComponent.factory().create(applicationContext)
    }
}
