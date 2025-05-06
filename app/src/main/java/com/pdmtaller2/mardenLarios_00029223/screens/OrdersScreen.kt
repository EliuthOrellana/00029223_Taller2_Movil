package com.pdmtaller2.mardenLarios_00029223.screens

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.SearchBar
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.runtime.snapshots.SnapshotStateList
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.pdmtaller2.mardenLarios_00029223.Utils.filterOrders
import com.pdmtaller2.mardenLarios_00029223.components.OrderItem
import com.pdmtaller2.mardenLarios_00029223.models.Dish

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun OrdersScreen(
    cartItems: SnapshotStateList<Dish>,
    onDeleteItem: (Dish) -> Unit
) {
    var search by remember { mutableStateOf("") }
    val filteredOrders = filterOrders(search, cartItems)

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Text(
            text = "Mis Ordenes",
            modifier = Modifier.padding(bottom = 16.dp)
        )

        SearchBar(
            query = search,
            onQueryChange = { search = it },
            onSearch = {},
            active = false,
            onActiveChange = {},
            placeholder = { Text("Buscar en tus ordenes...") },
            modifier = Modifier.padding(bottom = 16.dp)
        ) {}

        if (filteredOrders.isEmpty()) {
            Box(
                modifier = Modifier.fillMaxSize(),
                contentAlignment = Alignment.Center
            ) {
                Text("No hay ordenes aun")
            }
        } else {
            LazyColumn {
                items(filteredOrders.size) { index ->
                    OrderItem(filteredOrders[index], onDeleteFromCart = { onDeleteItem(filteredOrders[index])})
                }
            }
        }
    }
}

