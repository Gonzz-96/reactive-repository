package com.gonz.mx.reactive.repository

import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val appModule = module {
    single {
        Repository()
    }

    viewModel {
        EmitButtonViewModel(get())
    }

    viewModel {
        SubscribeTextViewViewModel(get())
    }
}
