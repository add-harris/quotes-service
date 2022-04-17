package uk.co.binxly.controllers

import io.quarkus.test.junit.QuarkusTest
import io.restassured.RestAssured
import io.restassured.RestAssured.given
import org.hamcrest.CoreMatchers
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import javax.ws.rs.core.MediaType

@QuarkusTest
internal class QuotesControllerImplTest {

    @Test
    fun get_quote_returns_200_response() {
        given()
            .`when`().get("/v1/quotes/kanye")
            .then()
            .statusCode(200)
    }

    @Test
    fun get_quote_produces_application_json() {
        given()
            .`when`().get("/v1/quotes/kanye")
            .then()
            .statusCode(200)
            .and()
            .header("content-type", MediaType.APPLICATION_JSON)
    }

}