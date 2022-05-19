package com.marco.arquitecturami.data.model

import com.google.gson.annotations.SerializedName

data class QuoteModel(@SerializedName("quote") val quote:String, @SerializedName("quote") val author:String)
