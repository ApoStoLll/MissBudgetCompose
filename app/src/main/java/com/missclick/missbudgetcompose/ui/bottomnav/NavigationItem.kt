package com.missclick.missbudgetcompose.ui.bottomnav

import com.missclick.missbudgetcompose.R

//todo make strings
sealed class NavigationItem(var route : String, var icon : Int, var title : String){
    object Bills : NavigationItem("bills", R.drawable.ic_launcher_foreground, "Bills")
    object Categories : NavigationItem("categories", R.drawable.ic_launcher_foreground, "Categories")
    object History : NavigationItem("history", R.drawable.ic_launcher_foreground, "History")
}
