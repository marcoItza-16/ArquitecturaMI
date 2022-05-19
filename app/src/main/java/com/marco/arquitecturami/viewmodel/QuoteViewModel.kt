package com.marco.arquitecturami.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.marco.arquitecturami.model.QuoteModel
import com.marco.arquitecturami.model.QuoteProvider

class QuoteViewModel : ViewModel() {

    val quoteModel = MutableLiveData<QuoteModel>()

    fun randomQuote(){
        val currentQuote : QuoteModel = QuoteProvider.ramdow()
        quoteModel.postValue(currentQuote)

    }
}