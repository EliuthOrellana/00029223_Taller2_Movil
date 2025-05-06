package com.pdmtaller2.mardenLarios_00029223.navigation

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.navigation.compose.*
import com.pdmtaller2.mardenLarios_00029223.models.Dish
import com.pdmtaller2.mardenLarios_00029223.models.Restaurant
import com.pdmtaller2.mardenLarios_00029223.restaurantList
import com.pdmtaller2.mardenLarios_00029223.screens.HomeScreen
import com.pdmtaller2.mardenLarios_00029223.screens.OrdersScreen
import com.pdmtaller2.mardenLarios_00029223.screens.RestaurantScreen



@Composable
fun Navigation() {
    val navController = rememberNavController()
    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentRoute = navBackStackEntry?.destination?.route

    val cartItems = remember { mutableStateListOf<Dish>() }

    val navigationActions = remember(navController) {
        NavigationActions(navController)
    }

    var selectedRestaurant by remember { mutableStateOf<Restaurant?>(null) }

    Scaffold(
        bottomBar = {
            BottomNavBar(
                currentRoute = currentRoute,
                navigationActions = navigationActions,
                selectedRestaurant = selectedRestaurant
            )
        }
    ) { padding ->
        NavHost(
            navController = navController,
            startDestination = "home",
            modifier = Modifier.padding(padding)
        ) {

            composable("home") {
                HomeScreen(navigationActions)
            }

            composable("restaurant/{restaurantId}") { backStackEntry ->
                val restaurantId = backStackEntry.arguments?.getString("restaurantId")?.toIntOrNull()
                if (restaurantId != null) {
                    selectedRestaurant = restaurantList.find { it.id == restaurantId }
                    RestaurantScreen(
                        restaurantId = restaurantId,
                        cartItems = cartItems
                    )
                } else {
                    Text("Restaurante no existe")
                }
            }

            composable("orders") {
                OrdersScreen(
                    cartItems = cartItems,
                    onDeleteItem = { dishToRemove ->
                        cartItems.remove(dishToRemove)
                    }
                )
            }
        }
    }
}










