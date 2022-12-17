package com.kponomarev.oneofthenewproject.feature.coins_list.ui.mapper

import com.kponomarev.oneofthenewproject.R
import com.kponomarev.oneofthenewproject.core.items.ErrorView
import com.kponomarev.oneofthenewproject.core.items.ShimmerItem
import com.kponomarev.oneofthenewproject.feature.coins_list.ui.presentation.CoinsListState
import ru.tinkoff.mobile.tech.ti_recycler.base.ViewTyped

class CoinsListUiItemProvider {
    private val shimmerItems = List(5) { ShimmerItem(R.layout.crypto_list_shimmer) }
    private val errorView = listOf(ErrorView())

    fun provideItems(state: CoinsListState): List<ViewTyped> = with(state) {
        if (isLoading) return shimmerItems
        return when {
            throwable != null -> errorView
            else -> listOf()
        }
    }
}
