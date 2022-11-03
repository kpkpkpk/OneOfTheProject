package com.kponomarev.oneofthenewproject.core.di

import javax.inject.Scope

@Scope
@Retention(value = AnnotationRetention.RUNTIME)
annotation class FragmentScope

@Scope
@Retention(value = AnnotationRetention.RUNTIME)
annotation class ActivityScope
