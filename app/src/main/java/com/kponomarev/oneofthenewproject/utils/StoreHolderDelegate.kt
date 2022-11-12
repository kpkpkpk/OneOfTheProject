package com.kponomarev.oneofthenewproject.utils

import androidx.lifecycle.LifecycleOwner
import vivid.money.elmslie.android.storeholder.LifecycleAwareStoreHolder
import vivid.money.elmslie.android.storeholder.StoreHolder
import vivid.money.elmslie.core.store.Store

fun <Event : Any, Effect : Any, State : Any> LifecycleOwner.storeHolderPropertyDelegate(
    provider: () -> Store<Event, Effect, State>
): Lazy<StoreHolder<Event, Effect, State>> {
    return fastLazy { LifecycleAwareStoreHolder(lifecycle) { provider() } }
}
