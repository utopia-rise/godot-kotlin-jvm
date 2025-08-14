package godot.codegen.models

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty

data class Constructor @JsonCreator constructor(
    @param:JsonProperty("index") val index: Int,
    @param:JsonProperty("arguments") val arguments: List<Argument>?,
    @param:JsonProperty("description") val description: String?,
    @param:JsonProperty("brief_description") val briefDescription: String?
)
