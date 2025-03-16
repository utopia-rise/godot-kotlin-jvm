package godot.codegen.models

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import godot.codegen.traits.CastableTrait

data class ReturnValue @JsonCreator constructor(
    @JsonProperty("type") val type: String,
    @JsonProperty("meta") val meta: String?,
)
