package com.kponomarev.oneofthenewproject.feature.di.component

import com.kponomarev.oneofthenewproject.feature.di.ActivityScope
import com.kponomarev.oneofthenewproject.feature.main.MainActivity
import dagger.Component

@ActivityScope
@Component
interface ActivityComponent {
    @Component.Builder
    interface Builder {
        fun build(): ActivityComponent
    }

    fun inject(activity: MainActivity)
}
