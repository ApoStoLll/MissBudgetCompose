package com.missclick.missbudgetcompose.di

import com.missclick.missbudgetcompose.data.repositories.BillsRepository
import com.missclick.missbudgetcompose.domain.bills.FetchBillsUseCase
import org.koin.dsl.module

val domainModule = module {
    single{
        provideBillsUseCase(get())
    }
}

private fun provideBillsUseCase(repository: BillsRepository): FetchBillsUseCase {
    return FetchBillsUseCase(repository = repository)
}