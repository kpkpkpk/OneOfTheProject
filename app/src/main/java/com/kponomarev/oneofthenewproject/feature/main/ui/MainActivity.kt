package com.kponomarev.oneofthenewproject.feature.main.ui

import android.os.Bundle
import by.kirich1409.viewbindingdelegate.viewBinding
import com.kponomarev.oneofthenewproject.MyApplication
import com.kponomarev.oneofthenewproject.R
import com.kponomarev.oneofthenewproject.feature.quotes.ui.container.QuotesFragmentContainer
import com.kponomarev.oneofthenewproject.databinding.ActivityMainBinding
import com.kponomarev.oneofthenewproject.feature.main.di.MainActivityComponent
import com.kponomarev.oneofthenewproject.feature.main.presentation.MainActivityEffect.NavigateToQuotes
import com.kponomarev.oneofthenewproject.feature.main.presentation.MainActivityUiEvent.OnStoreCreated
import com.kponomarev.oneofthenewproject.utils.fastLazy
import com.kponomarev.oneofthenewproject.utils.storeHolderPropertyDelegate
import vivid.money.elmslie.android.base.ElmActivity
import vivid.money.elmslie.android.storeholder.StoreHolder
import com.kponomarev.oneofthenewproject.feature.main.presentation.MainActivityEffect as Effect
import com.kponomarev.oneofthenewproject.feature.main.presentation.MainActivityEvent as Event
import com.kponomarev.oneofthenewproject.feature.main.presentation.MainActivityState as State

class MainActivity :
    ElmActivity<Event, Effect, State>(R.layout.activity_main) {

    private val component: MainActivityComponent by fastLazy {
        (application as MyApplication).mainActivityComponent
    }

    override val storeHolder: StoreHolder<Event, Effect, State> by storeHolderPropertyDelegate {
       component.mainActivityStore
    }

    private val binding: ActivityMainBinding by viewBinding()

    override val initEvent: Event
        get() = OnStoreCreated

    override fun render(state: State) = Unit

    override fun onCreate(savedInstanceState: Bundle?) {
        component.inject(this)
        super.onCreate(savedInstanceState)
    }

    override fun handleEffect(effect: Effect) = when (effect) {
        NavigateToQuotes -> {
            navigateToQuotes()
        }
    }

    private fun navigateToQuotes() {
        supportFragmentManager.beginTransaction()
            .add(binding.mainContainer.id, QuotesFragmentContainer.newInstance()).commit()
    }
}
