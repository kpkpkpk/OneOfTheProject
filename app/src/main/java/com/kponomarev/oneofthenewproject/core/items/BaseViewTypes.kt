package com.kponomarev.oneofthenewproject.core.items

import ru.tinkoff.mobile.tech.ti_recycler.base.ViewTyped

data class ShimmerItem(override val viewType: Int) : ViewTyped {
    override val uid: String = "SHIMMER_ITEM_ID"
}
