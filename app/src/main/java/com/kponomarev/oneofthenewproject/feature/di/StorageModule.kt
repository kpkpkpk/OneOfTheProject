package com.kponomarev.oneofthenewproject.feature.di

import android.content.Context
import com.kponomarev.oneofthenewproject.feature.storage.SharedPreferencesStorage
import com.kponomarev.oneofthenewproject.feature.storage.Storage
import dagger.Module
import dagger.Provides
import javax.inject.Qualifier

@Retention(AnnotationRetention.BINARY)
@Qualifier
annotation class LoginStorage

@Module
class StorageModule {

    @LoginStorage
    @Provides
    fun provideLoginStorage(context: Context): Storage {
        return SharedPreferencesStorage("login", context)
    }
}
