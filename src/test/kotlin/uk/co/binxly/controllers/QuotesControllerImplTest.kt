package uk.co.binxly.controllers

import io.mockk.every
import io.mockk.mockk
import io.quarkus.test.junit.QuarkusMock
import io.quarkus.test.junit.QuarkusTest
import io.restassured.RestAssured.given
import org.hamcrest.CoreMatchers.equalTo
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance
import org.junit.jupiter.api.TestInstance.Lifecycle.PER_CLASS
import uk.co.binxly.services.QuotesServiceImpl
import uk.co.binxly.utils.Fixtures.QUOTES_PATH
import uk.co.binxly.utils.Fixtures.testQuote
import javax.ws.rs.core.MediaType

val quotesService: QuotesServiceImpl = mockk()

@QuarkusTest
@TestInstance(PER_CLASS)
internal class QuotesControllerImplTest {

    @BeforeEach
    fun setupMocks() {
        QuarkusMock.installMockForType(quotesService, QuotesServiceImpl::class.java)
        every { quotesService.getQuote("kanye") } returns testQuote
    }

    @Test
    fun get_quote_returns_200_response() {
        given()
            .`when`().get(QUOTES_PATH)
            .then()
            .statusCode(200)
    }

    @Test
    fun get_quote_produces_application_json() {
        given()
            .`when`().get(QUOTES_PATH)
            .then()
            .statusCode(200)
            .and()
            .header("content-type", MediaType.APPLICATION_JSON)
    }

    @Test
    fun get_quote_calls_quotes_service() {
        given()
            .`when`().get(QUOTES_PATH)
            .then()
            .statusCode(200)
            .and()
            .header("content-type", MediaType.APPLICATION_JSON)
    }

    @Test
    fun get_quote_returns_quote() {
        given()
            .`when`().get(QUOTES_PATH)
            .then().statusCode(200)
            .and().body("id", equalTo("123456"))
            .and().body("text", equalTo("some quote text"))
            .and().body("author", equalTo("ye"))
    }

}