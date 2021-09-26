package com.missclick.missbudgetcompose.ui.uimodels.listdata

import androidx.compose.ui.graphics.Color

data class Bill(
    val name : String,
    val cash : String, // Передаем уже валюту + знак валюты
    val icon : Int? = null, // возможно нужно передавать сразу иконка + цвет, мб заменить на drawable
    val color : Color? = null
)
