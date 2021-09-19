package com.missclick.missbudgetcompose.di

import com.missclick.missbudgetcompose.ui.screens.bills.BillsViewModel
import com.missclick.missbudgetcompose.ui.screens.categories.CategoriesViewModel
import org.koin.android.compat.ScopeCompat.viewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val appModule = module{

    viewModel {
        CategoriesViewModel()
    }

    viewModel {
        BillsViewModel()
    }


}