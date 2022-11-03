package com.kponomarev.oneofthenewproject.feature.di.modules

import androidx.fragment.app.Fragment
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class FragmentModule(var fragment: Fragment) {
    @Provides
    @Singleton
    fun provideFragment(): Fragment = fragment
}
