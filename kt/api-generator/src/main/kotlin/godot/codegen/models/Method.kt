package godot.codegen.models

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty

data class Method @JsonCreator constructor(
    @param:JsonProperty("name") val name: String,
    @param:JsonProperty("is_const") val isConst: Boolean,
    @param:JsonProperty("is_vararg") val isVararg: Boolean,
    @param:JsonProperty("is_virtual") val isVirtual: Boolean,
    @param:JsonProperty("is_static") val isStatic: Boolean,
    @param:JsonProperty("is_required") val isRequired: Boolean,
    @param:JsonProperty("hash") val hash: Long,
    @param:JsonProperty("hash_compatibility") val hashCompatibility: List<Long>?,
    @param:JsonProperty("return_value") val returnValue: ReturnValue?,
    @param:JsonProperty("return_type") val returnType: String?,
    @param:JsonProperty("arguments") val arguments: List<Argument>?,
    @param:JsonProperty("description") val description: String?,
    @param:JsonProperty("brief_description") val briefDescription: String?
)
