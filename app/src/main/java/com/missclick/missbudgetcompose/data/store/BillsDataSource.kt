package com.missclick.missbudgetcompose.data.store

import com.missclick.missbudgetcompose.data.entities.BillEntity

interface BillsDataSource {

    fun getAllBills() : List<BillEntity>

    fun addBill(bill : BillEntity)

    fun deleteBill(bill : BillEntity)

}