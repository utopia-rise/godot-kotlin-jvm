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
    isCoreType() -> ClassName(
        "godot.core.VariantType",
        fqName.substringAfterLast(".").camelToSnakeCase().uppercase(Locale.getDefault())
    )
    fqName == "kotlin.Unit" -> ClassName("godot.core.VariantType", "NIL")
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
    "godot.core.VariantArray" -> true
    else -> supertypes.any { it.isCompatibleList() }
}

fun Type.isReference(): Boolean = fqName == "godot.Reference" ||
    this
        .supertypes
        .any { it.isReference() }

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
    "godot.core.Rect2" -> 6
    "godot.core.Vector3" -> 7
    "godot.core.Transform2D" -> 8
    "godot.core.Plane" -> 9
    "godot.core.Quat" -> 10
    "godot.core.AABB" -> 11
    "godot.core.Basis" -> 12
    "godot.core.Transform" -> 13
    "godot.core.Color" -> 14
    "godot.core.NodePath" -> 15
    "godot.core.RID" -> 16
    "godot.core.OBJECT" -> 17
    "godot.core.Dictionary" -> 18
    //Array -> handled in else branch
    "godot.core.PoolByteArray" -> 20
    "godot.core.PoolIntArray" -> 21
    "godot.core.PoolRealArray" -> 22
    "godot.core.PoolStringArray" -> 23
    "godot.core.PoolColorArray" -> 24
    "godot.core.PoolVector2Array" -> 25
    "godot.core.PoolVector3Array" -> 26
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
    "godot.core.Rect2",
    "godot.core.Vector3",
    "godot.core.Transform2D",
    "godot.core.Plane",
    "godot.core.Quat",
    "godot.core.AABB",
    "godot.core.Basis",
    "godot.core.Transform",
    "godot.core.Color",
    "godot.core.NodePath",
    "godot.core.RID",
    "godot.Object",
    "godot.core.Dictionary",
    "godot.core.PoolByteArray",
    "godot.core.PoolIntArray",
    "godot.core.PoolRealArray",
    "godot.core.PoolStringArray",
    "godot.core.PoolColorArray",
    "godot.core.PoolVector2Array",
    "godot.core.PoolVector3Array",
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
    "godot.core.Vector3Array"
)
