package com.missclick.missbudgetcompose.models.listdata

import androidx.compose.ui.graphics.Color

data class Category(
    val name : String,
    val cash : String, // Передаем уже валюту + знак валюты
    val icon : Int, // возможно нужно передавать сразу иконка + цвет, мб заменить на drawable
    val color : Color? = null
)
