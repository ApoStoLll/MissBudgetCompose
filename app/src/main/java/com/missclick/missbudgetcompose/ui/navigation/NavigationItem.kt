package com.missclick.missbudgetcompose.ui.navigation

import com.missclick.missbudgetcompose.R

//todo make strings
sealed class NavigationItem(var route : String, var icon : Int, var title : String){

    object Main : NavigationItem("main",-1, "main")


    //bottom navigation
    object Bills : NavigationItem("bills", R.drawable.ic_launcher_foreground, "Bills")
    object Categories : NavigationItem("categories", R.drawable.ic_launcher_foreground, "Categories")
    object History : NavigationItem("history", R.drawable.ic_launcher_foreground, "History")

    //bills
    object AddBill : NavigationItem("addBill", -1, "Add Bill")
    object BillInfo : NavigationItem("billInfo", -1, "Bill Info")
}
