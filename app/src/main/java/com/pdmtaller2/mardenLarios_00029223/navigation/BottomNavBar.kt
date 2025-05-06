package com.pdmtaller2.mardenLarios_00029223.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import com.pdmtaller2.mardenLarios_00029223.models.Restaurant

@Composable
fun BottomNavBar(
    currentRoute: String?,
    navigationActions: NavigationActions,
    selectedRestaurant: Restaurant?
) {
    NavigationBar {
        NavigationBarItem(
            selected = currentRoute == "home",
            onClick = { navigationActions.navigateToHome() },
            icon = {Icon(Icons.Default.Search, contentDescription = "Inicio")},
            label = { Text("Inicio") }
        )

        selectedRestaurant?.let { restaurant ->
            NavigationBarItem(
                selected = currentRoute?.startsWith("restaurant") == true,
                onClick = {navigationActions.navigateToRestaurant(restaurant.id) },
                icon = {Icon(Icons.Default.Home, contentDescription = "Inicio")},
                label = { Text("Restaurante")}
            )
        }

        NavigationBarItem(
            selected = currentRoute == "orders",
            onClick = { navigationActions.navigateToOrders() },
            icon = { Icon(Icons.Default.ShoppingCart, contentDescription = "Ordenes") },
            label = { Text("Ordenes") }
        )
    }
}