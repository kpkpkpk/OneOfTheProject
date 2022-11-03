package com.kponomarev.oneofthenewproject.feature.di.modules

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class ActivityModule(val activity: AppCompatActivity) {
    @Provides
    @Singleton
    fun provideActivity(): Activity = activity
}
