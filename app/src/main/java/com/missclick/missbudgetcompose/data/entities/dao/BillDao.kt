package com.missclick.missbudgetcompose.data.entities.dao

import androidx.room.Dao
import androidx.room.Query
import com.missclick.missbudgetcompose.data.entities.BillEntity
import com.missclick.missbudgetcompose.ui.bottomnav.NavigationItem

@Dao
interface BillDao {
    @Query("SELECT * FROM bills")
    fun getAll() : List<BillEntity>
}