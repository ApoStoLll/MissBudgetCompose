package com.missclick.missbudgetcompose.ui.screens.categories


import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.*
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.missclick.missbudgetcompose.data.listdata.Bill
import com.missclick.missbudgetcompose.data.listdata.Category


@ExperimentalFoundationApi
@Composable
fun CategoriesScreen(viewModel: CategoriesViewModel = CategoriesViewModel()){

    val bills : List<Bill> by viewModel.bills.observeAsState(listOf())
    val categories : List<Category> by viewModel.categories.observeAsState(listOf())
    viewModel.updateList()

    Scaffold(
        topBar = { Toolbar() }
    ) {

        Column {
            BillsList(bills = bills)
            ProgressBarCategories()
            CategoriesList(categories = categories)
        }

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
    LazyRow() {
        items(bills) { bill ->
            Row(modifier = Modifier
                .padding(5.dp)
                .background(color = Color.Gray)
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

@Composable
private fun ProgressBarCategories(){
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 8.dp)
        ,
        horizontalAlignment = Alignment.CenterHorizontally,

    ) {
        Box{
            CircularProgressIndicator(progress = 0.4f, modifier = Modifier
                .height(150.dp)
                .width(150.dp)
                .align(Alignment.Center)
            )
            Column(modifier = Modifier.align(Alignment.Center)) {
                Text(text = "500 $", color = Color.Green, fontSize = 25.sp)
                Text(text = "-300 $", color = Color.Red, fontSize = 20.sp)
            }

        }

    }

}

@ExperimentalFoundationApi
@Composable
private fun CategoriesList(categories: List<Category>) {
    LazyVerticalGrid(cells = GridCells.Fixed(4)) {
        items(categories) { category ->
            Column{
                Text(text = category.name)
                Text(text = category.cash)
            }
        }
    }
}