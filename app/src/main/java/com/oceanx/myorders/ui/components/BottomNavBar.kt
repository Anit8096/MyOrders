package com.oceanx.myorders.ui.components

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.outlined.List
import androidx.compose.material.icons.outlined.AccountCircle
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.Payment
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import com.oceanx.myorders.navigation.AppRoute

@Composable
fun BottomNavBar(
    currentRoute: AppRoute,
    onNavigate: (AppRoute) -> Unit
) {

    NavigationBar(
        containerColor = Color.White
    ) {
        NavigationBarItem(
            selected = currentRoute == AppRoute.Home,
            onClick = { onNavigate(AppRoute.Home) },
            icon = { Icon(Icons.Outlined.Home, contentDescription = null) },
            label = { Text("Home") },
            colors = navItemColors()
        )

        NavigationBarItem(
            selected = currentRoute == AppRoute.Orders,
            onClick = { onNavigate(AppRoute.Orders) },
            icon = { Icon(Icons.AutoMirrored.Outlined.List, contentDescription = null) },
            label = { Text("Orders") },
            colors = navItemColors()
        )

        NavigationBarItem(
            selected = currentRoute == AppRoute.Payment,
            onClick = { onNavigate(AppRoute.Payment) },
            icon = { Icon(Icons.Outlined.Payment, contentDescription = null) },
            label = { Text("Payments") },
            colors = navItemColors()
        )

        NavigationBarItem(
            selected = currentRoute == AppRoute.Account,
            onClick = { onNavigate(AppRoute.Account) },
            icon = { Icon(Icons.Outlined.AccountCircle, contentDescription = null) },
            label = { Text("Account") },
            colors = navItemColors()
        )
    }
}

@Composable
private fun navItemColors() = NavigationBarItemDefaults.colors(

    // Selected item
    selectedIconColor = Color(0xFFB45309),
    selectedTextColor = Color(0xFFB46109),

    // Selected pill background
    indicatorColor = Color(0xFFFFE7A3),

    // Unselected items
    unselectedIconColor = Color(0xFF151414),
    unselectedTextColor = Color(0xFF111111)
)
