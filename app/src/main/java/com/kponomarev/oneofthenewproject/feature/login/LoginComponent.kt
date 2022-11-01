package com.kponomarev.oneofthenewproject.feature.login

import dagger.Subcomponent

@Subcomponent
interface LoginComponent {
    @Subcomponent.Factory
    interface Factory {
        fun create(): LoginComponent
    }

    fun inject(fragment: LoginFragment)
}
