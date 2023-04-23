package com.omersungur.cryptocurrency_compose.data.remote

import com.omersungur.cryptocurrency_compose.data.remote.dto.CoinDTO
import com.omersungur.cryptocurrency_compose.data.remote.dto.CoinDetailDTO
import retrofit2.http.GET
import retrofit2.http.Path

interface CoinPaprikaAPI {

    //https://api.coinpaprika.com/v1/coins > Coin List
    //https://api.coinpaprika.com/v1/coins/btc-bitcoin > Coin Detail

    @GET("/v1/coins")
    suspend fun getCoins(): List<CoinDTO>

    @GET("/v1/coins/{coinId}")
    suspend fun getCoinDetail(@Path("coinId") coinId: String) : CoinDetailDTO
}