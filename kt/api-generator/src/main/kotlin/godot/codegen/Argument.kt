package godot.codegen

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty
import godot.codegen.utils.convertToCamelCase
import godot.codegen.utils.convertTypeToKotlin
import godot.codegen.utils.escapeKotlinReservedNames


@JsonIgnoreProperties(ignoreUnknown = true)
class Argument @JsonCreator constructor(
    @JsonProperty("name")
    var name: String,
    @JsonProperty("type")
    var type: String,
    @JsonProperty("has_default_value")
    val hasDefaultValue: Boolean = false,
    @JsonProperty("default_value")
    var defaultValue: String = ""
) {
    val nullable: Boolean

    val applyDefault: String?

    init {
        name = name.convertToCamelCase().escapeKotlinReservedNames()
        type = type.convertTypeToKotlin()

        if (defaultValue == "[Object:null]" || defaultValue == "Null") {
            defaultValue = "null"
            nullable = true
        } else nullable = type == "Any"

        applyDefault = if (hasDefaultValue && nullable) {
            "null"
        } else if (hasDefaultValue) {
            when (type) {
                "Color", "Variant" -> "$type($defaultValue)"
                "Boolean" -> defaultValue.toLowerCase()
                "Double" -> intToFloat(defaultValue)
                "Vector2", "Vector3", "Rect2" -> "$type${defaultValue.replace(",", ".0,")
                    .replace(")", ".0)")}"
                "Dictionary", "Transform", "Transform2D", if(isNative) "GodotArray" else "VariantArray", "RID", "PoolVector2Array", "PoolStringArray",
                "PoolVector3Array", "PoolColorArray", "PoolIntArray", "PoolRealArray", "PoolByteArray" -> "$type()"
                "String" -> "\"$defaultValue\""
                else -> defaultValue
            }
        } else {
            null
        }
    }

    private fun intToFloat(defaultValue: String): String {
        if (defaultValue.indexOf('.') != -1) return defaultValue

        return "$defaultValue.0"
    }
}
