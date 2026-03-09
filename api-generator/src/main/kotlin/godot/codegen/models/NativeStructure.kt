package godot.codegen.models

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty

data class NativeStructure @JsonCreator constructor(
    @JsonProperty("name") val name: String,
    @JsonProperty("format") val format: String
)
