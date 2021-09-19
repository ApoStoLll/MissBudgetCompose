package com.missclick.missbudgetcompose.ui.screens.bills

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.missclick.missbudgetcompose.R
import com.missclick.missbudgetcompose.models.listdata.Bill

class BillsViewModel : ViewModel() {

    private val _bills : MutableLiveData<List<Bill>> = MutableLiveData(listOf())
    val bills: LiveData<List<Bill>> = _bills

    fun updateList(){
        //TODO: Сделать через postValue, хз че не работает
        _bills.postValue(listOf(
            Bill(name = "Card", cash = "500 $", icon = R.drawable.ic_launcher_background),
            Bill("Cash","300 $", icon = R.drawable.ic_launcher_foreground)
        ))
    }
}