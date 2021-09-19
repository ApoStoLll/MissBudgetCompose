package com.missclick.missbudgetcompose.data.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "bills")
data class BillEntity(
    @PrimaryKey val id : Int,
    @ColumnInfo(name = "name") val name : String?,
    @ColumnInfo(name = "currency") val currency : String?,
    @ColumnInfo(name = "cash") val cash : Int?,
    @ColumnInfo(name = "icon") val icon : Int?,
    @ColumnInfo(name = "color") val color : String?,

)
