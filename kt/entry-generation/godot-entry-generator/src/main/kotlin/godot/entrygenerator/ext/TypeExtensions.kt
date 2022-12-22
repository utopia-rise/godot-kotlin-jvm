package godot.entrygenerator.ext

import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.TypeName
import godot.entrygenerator.model.Type
import java.util.*

//TODO: make compatible with other languages
fun Type?.toKtVariantType(): ClassName = when {
    this == null || fqName == "kotlin.Unit" -> ClassName("godot.core.VariantType", "NIL")
    fqName == "kotlin.Int" -> ClassName("godot.core.VariantType", "JVM_INT")
    fqName == "godot.util.NaturalT" ||
        fqName == "kotlin.Long" -> ClassName("godot.core.VariantType", "LONG")
    fqName == "kotlin.Float" -> ClassName("godot.core.VariantType", "JVM_FLOAT")
    fqName == "godot.util.RealT" ||
        fqName == "kotlin.Double" -> ClassName("godot.core.VariantType", "DOUBLE")
    fqName == "kotlin.String" -> ClassName("godot.core.VariantType", "STRING")
    fqName == "kotlin.Boolean" -> ClassName("godot.core.VariantType", "BOOL")
    fqName == "kotlin.Byte" -> ClassName("godot.core.VariantType", "JVM_BYTE")
    fqName == "godot.core.VariantArray" -> ClassName("godot.core.VariantType", "ARRAY")
    fqName == "godot.core.RID" -> ClassName("godot.core.VariantType", "_RID")
    fqName == "godot.core.AABB" -> ClassName("godot.core.VariantType", "AABB")
    fqName == "godot.core.Transform2D" -> ClassName("godot.core.VariantType", "TRANSFORM2D")
    fqName == "godot.core.Transform3D" -> ClassName("godot.core.VariantType", "TRANSFORM3D")
    fqName == "godot.core.PackedInt32Array" -> ClassName("godot.core.VariantType", "PACKED_INT_32_ARRAY")
    fqName == "godot.core.PackedInt64Array" -> ClassName("godot.core.VariantType", "PACKED_INT_64_ARRAY")
    fqName == "godot.core.PackedFloat32Array" -> ClassName("godot.core.VariantType", "PACKED_FLOAT_32_ARRAY")
    fqName == "godot.core.PackedFloat64Array" -> ClassName("godot.core.VariantType", "PACKED_FLOAT_64_ARRAY")
    isCoreType() -> ClassName(
        "godot.core.VariantType",
        fqName.substringAfterLast(".").camelToSnakeCase().uppercase(Locale.getDefault())
    )
    fqName == "kotlin.Any" -> ClassName("godot.core.VariantType", "ANY")
    else -> ClassName("godot.core.VariantType", "OBJECT")
}

/**
 * Same as [toKtVariantType] but resolves JVM_* types to actual godot types.
 *
 * Calls [toKtVariantType] under the hood for all other types
 */
fun Type?.toGodotVariantType(): ClassName = this?.let {
    when (it.fqName) {
        "kotlin.Byte", "kotlin.Int" -> ClassName("godot.core.VariantType", "LONG")
        "kotlin.Float" -> ClassName("godot.core.VariantType", "DOUBLE")
        else -> toKtVariantType()
    }
} ?: toKtVariantType()

fun Type.isCoreType(): Boolean {
    return coreTypes.contains(fqName)
}

fun Type.toTypeName(): TypeName = ClassName(
    fqName.substringBeforeLast("."),
    fqName.substringAfterLast(".")
)

fun Type.isCompatibleList(): Boolean = when (fqName) {
    "godot.core.GodotArray", "godot.core.VariantArray" -> true
    else -> supertypes.any { it.fqName == "godot.core.GodotArray" || it.fqName == "godot.core.VariantArray" }
}

fun Type.isReference(): Boolean = fqName == "godot.Reference" ||
    this
        .supertypes
        .map { it.fqName }
        .any { it == "godot.Reference" }

fun Type.isGodotPrimitive(): Boolean = when (fqName) {
    "kotlin.Int",
    "godot.util.NaturalT",
    "kotlin.Long",
    "kotlin.Float",
    "godot.util.RealT",
    "kotlin.Double",
    "kotlin.Boolean",
    "kotlin.Byte",
    "kotlin.Short",
    "kotlin.String" -> true
    else -> false
}

