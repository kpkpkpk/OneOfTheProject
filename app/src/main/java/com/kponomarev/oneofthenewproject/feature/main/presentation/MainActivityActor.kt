package com.kponomarev.oneofthenewproject.feature.main.presentation

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.emptyFlow
import vivid.money.elmslie.coroutines.Actor

class MainActivityActor : Actor<MainActivityCommand, MainActivityEvent> {

    override fun execute(command: MainActivityCommand): Flow<MainActivityEvent> {
        return emptyFlow()
    }
}
