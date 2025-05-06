package com.pdmtaller2.mardenLarios_00029223.navigation

import kotlinx.serialization.Serializable


@Serializable
object HomeScreen

@Serializable
data class RestaurantScreen(val restaurantId: Int)

@Serializable
object OrdersScreen