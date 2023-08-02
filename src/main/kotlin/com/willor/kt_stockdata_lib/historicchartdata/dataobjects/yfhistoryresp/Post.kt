package com.willor.kt_stockdata_lib.historicchartdata.dataobjects.yfhistoryresp


import com.google.gson.annotations.SerializedName

internal data class Post(
    @SerializedName("end")
    val end: Int,
    @SerializedName("gmtoffset")
    val gmtoffset: Int,
    @SerializedName("start")
    val start: Int,
    @SerializedName("timezone")
    val timezone: String
)