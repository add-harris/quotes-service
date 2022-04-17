package uk.co.binxly.controllers

import javax.ws.rs.core.Response


interface QuotesController {

    fun getQuote(category : String) : Response

    fun getQuoteById(category : String, id : String)

}