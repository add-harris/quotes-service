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

val quotesServiceImpl = QuotesServiceImpl()

@QuarkusTest
@TestInstance(PER_CLASS)
internal class QuotesServiceImplTest {

    @BeforeEach
    fun setupMocks() {
        mockkObject(KanyeQuotes)
    }

    @Test
    fun service_calls_kanye_repository() {
        every { KanyeQuotes.getQuote(KANYE) } returns testQuote
        quotesServiceImpl.getQuote(KANYE)
        verify(exactly = 1) { KanyeQuotes.getQuote(KANYE) }
    }

    @Test
    fun returns_quote_from_kanye_repository() {
        every { KanyeQuotes.getQuote(KANYE) } returns testQuote
        val result = quotesServiceImpl.getQuote(KANYE)
        assertEquals(testQuote, result)
    }

    @Test
    fun returns_null_if_category_not_recognised() {
        every { KanyeQuotes.getQuote("notCategory") } returns null
        val result = quotesServiceImpl.getQuote("notCategory")
        assertNull(result)
    }


}