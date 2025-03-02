package godot.codegen.models

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty

data class Method @JsonCreator constructor(
    @JsonProperty("name") val name : String,
    @JsonProperty("is_const") val isConst : Boolean,
    @JsonProperty("is_vararg") val isVararg : Boolean,
    @JsonProperty("is_virtual") val isVirtual : Boolean,
    @JsonProperty("is_static") val isStatic: Boolean,
    @JsonProperty("is_required") val isRequired: Boolean,
    @JsonProperty("hash") val hash : Long,
    @JsonProperty("hash_compatibility") val hashCompatibility: List<Long>?,
    @JsonProperty("return_value") val returnValue : ReturnValue?,
    @JsonProperty("return_type") val returnType: String?,
    @JsonProperty("arguments") val arguments : List<Argument>?,
    @JsonProperty("description") val description: String?,
    @JsonProperty("brief_description") val briefDescription: String?
)
