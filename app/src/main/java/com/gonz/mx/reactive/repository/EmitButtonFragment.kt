package com.gonz.mx.reactive.repository

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import org.koin.android.ext.android.inject

class EmitButtonFragment : Fragment(R.layout.fragment_emit_button) {

    private val emitButtonViewModel: EmitButtonViewModel by inject()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        view.findViewById<Button>(R.id.btn_emit).run {
            setOnClickListener {
                emitButtonViewModel.incrementCounter()
            }
        }

        emitButtonViewModel.value.observe(viewLifecycleOwner, Observer {
            Toast.makeText(requireContext(), "Value changed: $it!", Toast.LENGTH_SHORT).show()
        })

        emitButtonViewModel.observeData()
    }
}
