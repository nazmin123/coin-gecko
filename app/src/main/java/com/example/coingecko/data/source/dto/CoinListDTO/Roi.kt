package com.example.coingecko.data.source.dto.CoinListDTO

data class Roi(
    val currency: String,
    val percentage: Double,
    val times: Double
)