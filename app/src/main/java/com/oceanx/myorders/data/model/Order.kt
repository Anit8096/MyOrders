package com.oceanx.myorders.data.model

import kotlinx.serialization.Serializable

data class Order(
    val id: String,
    val title: String,
    val dateTime: String,
    val pickupAddress: String,
    val deliveryAddress:String,
    val amount: String,
    val orderStatus: String
)
