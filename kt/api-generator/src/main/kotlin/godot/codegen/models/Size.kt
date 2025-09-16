package godot.codegen.models

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty

data class Size @JsonCreator constructor(
    @param:JsonProperty("name") val name: String,
    @param:JsonProperty("size") val size: Int
)
