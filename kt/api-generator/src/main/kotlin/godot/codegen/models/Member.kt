package godot.codegen.models

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty

data class Member @JsonCreator constructor(
    @JsonProperty("name") val name: String,
    @JsonProperty("type") val type: String
)
