package com.example.coingecko.presentation.coin

import com.example.coingecko.domain.model.CoinDetail

data class CoinState(
    val isLoading : Boolean = false,
    val coinDetail : CoinDetail? =null,
    val error : String = ""
)