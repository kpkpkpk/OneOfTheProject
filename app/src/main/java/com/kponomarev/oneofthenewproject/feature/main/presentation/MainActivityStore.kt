package com.kponomarev.oneofthenewproject.feature.main.presentation

import vivid.money.elmslie.core.store.Store
import vivid.money.elmslie.coroutines.ElmStoreCompat

class MainActivityStore(
    state: MainActivityState,
    reducer: MainActivityReducer,
    actor: MainActivityActor
) : Store<MainActivityEvent, MainActivityEffect, MainActivityState> by ElmStoreCompat(
    state,
    reducer,
    actor
)
