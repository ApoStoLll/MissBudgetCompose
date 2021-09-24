package com.missclick.missbudgetcompose.data.repositories

import com.missclick.missbudgetcompose.core.CommonDataSource
import com.missclick.missbudgetcompose.core.CommonModel
import com.missclick.missbudgetcompose.core.CommonRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class BaseRepository<T>(
    private val commonDataSource: CommonDataSource<T>
) : CommonRepository<T> {
    override suspend fun getCommonItem(): CommonModel<T> {
        return CommonModel()
    }


    override suspend fun getCommonItemsList(): List<CommonModel<T>> = withContext(Dispatchers.IO){
        commonDataSource.getDataList()
    }

    override suspend fun removeItem(item: T) {
        TODO("Not yet implemented")
    }

}