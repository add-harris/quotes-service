package uk.co.binxly.controllers

import org.slf4j.LoggerFactory
import uk.co.binxly.services.QuotesService
import javax.enterprise.context.ApplicationScoped
import javax.enterprise.inject.Default
import javax.inject.Inject
import javax.ws.rs.GET
import javax.ws.rs.Path
import javax.ws.rs.PathParam
import javax.ws.rs.Produces
import javax.ws.rs.core.MediaType
import javax.ws.rs.core.Response


@ApplicationScoped
@Path("/v1/quotes")
class QuotesControllerImpl(
    private val quotesService: QuotesService
) : QuotesController {

    private val logger = LoggerFactory.getLogger(QuotesControllerImpl::class.java)

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("{category}")
    override fun getQuote(@PathParam("category") category : String): Response {
        logger.info(category)
        return Response.ok("{ \"text\": \"${quotesService.getQuote(category)}\"}").build()
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("{category}/{id}")
    override fun getQuoteById(
        @PathParam("category") category : String,
        @PathParam("id") id : String
    ) {
        logger.info(category)
        logger.info(id)
    }

}