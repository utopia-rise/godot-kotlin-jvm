package godot.codegen.models

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty

data class Singleton @JsonCreator constructor(
    @param:JsonProperty("name") val name: String,
    @param:JsonProperty("type") val type: String
)
