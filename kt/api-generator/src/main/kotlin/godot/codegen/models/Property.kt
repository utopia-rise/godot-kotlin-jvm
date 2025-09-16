package godot.codegen.models

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty

data class Property @JsonCreator constructor(
    @param:JsonProperty("type") val type: String,
    @param:JsonProperty("name") val name: String,
    @param:JsonProperty("setter") val setter: String?,
    @param:JsonProperty("getter") val getter: String,
    @param:JsonProperty("index") val index: Int?,
    @param:JsonProperty("description") val description: String?,
    @param:JsonProperty("brief_description") val briefDescription: String?
)
