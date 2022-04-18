package uk.co.binxly.services

import uk.co.binxly.models.Quote

interface QuotesService {

    fun getQuote(category: String) : Quote?

}