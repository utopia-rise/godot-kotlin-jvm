package godot.codegen.models

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import godot.codegen.traits.IDocumented

data class Operator @JsonCreator constructor(
    @JsonProperty("name") val name : String,
    @JsonProperty("right_type") val rightType : String?,
    @JsonProperty("return_type") val returnType : String,
    @JsonProperty("description") val description: String?,
    @JsonProperty("brief_description") val briefDescription: String?
)
