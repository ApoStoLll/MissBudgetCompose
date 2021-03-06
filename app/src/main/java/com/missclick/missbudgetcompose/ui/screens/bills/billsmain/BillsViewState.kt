package com.missclick.missbudgetcompose.ui.screens.bills.billsmain

import com.missclick.missbudgetcompose.ui.uimodels.listdata.Bill

//sealed class BillState{
//    object LoadingState : BillState()
//    class LoadedState(val bills : List<Bill>) : BillState()
//    class EditState(private val bills : List<Bill>) : BillState()
//}

data class BillsViewState(
    var isEditable : Boolean = false,
    var isLoaded : Boolean = false,
    var bills : List<Bill> = listOf()
)

