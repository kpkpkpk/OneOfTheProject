package com.kponomarev.oneofthenewproject.feature.main.presentation

import com.kponomarev.oneofthenewproject.feature.main.presentation.MainActivityUiEvent.Init
import com.kponomarev.oneofthenewproject.feature.main.presentation.MainActivityUiEvent.OnStoreCreated
import vivid.money.elmslie.core.store.dsl_reducer.ScreenDslReducer
import com.kponomarev.oneofthenewproject.feature.main.presentation.MainActivityCommand as Command
import com.kponomarev.oneofthenewproject.feature.main.presentation.MainActivityEffect as Effect
import com.kponomarev.oneofthenewproject.feature.main.presentation.MainActivityEvent as Event
import com.kponomarev.oneofthenewproject.feature.main.presentation.MainActivityState as State
import com.kponomarev.oneofthenewproject.feature.main.presentation.MainActivityUiEvent as UiEvent

class MainActivityReducer : ScreenDslReducer<Event, UiEvent, Event, State, Effect, Command>(
    UiEvent::class,
    Event::class
) {
    //unit because we didn't create any events from actor
    override fun Result.internal(event: Event) = Unit

    override fun Result.ui(event: UiEvent) = when (event) {
        OnStoreCreated -> {
        }
        Init -> {
            state { state.copy(isLoading = "s") }
        }
    }
}
