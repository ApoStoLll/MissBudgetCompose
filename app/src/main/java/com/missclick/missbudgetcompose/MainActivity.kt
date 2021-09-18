package com.missclick.missbudgetcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import com.missclick.missbudgetcompose.ui.bottomnav.BottomNavigationBar
import com.missclick.missbudgetcompose.ui.bottomnav.Navigation
import com.missclick.missbudgetcompose.ui.bottomnav.NavigationItem
import com.missclick.missbudgetcompose.ui.theme.MissBudgetComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MissBudgetComposeTheme {
                val navController = rememberNavController()
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                    Scaffold(
                        bottomBar = { BottomNavigationBar(navController) }
                    ) {
                        Navigation(navController)
                    }
                }
            }
        }
    }
}

