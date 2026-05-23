package com.oceanx.myorders.navigation

import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.entryProvider
import androidx.navigation3.runtime.rememberNavBackStack
import androidx.navigation3.ui.NavDisplay
import com.oceanx.myorders.ui.screen.AccountScreen
import com.oceanx.myorders.ui.screen.HomeScreen
import com.oceanx.myorders.ui.screen.OrdersScreen
import com.oceanx.myorders.ui.screen.PaymentScreen
import org.koin.androidx.compose.koinViewModel

@Composable
fun AppNavHost() {
    val backStack = rememberNavBackStack(AppRoute.Orders)
    val onNavigate: (AppRoute) -> Unit = { route ->
        if (backStack.lastOrNull() != route) {
            backStack.clear()
            backStack.add(route)
        }
    }

    NavDisplay(
        backStack = backStack,
        entryDecorators = listOf(

        ),
        entryProvider = entryProvider {
            entry<AppRoute.Home> {
                HomeScreen(
                    onNavigate = onNavigate
                )
            }
            entry<AppRoute.Orders> {
                OrdersScreen(
                    viewModel = koinViewModel(),
                    onNavigate = onNavigate
                )
            }
            entry<AppRoute.Payment> {
                PaymentScreen(
                    onNavigate = onNavigate
                )
            }
            entry<AppRoute.Account> {
                AccountScreen(
                    onNavigate = onNavigate
                )
            }
        },
    )
}
