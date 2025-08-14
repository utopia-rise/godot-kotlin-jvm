package godot.codegen.models

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty

data class Argument @JsonCreator constructor(
    @param:JsonProperty("name") val name: String,
    @param:JsonProperty("type") val type: String,
    @param:JsonProperty("meta") val meta: String?,
    @param:JsonProperty("default_value") val defaultValue: String?
)
