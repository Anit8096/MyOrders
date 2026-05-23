package com.oceanx.myorders.ui.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.ExtendedFloatingActionButton
import androidx.compose.material3.FloatingActionButtonDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import com.oceanx.myorders.ui.components.BottomNavBar
import com.oceanx.myorders.ui.components.OrderCard
import com.oceanx.myorders.ui.components.SearchBar
import com.oceanx.myorders.ui.components.TabSection
import com.oceanx.myorders.ui.components.TopSection
import com.oceanx.myorders.ui.viewmodel.OrdersViewModel

@Composable
fun OrdersScreen(
    viewModel: OrdersViewModel
) {
    val orders = viewModel.orders.collectAsStateWithLifecycle().value
    val screenBackground = Color(0xFFF4F6FA)

    Scaffold(
        containerColor = screenBackground,
        bottomBar = {
            BottomNavBar()
        },
        topBar = {
            TopSection()
        },
        floatingActionButton = {
            ExtendedFloatingActionButton(
                onClick = {},
                containerColor = Color(0xFFFFC928),
                contentColor = Color(0xFF121212),
                elevation = FloatingActionButtonDefaults.elevation(defaultElevation = 6.dp)
            ) {
                Text(
                    text = "Help",
                    fontSize = 14.sp
                )
            }
        }
    ) { padding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(padding)
                .background(screenBackground)
        ) {
            SearchBar()
            TabSection()

            Spacer(modifier = Modifier.height(10.dp))
            LazyColumn(
                modifier = Modifier.fillMaxSize(),
                contentPadding = PaddingValues(
                    horizontal = 16.dp,
                    vertical = 10.dp
                ),
                verticalArrangement = Arrangement.spacedBy(14.dp)
            ) {
                items(orders) { order ->
                    OrderCard(order = order)
                }
            }
        }
    }
}
