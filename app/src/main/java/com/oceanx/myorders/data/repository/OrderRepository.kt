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
                dateTime = "06 Feb, 11:20 AM",
                pickupAddress = "Civil Lines",
                deliveryAddress = "Nehru Nagar, Bhopal, Madhya Pradesh 462003, India",
                amount = "₹ 499.0",
                orderStatus = "COMPLETED"
            ),

            Order(
                id = "#ORD12347",
                title = "Mini Truck",
                dateTime = "07 Feb, 8:15 PM",
                pickupAddress = "332, Gumanwara",
                deliveryAddress = "GC72+GGV, Kamrari, Madhya Pradesh 475661, India",
                amount = "₹ 1515.0",
                orderStatus = "BOOKED AGAIN"
            ),

            Order(
                id = "#ORD12348",
                title = "Bike Delivery",
                dateTime = "08 Feb, 2:30 PM",
                pickupAddress = "MP Nagar Zone 1",
                deliveryAddress = "Arera Colony, Bhopal, Madhya Pradesh 462016, India",
                amount = "₹ 1634.0",
                orderStatus = "COMPLETED"
            ),

            Order(
                id = "#ORD12349",
                title = "Three Wheeler",
                dateTime = "09 Feb, 9:00 AM",
                pickupAddress = "TT Nagar",
                deliveryAddress = "Lalghati, Bhopal, Madhya Pradesh 462030, India",
                amount = "₹ 320.0",
                orderStatus = "CANCELLED"
            ),

            Order(
                id = "#ORD12350",
                title = "Four Wheeler",
                dateTime = "10 Feb, 6:45 PM",
                pickupAddress = "Kolar Road",
                deliveryAddress = "Ayodhya Nagar, Bhopal, Madhya Pradesh 462041, India",
                amount = "₹ 870.0",
                orderStatus = "BOOKED AGAIN"
            ),

            Order(
                id = "#ORD12351",
                title = "Mini Truck",
                dateTime = "11 Feb, 1:10 PM",
                pickupAddress = "Ashoka Garden",
                deliveryAddress = "Habibganj, Bhopal, Madhya Pradesh 462024, India",
                amount = "₹ 1299.0",
                orderStatus = "COMPLETED"
            ),

            Order(
                id = "#ORD12352",
                title = "Bike Delivery",
                dateTime = "12 Feb, 5:35 PM",
                pickupAddress = "Chuna Bhatti",
                deliveryAddress = "Berasia Road, Bhopal, Madhya Pradesh 462001, India",
                amount = "₹ 180.0",
                orderStatus = "CANCELLED"
            ),

            Order(
                id = "#ORD12353",
                title = "Three Wheeler",
                dateTime = "13 Feb, 7:50 AM",
                pickupAddress = "Indrapuri",
                deliveryAddress = "Govindpura, Bhopal, Madhya Pradesh 462023, India",
                amount = "₹ 540.0",
                orderStatus = "BOOKED AGAIN"
            ),

            Order(
                id = "#ORD12354",
                title = "Four Wheeler",
                dateTime = "14 Feb, 3:15 PM",
                pickupAddress = "New Market",
                deliveryAddress = "Kohefiza, Bhopal, Madhya Pradesh 462001, India",
                amount = "₹ 760.0",
                orderStatus = "COMPLETED"
            ),

            Order(
                id = "#ORD12355",
                title = "Mini Truck",
                dateTime = "15 Feb, 10:40 AM",
                pickupAddress = "Shahpura",
                deliveryAddress = "Misrod, Bhopal, Madhya Pradesh 462047, India",
                amount = "₹ 2140.0",
                orderStatus = "CANCELLED"
            )
        )
    }
}