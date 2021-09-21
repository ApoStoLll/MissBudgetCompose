package com.missclick.missbudgetcompose.data.entities


import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "history")
data class HistoryEntity(
    @PrimaryKey val id : Int,
    @ColumnInfo(name = "category") val category : String?,
    @ColumnInfo(name = "date") val date : String?,
    @ColumnInfo(name = "cash") val cash : Int?,
    @ColumnInfo(name = "note") val note : String?,
    @ColumnInfo(name = "bill") val bill : Int?,
    // @ColumnInfo(name = "type") val type : String? (трата, доход, перевод)
    )
