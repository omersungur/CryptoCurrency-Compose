package com.omersungur.cryptocurrency_compose.presentation.coin_list_screen

import com.omersungur.cryptocurrency_compose.domain.model.Coin

data class CoinListState (
    val coins: List<Coin> = emptyList(),
    val error: String = "",
    val isLoading: Boolean = false
)