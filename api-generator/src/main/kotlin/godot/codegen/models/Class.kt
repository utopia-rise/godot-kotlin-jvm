package godot.codegen.models

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty

data class Class @JsonCreator constructor(
    @JsonProperty("name") val name: String,
    @JsonProperty("is_refcounted") val isRefCounted: Boolean,
    @JsonProperty("is_instantiable") val isInstantiable: Boolean,
    @JsonProperty("inherits") val inherits: String?,
    @JsonProperty("api_type") val apiType: String,
    @JsonProperty("enums") val enums: List<Enum>?,
    @JsonProperty("methods") val methods: List<Method>?,
    @JsonProperty("properties") val properties: List<Property>?,
    @JsonProperty("constants") val constants: List<Constant>?,
    @JsonProperty("signals") val signals: List<Signal>?,
    @JsonProperty("description") val description: String?,
    @JsonProperty("brief_description") val briefDescription: String?
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
