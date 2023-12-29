package com.example.coingecko.data.source

import com.example.coingecko.data.source.dto.CoinDetailDTO.CoinDetailDTO
import com.example.coingecko.data.source.dto.CoinListDTO.CoinListDTOItem
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface CoinGeckoApi {
    //https://www.coingecko.com/api/documentation

    @GET("/api/v3/coins/markets?vs_currency=usd&order=market_cap_desc&per_page=100&sparkline=false")
    suspend fun getAllCoins(@Query("page")page:String): List<CoinListDTOItem>

    @GET("/api/v3/coins/{id}")
    suspend fun getCoinById(@Path("id")id:String): CoinDetailDTO

}