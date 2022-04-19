package uk.co.binxly.controllers

import javax.validation.constraints.Pattern
import javax.ws.rs.core.Response


interface QuotesController {

    fun getQuote(category : String) : Response

    fun getQuoteById(category : String, @Pattern(regexp = "[0-9]{3}") id : String) : Response

}