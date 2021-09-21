package com.missclick.missbudgetcompose.data.entities


import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "categories")
data class CategoriesEntity(
    @PrimaryKey val id : Int,
    @ColumnInfo(name = "name") val name : String?,
    @ColumnInfo(name = "icon") val icon : Int?,
    @ColumnInfo(name = "color") val color : String?,
    //@ColumnInfo(name = "") val  : String? Доход / расход
    )