package com.kponomarev.oneofthenewproject.feature.main

import by.kirich1409.viewbindingdelegate.viewBinding
import com.kponomarev.oneofthenewproject.R
import com.kponomarev.oneofthenewproject.feature.quotes.ui.container.QutoesFragmentContainer
import com.kponomarev.oneofthenewproject.databinding.ActivityMainBinding
import com.kponomarev.oneofthenewproject.feature.main.presentation.MainActivityActor
import com.kponomarev.oneofthenewproject.feature.main.presentation.MainActivityEffect.NavigateToQuotes
import com.kponomarev.oneofthenewproject.feature.main.presentation.MainActivityReducer
import com.kponomarev.oneofthenewproject.feature.main.presentation.MainActivityStore
import com.kponomarev.oneofthenewproject.feature.main.presentation.MainActivityUiEvent.OnStoreCreated
import com.kponomarev.oneofthenewproject.utils.storeHolderPropertyDelegate
import vivid.money.elmslie.android.base.ElmActivity
import vivid.money.elmslie.android.storeholder.StoreHolder
import com.kponomarev.oneofthenewproject.feature.main.presentation.MainActivityEffect as Effect
import com.kponomarev.oneofthenewproject.feature.main.presentation.MainActivityEvent as Event
import com.kponomarev.oneofthenewproject.feature.main.presentation.MainActivityState as State

class MainActivity :
    ElmActivity<Event, Effect, State>(R.layout.activity_main) {

    override val storeHolder: StoreHolder<Event, Effect, State> by storeHolderPropertyDelegate {
        //пока нет di делаю так
        MainActivityStore(State(), MainActivityReducer(), MainActivityActor())
    }

    private val binding: ActivityMainBinding by viewBinding()

    override val initEvent: Event
        get() = OnStoreCreated

    override fun render(state: State) = Unit

    override fun handleEffect(effect: Effect) = when (effect) {
        NavigateToQuotes -> {
            navigateToQuotes()
        }
    }

    private fun navigateToQuotes() {
        supportFragmentManager.beginTransaction()
            .add(binding.mainContainer.id, QutoesFragmentContainer.newInstance()).commit()
    }
}
