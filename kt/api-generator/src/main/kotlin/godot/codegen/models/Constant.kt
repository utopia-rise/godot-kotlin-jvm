package godot.codegen.models

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty

data class Constant @JsonCreator constructor(
    @JsonProperty("name") val name: String,
    @JsonProperty("type") val type: String?,
    @JsonProperty("value") val value: String
)
