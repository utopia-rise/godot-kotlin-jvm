package godot.codegen.models.traits

import godot.codegen.constants.GodotMeta
import godot.tools.common.constants.GODOT_CALLABLE
import godot.tools.common.constants.GodotKotlinJvmTypes
import godot.tools.common.constants.GodotTypes
import godot.tools.common.constants.godotCorePackage
import java.util.*

interface WithDefaultValueTrait : MetaGenerationTrait {
    val defaultValue: String?


    fun getDefaultValue(): Pair<String, Array<Any?>>? {
        val defaultValueString = defaultValue ?: return null
        val identifier = type.identifier
        return when {
            nullable && defaultValue == "null" -> defaultValueString to arrayOf()
            identifier == GodotTypes.color -> "${GodotKotlinJvmTypes.color}($defaultValueString)" to arrayOf()
            identifier == GodotTypes.variant -> defaultValueString to arrayOf()
            identifier == GodotTypes.bool -> defaultValueString.lowercase(Locale.US) to arrayOf()
            identifier == GodotTypes.float && meta == GodotMeta.Float.float -> "${intToFloat(defaultValueString)}f" to arrayOf()
            identifier == GodotTypes.float -> intToFloat(defaultValueString) to arrayOf()
            identifier == GodotTypes.stringName -> "${GodotKotlinJvmTypes.stringName}(".plus(defaultValueString.replace("&", ""))
                .plus(")") to arrayOf()

            identifier == GodotTypes.array || type.isTypedArray() ->
                if (defaultValueString.startsWith("Array")) {
                    val defaultArrayValues = defaultValueString
                        .replace("Array.*\\(\\[".toRegex(), "")
                        .removeSuffix("])")
                    "$godotCorePackage.variantArrayOf(".plus(defaultArrayValues).plus(")")
                } else {
                    "$godotCorePackage.variantArrayOf("
                        .plus(defaultValueString.removePrefix("[").removeSuffix("]"))
                        .plus(")")
                } to arrayOf()

            identifier == GodotTypes.rect2 -> defaultValueString
                .replace(",", ".0,")
                .replace(")", ".0)") to arrayOf()

            identifier == GodotTypes.callable -> "%T()" to arrayOf(GODOT_CALLABLE)

            identifier == GodotTypes.rid ||
                identifier == GodotTypes.dictionary ||
                identifier == GodotTypes.transform2D ||
                identifier == GodotTypes.transform3D ||
                identifier == GodotTypes.packedByteArray ||
                identifier == GodotTypes.packedColorArray ||
                identifier == GodotTypes.packedFloat32Array ||
                identifier == GodotTypes.packedFloat64Array ||
                identifier == GodotTypes.packedStringArray ||
                identifier == GodotTypes.packedInt32Array ||
                identifier == GodotTypes.packedInt64Array ||
                identifier == GodotTypes.packedVector2Array ||
                identifier == GodotTypes.packedVector3Array
                -> "$identifier()" to arrayOf()

            else -> defaultValueString to arrayOf()
        }
    }

    private fun intToFloat(defaultValue: String): String {
        if (defaultValue.indexOf('.') != -1) return defaultValue
        return "$defaultValue.0"
    }
}
