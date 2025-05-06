package com.pdmtaller2.mardenLarios_00029223

import com.pdmtaller2.mardenLarios_00029223.models.Dish
import com.pdmtaller2.mardenLarios_00029223.models.Restaurant

val restaurantList = listOf(
    // Categoría Italiana (3 restaurantes)
    Restaurant(
        id = 1,
        name = "La Italiana",
        description = "Autentica cocina italiana",
        categories = listOf("Italiana"),
        imageUrl = "https://cdn.pixabay.com/photo/2017/12/09/08/18/pizza-3007395_960_720.jpg",
        menu = listOf(
            Dish(
                id = 101,
                name = "Carbonara",
                description = "Pasta con huevo, panceta y queso pecorino",
                imageUrl = "https://cdn.pixabay.com/photo/2018/07/18/19/12/pasta-3547078_960_720.jpg"
            ),
            Dish(
                id = 102,
                name = "Pizza Margarita",
                description = "Clasica pizza napolitana",
                imageUrl = "https://cdn.pixabay.com/photo/2017/12/10/14/47/pizza-3010062_960_720.jpg"
            )
        )
    ),
    Restaurant(
        id = 10,
        name = "Pizzeria Napoli",
        description = "Pizzas al estilo tradicional napolitano",
        categories = listOf("Italiana"),
        imageUrl = "https://cdn.pixabay.com/photo/2016/11/18/22/21/restaurant-1837150_960_720.jpg",
        menu = listOf(
            Dish(
                id = 105,
                name = "Pizza Prosciutto",
                description = "Pizza con jamón crudo y rucula",
                imageUrl = "https://cdn.pixabay.com/photo/2016/05/05/09/19/pizza-1373508_960_720.jpg"
            )
        )
    ),

    // Categoría Americana (3 restaurantes)
    Restaurant(
        id = 2,
        name = "Burger Palace",
        description = "Hamburguesas gourmet",
        categories = listOf("Americana"),
        imageUrl = "https://cdn.pixabay.com/photo/2016/03/05/19/02/hamburger-1238246_960_720.jpg",
        menu = listOf(
            Dish(
                id = 201,
                name = "Hamburguesa Clasica con Queso",
                description = "Carne 100% res, queso cheddar",
                imageUrl = "https://cdn.pixabay.com/photo/2016/03/05/19/02/hamburger-1238246_960_720.jpg",
                ),
            Dish(
                id = 202,
                name = "Hamburguesa BBQ Bacon",
                description = "Con tocino y salsa barbacoa",
                imageUrl = "https://cdn.pixabay.com/photo/2016/03/05/19/02/hamburger-1238246_960_720.jpg",

            )
        )
    ),
    Restaurant(
        id = 11,
        name = "American Diner",
        description = "Comida americana de los años 50",
        categories = listOf("Americana"),
        imageUrl = "https://cdn.pixabay.com/photo/2014/09/17/20/26/restaurant-449952_960_720.jpg",
        menu = listOf(
            Dish(
                id = 204,
                name = "Mac & Cheese",
                description = "Macarrones con queso cheddar",
                imageUrl = "https://cdn.pixabay.com/photo/2015/04/08/13/13/food-712665_960_720.jpg"
            ),
            Dish(
                id = 201,
                name = "Hamburguesa Clasica con Queso",
                description = "Carne 100% res, queso cheddar",
                imageUrl = "https://cdn.pixabay.com/photo/2016/03/05/19/02/hamburger-1238246_960_720.jpg",
            )
        )
    ),
    Restaurant(
        id = 14,
        name = "Teppanyaki Tokyo",
        description = "Cocina japonesa a la plancha",
        categories = listOf("Japonesa"),
        imageUrl = "https://cdn.pixabay.com/photo/2014/10/19/20/59/hamburger-494706_960_720.jpg",
        menu = listOf(
            Dish(
                id = 305,
                name = "Teppanyaki Mixto",
                description = "Carne, pollo y mariscos a la plancha",
                imageUrl = "https://cdn.pixabay.com/photo/2015/04/08/13/13/food-712665_960_720.jpg"
            )
        )
    )
)