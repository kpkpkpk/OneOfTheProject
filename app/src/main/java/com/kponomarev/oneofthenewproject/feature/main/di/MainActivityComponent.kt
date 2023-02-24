package com.kponomarev.oneofthenewproject.feature.main.di

import com.kponomarev.oneofthenewproject.core.di.NavigationModule
import com.kponomarev.oneofthenewproject.core.di.component.NavigationDependencies
import com.kponomarev.oneofthenewproject.feature.main.ui.MainActivity
import dagger.Component

@MainActivityScope
@Component(
    dependencies = [MainActivityDependencies::class],
    modules = [MainActivityModule::class, NavigationModule::class]
)
interface MainActivityComponent : NavigationDependencies {

    @Component.Builder
    interface Builder {
        fun mainActivityDependencies(mainActivityDependencies: MainActivityDependencies): Builder
        fun build(): MainActivityComponent
    }

    fun inject(activity: MainActivity)
}
