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
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.graphics.Color

@Composable
fun BottomNavBar() {
    var selectedItem by remember { mutableIntStateOf(1) }

    NavigationBar(
        containerColor = Color.White
    ) {
        NavigationBarItem(
            selected = selectedItem == 0,
            onClick = { selectedItem = 0 },
            icon = { Icon(Icons.Outlined.Home, contentDescription = null) },
            label = { Text("Home") },
            colors = navItemColors()
        )

        NavigationBarItem(
            selected = selectedItem == 1,
            onClick = { selectedItem = 1 },
            icon = { Icon(Icons.AutoMirrored.Outlined.List, contentDescription = null) },
            label = { Text("Orders") },
            colors = navItemColors()
        )

        NavigationBarItem(
            selected = selectedItem == 2,
            onClick = { selectedItem = 2 },
            icon = { Icon(Icons.Outlined.Payment, contentDescription = null) },
            label = { Text("Payments") },
            colors = navItemColors()
        )

        NavigationBarItem(
            selected = selectedItem == 3,
            onClick = { selectedItem = 3 },
            icon = { Icon(Icons.Outlined.AccountCircle, contentDescription = null) },
            label = { Text("Account") },
            colors = navItemColors()
        )
    }
}

@Composable
private fun navItemColors() = NavigationBarItemDefaults.colors(
    selectedIconColor = Color(0xFF111827),
    selectedTextColor = Color(0xFF111827),
    indicatorColor = Color(0xFFE7EDF6),
    unselectedIconColor = Color(0xFFA1A1AA),
    unselectedTextColor = Color(0xFFA1A1AA)
)
