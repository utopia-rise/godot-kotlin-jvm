package godot.codegen.models

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty

data class BuiltinClass @JsonCreator constructor(
    @param:JsonProperty("name") val name: String,
    @param:JsonProperty("is_keyed") val isKeyed: Boolean,
    @param:JsonProperty("operators") val operators: List<Operator>,
    @param:JsonProperty("constructors") val constructors: List<Constructor>,
    @param:JsonProperty("has_destructor") val hasDestructor: Boolean,
    @param:JsonProperty("methods") val methods: List<Method>?,
    @param:JsonProperty("members") val members: List<Member>?,
    @param:JsonProperty("constants") val constants: List<Constant>?,
    @param:JsonProperty("enums") val enums: List<Enum>?,
    @param:JsonProperty("indexing_return_type") val indexingReturnType: String?,
    @param:JsonProperty("description") val description: String?,
    @param:JsonProperty("brief_description") val briefDescription: String?
)
