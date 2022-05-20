package com.marco.arquitecturami.ui.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.marco.arquitecturami.data.model.QuoteModel
import com.marco.arquitecturami.data.model.QuoteProvider
import com.marco.arquitecturami.domain.GetQuotesUseCase
import kotlinx.coroutines.launch

class QuoteViewModel : ViewModel() {

    val quoteModel = MutableLiveData<QuoteModel>()
    val isLoading = MutableLiveData<Boolean>()

    var getQuotesUseCase = GetQuotesUseCase()

    fun onCreate() {
        viewModelScope.launch {
            val result :List<QuoteModel>? = getQuotesUseCase()

            if(!result.isNullOrEmpty()) {
                quoteModel.postValue(result[0])
            }
        }
    }

    fun randomQuote(){
        //val currentQuote : QuoteModel = QuoteProvider.ramdow()
       // quoteModel.postValue(currentQuote)
//
    }
}