package godot.codegen.models

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import godot.codegen.traits.IDocumented

data class UtilityFunction @JsonCreator constructor (
    @JsonProperty("name") val name : String,
    @JsonProperty("return_type") val returnType : String?,
    @JsonProperty("category") val category : String,
    @JsonProperty("is_vararg") val isVararg : Boolean,
    @JsonProperty("hash") val hash : Long,
    @JsonProperty("arguments") val arguments : List<Argument>?,
    @JsonProperty("description") val description: String?,
    @JsonProperty("brief_description") val briefDescription: String?
)
