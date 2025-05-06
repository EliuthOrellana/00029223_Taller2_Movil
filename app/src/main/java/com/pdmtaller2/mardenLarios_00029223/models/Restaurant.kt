package com.pdmtaller2.mardenLarios_00029223.models

data class Restaurant(
    val id: Int,
    val name: String,
    val description: String,
    val categories: List<String>,
    val imageUrl: String,
    val menu: List<Dish>
)
