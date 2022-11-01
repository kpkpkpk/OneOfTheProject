package com.kponomarev.oneofthenewproject.feature.di

import com.kponomarev.oneofthenewproject.feature.login.LoginComponent
import dagger.Module

@Module(subcomponents = [LoginComponent::class, ])
class AppSubComponents
