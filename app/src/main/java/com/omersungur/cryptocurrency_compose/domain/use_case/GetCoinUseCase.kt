package com.omersungur.cryptocurrency_compose.domain.use_case

import com.omersungur.cryptocurrency_compose.common.Resource
import com.omersungur.cryptocurrency_compose.data.remote.dto.toCoinDetail
import com.omersungur.cryptocurrency_compose.domain.model.CoinDetail
import com.omersungur.cryptocurrency_compose.domain.repository.CoinRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import okio.IOException
import retrofit2.HttpException
import javax.inject.Inject

class GetCoinUseCase @Inject constructor(
    private val repository: CoinRepository,
) {

    operator fun invoke(coinId: String): Flow<Resource<CoinDetail>> = flow {
        try {
            emit(Resource.Loading())
            val coin = repository.getCoinDetail(coinId).toCoinDetail()
            emit(Resource.Success(coin))
        } catch (e: HttpException) {
            emit(Resource.Error(e.localizedMessage ?: "An unexpected error occurred"))
        } catch (e: IOException) {
            emit(Resource.Error("Couldn't reach server. Check your internet connection."))
        }
    }
}