fun Type.getAsVariantTypeOrdinal(): Int? = when (fqName) {
    "kotlin.Boolean" -> 1
    "kotlin.Int",
    "godot.util.NaturalT",
    "kotlin.Long",
    "kotlin.Byte",
    "kotlin.Short",
    "kotlin.Enum" -> 2
    "kotlin.Float",
    "godot.util.RealT",
    "kotlin.Double" -> 3
    "kotlin.String" -> 4
    "godot.core.Vector2" -> 5
    "godot.core.Vector2i" -> 6
    "godot.core.Rect2" -> 7
    "godot.core.Rect2i" -> 8
    "godot.core.Vector3" -> 9
    "godot.core.Vector3i" -> 10
    "godot.core.Transform2D" -> 11
    "godot.core.Vector4" -> 12
    "godot.core.Vector4i" -> 13
    "godot.core.Plane" -> 14
    "godot.core.Quaternion" -> 15
    "godot.core.AABB" -> 16
    "godot.core.Basis" -> 17
    "godot.core.Transform3D" -> 18
    "godot.core.Projection" -> 19
    "godot.core.Color" -> 20
    "godot.core.StringName" -> 21
    "godot.core.NodePath" -> 22
    "godot.core.RID" -> 23
    "godot.core.OBJECT" -> 24
    "godot.core.Callable" -> 25
    "godot.core.Signal" -> 26
    "godot.core.Dictionary" -> 27
    //Array -> handled in else branch
    "godot.core.PackedByteArray" -> 29
    "godot.core.PackedInt32Array" -> 30
    "godot.core.PackedInt64Array" -> 31
    "godot.core.PackedFloat32Array" -> 32
    "godot.core.PackedFloat64Array" -> 33
    "godot.core.PackedStringArray" -> 34
    "godot.core.PackedVector2Array" -> 35
    "godot.core.PackedVector3Array" -> 36
    "godot.core.PackedColorArray" -> 37
    else -> if (this.isCompatibleListType()) {
        19
    } else {
        null
    }
}

fun Type.isCompatibleListType(): Boolean {
    return this.getCompatibleListType().isNotEmpty()
}

fun Type.getCompatibleListType() = when (fqName) {
    "godot.core.BoolVariantArray" -> "1"
    "godot.core.EnumArray",
    "godot.core.IntVariantArray" -> "2"
    "godot.core.RealVariantArray" -> "3"
    "godot.core.StringVariantArray" -> "4"
    "godot.core.Vector2Array" -> "5"
    "godot.core.Rect2Array" -> "6"
    "godot.core.Vector3Array" -> "7"
    "godot.core.Transform2DArray" -> "8"
    "godot.core.PlaneArray" -> "9"
    "godot.core.QuatArray" -> "10"
    "godot.core.AABBArray" -> "11"
    "godot.core.BasisArray" -> "12"
    "godot.core.TransformArray" -> "13"
    "godot.core.ColorArray" -> "14"
    "godot.core.NodePathArray" -> "15"
    "godot.core.RIDArray" -> "16"
    "godot.core.ObjectArray",
    "godot.core.CoreArray" -> "17"
    else -> ""
}

private val coreTypes = listOf(
    "godot.core.Vector2",
    "godot.core.Vector2i",
    "godot.core.Rect2",
    "godot.core.Rect2i",
    "godot.core.Vector3",
    "godot.core.Vector3i",
    "godot.core.Transform2D",
    "godot.core.Vector4",
    "godot.core.Vector4i",
    "godot.core.Plane",
    "godot.core.Quaternion",
    "godot.core.AABB",
    "godot.core.Basis",
    "godot.core.Transform3D",
    "godot.core.Projection",
    "godot.core.Color",
    "godot.core.StringName",
    "godot.core.NodePath",
    "godot.core.RID",
    "godot.Object",
    "godot.core.Callable",
    "godot.core.Signal",
    "godot.core.Dictionary",
    "godot.core.PackedByteArray",
    "godot.core.PackedInt32Array",
    "godot.core.PackedInt64Array",
    "godot.core.PackedFloat32Array",
    "godot.core.PackedFloat64Array",
    "godot.core.PackedStringArray",
    "godot.core.PackedVector2Array",
    "godot.core.PackedVector3Array",
    "godot.core.PackedColorArray",
    "godot.core.VariantArray",
    "godot.core.ObjectArray",
    "godot.core.EnumArray",
    "godot.core.BoolVariantArray",
    "godot.core.IntVariantArray",
    "godot.core.RealVariantArray",
    "godot.core.StringVariantArray",
    "godot.core.AABBArray",
    "godot.core.BasisArray",
    "godot.core.ColorArray",
    "godot.core.NodePathArray",
    "godot.core.PlaneArray",
    "godot.core.QuatArray",
    "godot.core.Rect2Array",
    "godot.core.RIDArray",
    "godot.core.Transform2DArray",
    "godot.core.TransformArray",
    "godot.core.Vector2Array",
    "godot.core.Vector2iArray",
    "godot.core.Vector3Array",
    "godot.core.Vector3iArray",
    "godot.core.Vector4Array",
    "godot.core.Vector4iArray"
)
