package com.kponomarev.oneofthenewproject.feature.coins_list.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import by.kirich1409.viewbindingdelegate.viewBinding
import com.kponomarev.oneofthenewproject.R

import com.kponomarev.oneofthenewproject.databinding.FragmentQuotesContainerBinding

class CoinsListFragment : Fragment(R.layout.fragment_quotes_container) {

    companion object {
        fun newInstance() = CoinsListFragment()
    }

    private val binding: FragmentQuotesContainerBinding by viewBinding()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }
}
