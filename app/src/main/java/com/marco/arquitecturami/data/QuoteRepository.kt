package com.marco.arquitecturami.data

import com.marco.arquitecturami.data.model.QuoteModel
import com.marco.arquitecturami.data.model.QuoteProvider
import com.marco.arquitecturami.data.networt.QuoteService

class QuoteRepository {

    private val api = QuoteService()


    suspend fun getAllQuotes():List<QuoteModel>{
        val response :List<QuoteModel> = api.getQuotes()
        QuoteProvider.quotes = response
        return response
    }
}