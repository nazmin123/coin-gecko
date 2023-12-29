package com.example.coingecko.domain.repository

import com.example.coingecko.data.source.dto.CoinDetailDTO.CoinDetailDTO
import com.example.coingecko.data.source.dto.CoinListDTO.CoinListDTOItem

interface CoinRepository {

    suspend fun getAllCoins(page:String): List<CoinListDTOItem>

    suspend fun getCoinById(id:String): CoinDetailDTO

}