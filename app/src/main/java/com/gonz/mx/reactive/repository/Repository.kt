package com.gonz.mx.reactive.repository

import io.reactivex.Observable
import io.reactivex.subjects.PublishSubject

class Repository {

    var counter = 0

    private val publishSubject = PublishSubject.create<Int>()
    val observableData: Observable<Int>
        get() = publishSubject

    fun incrementCounter() = publishSubject.onNext(counter++)

}
