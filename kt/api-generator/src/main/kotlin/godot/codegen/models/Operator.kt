package godot.codegen.models

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty

data class Operator @JsonCreator constructor(
    @param:JsonProperty("name") val name: String,
    @param:JsonProperty("right_type") val rightType: String?,
    @param:JsonProperty("return_type") val returnType: String,
    @param:JsonProperty("description") val description: String?,
    @param:JsonProperty("brief_description") val briefDescription: String?
)
