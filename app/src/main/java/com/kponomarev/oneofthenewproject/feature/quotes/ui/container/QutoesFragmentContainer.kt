package com.kponomarev.oneofthenewproject.feature.quotes.ui.container

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import android.widget.Toast
import by.kirich1409.viewbindingdelegate.viewBinding
import com.kponomarev.oneofthenewproject.R

import com.kponomarev.oneofthenewproject.databinding.FragmentQuotesContainerBinding

class QutoesFragmentContainer : Fragment(R.layout.fragment_quotes_container) {

    companion object {
        fun newInstance() = QutoesFragmentContainer()
    }

    private val binding: FragmentQuotesContainerBinding by viewBinding()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Toast.makeText(
            requireContext(),
            "fragmentCrypto ${binding.quotesContainer.id}",
            Toast.LENGTH_SHORT
        ).show()
    }
}
