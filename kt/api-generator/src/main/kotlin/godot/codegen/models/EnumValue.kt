package godot.codegen.models

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty

data class EnumValue @JsonCreator constructor(
    @JsonProperty("name") val name : String,
    @JsonProperty("value") val value : Int
)
