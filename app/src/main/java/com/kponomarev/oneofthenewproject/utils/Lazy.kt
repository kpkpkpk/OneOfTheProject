package com.kponomarev.oneofthenewproject.utils

import kotlin.LazyThreadSafetyMode.NONE

fun <T> fastLazy(initializer: () -> T) = lazy(NONE, initializer)
