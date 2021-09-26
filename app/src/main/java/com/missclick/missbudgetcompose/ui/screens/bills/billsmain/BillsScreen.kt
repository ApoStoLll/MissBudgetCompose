package com.missclick.missbudgetcompose.ui.screens.bills.billsmain

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.missclick.missbudgetcompose.models.listdata.Bill
import com.missclick.missbudgetcompose.ui.navigation.NavigationItem
import com.missclick.missbudgetcompose.ui.navigation.Router
import org.koin.androidx.compose.getViewModel


@Composable
fun BillsScreen(router: Router?, navController: NavController){
    val viewModel = getViewModel<BillsViewModel>()

    val viewState : BillsViewState by viewModel.viewState.observeAsState(BillsViewState())
    viewModel.testUseCase()

    Scaffold(
        topBar = {
            Toolbar(isEditable = viewState.isEditable, editModeOn = { viewModel.editModeOn() },
            editModeOff = { viewModel.editModeOff() })
        }
    ) {
        if (!viewState.isLoaded){
            Loading()
            viewModel.updateList()
        }
        else
            router?.let { it1 -> BillsList(bills = viewState.bills,
                isEditable = viewState.isEditable , router = it1,
            navController = navController) }
    }

}


@Composable
private fun Toolbar(isEditable: Boolean,editModeOn : () -> Unit, editModeOff: () -> Unit){
    TopAppBar(backgroundColor = Color.Black) {
        Box(modifier = Modifier.fillMaxWidth()){
            Text(text = "testToolbar",color = Color.White)
            if(isEditable){
                Button(onClick = editModeOff,modifier = Modifier.align(Alignment.CenterEnd)) {
                    Text("Save", color = Color.White)
                }
            }
            else{
                Button(onClick = editModeOn,modifier = Modifier.align(Alignment.CenterEnd)) {
                    Text("Edit", color = Color.White)
                }
            }
        }


    }
}

@Composable
private fun Loading(){
    Box(modifier = Modifier.fillMaxSize()){
        CircularProgressIndicator(modifier = Modifier.align(Alignment.Center))
    }
}

@Composable
private fun BillsList(bills: List<Bill>, isEditable: Boolean, router: Router,
                      navController : NavController) {
    LazyColumn {
        items(bills) { bill ->
            Row(modifier = Modifier
                .padding(top = 5.dp)
                .background(color = Color.Gray)
                .fillMaxWidth()
                .clickable { navController.navigate(NavigationItem.BillInfo.route) }
            ){

                //TODO: Image (icon + color)
                Column {
                    Text(text = bill.name)
                    Text(text = bill.cash)
                }
            }
        }
        if(isEditable) item { Text(text = "Add", modifier = Modifier
            .clickable { router.routeTo(NavigationItem.AddBill.route) }) }
    }
}

