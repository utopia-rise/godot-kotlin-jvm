package godot.codegen.models

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty

data class Signal @JsonCreator constructor(
    @JsonProperty("name") val name: String,
    @JsonProperty("arguments") val arguments: List<Argument>?,
    @JsonProperty("description") val description: String?,
    @JsonProperty("brief_description") val briefDescription: String?
)
