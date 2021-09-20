package com.missclick.missbudgetcompose.ui.screens.categories

import com.missclick.missbudgetcompose.models.listdata.Bill
import com.missclick.missbudgetcompose.models.listdata.Category

data class CategoriesViewState(
    var isEditable : Boolean = false,
    var isLoaded : Boolean = false,
    var bills : List<Bill> = listOf(),
    var categories : List<Category> = listOf()
)

