package uk.co.binxly.controllers


interface QuotesController {

    fun getQuote(category : String)

    fun getQuoteById(category : String, id : String)

}