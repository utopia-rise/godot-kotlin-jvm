package godot.entrygenerator.extension

import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.TypeName
import com.squareup.kotlinpoet.asClassName
import com.squareup.kotlinpoet.asTypeName
import godot.entrygenerator.EntryGenerationType
import godot.entrygenerator.model.GODOT_BASE_TYPE_ANNOTATION
import org.jetbrains.kotlin.js.descriptorUtils.getJetTypeFqName
import org.jetbrains.kotlin.name.FqName
import org.jetbrains.kotlin.types.KotlinType
import org.jetbrains.kotlin.types.typeUtil.*


fun KotlinType.isCoreType(): Boolean {
    return coreTypes.contains(getJetTypeFqName(false).removeSuffix("?"))
}

private fun getReferenceFqName(entryGenerationType: EntryGenerationType) = when (entryGenerationType) {
    EntryGenerationType.KOTLIN_NATIVE -> "godot.Resource"
    EntryGenerationType.JVM -> "godot.Reference"
}

fun KotlinType.isReference(entryGenerationType: EntryGenerationType): Boolean {
    return this.getJetTypeFqName(false) == getReferenceFqName(entryGenerationType)
        || this
        .supertypes()
        .map { it.getJetTypeFqName(false) }
        .any { it == getReferenceFqName(entryGenerationType) }
}

fun KotlinType.isCompatibleList(): Boolean {
    return when {
        getJetTypeFqName(false) == "godot.core.GodotArray" || getJetTypeFqName(false) == "godot.core.VariantArray" -> true
        else -> supertypes().any { it.getJetTypeFqName(false) == "godot.core.GodotArray" || it.getJetTypeFqName(false) == "godot.core.VariantArray" }
    }
}

fun KotlinType.getCompatibleListType(): String {
    return getJetTypeFqName(false).getCompatibleListType()
}

private fun KotlinType.getRegistrableTypeAsFqNameString(): String? {
    return when {
        getJetTypeFqName(false).isGodotPrimitive()
            || isCoreType() -> getJetTypeFqName(false)
        else -> null
    }
}

fun KotlinType.getFirstRegistrableTypeAsFqNameStringOrNull(): String? {
    return getRegistrableTypeAsFqNameString()
        ?: supertypes()
            .firstOrNull { it.getRegistrableTypeAsFqNameString() != null }
            ?.getRegistrableTypeAsFqNameString()
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


fun KotlinType?.toReturnKtVariantType(): ClassName {
    if (this == null) throw IllegalStateException("Type is null")
    val typeFqNameNonNull = getJetTypeFqName(false).removeSuffix("?")
    return when {
        typeFqNameNonNull == "kotlin.Unit" -> ClassName("godot.core.VariantType", "NIL")
        typeFqNameNonNull == "kotlin.Int" || typeFqNameNonNull == "kotlin.Long" -> ClassName("godot.core.VariantType", "LONG")
        typeFqNameNonNull == "kotlin.Float" || typeFqNameNonNull == "kotlin.Double" -> ClassName("godot.core.VariantType", "DOUBLE")
        typeFqNameNonNull == "kotlin.String" -> ClassName("godot.core.VariantType", "STRING")
        isBooleanOrNullableBoolean() -> ClassName("godot.core.VariantType", "BOOL")
        typeFqNameNonNull == "kotlin.Byte" -> ClassName("godot.core.VariantType", "JVM_BYTE")
        typeFqNameNonNull == "godot.core.VariantArray" -> ClassName("godot.core.VariantType", "ARRAY")
        typeFqNameNonNull == "godot.core.RID" -> ClassName("godot.core.VariantType", "_RID")
        typeFqNameNonNull == "godot.core.AABB" -> ClassName("godot.core.VariantType", "AABB")
        typeFqNameNonNull == "godot.core.Transform2D" -> ClassName("godot.core.VariantType", "TRANSFORM2D")
        isCoreType() -> ClassName("godot.core.VariantType", getJetTypeFqName(false).substringAfterLast(".").camelToSnakeCase().toUpperCase())
        isAnyOrNullableAny() -> ClassName("godot.core.VariantType", "ANY")
        supertypes().any { it.isAnyOrNullableAny() } -> ClassName("godot.core.VariantType", "OBJECT")
        else -> throw IllegalStateException("ReturnType $this cannot be handled by godot")
    }
}

fun KotlinType.toParameterKtVariantType(): ClassName {
    val typeFqNameNonNull = getJetTypeFqName(false).removeSuffix("?")
    return when {
        typeFqNameNonNull == "kotlin.Int" -> ClassName("godot.core.VariantType", "JVM_INT")
        typeFqNameNonNull == "kotlin.Long" -> ClassName("godot.core.VariantType", "LONG")
        typeFqNameNonNull == "kotlin.Float" -> ClassName("godot.core.VariantType", "JVM_FLOAT")
        typeFqNameNonNull == "kotlin.Double" -> ClassName("godot.core.VariantType", "DOUBLE")
        typeFqNameNonNull == "kotlin.String" -> ClassName("godot.core.VariantType", "STRING")
        isBooleanOrNullableBoolean() -> ClassName("godot.core.VariantType", "BOOL")
        typeFqNameNonNull == "kotlin.Byte" -> ClassName("godot.core.VariantType", "JVM_BYTE")
        typeFqNameNonNull == "godot.core.VariantArray" -> ClassName("godot.core.VariantType", "ARRAY")
        typeFqNameNonNull == "godot.core.RID" -> ClassName("godot.core.VariantType", "_RID")
        typeFqNameNonNull == "godot.core.AABB" -> ClassName("godot.core.VariantType", "AABB")
        typeFqNameNonNull == "godot.core.Transform2D" -> ClassName("godot.core.VariantType", "TRANSFORM2D")
        isCoreType() -> ClassName("godot.core.VariantType", getJetTypeFqName(false).substringAfterLast(".").camelToSnakeCase().toUpperCase())
        typeFqNameNonNull == "kotlin.Unit" -> ClassName("godot.core.VariantType", "NIL")
        isAnyOrNullableAny() -> ClassName("godot.core.VariantType", "ANY")
        supertypes().any { it.isAnyOrNullableAny() } -> ClassName("godot.core.VariantType", "OBJECT")
        else -> throw IllegalStateException("ParameterType $this cannot be handled by godot")
    }
}

fun KotlinType.toTypeName(): TypeName {
    return ClassName(
        getJetTypeFqName(false).substringBeforeLast("."),
        getJetTypeFqName(false).substringAfterLast(".")
    ).copy(nullable = isMarkedNullable)
}
