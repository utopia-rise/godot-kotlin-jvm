package godot.codegen.models

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty

data class BuiltinClassMemberOffsets @JsonCreator constructor (
    @JsonProperty("build_configuration") val buildConfiguration : String,
    @JsonProperty("classes") val classes : List<ClassMemberOffsets>
)
