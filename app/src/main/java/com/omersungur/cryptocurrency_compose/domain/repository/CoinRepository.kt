package com.omersungur.cryptocurrency_compose.domain.repository

import com.omersungur.cryptocurrency_compose.data.remote.dto.CoinDTO
import com.omersungur.cryptocurrency_compose.data.remote.dto.CoinDetailDTO

interface CoinRepository {

    suspend fun getCoins():  List<CoinDTO>

    suspend fun getCoinDetail(id : String): CoinDetailDTO
}