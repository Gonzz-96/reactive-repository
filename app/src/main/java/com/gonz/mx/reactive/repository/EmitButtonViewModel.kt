package com.gonz.mx.reactive.repository

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import io.reactivex.disposables.CompositeDisposable

class EmitButtonViewModel(
    private val repo: Repository
) : ViewModel() {

    private val _value = MutableLiveData<Int>()
    val value: LiveData<Int>
        get() = _value

    val compositeDisposable = CompositeDisposable()

    fun incrementCounter() {
        repo.incrementCounter()
    }

    fun observeData() {
        repo.observableData.subscribe {
            _value.value = it
        }.apply {
            compositeDisposable.add(this)
        }
    }

    override fun onCleared() {
        compositeDisposable.dispose()
    }
}
