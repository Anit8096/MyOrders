package com.oceanx.myorders.navigation

import androidx.navigation3.runtime.NavKey
import kotlinx.serialization.Serializable

@Serializable
sealed interface AppRoute : NavKey {

    @Serializable
    data object Home : AppRoute

    @Serializable
    data object Orders : AppRoute

    @Serializable
    data object Payment : AppRoute

    @Serializable
    data object Account : AppRoute
}
