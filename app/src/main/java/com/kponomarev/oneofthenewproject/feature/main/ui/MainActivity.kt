package com.kponomarev.oneofthenewproject.feature.main.ui

import android.os.Bundle
import com.kponomarev.oneofthenewproject.MyApplication
import com.kponomarev.oneofthenewproject.R
import com.kponomarev.oneofthenewproject.core.navigation.Navigator
import com.kponomarev.oneofthenewproject.feature.main.di.MainActivityComponent
import com.kponomarev.oneofthenewproject.feature.main.presentation.MainActivityUiEvent.LaunchAnimeListScreen
import com.kponomarev.oneofthenewproject.utils.fastLazy
import com.kponomarev.oneofthenewproject.utils.storeHolderPropertyDelegate
import vivid.money.elmslie.android.base.ElmActivity
import vivid.money.elmslie.android.storeholder.StoreHolder
import com.kponomarev.oneofthenewproject.feature.main.presentation.MainActivityEffect as Effect
import com.kponomarev.oneofthenewproject.feature.main.presentation.MainActivityEvent as Event
import com.kponomarev.oneofthenewproject.feature.main.presentation.MainActivityState as State

class MainActivity : ElmActivity<Event, Effect, State>(R.layout.activity_main) {

    private val component: MainActivityComponent by fastLazy {
        (application as MyApplication).mainActivityComponent
    }

    override val storeHolder: StoreHolder<Event, Effect, State> by storeHolderPropertyDelegate {
        component.mainActivityStore
    }

    private val navigator by fastLazy { Navigator(this, R.id.mainContainer) }

    override val initEvent: Event = LaunchAnimeListScreen

    override fun render(state: State) = Unit

    override fun onCreate(savedInstanceState: Bundle?) {
        component.inject(this)
        super.onCreate(savedInstanceState)
    }

    override fun onResumeFragments() {
        super.onResumeFragments()
        component.navigatorHolder.setNavigator(navigator)
    }

    override fun onPause() {
        component.navigatorHolder.removeNavigator()
        super.onPause()
    }
}
