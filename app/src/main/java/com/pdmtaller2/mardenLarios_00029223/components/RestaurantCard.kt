package com.pdmtaller2.mardenLarios_00029223.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.pdmtaller2.mardenLarios_00029223.models.Restaurant
import com.pdmtaller2.mardenLarios_00029223.navigation.NavigationActions

@Composable
fun RestaurantCard(restaurant: Restaurant, navigationActions: NavigationActions) {
    Card(
        modifier = Modifier
            .width(200.dp)
            .padding(end = 8.dp)
            .clickable {
                navigationActions.navigateToRestaurant(restaurant.id)
            }
    ) {
        Column {
            AsyncImage(
                model = restaurant.imageUrl,
                contentDescription = restaurant.name,
                modifier = Modifier
                    .height(120.dp)
                    .fillMaxWidth(),
                contentScale = ContentScale.Crop
            )

            Text(
                text = restaurant.name,
                modifier = Modifier.padding(8.dp)
            )

        }
    }
}
