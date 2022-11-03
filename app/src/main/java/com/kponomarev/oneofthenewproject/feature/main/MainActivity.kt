package com.kponomarev.oneofthenewproject.feature.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import by.kirich1409.viewbindingdelegate.viewBinding
import com.kponomarev.oneofthenewproject.R
import com.kponomarev.oneofthenewproject.feature.quotes.ui.container.QuotesFragmentContainer
import com.kponomarev.oneofthenewproject.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(R.layout.activity_main) {
    private val binding: ActivityMainBinding by viewBinding()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        supportFragmentManager.beginTransaction()
            .add(binding.mainContainer.id, QuotesFragmentContainer.newInstance()).commit()
    }
}
