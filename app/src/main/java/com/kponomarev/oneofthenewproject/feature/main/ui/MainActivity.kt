package com.kponomarev.oneofthenewproject.feature.main.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.kponomarev.oneofthenewproject.MyApplication
import com.kponomarev.oneofthenewproject.R
import com.kponomarev.oneofthenewproject.core.navigation.Navigator
import com.kponomarev.oneofthenewproject.feature.main.di.MainActivityComponent
import com.kponomarev.oneofthenewproject.utils.fastLazy

class MainActivity : AppCompatActivity(R.layout.activity_main) {

    private val component: MainActivityComponent by fastLazy {
        (application as MyApplication).mainActivityComponent
    }

    private val navigator by fastLazy { Navigator(this, R.id.mainContainer) }

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
