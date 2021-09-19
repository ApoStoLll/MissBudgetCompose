package com.missclick.missbudgetcompose.ui.screens.bills

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.missclick.missbudgetcompose.models.listdata.Bill
import com.missclick.missbudgetcompose.ui.screens.categories.CategoriesViewModel
import org.koin.androidx.compose.getViewModel


@Composable
fun BillsScreen(){
    val viewModel = getViewModel<BillsViewModel>()
//    val bills : List<Bill> by viewModel.viewState.observeAsState(listOf())
    val viewState : BillState by viewModel.viewState.observeAsState(BillState.LoadingState)
    viewModel.updateList()

    when(viewState){
        is BillState.LoadingState ->{
            Text(text = "хуй соси")
            viewModel.updateList()
        }
        is BillState.LoadedState ->{
            Scaffold(
                topBar = { Toolbar() }
            ) {
                BillsList(bills = (viewState as BillState.LoadedState).bills)
            }
        }
        is BillState.EditState ->{}
    }

}


@Composable
private fun Toolbar(){
    TopAppBar(backgroundColor = Color.Black) {
        Text(text = "testToolbar",color = Color.White)
    }
}

@Composable
private fun BillsList(bills: List<Bill>) {
    LazyColumn() {
        items(bills) { bill ->
            Row(modifier = Modifier
                .padding(top = 5.dp)
                .background(color = Color.Gray)
                .fillMaxWidth()
            ){

                //TODO: Image (icon + color)
                Column() {
                    Text(text = bill.name)
                    Text(text = bill.cash)
                }
            }
        }
    }
}

