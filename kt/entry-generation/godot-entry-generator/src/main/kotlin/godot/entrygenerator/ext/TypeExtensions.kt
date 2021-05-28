package godot.entrygenerator.ext

import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.TypeName
import godot.entrygenerator.model.Type
import java.util.*

//TODO: make compatible with other languages
fun Type.toKtVariantType(): ClassName = when {
    fqName == "kotlin.Int" -> ClassName("godot.core.VariantType", "JVM_INT")
    fqName == "kotlin.Long" -> ClassName("godot.core.VariantType", "LONG")
    fqName == "kotlin.Float" -> ClassName("godot.core.VariantType", "JVM_FLOAT")
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

fun Type.isCoreType(): Boolean {
    return coreTypes.contains(fqName)
}

fun Type.toTypeName(): TypeName = ClassName(
    fqName.substringBeforeLast("."),
    fqName.substringAfterLast(".")
)

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
