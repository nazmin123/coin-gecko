package com.example.coingecko.domain.use_case

import com.example.coingecko.domain.model.CoinDetail
import com.example.coingecko.domain.repository.CoinRepository
import com.example.coingecko.util.ResponseState
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOException
import javax.inject.Inject

class CoinUseCase @Inject constructor(
    private val repository: CoinRepository
) {
    operator fun invoke(id:String): Flow<ResponseState<CoinDetail>> = flow {

        try {

            emit(ResponseState.Loading<CoinDetail>())
            val coin = repository.getCoinById(id).toCoinDetail()

            emit(ResponseState.Success<CoinDetail>(coin))
        } catch (e: HttpException) {
            emit(ResponseState.Error<CoinDetail>(e.localizedMessage ?: "An Unexpected Error"))
        } catch (e: IOException) {
            emit(ResponseState.Error<CoinDetail>("Internet Error"))
        }
    }
}