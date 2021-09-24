package com.missclick.missbudgetcompose.data

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.missclick.missbudgetcompose.data.entities.BillEntity
import com.missclick.missbudgetcompose.data.dao.BillDao
import com.missclick.missbudgetcompose.data.entities.CategoriesEntity
import com.missclick.missbudgetcompose.data.entities.HistoryEntity
import com.missclick.missbudgetcompose.data.entities.SettingsEntity

@Database(entities = [
    BillEntity::class,
    CategoriesEntity::class,
    HistoryEntity::class,
    SettingsEntity::class
                     ], version = 1)
@TypeConverters(Converter::class)
abstract class BudgetDatabase : RoomDatabase(){
    abstract fun billsDao() : BillDao
}