package com.kponomarev.oneofthenewproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.lifecycleScope
import by.kirich1409.viewbindingdelegate.viewBinding
import com.kponomarev.oneofthenewproject.data.api.RetrofitInstance
import com.kponomarev.oneofthenewproject.databinding.ActivityMainBinding

@Suppress("UnusedPrivateMember")
class MainActivity : AppCompatActivity(R.layout.activity_main) {
    private val binding: ActivityMainBinding by viewBinding()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        lifecycleScope.launchWhenCreated {
            var response = RetrofitInstance.api.getListAllCoins()
            Log.d("DEBUG_TAG", response.toString())
            response = RetrofitInstance.api.getListAllMarkets(
                mapOf("vs_currency" to "usd", "ids" to "", "order" to "", "per_page" to "10", "page" to "1"))
            Log.d("DEBUG_TAG", response.toString())
        }
    }
}
