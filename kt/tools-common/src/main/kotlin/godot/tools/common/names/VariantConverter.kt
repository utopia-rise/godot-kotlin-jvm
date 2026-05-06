@file:Suppress("unused")

package godot.tools.common.names

import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.MemberName

object VariantConverter {
    val parserType = ClassName(godotCorePackage, "VariantParser")
    val casterType = ClassName(godotCorePackage, "VariantCaster")
    val converterType = ClassName(godotInteropPackage, "VariantConverter")

    fun parserName(simpleName: String): MemberName = parserType.member(simpleName)
    fun casterName(simpleName: String): MemberName = casterType.member(simpleName)

    val nil = parserName("NIL")
    val bool = parserName("BOOL")
    val long = parserName("LONG")
    val double = parserName("DOUBLE")
    val nodePath = parserName("NODE_PATH")
    val stringName = parserName("STRING_NAME")
    val string = parserName("STRING")
    val rid = parserName("_RID")
    val array = parserName("ARRAY")
    val aabb = parserName("AABB")
    val transform2D = parserName("TRANSFORM2D")
    val transform3D = parserName("TRANSFORM3D")
    val packedByteArray = parserName("PACKED_BYTE_ARRAY")
    val packedInt32Array = parserName("PACKED_INT_32_ARRAY")
    val packedInt64Array = parserName("PACKED_INT_64_ARRAY")
    val packedFloat32Array = parserName("PACKED_FLOAT_32_ARRAY")
    val packedFloat64Array = parserName("PACKED_FLOAT_64_ARRAY")
    val packedStringArray = parserName("PACKED_STRING_ARRAY")
    val packedVector2Array = parserName("PACKED_VECTOR2_ARRAY")
    val packedVector3Array = parserName("PACKED_VECTOR3_ARRAY")
    val packedVector4Array = parserName("PACKED_VECTOR4_ARRAY")
    val packedColorArray = parserName("PACKED_COLOR_ARRAY")
    val callable = parserName("CALLABLE")
    val obj = parserName("OBJECT")

    val byte = casterName("BYTE")
    val int = casterName("INT")
    val float = casterName("FLOAT")
    val any = casterName("ANY")
    val enum = casterName("ENUM")
}
