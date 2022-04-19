package uk.co.binxly.controllers

import org.eclipse.microprofile.openapi.annotations.Operation
import org.eclipse.microprofile.openapi.annotations.enums.SchemaType
import org.eclipse.microprofile.openapi.annotations.media.Content
import org.eclipse.microprofile.openapi.annotations.media.Schema
import org.eclipse.microprofile.openapi.annotations.parameters.Parameter
import org.eclipse.microprofile.openapi.annotations.responses.APIResponse
import org.eclipse.microprofile.openapi.annotations.tags.Tag
import org.slf4j.LoggerFactory
import uk.co.binxly.models.ErrorResponse
import uk.co.binxly.models.Quote
import uk.co.binxly.services.QuotesService
import javax.enterprise.context.ApplicationScoped
import javax.ws.rs.GET
import javax.ws.rs.Path
import javax.ws.rs.PathParam
import javax.ws.rs.Produces
import javax.ws.rs.core.MediaType
import javax.ws.rs.core.Response


@ApplicationScoped
@Path("/v1/quotes")
@Tag(name = "Quotes APIs", description = "Available for querying quotes.")
class QuotesControllerImpl(
    private val quotesService: QuotesService
) : QuotesController {

    private val logger = LoggerFactory.getLogger(QuotesControllerImpl::class.java)

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("{category}")
    @Operation(summary = "Get randomized quote.")
    @APIResponse(responseCode = "200", description = "OK", content = [Content(mediaType = "application/json", schema = Schema(implementation = Quote::class))])
    @APIResponse(responseCode = "404", description = "Not Found", content = [Content(mediaType = "application/json", schema = Schema(implementation = ErrorResponse::class))])
    override fun getQuote(
        @PathParam("category")
        @Parameter(name = "category", example = "kanye", description = "category of quote requested")
        category : String
    ) : Response {
        logger.info("quote request received for category: $category")
        return when (val quote = quotesService.getQuote(category)) {
            null -> Response.status(404).entity(ErrorResponse.notFound()).build()
            else -> Response.ok(quote).build()
        }
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("{category}/{id}")
    @Operation(summary = "Get quote by id.")
    @APIResponse(responseCode = "200", description = "OK", content = [Content(mediaType = "application/json", schema = Schema(implementation = Quote::class))])
    @APIResponse(responseCode = "404", description = "Not Found", content = [Content(mediaType = "application/json", schema = Schema(implementation = ErrorResponse::class))])
    override fun getQuoteById(
        @PathParam("category")
        @Parameter(name = "category", example = "kanye", description = "category of quote requested")
        category : String,
        @PathParam("id")
        @Parameter(name = "id", example = "015", description = "unique quote identifier", schema = Schema(pattern = "[0-9]{3}", type = SchemaType.STRING, format = "[0-9]{3}"))
        id : String
    ) : Response {
        logger.info("quote request received for category: $category, quote id: $id")
        return when (val quote = quotesService.getQuoteById(category, id)) {
            null -> Response.status(404).entity(ErrorResponse.notFound()).build()
            else -> Response.ok(quote).build()
        }

    }

}