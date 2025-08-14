package godot.codegen.models

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty

data class Class @JsonCreator constructor(
    @param:JsonProperty("name") val name: String,
    @param:JsonProperty("is_refcounted") val isRefCounted: Boolean,
    @param:JsonProperty("is_instantiable") val isInstantiable: Boolean,
    @param:JsonProperty("inherits") val inherits: String?,
    @param:JsonProperty("api_type") val apiType: String,
    @param:JsonProperty("enums") val enums: List<Enum>?,
    @param:JsonProperty("methods") val methods: List<Method>?,
    @param:JsonProperty("properties") val properties: List<Property>?,
    @param:JsonProperty("constants") val constants: List<Constant>?,
    @param:JsonProperty("signals") val signals: List<Signal>?,
    @param:JsonProperty("description") val description: String?,
    @param:JsonProperty("brief_description") val briefDescription: String?
) {
    fun copy(newName: String) = Class(
        newName,
        isRefCounted,
        isInstantiable,
        inherits,
        apiType,
        enums,
        methods,
        properties,
        constants,
        signals,
        description,
        briefDescription
    )
}
