package uk.co.binxly.utils

import uk.co.binxly.models.Quote

object Fixtures {

    const val QUOTES_PATH: String = "/v1/quotes/kanye"

    const val KANYE: String = "kanye"

    val testQuote: Quote = Quote("123456", "some quote text", "ye")

}