package com.pdmtaller2.mardenLarios_00029223.navigation

import androidx.navigation.NavHostController

class NavigationActions(private val navController: NavHostController) {
    fun navigateToHome() {
        navController.navigate("home")
    }

    fun navigateToRestaurant(restaurantId: Int) {
        navController.navigate("restaurant/$restaurantId")
    }

    fun navigateToOrders() {
        navController.navigate("orders")
    }
}