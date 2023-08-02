package com.willor.kt_stockdata_lib

fun main() {
    val kt = KtStocks.marketData.getEtfQuote("SPY")
    println(kt)
}