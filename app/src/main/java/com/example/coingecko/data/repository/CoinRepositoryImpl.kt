package com.example.coingecko.data.repository

import com.example.coingecko.data.source.CoinGeckoApi
import com.example.coingecko.data.source.dto.CoinDetailDTO.CoinDetailDTO
import com.example.coingecko.data.source.dto.CoinListDTO.CoinListDTOItem
import com.example.coingecko.domain.repository.CoinRepository
import javax.inject.Inject

class CoinRepositoryImpl @Inject constructor(
    private val api : CoinGeckoApi
) : CoinRepository {
    override suspend fun getAllCoins(page:String): List<CoinListDTOItem> {
        return api.getAllCoins(page=page)
    }

    override suspend fun getCoinById(id: String): CoinDetailDTO {

        return api.getCoinById(id=id)
    }
}