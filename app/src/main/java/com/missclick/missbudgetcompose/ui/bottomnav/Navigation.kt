package com.missclick.missbudgetcompose.ui.bottomnav

import android.util.Log
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import com.missclick.missbudgetcompose.R
import com.missclick.missbudgetcompose.ui.screens.bills.BillsScreen
import com.missclick.missbudgetcompose.ui.screens.category.CategoriesScreen


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

@Composable
fun Navigation(navController: NavHostController) {
    NavHost(navController, startDestination = NavigationItem.Bills.route) {
        composable(NavigationItem.Bills.route) {
            BillsScreen()
        }
        composable(NavigationItem.Categories.route) {
            CategoriesScreen()
        }
        composable(NavigationItem.History.route) {
            //BillsScreen()
        }
    }
}
