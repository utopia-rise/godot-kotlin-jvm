package godot.codegen.models

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty

data class Size @JsonCreator constructor (
    @JsonProperty("name") val name : String,
    @JsonProperty("size") val size : Int
)
