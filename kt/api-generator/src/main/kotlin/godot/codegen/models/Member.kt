package godot.codegen.models

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import godot.codegen.traits.TypedTrait

data class Member @JsonCreator constructor(
    @JsonProperty("name") val name: String,
    @JsonProperty("type") override val type: String,
    @JsonProperty("description") val description: String?,
    @JsonProperty("brief_description") val briefDescription: String?
) : TypedTrait
