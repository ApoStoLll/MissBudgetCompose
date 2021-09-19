package com.missclick.missbudgetcompose.di

import android.content.Context
import androidx.room.Room
import com.missclick.missbudgetcompose.data.BudgetDatabase
import com.missclick.missbudgetcompose.data.store.BillsDataSource
import com.missclick.missbudgetcompose.data.store.BillsDataSourceImpl
import com.missclick.missbudgetcompose.domain.repositories.BillsRepository
import com.missclick.missbudgetcompose.domain.repositories.BillsRepositoryImpl
import org.koin.dsl.module

val dataModule = module {
    single {
        provideRoomDb(get())
    }

    single {
        provideBillsDataSource(get())
    }

    single {
        provideBillsRepository(get())
    }

}

private fun provideRoomDb(context: Context) : BudgetDatabase {
    return Room.databaseBuilder(context, BudgetDatabase::class.java, "statistic")
        .fallbackToDestructiveMigration()
        .build()
}

private fun provideBillsRepository(billsDataSource: BillsDataSource) : BillsRepository{
    return BillsRepositoryImpl(billsDataSource)
}

private fun provideBillsDataSource(db : BudgetDatabase) : BillsDataSource{
    return BillsDataSourceImpl(db.billsDao())
}