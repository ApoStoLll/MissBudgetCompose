package com.missclick.missbudgetcompose.ui.screens.categories


import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState

import androidx.compose.ui.graphics.Color
import androidx.lifecycle.viewmodel.compose.viewModel


@Composable
fun CategoriesScreen(viewModel: CategoriesViewModel = CategoriesViewModel()){
    val name: String by viewModel.name.observeAsState("")
    Scaffold(
        topBar = { Toolbar() }
    ) {

        Text(
            text = name,
        )

    }

}

@Composable
fun Toolbar(){
    TopAppBar(backgroundColor = Color.Black) {
        Text(text = "testToolbar",color = Color.White)
    }
}