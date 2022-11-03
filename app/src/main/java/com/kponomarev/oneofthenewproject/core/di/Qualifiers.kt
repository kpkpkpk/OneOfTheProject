package com.kponomarev.oneofthenewproject.core.di

import javax.inject.Qualifier

@Retention(AnnotationRetention.BINARY)
@Qualifier
annotation class LoginStorage

@Retention(AnnotationRetention.BINARY)
@Qualifier
annotation class MainStorage
