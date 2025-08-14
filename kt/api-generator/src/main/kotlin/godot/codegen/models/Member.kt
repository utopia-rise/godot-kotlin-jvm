package godot.codegen.models

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty

data class Member @JsonCreator constructor(
    @param:JsonProperty("name") val name: String,
    @param:JsonProperty("type") val type: String,
    @param:JsonProperty("description") val description: String?,
    @param:JsonProperty("brief_description") val briefDescription: String?
)
