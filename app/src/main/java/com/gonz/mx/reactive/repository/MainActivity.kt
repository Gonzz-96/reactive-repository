package com.gonz.mx.reactive.repository

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.annotation.IdRes
import androidx.fragment.app.Fragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        addFragment(R.id.fragment_emit_button, EmitButtonFragment())
        addFragment(R.id.fragment_observer_tv, SubscribeTextViewFragment())
    }

    private fun addFragment(@IdRes container: Int, fragment: Fragment) {
        supportFragmentManager.beginTransaction()
            .add(container, fragment)
            .commit()
    }
}
