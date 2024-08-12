package godot.codegen.models

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import godot.codegen.traits.IDocumented

data class EnumValue @JsonCreator constructor(
    @JsonProperty("name") val name : String,
    @JsonProperty("value") val value : Long,
    @JsonProperty("description") override val description: String? = null
) : IDocumented
