package com.missclick.missbudgetcompose.data

import androidx.room.TypeConverter
import com.missclick.missbudgetcompose.data.entities.CashMove
import com.missclick.missbudgetcompose.data.entities.CategoryType

class Converter {

    @TypeConverter
    fun fromCategoryType(categoryType: CategoryType) : Int = categoryType.id

    @TypeConverter
    fun toCategoryType(id : Int) : CategoryType = when(id){
        1 -> CategoryType.Income
        -1 -> CategoryType.Expense
        else -> CategoryType.Undefined
    }

    @TypeConverter
    fun fromCashMove(cashMove: CashMove) : Int = cashMove.id

    @TypeConverter
    fun toCashMove(id : Int) : CashMove = when(id){
        1 -> CashMove.Income
        -1 -> CashMove.Expense
        0 -> CashMove.Transfer
        else -> CashMove.Undefined
    }
}

