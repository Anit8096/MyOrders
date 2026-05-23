package com.oceanx.myorders

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.oceanx.myorders.ui.screen.OrdersScreen
import com.oceanx.myorders.ui.theme.MyOrdersTheme
import com.oceanx.myorders.ui.viewmodel.OrdersViewModel
import androidx.lifecycle.viewmodel.compose.viewModel
import com.oceanx.myorders.navigation.AppNavHost


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyOrdersTheme {
                AppNavHost()
            }
        }
    }
}

