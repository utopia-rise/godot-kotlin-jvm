package godot.codegen.models

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import godot.codegen.traits.TypedTrait

data class Property @JsonCreator constructor(
    @JsonProperty("type") override val type: String,
    @JsonProperty("name") val name: String,
    @JsonProperty("setter") val setter: String?,
    @JsonProperty("getter") val getter: String,
    @JsonProperty("index") val index: Int?,
    @JsonProperty("documentation") val documentation: String?
) : TypedTrait
