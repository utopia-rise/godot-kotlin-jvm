package godot.codegen.models.traits

import godot.codegen.constants.GodotMeta
import godot.tools.common.names.CoreType
import godot.tools.common.names.Function
import godot.tools.common.names.qualifiedName
import java.util.*

interface WithDefaultValueTrait : MetaGenerationTrait {
    val defaultValue: String?


    fun getDefaultValue(): Pair<String, Array<Any?>>? {
        val defaultValueString = defaultValue ?: return null
        val identifier = type.identifier
        return when {
            type.isNullable() && defaultValue == "null" -> defaultValueString to arrayOf()
            identifier == CoreType.color.simpleName -> "${CoreType.color.simpleName}($defaultValueString)" to arrayOf()
            identifier == CoreType.variantIdentifier -> defaultValueString to arrayOf()
            identifier == CoreType.boolIdentifier -> defaultValueString.lowercase(Locale.US) to arrayOf()
            identifier == CoreType.floatIdentifier && meta == GodotMeta.Float.float -> "${intToFloat(defaultValueString)}f" to arrayOf()
            identifier == CoreType.floatIdentifier -> intToFloat(defaultValueString) to arrayOf()
            identifier == CoreType.stringName.simpleName -> "${CoreType.stringName.simpleName}(".plus(defaultValueString.replace("&", ""))
                .plus(")") to arrayOf()

            identifier == CoreType.arrayIdentifier || type.isTypedArray() ->
                if (defaultValueString.startsWith("Array")) {
                    val defaultArrayValues = defaultValueString
                        .replace("Array.*\\(\\[".toRegex(), "")
                        .removeSuffix("])")
                    "${Function.variantArrayOf.qualifiedName}(".plus(defaultArrayValues).plus(")")
                } else {
                    "${Function.variantArrayOf.qualifiedName}("
                        .plus(defaultValueString.removePrefix("[").removeSuffix("]"))
                        .plus(")")
                } to arrayOf()

            identifier == CoreType.rect2.simpleName -> defaultValueString
                .replace(",", ".0,")
                .replace(")", ".0)") to arrayOf()

            identifier == CoreType.callable.simpleName -> "%T()" to arrayOf(CoreType.callable)

            identifier == CoreType.rid.simpleName ||
                identifier == CoreType.dictionary.simpleName ||
                identifier == CoreType.transform2D.simpleName ||
                identifier == CoreType.transform3D.simpleName ||
                identifier == CoreType.packedByteArray.simpleName ||
                identifier == CoreType.packedColorArray.simpleName ||
                identifier == CoreType.packedFloat32Array.simpleName ||
                identifier == CoreType.packedFloat64Array.simpleName ||
                identifier == CoreType.packedStringArray.simpleName ||
                identifier == CoreType.packedInt32Array.simpleName ||
                identifier == CoreType.packedInt64Array.simpleName ||
                identifier == CoreType.packedVector2Array.simpleName ||
                identifier == CoreType.packedVector3Array.simpleName
                -> "$identifier()" to arrayOf()

            else -> defaultValueString to arrayOf()
        }
    }

    private fun intToFloat(defaultValue: String): String {
        if (defaultValue.indexOf('.') != -1) return defaultValue
        return "$defaultValue.0"
    }
}

