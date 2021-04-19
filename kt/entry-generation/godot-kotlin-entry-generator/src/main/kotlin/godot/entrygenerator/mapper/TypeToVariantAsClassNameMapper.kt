package godot.entrygenerator.mapper

import com.squareup.kotlinpoet.ClassName
import godot.entrygenerator.extension.isCompatibleList
import org.jetbrains.kotlin.types.KotlinType

object TypeToVariantAsClassNameMapper {

    fun mapTypeToVariantAsClassName(
        typeAsString: String,
        type: KotlinType? = null,
        isEnum: Boolean = false
    ): ClassName {

        if (isEnum) {
            return ClassName("godot.core.Variant.Type", "STRING")
        }

        return when (typeAsString) {
            "Byte", "Short", "Int", "Long" -> ClassName("godot.core.Variant.Type", "INT")
            "Float", "Double" -> ClassName("godot.core.Variant.Type", "REAL")
            "Boolean" -> ClassName("godot.core.Variant.Type", "BOOL")
            "String" -> ClassName("godot.core.Variant.Type", "STRING")
            "RID" -> ClassName("godot.core.Variant.Type", "_RID")
            "Vector2", "Rect2", "Vector3", "Transform2D", "Plane", "Quat", "Rect3", "Basis", "Transform", "Color", "Dictionary" ->
                ClassName("godot.core.Variant.Type", typeAsString.toUpperCase())
            "NodePath" -> ClassName("godot.core.Variant.Type", "NODE_PATH")
            "PoolByteArray" -> ClassName("godot.core.Variant.Type", "POOL_BYTE_ARRAY")
            "PoolIntArray" -> ClassName("godot.core.Variant.Type", "POOL_INT_ARRAY")
            "PoolReadArray" -> ClassName("godot.core.Variant.Type", "POOL_REAL_ARRAY")
            "PoolStringArray" -> ClassName("godot.core.Variant.Type", "POOL_STRING_ARRAY")
            "PoolVector2Array" -> ClassName("godot.core.Variant.Type", "POOL_VECTOR2_ARRAY")
            "PoolVector3Array" -> ClassName("godot.core.Variant.Type", "POOL_VECTOR3_ARRAY")
            "PoolColorArray" -> ClassName("godot.core.Variant.Type", "POOL_COLOR_ARRAY")
            else -> {
                if (type != null && type.isCompatibleList()) {
                    ClassName("godot.core.Variant.Type", "ARRAY")
                } else {
                    ClassName("godot.core.Variant.Type", "OBJECT")
                }
            }
        }
    }
}
