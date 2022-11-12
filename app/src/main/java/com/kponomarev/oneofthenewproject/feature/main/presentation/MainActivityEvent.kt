package com.kponomarev.oneofthenewproject.feature.main.presentation

sealed class MainActivityEvent {
    object Init : MainActivityEvent()
}

sealed class MainActivityUiEvent : MainActivityEvent() {
    object OnStoreCreated : MainActivityUiEvent()
}
