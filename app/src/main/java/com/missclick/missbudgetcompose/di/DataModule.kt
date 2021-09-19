package com.missclick.missbudgetcompose.di

import android.content.Context
import androidx.room.Room
import com.missclick.missbudgetcompose.data.BudgetDatabase
import org.koin.dsl.module

val dataModule = module {
    single {
        provideRoomDb(get())
    }
}

fun provideRoomDb(context: Context) : BudgetDatabase {
    return Room.databaseBuilder(context, BudgetDatabase::class.java, "statistic")
        .fallbackToDestructiveMigration()
        .build()
}