package uk.co.binxly.services

import io.mockk.every
import io.mockk.mockkObject
import io.mockk.verify
import io.quarkus.test.junit.QuarkusTest
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertNull
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance
import org.junit.jupiter.api.TestInstance.Lifecycle.PER_CLASS
import uk.co.binxly.repository.KanyeQuotes
import uk.co.binxly.utils.Fixtures.KANYE
import uk.co.binxly.utils.Fixtures.testQuote

const val QUOTE_ID = "015"
const val INVALID_QUOTE_ID = "106"
val quotesServiceImpl = QuotesServiceImpl()

@QuarkusTest
@TestInstance(PER_CLASS)
internal class QuotesServiceImplTest {

    @BeforeEach
    fun setupMocks() {
        mockkObject(KanyeQuotes)
    }

    @Test
    fun get_quote_calls_kanye_repository() {
        every { KanyeQuotes.getQuote() } returns testQuote
        quotesServiceImpl.getQuote(KANYE)
        verify(exactly = 1) { KanyeQuotes.getQuote() }
    }

    @Test
    fun get_quote_returns_quote_from_kanye_repository() {
        every { KanyeQuotes.getQuote() } returns testQuote
        val result = quotesServiceImpl.getQuote(KANYE)
        assertEquals(testQuote, result)
    }

    @Test
    fun get_quote_returns_null_if_category_not_recognised() {
        every { KanyeQuotes.getQuote() } returns null
        val result = quotesServiceImpl.getQuote("notCategory")
        assertNull(result)
    }

    @Test
    fun get_quote_by_id_calls_kanye_repository() {
        every { KanyeQuotes.getQuoteById(QUOTE_ID) } returns testQuote
        quotesServiceImpl.getQuoteById(KANYE, QUOTE_ID)
        verify(exactly = 1) { KanyeQuotes.getQuoteById(QUOTE_ID) }
    }

    @Test
    fun get_quote_by_id_returns_quote_from_kanye_repository() {
        every { KanyeQuotes.getQuoteById(QUOTE_ID) } returns testQuote
        val result = quotesServiceImpl.getQuoteById(KANYE, QUOTE_ID)
        assertEquals(testQuote, result)
    }

    @Test
    fun get_quote_by_id_returns_null_if_category_not_recognised() {
        every { KanyeQuotes.getQuoteById(INVALID_QUOTE_ID) } returns null
        val result = quotesServiceImpl.getQuoteById(KANYE, INVALID_QUOTE_ID)
        assertNull(result)
    }

}