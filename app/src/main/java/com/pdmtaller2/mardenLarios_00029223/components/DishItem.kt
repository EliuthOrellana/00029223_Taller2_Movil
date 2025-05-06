package com.pdmtaller2.mardenLarios_00029223.components

import android.widget.Toast
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.pdmtaller2.mardenLarios_00029223.models.Dish

@Composable
fun DishItem(dish: Dish, onAddToCart: () -> Unit) {
    val context = LocalContext.current
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(bottom = 8.dp)
    ) {

        Column(horizontalAlignment = Alignment.CenterHorizontally ) {
            AsyncImage(
                model = dish.imageUrl,
                contentDescription = dish.name,
                modifier = Modifier
                    .height(120.dp)
                    .fillMaxWidth(),
                contentScale = ContentScale.Crop
            )

            Text(dish.name, style = MaterialTheme.typography.titleMedium)

            Text(dish.description, style = MaterialTheme.typography.bodyMedium)


            Button(onClick = {
                onAddToCart()
                Toast.makeText(context, "${dish.name} agregado", Toast. LENGTH_SHORT).show()
            }) {
                Text("Anadir")
            }
        }
    }
}