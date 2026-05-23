package com.oceanx.myorders.di

import com.oceanx.myorders.data.repository.OrderRepository
import com.oceanx.myorders.ui.viewmodel.OrdersViewModel
import org.koin.core.module.dsl.viewModelOf
import org.koin.dsl.module

val appModule = module {

    single {
        OrderRepository
    }

    viewModelOf(::OrdersViewModel)
}