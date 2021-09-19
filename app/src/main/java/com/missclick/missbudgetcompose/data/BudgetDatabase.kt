package com.missclick.missbudgetcompose.data

import androidx.room.Database
import androidx.room.RoomDatabase
import com.missclick.missbudgetcompose.data.entities.BillEntity
import com.missclick.missbudgetcompose.data.entities.dao.BillDao

@Database(entities = [BillEntity::class], version = 1)
abstract class BudgetDatabase : RoomDatabase(){
    abstract fun billsDao() : BillDao
}