package com.willor.kt_stockdata_lib

import com.willor.kt_stockdata_lib.historicchartdata.HistoricChartData
import com.willor.kt_stockdata_lib.marketdata.MarketData
import com.willor.kt_stockdata_lib.watchlistsdata.PopularWatchlistDataImpl

object KtStocks {
    val historicChartData = HistoricChartData()
    val marketData = MarketData()
    val watchlistData = PopularWatchlistDataImpl()
}
