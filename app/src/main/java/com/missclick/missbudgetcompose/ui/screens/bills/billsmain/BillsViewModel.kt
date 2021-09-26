package com.missclick.missbudgetcompose.ui.screens.bills.billsmain

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.missclick.missbudgetcompose.R

import com.missclick.missbudgetcompose.domain.bills.FetchBillsUseCase
import com.missclick.missbudgetcompose.ui.uimodels.listdata.Bill
import kotlinx.coroutines.launch

class BillsViewModel(
    private val fetchBillsUseCase: FetchBillsUseCase
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

    fun testUseCase(){
        viewModelScope.launch {
            val result = fetchBillsUseCase.run(params = Unit)
            result.fold(failed = { exception ->
                Log.e("BillsViewModel", exception.toString())
            }, succeeded = { response ->
                Log.e("BillsViewModel", response.toString())
            })
        }
    }

    fun editModeOn(){
        _viewState.postValue(_viewState.value?.copy(isEditable = true))
    }

    fun editModeOff(){
        _viewState.postValue(_viewState.value?.copy(isEditable = false))
    }
}