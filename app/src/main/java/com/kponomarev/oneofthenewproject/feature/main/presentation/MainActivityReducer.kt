package com.kponomarev.oneofthenewproject.feature.main.presentation

import com.github.terrakok.cicerone.Router
import com.kponomarev.oneofthenewproject.feature.main.presentation.MainActivityUiEvent.LaunchAnimeListScreen
import com.kponomarev.oneofthenewproject.feature.screens.Screens.AnimeList
import vivid.money.elmslie.core.store.dsl_reducer.ScreenDslReducer
import com.kponomarev.oneofthenewproject.feature.main.presentation.MainActivityCommand as Command
import com.kponomarev.oneofthenewproject.feature.main.presentation.MainActivityEffect as Effect
import com.kponomarev.oneofthenewproject.feature.main.presentation.MainActivityEvent as Event
import com.kponomarev.oneofthenewproject.feature.main.presentation.MainActivityState as State
import com.kponomarev.oneofthenewproject.feature.main.presentation.MainActivityUiEvent as UiEvent

class MainActivityReducer(
    private val router: Router
) : ScreenDslReducer<Event, UiEvent, Event, State, Effect, Command>(
    UiEvent::class,
    Event::class
) {
    //unit because we didn't create any events from actor
    override fun Result.internal(event: Event) = Unit

    override fun Result.ui(event: UiEvent) = when (event) {
        LaunchAnimeListScreen -> router.navigateTo(AnimeList())
    }
}
