package uk.co.binxly.models

import org.eclipse.microprofile.openapi.annotations.media.Schema

@Schema(description = "Quote object")
data class Quote(
    @field:Schema(description = "unique quote identifier", example = "015")
    val id : String,
    @field:Schema(description = "quote text", example = "I make awesome decisions in bike stores!!!")
    val text : String,
    @field:Schema(description = "quote author", example = "Kanye West")
    val author : String
)
