package com.willor.kt_stockdata_lib.watchlistsdata.dataobjects

data class Watchlist(
    val name: String,
    val tickers: List<Ticker>
)
