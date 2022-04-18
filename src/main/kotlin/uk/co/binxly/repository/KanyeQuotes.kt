package uk.co.binxly.repository

import uk.co.binxly.models.Quote
import javax.enterprise.context.ApplicationScoped

@ApplicationScoped
object KanyeQuotes {

    private val kanyeQuotes = mapOf<String, Quote>(
        Pair("123", Quote("123", "", "kanye west"))
    )

    fun getQuote(category: String) : Quote? {
        return kanyeQuotes["123"]
    }

}