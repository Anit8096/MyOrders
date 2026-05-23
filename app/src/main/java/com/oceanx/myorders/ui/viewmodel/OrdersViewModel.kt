package com.oceanx.myorders.ui.viewmodel

import androidx.lifecycle.ViewModel
import com.oceanx.myorders.data.model.Order
import com.oceanx.myorders.data.repository.OrderRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class OrdersViewModel(
    private val repository: OrderRepository
) : ViewModel() {

    private val _orders = MutableStateFlow<List<Order>>(emptyList())
    val orders: StateFlow<List<Order>> = _orders

    init {
        loadOrders()
    }

    private fun loadOrders() {
        _orders.value = repository.getOrders()
    }
}