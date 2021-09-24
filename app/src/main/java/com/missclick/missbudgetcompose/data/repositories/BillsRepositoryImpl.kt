package com.missclick.missbudgetcompose.data.repositories

import com.missclick.missbudgetcompose.data.entities.BillEntity
import com.missclick.missbudgetcompose.data.store.BillsDataSource

class BillsRepositoryImpl(
    private val localDataSource: BillsDataSource
) : BillsRepository {

    override fun getAllBills(): List<BillEntity> {
        TODO("Not yet implemented")
    }

    override fun addBill() {
        TODO("Not yet implemented")
    }

    override fun deleteBill() {
        TODO("Not yet implemented")
    }
}