package com.oceanx.myorders.data.repository

import com.oceanx.myorders.data.model.Order

object OrderRepository {

    fun getOrders(): List<Order> {
        return listOf(
            Order(
                id = "#ORD12345",
                title = "Four Wheeler",
                dateTime = "05 Feb, 4:46 PM",
                pickupAddress = "741, Gumanwara",
                deliveryAddress = "00, Main Rd, Shivaji Nagar, Jhansi, Uttar Pradesh 284001, India",
                amount = "₹ 229.0",
                orderStatus = "CANCELLED"
            ),
            Order(
                id = "#ORD12346",
                title = "Four Wheeler",
                dateTime = "05 Feb, 4:46 PM",
                pickupAddress = "741, Gumanwara",
                deliveryAddress = "00, Main Rd, Shivaji Nagar, Jhansi, Uttar Pradesh 284001, India",
                amount = "₹ 229.0",
                orderStatus = "CANCELLED"
            ),
            Order(
                id = "#ORD12347",
                title = "Four Wheeler",
                dateTime = "05 Feb, 4:46 PM",
                pickupAddress = "332, Gumanwara",
                deliveryAddress = "GC72+GGV, Kamrari, Madhya Pradesh 475661, India",
                amount = "₹ 1515.0",
                orderStatus = "CANCELLED"
            ),
            Order(
                id = "#ORD12348",
                title = "Four Wheeler",
                dateTime = "05 Feb, 4:46 PM",
                pickupAddress = "332, Gumanwara",
                deliveryAddress = "GC72+GGV, Kamrari, Madhya Pradesh 475661, India",
                amount = "₹ 1634.0",
                orderStatus = "CANCELLED"
            )
        )
    }
}