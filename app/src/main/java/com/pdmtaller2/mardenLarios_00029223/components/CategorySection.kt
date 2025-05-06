package com.pdmtaller2.mardenLarios_00029223.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.pdmtaller2.mardenLarios_00029223.models.Restaurant
import com.pdmtaller2.mardenLarios_00029223.navigation.NavigationActions

@Composable
fun CategorySection(
    category: String,
    navigationActions: NavigationActions,
    restaurants: List<Restaurant>
) {
    Column(modifier = Modifier.padding(vertical = 8.dp)) {
        Text(
            text = category,
            modifier = Modifier.padding(bottom = 8.dp),
            style = MaterialTheme.typography.headlineSmall
        )
        LazyRow {
            items(restaurants.size) { index ->
                RestaurantCard(restaurants[index], navigationActions)
            }
        }
    }
}