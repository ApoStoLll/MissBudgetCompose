package com.missclick.missbudgetcompose.ui.screens.bills

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.missclick.missbudgetcompose.R
import com.missclick.missbudgetcompose.domain.repositories.BillsRepository
import com.missclick.missbudgetcompose.models.listdata.Bill

class BillsViewModel(
    private val billsRepository: BillsRepository
) : ViewModel() {

    private val _viewState : MutableLiveData<BillState> = MutableLiveData(BillState.LoadingState)
    val viewState: LiveData<BillState> = _viewState

    fun updateList(){
        //TODO: Сделать через postValue, хз че не работает
        _viewState.postValue(
            BillState.LoadedState(
                listOf(
                    Bill(name = "Card", cash = "500 $", icon = R.drawable.ic_launcher_background),
                    Bill("Cash","300 $", icon = R.drawable.ic_launcher_foreground)
                )
        ))

    }
}