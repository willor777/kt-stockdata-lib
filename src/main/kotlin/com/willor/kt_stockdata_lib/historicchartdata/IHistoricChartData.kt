package com.willor.kt_stockdata_lib.historicchartdata

import com.willor.kt_stockdata_lib.historicchartdata.charts.advancedchart.AdvancedStockChart
import com.willor.kt_stockdata_lib.historicchartdata.charts.simplechart.SimpleStockChart

interface IHistoricChartData {

    fun getHistoryAsSimpleStockChart(
        ticker: String,
        interval: String = "5m",
        periodRange: String = "5d",
        prepost: Boolean = true
    ): SimpleStockChart?


    fun getHistoryAsAdvancedStockChart(
        ticker: String,
        interval: String = "5m",
        periodRange: String = "5d",
        prepost: Boolean = true
    ): AdvancedStockChart?

    suspend fun getHistoryAsSimpleStockChartAsync(
        ticker: String,
        interval: String = "5m",
        periodRange: String = "5d",
        prepost: Boolean = true
    ): SimpleStockChart?

    suspend fun getHistoryAsAdvancedStockChartAsync(
        ticker: String,
        interval: String = "5m",
        periodRange: String = "5d",
        prepost: Boolean = true
    ): AdvancedStockChart?
}