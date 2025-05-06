package com.pdmtaller2.mardenLarios_00029223.Utils

import com.pdmtaller2.mardenLarios_00029223.models.Dish
import com.pdmtaller2.mardenLarios_00029223.models.Restaurant
import com.pdmtaller2.mardenLarios_00029223.restaurantList

fun filterRestaurants(
    search: String,
    restaurants: List<Restaurant> = restaurantList
): List<Restaurant> {

    if (search.isBlank()) return restaurants

    return restaurants.filter { restaurant ->
        restaurant.name.contains(search, ignoreCase = true) ||
                restaurant.categories.any { it.contains(search, ignoreCase = true) } ||
                restaurant.menu.any { dish ->
                    dish.name.contains(search, ignoreCase = true) ||
                            dish.description.contains(search, ignoreCase = true)
                }
    }
}

fun filterMenu(
    search: String,
    menu: List<Dish>
): List<Dish> {
    if (search.isBlank()) return menu

    return menu.filter { dish ->
        dish.name.contains(search, ignoreCase = true) || dish.description.contains(search, ignoreCase = true)
    }
}


fun filterOrders(
    search: String,
    orderItems: List<Dish>
): List<Dish> {
    if (search.isBlank()) return orderItems

    return orderItems.filter { dish ->
        dish.name.contains(search, ignoreCase = true) ||
                dish.description.contains(search, ignoreCase = true)
    }
}
