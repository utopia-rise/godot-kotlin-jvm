package godot.codegen.models

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import godot.codegen.traits.TypedTrait

data class Singleton @JsonCreator constructor(
    @JsonProperty("name") val name: String,
    @JsonProperty("type") val type: String
)
