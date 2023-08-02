package com.willor.kt_stockdata_lib.historicchartdata.dataobjects.yfhistoryresp


import com.google.gson.annotations.SerializedName

internal data class CurrentTradingPeriod(
    @SerializedName("post")
    val post: Post,
    @SerializedName("pre")
    val pre: Pre,
    @SerializedName("regular")
    val regular: Regular
)