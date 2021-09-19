package com.missclick.missbudgetcompose.ui.screens.categories

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.missclick.missbudgetcompose.R
import com.missclick.missbudgetcompose.models.listdata.Bill
import com.missclick.missbudgetcompose.models.listdata.Category

class CategoriesViewModel : ViewModel() {

     private val _bills : MutableLiveData<List<Bill>> = MutableLiveData(listOf())
     val bills: LiveData<List<Bill>> = _bills

     private val _categories : MutableLiveData<List<Category>> = MutableLiveData(listOf())
     val categories: LiveData<List<Category>> = _categories

     fun updateList(){
          //TODO: Сделать через postValue, хз че не работает
          _bills.value = listOf(
               Bill(name = "Card", cash = "500 $", icon = R.drawable.ic_launcher_background),
               Bill("Cash","300 $", icon = R.drawable.ic_launcher_foreground)
          )
          _categories.value = listOf(
               Category(name = "Rest", cash = "100 $", icon = R.drawable.ic_launcher_background),
               Category(name = "Products", cash = "50 $", icon = R.drawable.ic_launcher_background),
               Category(name = "Car", cash = "500 $", icon = R.drawable.ic_launcher_background),
               Category(name = "IT", cash = "500 $", icon = R.drawable.ic_launcher_background),
               Category(name = "Card", cash = "500 $", icon = R.drawable.ic_launcher_background),
               Category(name = "Card", cash = "500 $", icon = R.drawable.ic_launcher_background),
               Category(name = "Card", cash = "500 $", icon = R.drawable.ic_launcher_background),
               Category(name = "Card", cash = "500 $", icon = R.drawable.ic_launcher_background),
          )
     }

}