package com.missclick.missbudgetcompose.data.store

import com.missclick.missbudgetcompose.data.dao.BillDao

class BillsDataSourceImpl(
    private val billDao: BillDao
) : BillsDataSource {
    override fun getAllBills() {
        TODO("Not yet implemented")
    }

    override fun addBill() {
        TODO("Not yet implemented")
    }

    override fun deleteBill() {
        TODO("Not yet implemented")
    }
}