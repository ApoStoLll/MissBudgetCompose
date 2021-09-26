package com.missclick.missbudgetcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.navigation.compose.rememberNavController
import com.missclick.missbudgetcompose.ui.navigation.Navigation
import com.missclick.missbudgetcompose.ui.theme.MissBudgetComposeTheme

class MainActivity : ComponentActivity() {
    @ExperimentalAnimationApi
    @ExperimentalFoundationApi
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MissBudgetComposeTheme {
                val navController = rememberNavController()
                Navigation(navController)
            }
        }
    }
}

