package com.marco.arquitecturami.domain

import com.marco.arquitecturami.data.QuoteRepository
import com.marco.arquitecturami.data.model.QuoteModel

class GetQuotesUseCase {

    private val repository = QuoteRepository()

    suspend operator fun invoke():List<QuoteModel>? = repository.getAllQuotes()

}
