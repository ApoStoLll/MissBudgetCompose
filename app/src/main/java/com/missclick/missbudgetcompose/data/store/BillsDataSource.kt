package com.missclick.missbudgetcompose.data.store

interface BillsDataSource {

    fun getAllBills()

    fun addBill()

    fun deleteBill()

}