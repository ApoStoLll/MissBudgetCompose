package com.missclick.missbudgetcompose.ui.screens.categories


import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.missclick.missbudgetcompose.models.listdata.Bill
import com.missclick.missbudgetcompose.models.listdata.Category
import com.missclick.missbudgetcompose.ui.screens.bills.BillsViewState
import org.koin.androidx.compose.getViewModel


@ExperimentalFoundationApi
@Composable
fun CategoriesScreen(){
    val viewModel = getViewModel<CategoriesViewModel>()
    val viewState : CategoriesViewState by viewModel.viewState.observeAsState(CategoriesViewState())

    Scaffold(
        topBar = {
            Toolbar(isEditable = viewState.isEditable,
                editModeOn = { viewModel.editModeOn() },
                editModeOff = { viewModel.editModeOff() })
        }
    ) {
        Column {
            if (!viewState.isLoaded){
                Loading()
                viewModel.update()
            }
            else{
                BillsList(bills = viewState.bills)
                ProgressBarCategories()
                CategoriesList(categories = viewState.categories, isEditable = viewState.isEditable)
            }

        }
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
private fun CategoriesList(categories: List<Category>, isEditable : Boolean) {
    LazyVerticalGrid(cells = GridCells.Fixed(4)) {
        items(categories) { category ->
            Column{
                Text(text = category.name)
                Image(painter = painterResource(category.icon), contentDescription = "contentDescr")
                Text(text = category.cash)
            }
        }
        item{
            if(isEditable){
                Box(modifier = Modifier.clickable(onClick = { println("addd") })) {
                    Text(text = "Add")
                }
            }
        }
    }
}