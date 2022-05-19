package com.marco.arquitecturami.data.model

class QuoteProvider {
    companion object {
        fun ramdow():QuoteModel{
            val position = (0..7).random()
            return quote[position]
        }

    private val quote = listOf<QuoteModel>(
        QuoteModel(
            quote = "Aristeo casares el mejor parqulenio",
            author = "Marco Estrada"
        ),
        QuoteModel(
            quote = "Aristeo casares el mejor parqulenio",
            author = "Marco Itza"
        ),  QuoteModel(
            quote = "Ernesto casares el mejor parqulenio",
            author = "Albert Estrada"
        ),  QuoteModel(
            quote = "Casa casares el mejor parqulenio",
            author = "Albert Itza"
        ),  QuoteModel(
            quote = "Res casares el mejor parqulenio",
            author = "Itza Marco"
        ),  QuoteModel(
            quote = "Campion  casares el mejor parqulenio",
            author = "Estrada Marco"
        ),  QuoteModel(
            quote = "campion del exatlon casares el mejor parqulenio",
            author = "Naylet Camara"
        ),
        QuoteModel(quote = "Fue el primero al darle la vuelta al mundo", author = "Ton" )
    )
    }
}
