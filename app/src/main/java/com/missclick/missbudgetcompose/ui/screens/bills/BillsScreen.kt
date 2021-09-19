package com.missclick.missbudgetcompose.ui.screens.bills

import androidx.compose.foundation.Image
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
import androidx.compose.ui.unit.dp
import androidx.lifecycle.ViewModel
import com.missclick.missbudgetcompose.data.listdata.Bill


@Composable
fun BillsScreen(viewModel: BillsViewModel = BillsViewModel()){

    val bills : List<Bill> by viewModel.bills.observeAsState(listOf())
    viewModel.updateList()

    Scaffold(
        topBar = { Toolbar() }
    ) {
        BillsList(bills = bills)
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

