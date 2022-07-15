package godot.codegen.models

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import godot.codegen.traits.TypedTrait

data class Argument @JsonCreator constructor(
    @JsonProperty("name") val name : String,
    @JsonProperty("type") override val type : String,
    @JsonProperty("meta") val meta : String?,
    @JsonProperty("default_value") val defaultValue: String?
) : TypedTrait
