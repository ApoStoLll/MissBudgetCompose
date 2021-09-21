package com.missclick.missbudgetcompose.data.entities




import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "settings")
data class SettingsEntity(
    @PrimaryKey val id : Int,
    @ColumnInfo(name = "currency") val currency : String?,
    @ColumnInfo(name = "theme") val theme : String?,

    )