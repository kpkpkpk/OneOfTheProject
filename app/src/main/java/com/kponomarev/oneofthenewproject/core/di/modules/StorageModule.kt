package com.kponomarev.oneofthenewproject.core.di.modules

import android.content.Context
import com.kponomarev.oneofthenewproject.core.di.LoginStorage
import com.kponomarev.oneofthenewproject.core.di.MainStorage
import com.kponomarev.oneofthenewproject.feature.preference.StringPreference
import dagger.Module
import dagger.Provides

@Module
class StorageModule {

    @Provides
    @LoginStorage
    fun provideLoginStorage(context: Context): StringPreference {
        return StringPreference(
            context.getSharedPreferences("login", Context.MODE_PRIVATE),
            "login"
        )
    }

    @Provides
    @MainStorage
    fun provideMainStorage(context: Context): StringPreference {
        return StringPreference(
            context.getSharedPreferences("main", Context.MODE_PRIVATE),
            "main"
        )
    }
}
