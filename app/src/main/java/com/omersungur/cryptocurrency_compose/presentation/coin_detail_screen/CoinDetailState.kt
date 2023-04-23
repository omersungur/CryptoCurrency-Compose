package com.omersungur.cryptocurrency_compose.presentation.coin_detail_screen

import com.omersungur.cryptocurrency_compose.domain.model.Coin
import com.omersungur.cryptocurrency_compose.domain.model.CoinDetail

data class CoinDetailState (
    val coin: CoinDetail? = null,
    val error: String = "",
    val isLoading: Boolean = false
)