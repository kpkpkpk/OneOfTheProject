package com.kponomarev.oneofthenewproject.feature.di

import javax.inject.Scope

@Scope
@Retention(value = AnnotationRetention.RUNTIME)
annotation class FragmentScope

@Scope
@Retention(value = AnnotationRetention.RUNTIME)
annotation class ActivityScope
