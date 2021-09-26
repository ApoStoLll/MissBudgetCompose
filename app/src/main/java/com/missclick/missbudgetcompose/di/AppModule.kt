package com.missclick.missbudgetcompose.di

import com.missclick.missbudgetcompose.ui.screens.bills.billsmain.BillsViewModel
import com.missclick.missbudgetcompose.ui.screens.categories.CategoriesViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val appModule = module{

    viewModel {
        CategoriesViewModel()
    }

    viewModel {
        BillsViewModel(get())
    }


}