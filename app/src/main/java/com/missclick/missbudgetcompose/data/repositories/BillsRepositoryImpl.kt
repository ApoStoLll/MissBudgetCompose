package com.missclick.missbudgetcompose.data.repositories

import com.missclick.missbudgetcompose.R
import com.missclick.missbudgetcompose.data.entities.BillEntity
import com.missclick.missbudgetcompose.data.store.BillsDataSource
import com.missclick.missbudgetcompose.ui.uimodels.listdata.Bill

class BillsRepositoryImpl(
    private val localDataSource: BillsDataSource
) : BillsRepository {

    override fun getAllBills(): List<BillEntity> {
        return listOf(
            BillEntity(name = "Card", cash = 500, icon = R.drawable.ic_launcher_foreground, id = 3, currency = "USD", color = "red"),
            BillEntity(name = "Cash", cash = 500, icon = R.drawable.ic_launcher_foreground, id = 4, currency = "USD", color = "blue")
        )
    }

    override fun addBill() {
        TODO("Not yet implemented")
    }

    override fun deleteBill() {
        TODO("Not yet implemented")
    }
}