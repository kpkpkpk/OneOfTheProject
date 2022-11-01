package com.kponomarev.oneofthenewproject

import android.app.Application
import com.kponomarev.oneofthenewproject.core.di.component.AppComponent
import com.kponomarev.oneofthenewproject.core.di.component.DaggerAppComponent
import com.kponomarev.oneofthenewproject.feature.main.di.DaggerMainActivityComponent

class MyApplication : Application() {

    val appComponent: AppComponent by lazy {
        DaggerAppComponent.builder().build()
    }

    val mainActivityComponent by lazy {
        // todo вынести создание стора в компонент, который переживет жц - VM
        DaggerMainActivityComponent.builder()
            .mainActivityDependencies(appComponent)
            .build()
    }
}
