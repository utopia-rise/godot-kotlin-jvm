package godot.codegen.models

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty

data class BuiltinClass @JsonCreator constructor (
    @JsonProperty("name") val name : String,
    @JsonProperty("is_keyed") val isKeyed : Boolean,
    @JsonProperty("operators") val operators : List<Operator>,
    @JsonProperty("constructors") val constructors : List<Constructor>,
    @JsonProperty("has_destructor") val hasDestructor : Boolean,
    @JsonProperty("methods") val methods: List<Method>?,
    @JsonProperty("members") val members: List<Member>?,
    @JsonProperty("constants") val constants: List<Constant>?,
    @JsonProperty("enums") val enums: List<Enum>?,
    @JsonProperty("indexing_return_type") val indexingReturnType: String?,
    @JsonProperty("documentation") val documentation: String?
)
