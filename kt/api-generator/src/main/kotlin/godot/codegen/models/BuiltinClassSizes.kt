package godot.codegen.models

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty

data class BuiltinClassSizes @JsonCreator constructor(
    @param:JsonProperty("build_configuration") val buildConfiguration: String,
    @param:JsonProperty("sizes") val sizes: List<Size>
)
