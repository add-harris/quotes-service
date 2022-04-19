package uk.co.binxly.services

import uk.co.binxly.models.Quote
import uk.co.binxly.repository.KanyeQuotes
import javax.enterprise.context.ApplicationScoped

// Categories - could potentially be expanded
const val KANYE = "kanye"

@ApplicationScoped
class QuotesServiceImpl : QuotesService {

    override fun getQuote(category: String): Quote? {
        return when (category) {
            KANYE -> KanyeQuotes.getQuote()
            else -> null
        }
    }

    override fun getQuoteById(category: String, id: String): Quote? {
        return null
    }

}