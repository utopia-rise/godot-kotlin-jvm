package godot.codegen.models

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty

data class Signal @JsonCreator constructor(
    @param:JsonProperty("name") val name: String,
    @param:JsonProperty("arguments") val arguments: List<Argument>?,
    @param:JsonProperty("description") val description: String?,
    @param:JsonProperty("brief_description") val briefDescription: String?
)
