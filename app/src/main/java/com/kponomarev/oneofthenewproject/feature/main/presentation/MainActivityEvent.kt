package com.kponomarev.oneofthenewproject.feature.main.presentation

sealed class MainActivityEvent

sealed class MainActivityUiEvent : MainActivityEvent() {
    object OnStoreCreated : MainActivityUiEvent()
    object Init : MainActivityUiEvent()
}
