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
    @ColumnInfo(name = "type") val cashMove : CashMove? //(трата, доход, перевод)
    )

enum class CashMove(val id: Int) {
    Income(1),
    Expense(-1),
    Transfer(0),
    Undefined(-100)
}