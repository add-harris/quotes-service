package uk.co.binxly.services

import javax.enterprise.context.ApplicationScoped

@ApplicationScoped
class QuotesServiceImpl : QuotesService {

    override fun getQuote(category: String): String {
        return "quote string"
    }
}