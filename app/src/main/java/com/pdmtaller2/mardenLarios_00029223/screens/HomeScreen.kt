package com.pdmtaller2.mardenLarios_00029223.screens


import androidx.compose.foundation.layout.*
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
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.pdmtaller2.mardenLarios_00029223.Utils.filterRestaurants
import com.pdmtaller2.mardenLarios_00029223.components.CategorySection
import com.pdmtaller2.mardenLarios_00029223.navigation.NavigationActions


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(navigationActions: NavigationActions) {
    var search by remember { mutableStateOf("") }
    val restaurantsBySearch = filterRestaurants(search)
    val categoriesBySearch = restaurantsBySearch.flatMap { it.categories }.distinct()

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "FoodSpot By Larios",
            modifier = Modifier.padding(bottom = 16.dp),
            style = MaterialTheme.typography.headlineLarge
        )
        SearchBar(
            query = search,
            onQueryChange = { search = it },
            onSearch = {},
            active = false,
            onActiveChange = {},
            placeholder = { Text("Buscar...") },
            modifier = Modifier.padding(bottom = 16.dp)
        ) {}

        if (restaurantsBySearch.isEmpty()) {
            Box(
                modifier = Modifier.fillMaxSize(),
                contentAlignment = Alignment.Center
            ) {
                Text("No se encontraron restaurantes")
            }
        } else {
            LazyColumn {
                items(categoriesBySearch.size) { index ->
                    CategorySection(
                        category = categoriesBySearch[index],
                        navigationActions = navigationActions,
                        restaurants = restaurantsBySearch.filter { it.categories.contains(categoriesBySearch[index]) }
                    )
                }
            }
        }
    }
}


