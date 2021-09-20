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

    private val _viewState : MutableLiveData<BillsViewState> = MutableLiveData(BillsViewState())
    val viewState: LiveData<BillsViewState> = _viewState

    fun updateList(){
        _viewState.postValue(
                _viewState.value?.copy(bills = listOf(
                    Bill(name = "Card", cash = "500 $", icon = R.drawable.ic_launcher_foreground),
                    Bill("Cash","300 $", icon = R.drawable.ic_launcher_foreground)
                    ),
                    isLoaded = true
                )
        )
    }

    fun editModeOn(){
        _viewState.postValue(_viewState.value?.copy(isEditable = true))
    }

    fun editModeOff(){
        _viewState.postValue(_viewState.value?.copy(isEditable = false))
    }
}