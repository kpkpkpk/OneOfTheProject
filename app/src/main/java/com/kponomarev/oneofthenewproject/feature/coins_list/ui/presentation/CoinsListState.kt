package com.kponomarev.oneofthenewproject.feature.coins_list.ui.presentation

data class CoinsListState(
    val isLoading: Boolean,
    val throwable: Throwable? = null
)
