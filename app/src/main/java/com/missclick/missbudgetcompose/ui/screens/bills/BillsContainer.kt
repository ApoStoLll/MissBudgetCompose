package com.missclick.missbudgetcompose.ui.screens.bills

import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.runtime.Composable
import com.missclick.missbudgetcompose.ui.navigation.NavigationController
import com.missclick.missbudgetcompose.ui.navigation.NavigationItem
import com.missclick.missbudgetcompose.ui.navigation.Router
import com.missclick.missbudgetcompose.ui.screens.bills.billinfo.BillInfoScreen
import com.missclick.missbudgetcompose.ui.screens.bills.billsmain.BillsScreen

@ExperimentalAnimationApi
@Composable
fun BillsContainer(
    externalRouter: Router
) {
    NavigationController(
        startDestination = NavigationItem.Bills.route,
        router = externalRouter,
        screens = listOf(
            Pair(NavigationItem.Bills.route, { nav, router, _ -> BillsScreen(router, nav) }),
//            Pair(NavigationItem.BillInfo.route, { _, _, params ->
//                params?.getParcelable<UserModel>(UserModel.USER)?.let {
//                    UserScreen(model = it)
//                }
//            })
            Pair(NavigationItem.BillInfo.route, {_,_,_ -> BillInfoScreen()})
        )
    )
}