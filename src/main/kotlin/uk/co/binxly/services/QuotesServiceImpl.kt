package uk.co.binxly.services

import uk.co.binxly.models.Quote
import javax.enterprise.context.ApplicationScoped

@ApplicationScoped
class QuotesServiceImpl : QuotesService {

    override fun getQuote(category: String): Quote {
        return Quote("", "", "")
    }
}