package com.missclick.missbudgetcompose.ui.screens.categories

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CategoriesViewModel : ViewModel() {

     private val _name = MutableLiveData("")
     val name: LiveData<String> = _name
}