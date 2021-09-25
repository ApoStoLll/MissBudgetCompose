package com.missclick.missbudgetcompose.ui.screens.categories

import com.missclick.missbudgetcompose.ui.uimodels.listdata.Bill
import com.missclick.missbudgetcompose.ui.uimodels.listdata.Category

data class CategoriesViewState(
    var isEditable : Boolean = false,
    var isLoaded : Boolean = false,
    var bills : List<Bill> = listOf(),
    var categories : List<Category> = listOf()
)

