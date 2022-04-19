package uk.co.binxly.repository

import io.quarkus.test.junit.QuarkusTest
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import uk.co.binxly.utils.Fixtures.KANYE_WEST

@QuarkusTest
internal class KanyeQuotesTest {

    @Test
    fun returns_random_kanye_quote() {
        val quote = KanyeQuotes.getQuote()
        assertEquals(KANYE_WEST, quote?.author)
        assertNotNull(quote?.id)
        assertNotNull(quote?.text)
        assertTrue(quote?.id?.toInt()!! in 0..104)
    }

    @Test
    fun returns_specific_quote_by_id() {
        val quote = KanyeQuotes.getQuoteById("024")
        assertEquals("024", quote?.id)
        assertEquals("I'm nice at ping pong", quote?.text)
        assertEquals(KANYE_WEST, quote?.author)
    }

    @Test
    fun get_quote_by_id_returns_all_104_quotes() {
        for (i in 0..104) {
            val quoteId = i.toString().padStart(3, '0')
            val quote = KanyeQuotes.getQuoteById(quoteId)
            assertEquals(KANYE_WEST, quote?.author)
            assertEquals(quoteId, quote?.id)
            assertNotNull(quote?.text)
        }
    }

    @Test
    fun get_quote_by_id_returns_null_for_invalid_id() {
        val invalidIds = listOf("105", "106", "999", "200", "555")
        invalidIds.forEach { assertNull(KanyeQuotes.getQuoteById(it)) }
    }

}