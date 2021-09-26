package com.missclick.missbudgetcompose.ui.navigation

import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.missclick.missbudgetcompose.ui.mainscreen.MainScreen
import com.missclick.missbudgetcompose.ui.screens.bills.addbills.AddBillScreen


@ExperimentalAnimationApi
@ExperimentalFoundationApi
@Composable
fun Navigation(navController: NavHostController) {

    NavHost(navController = navController, startDestination = NavigationItem.Main.route) {
        composable(NavigationItem.Main.route) {
            MainScreen(
                createExternalRouter { screen, params ->
                    navController.navigate(screen, params)
                }
            )
        }
        composable(NavigationItem.AddBill.route) {
            AddBillScreen()
        }
    }

}
