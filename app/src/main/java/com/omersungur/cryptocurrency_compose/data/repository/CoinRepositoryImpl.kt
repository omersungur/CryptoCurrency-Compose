package com.omersungur.cryptocurrency_compose.data.repository

import com.omersungur.cryptocurrency_compose.data.remote.CoinPaprikaAPI
import com.omersungur.cryptocurrency_compose.data.remote.dto.CoinDTO
import com.omersungur.cryptocurrency_compose.data.remote.dto.CoinDetailDTO
import com.omersungur.cryptocurrency_compose.domain.repository.CoinRepository
import javax.inject.Inject

class CoinRepositoryImpl @Inject constructor(
    private val api: CoinPaprikaAPI,
) : CoinRepository {

    override suspend fun getCoins(): List<CoinDTO> {
        return api.getCoins()
    }

    override suspend fun getCoinDetail(id: String): CoinDetailDTO {
        return api.getCoinDetail(id)
    }
}