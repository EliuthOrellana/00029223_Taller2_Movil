package com.pdmtaller2.mardenLarios_00029223

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.pdmtaller2.mardenLarios_00029223.navigation.Navigation
import com.pdmtaller2.mardenLarios_00029223.ui.theme.FoodSpotByLariosTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            FoodSpotByLariosTheme {
               Navigation()
            }
        }
    }
}

