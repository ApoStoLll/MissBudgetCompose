package com.missclick.missbudgetcompose.data.dao

import androidx.room.Dao
import androidx.room.Query
import com.missclick.missbudgetcompose.data.entities.BillEntity

@Dao
interface BillDao {
    @Query("SELECT * FROM bills")
    fun getAll() : List<BillEntity>
}