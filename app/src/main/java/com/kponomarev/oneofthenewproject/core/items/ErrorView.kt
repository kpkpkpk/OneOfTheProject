package com.kponomarev.oneofthenewproject.core.items

import com.kponomarev.oneofthenewproject.R
import ru.tinkoff.mobile.tech.ti_recycler.base.ViewTyped

class ErrorView : ViewTyped {
    override val viewType = R.layout.error_view
    override val uid: String = "ERROR_VIEW"
}
