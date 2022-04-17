package uk.co.binxly.services

import javax.enterprise.context.ApplicationScoped

interface QuotesService {

    fun getQuote(category: String) : String

}