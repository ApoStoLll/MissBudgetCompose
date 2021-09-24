package com.missclick.missbudgetcompose.data.repositories

import com.missclick.missbudgetcompose.data.entities.BillEntity

interface BillsRepository {

    fun getAllBills() : List<BillEntity>

    fun addBill()

    fun deleteBill()

}