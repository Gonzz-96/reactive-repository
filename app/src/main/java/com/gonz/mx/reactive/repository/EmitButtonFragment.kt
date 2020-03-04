package com.gonz.mx.reactive.repository

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.fragment.app.Fragment

class EmitButtonFragment : Fragment(R.layout.fragment_emit_button) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        view.findViewById<Button>(R.id.btn_emit).run {
            setOnClickListener { Toast.makeText(requireContext(), "Pressed", Toast.LENGTH_SHORT).show() }
        }
    }
}
