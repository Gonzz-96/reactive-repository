package com.gonz.mx.reactive.repository

import android.app.Application
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class RepoApp : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@RepoApp)
            modules(appModule)
        }
    }
}
