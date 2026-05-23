package com.oceanx.myorders.navigation

import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.entryProvider
import androidx.navigation3.runtime.rememberNavBackStack
import androidx.navigation3.ui.NavDisplay
import com.oceanx.myorders.ui.screen.OrdersScreen
import org.koin.androidx.compose.koinViewModel

@Composable
fun AppNavHost() {
    val backStack = rememberNavBackStack(AppRoute.Orders)

    NavDisplay(
        backStack = backStack,
        entryDecorators = listOf(

        ),
        entryProvider = entryProvider {
            entry<AppRoute.Orders> {
                OrdersScreen(
                    viewModel = koinViewModel()
                )
            }
        },
    )
}
