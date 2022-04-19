package uk.co.binxly.models

import org.eclipse.microprofile.openapi.annotations.media.Schema

const val e404 = 404
const val NOT_FOUND = "Not Found."
const val NOT_FOUND_DETAIL = "No Quote Found for Request."

@Schema(description = "Error details.")
data class ErrorResponse(
    @field:Schema(example = e404.toString(), description = "error status code")
    val status : Int,
    @field:Schema(example = NOT_FOUND, description = "error type")
    val title : String,
    @field:Schema(example = NOT_FOUND_DETAIL, description = "descriptive detail of error")
    val detail : String) {

    companion object Generator {

        fun notFound(): ErrorResponse {
            return ErrorResponse(e404, NOT_FOUND, NOT_FOUND_DETAIL)
        }

    }

}
