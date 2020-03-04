package com.gonz.mx.reactive.repository

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import org.koin.android.ext.android.inject

class SubscribeTextViewFragment : Fragment(R.layout.fragment_subscribe_text_view) {

    private val viewModel: SubscribeTextViewViewModel by inject()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        viewModel.value.observe(viewLifecycleOwner, Observer {
            view.findViewById<TextView>(R.id.tv_observer).text = "$it"
        })
    }
}
