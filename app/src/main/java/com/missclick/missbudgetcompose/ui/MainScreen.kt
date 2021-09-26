package com.missclick.missbudgetcompose.ui.mainscreen

import android.util.Log
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.missclick.missbudgetcompose.R
import com.missclick.missbudgetcompose.ui.navigation.NavigationItem
import com.missclick.missbudgetcompose.ui.navigation.Router
import com.missclick.missbudgetcompose.ui.screens.bills.BillsContainer
import com.missclick.missbudgetcompose.ui.screens.categories.CategoriesScreen
import com.missclick.missbudgetcompose.ui.screens.history.HistoryScreen

@ExperimentalAnimationApi
@ExperimentalFoundationApi
@Composable
fun MainScreen(router: Router){

    val navController = rememberNavController()
    Scaffold(bottomBar = { BottomNavigationBar(navController = navController) }) {
        NavHost(navController, startDestination = NavigationItem.Bills.route) {
            composable(NavigationItem.Bills.route) {
                BillsContainer(externalRouter = router)
            }
            composable(NavigationItem.Categories.route) {
                CategoriesScreen()
            }
            composable(NavigationItem.History.route) {
                HistoryScreen()
            }
        }
    }

}

@Composable
fun BottomNavigationBar(navController: NavController){
    val items = listOf(
        NavigationItem.Bills,
        NavigationItem.Categories,
        NavigationItem.History
    )
    BottomNavigation(
        backgroundColor = colorResource(id = R.color.teal_200),
        contentColor = Color.White
    ) {
        val navBackStackEntry by navController.currentBackStackEntryAsState()
        val currentRoute = navBackStackEntry?.destination?.route
        items.forEach { item ->
            BottomNavigationItem(
                icon = { Icon(painterResource(id = item.icon), contentDescription = item.title) },
                label = { Text(text = item.title) },
                selectedContentColor = Color.White,
                unselectedContentColor = Color.White.copy(0.4f),
                alwaysShowLabel = true,
                selected = currentRoute == item.route,
                onClick = {
                    Log.e("Bottom", item.route)
                    if (currentRoute != item.route) {
                        navController.navigate(item.route)
                    }
                }
            )
        }
    }
}