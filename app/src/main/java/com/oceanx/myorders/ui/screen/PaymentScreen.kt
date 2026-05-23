package com.oceanx.myorders.ui.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.onSizeChanged
import androidx.compose.ui.unit.sp
import com.oceanx.myorders.navigation.AppRoute
import com.oceanx.myorders.ui.components.BottomNavBar

@Composable
fun PaymentScreen(
    onNavigate: (AppRoute) -> Unit
) {
    Scaffold(
        bottomBar = {
            BottomNavBar(
                currentRoute = AppRoute.Payment,
                onNavigate = onNavigate
            )
        }
    ) { contentPadding ->
        Box(
            modifier = Modifier
                .background(Color.White)
                .fillMaxSize().padding(contentPadding),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = "Payment",
                fontSize = 30.sp,
                color = Color.Black
            )
        }
    }
}
