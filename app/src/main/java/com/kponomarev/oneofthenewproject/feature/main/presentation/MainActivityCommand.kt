package com.kponomarev.oneofthenewproject.feature.main.presentation

sealed class MainActivityCommand {
    object NavigateToAnimeList : MainActivityCommand()
}
