package com.kponomarev.oneofthenewproject.feature.screens

import com.github.terrakok.cicerone.androidx.FragmentScreen
import com.kponomarev.oneofthenewproject.feature.anime_list.AnimeListFragment

@Suppress("FunctionNaming")
object Screens {
    fun AnimeList() = FragmentScreen { AnimeListFragment.newInstance() }
}
