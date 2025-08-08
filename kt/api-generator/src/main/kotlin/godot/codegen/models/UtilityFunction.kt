package godot.codegen.models

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty

data class UtilityFunction @JsonCreator constructor(
    @param:JsonProperty("name") val name: String,
    @param:JsonProperty("return_type") val returnType: String?,
    @param:JsonProperty("category") val category: String,
    @param:JsonProperty("is_vararg") val isVararg: Boolean,
    @param:JsonProperty("hash") val hash: Long,
    @param:JsonProperty("arguments") val arguments: List<Argument>?,
    @param:JsonProperty("description") val description: String?,
    @param:JsonProperty("brief_description") val briefDescription: String?
)
