package uk.co.binxly.models

const val e404 = 404
const val NOT_FOUND = "Not Found."
const val NOT_FOUND_DETAIL = "No Quote Found for Request."

data class ErrorResponse(val status : Int, val title : String, val detail : String) {

    companion object Generator {

        fun notFound(): ErrorResponse {
            return ErrorResponse(e404, NOT_FOUND, NOT_FOUND_DETAIL)
        }

    }

}
