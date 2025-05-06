package com.pdmtaller2.mardenLarios_00029223.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.SearchBar
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.runtime.snapshots.SnapshotStateList
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.pdmtaller2.mardenLarios_00029223.Utils.filterMenu
import com.pdmtaller2.mardenLarios_00029223.models.Dish
import com.pdmtaller2.mardenLarios_00029223.restaurantList
import com.pdmtaller2.mardenLarios_00029223.components.DishItem

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun RestaurantScreen(
    restaurantId: Int,
    cartItems: SnapshotStateList<Dish>
) {
    val restaurant = restaurantList.find { it.id == restaurantId }
    var search by remember { mutableStateOf("") }
    
    if (restaurant == null) {
        Text("Restaurante no encontrado")
        return
    }

    val filteredMenu = filterMenu(search,restaurant.menu)

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = restaurant.name,
            style = MaterialTheme.typography.headlineLarge,
            modifier = Modifier.padding(bottom = 16.dp)
        )
        Text(
            text = restaurant.description,
            style = MaterialTheme.typography.bodyMedium,
            modifier = Modifier.padding(bottom = 16.dp)
        )


        SearchBar(
            query = search,
            onQueryChange = { search = it },
            onSearch = {},
            active = false,
            onActiveChange = {},
            placeholder = { Text("Buscar platillos...") },
            modifier = Modifier.padding(bottom = 16.dp)
        ) {}

        LazyColumn {
            items(filteredMenu.size) { index ->
                DishItem(dish = filteredMenu[index]) {
                    cartItems.add(filteredMenu[index])
                }
            }
        }
    }
}



