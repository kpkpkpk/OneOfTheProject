package com.kponomarev.oneofthenewproject.core.di

import com.github.terrakok.cicerone.Cicerone
import com.github.terrakok.cicerone.NavigatorHolder
import com.github.terrakok.cicerone.Router
import com.kponomarev.oneofthenewproject.utils.fastLazy
import dagger.Module
import dagger.Provides

@Module
class NavigationModule {

    private val cicerone: Cicerone<Router> by fastLazy { Cicerone.create() }

    @Provides
    fun provideRouter(): Router = cicerone.router

    @Provides
    fun provideNavigatorHolder(): NavigatorHolder = cicerone.getNavigatorHolder()
}
