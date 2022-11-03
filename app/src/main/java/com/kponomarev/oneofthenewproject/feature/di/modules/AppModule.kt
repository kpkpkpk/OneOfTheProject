package com.kponomarev.oneofthenewproject.feature.di.modules

import android.app.Application
import android.content.Context
import com.kponomarev.oneofthenewproject.feature.MyApplication
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class AppModule(val application: MyApplication) {
    @Provides
    @Singleton
    fun provideApplication(): Application = application

    @Provides
    @Singleton
    fun provideContext(): Context = application
}
