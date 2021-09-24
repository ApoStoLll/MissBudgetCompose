package com.missclick.missbudgetcompose.data.store

import com.missclick.missbudgetcompose.data.dao.BillDao
import com.missclick.missbudgetcompose.data.entities.BillEntity

class BillsDataSourceImpl(
    private val billDao: BillDao
) : BillsDataSource {
    override fun getAllBills(): List<BillEntity> {
        return listOf(
            BillEntity(id = 2, name = "TestBill", currency = "USD", cash = 10, icon = 4, color = "RED")
        )
    }

    override fun addBill(bill: BillEntity) {
        TODO("Not yet implemented")
    }

    override fun deleteBill(bill: BillEntity) {
        TODO("Not yet implemented")
    }

}