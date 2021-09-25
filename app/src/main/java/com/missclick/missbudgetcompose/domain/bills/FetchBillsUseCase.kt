package com.missclick.missbudgetcompose.domain.bills

import com.missclick.missbudgetcompose.core.domain.BaseUseCase
import com.missclick.missbudgetcompose.core.domain.Either
import com.missclick.missbudgetcompose.data.repositories.BillsRepository
import com.missclick.missbudgetcompose.domain.bills.BillsResponseModel

class FetchBillsUseCase(
    private val repository: BillsRepository,
) : BaseUseCase<BillsResponseModel, Unit>() {

    override suspend fun run(params: Unit): Either<Exception, BillsResponseModel> {
        return try{
            Either.Success(
                //Todo map
                BillsResponseModel(bills = repository.getAllBills())
            )
        } catch (e : java.lang.Exception) {
            Either.Failure(e)
        }
    }
}