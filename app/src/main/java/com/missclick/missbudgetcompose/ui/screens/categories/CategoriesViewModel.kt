package com.missclick.missbudgetcompose.ui.screens.categories

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.missclick.missbudgetcompose.R
import com.missclick.missbudgetcompose.ui.uimodels.listdata.Bill
import com.missclick.missbudgetcompose.ui.uimodels.listdata.Category


class CategoriesViewModel : ViewModel() {

     private val _viewState : MutableLiveData<CategoriesViewState> = MutableLiveData(CategoriesViewState())
     val viewState: LiveData<CategoriesViewState> = _viewState

     fun update(){
          _viewState.postValue(
               _viewState.value?.copy(bills = listOf(
                    Bill(name = "Card", cash = "500 $", icon = R.drawable.ic_launcher_foreground),
                    Bill("Cash","300 $", icon = R.drawable.ic_launcher_foreground)
               ),
                    categories = listOf(
                         Category(name = "Rest", cash = "100 $", icon = R.drawable.ic_launcher_foreground),
                         Category(name = "Products", cash = "50 $", icon = R.drawable.ic_launcher_foreground),
                         Category(name = "Car", cash = "500 $", icon = R.drawable.ic_launcher_foreground),
                         Category(name = "IT", cash = "500 $", icon = R.drawable.ic_launcher_foreground),
                         Category(name = "Card", cash = "500 $", icon = R.drawable.ic_launcher_foreground),
                         Category(name = "Card", cash = "500 $", icon = R.drawable.ic_launcher_foreground),
                         Category(name = "Card", cash = "500 $", icon = R.drawable.ic_launcher_foreground),
                         Category(name = "Card", cash = "500 $", icon = R.drawable.ic_launcher_foreground),
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