package godot.codegen.models

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty

data class ReturnValue @JsonCreator constructor(
    @param:JsonProperty("type") val type: String,
    @param:JsonProperty("meta") val meta: String?,
)
