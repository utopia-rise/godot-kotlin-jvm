package godot.codegen.models

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty

data class Property @JsonCreator constructor(
    @JsonProperty("type") val type: String,
    @JsonProperty("name") val name: String,
    @JsonProperty("setter") val setter: String?,
    @JsonProperty("getter") val getter: String,
    @JsonProperty("index") val index: Int?,
    @JsonProperty("description") val description: String?,
    @JsonProperty("brief_description") val briefDescription: String?
)
