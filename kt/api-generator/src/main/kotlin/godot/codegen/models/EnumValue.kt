package godot.codegen.models

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty

data class EnumValue @JsonCreator constructor(
    @param:JsonProperty("name") val name: String,
    @param:JsonProperty("value") val value: Long,
    @param:JsonProperty("description") val description: String? = null
)
