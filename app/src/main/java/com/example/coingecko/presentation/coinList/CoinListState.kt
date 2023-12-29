package com.example.coingecko.presentation.coinList

import com.example.coingecko.domain.model.Coin

data class CoinListState(
    val isLoading : Boolean = false,
    val coinsList : List<Coin> = emptyList(),
    val error : String = ""
)