package godot.registrar.generator.ext

import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.MemberName
import com.squareup.kotlinpoet.TypeName
import com.squareup.kotlinpoet.asClassName
import godot.common.extensions.convertToCamelCase
import godot.common.util.NaturalT
import godot.common.util.RealT
import godot.core.AABB
import godot.core.LambdaCallable
import godot.core.NodePath
import godot.core.PackedByteArray
import godot.core.PackedColorArray
import godot.core.PackedFloat32Array
import godot.core.PackedFloat64Array
import godot.core.PackedInt32Array
import godot.core.PackedInt64Array
import godot.core.PackedStringArray
import godot.core.PackedVector2Array
import godot.core.PackedVector3Array
import godot.core.PackedVector4Array
import godot.core.RID
import godot.core.StringName
import godot.core.Transform2D
import godot.core.Transform3D
import godot.core.VariantArray
import godot.core.VariantCaster
import godot.core.VariantParser
import godot.registration.model.ext.isCoreType
import godot.registration.model.types.Type
import godot.registration.model.types.TypeKind
import java.util.Locale

private object VariantConverterNames {
    private val parser = VariantParser::class.asClassName()
    private val caster = VariantCaster::class.asClassName()

    val nil = MemberName(parser, "NIL")
    val bool = MemberName(parser, "BOOL")
    val byte = MemberName(caster, "BYTE")
    val int = MemberName(caster, "INT")
    val long = MemberName(parser, "LONG")
    val float = MemberName(caster, "FLOAT")
    val double = MemberName(parser, "DOUBLE")
    val string = MemberName(parser, "STRING")
    val array = MemberName(parser, "ARRAY")
    val stringName = MemberName(parser, "STRING_NAME")
    val rid = MemberName(parser, "_RID")
    val aabb = MemberName(parser, "AABB")
    val nodePath = MemberName(parser, "NODE_PATH")
    val transform2D = MemberName(parser, "TRANSFORM2D")
    val transform3D = MemberName(parser, "TRANSFORM3D")
    val packedByteArray = MemberName(parser, "PACKED_BYTE_ARRAY")
    val packedInt32Array = MemberName(parser, "PACKED_INT_32_ARRAY")
    val packedInt64Array = MemberName(parser, "PACKED_INT_64_ARRAY")
    val packedFloat32Array = MemberName(parser, "PACKED_FLOAT_32_ARRAY")
    val packedFloat64Array = MemberName(parser, "PACKED_FLOAT_64_ARRAY")
    val packedStringArray = MemberName(parser, "PACKED_STRING_ARRAY")
    val packedVector2Array = MemberName(parser, "PACKED_VECTOR2_ARRAY")
    val packedVector3Array = MemberName(parser, "PACKED_VECTOR3_ARRAY")
    val packedVector4Array = MemberName(parser, "PACKED_VECTOR4_ARRAY")
    val packedColorArray = MemberName(parser, "PACKED_COLOR_ARRAY")
    val callable = MemberName(parser, "CALLABLE")
    val any = MemberName(caster, "ANY")
    val enum = MemberName(caster, "ENUM")
    val obj = MemberName(parser, "OBJECT")

    fun parserName(name: String) = MemberName(parser, name.uppercase(Locale.getDefault()))
}

fun Type?.toKtVariantMemberName(): MemberName = when {
    this == null || fqName == Unit::class.qualifiedName -> VariantConverterNames.nil
    this.kind == TypeKind.ENUM -> VariantConverterNames.enum
    fqName == Byte::class.qualifiedName -> VariantConverterNames.byte
    fqName == Int::class.qualifiedName -> VariantConverterNames.int
    fqName == NaturalT::class.qualifiedName || fqName == Long::class.qualifiedName -> VariantConverterNames.long
    fqName == Float::class.qualifiedName -> VariantConverterNames.float
    fqName == RealT::class.qualifiedName || fqName == Double::class.qualifiedName -> VariantConverterNames.double
    fqName == String::class.qualifiedName -> VariantConverterNames.string
    fqName == Boolean::class.qualifiedName -> VariantConverterNames.bool
    fqName == VariantArray::class.qualifiedName -> VariantConverterNames.array
    fqName == StringName::class.qualifiedName -> VariantConverterNames.stringName
    fqName == RID::class.qualifiedName -> VariantConverterNames.rid
    fqName == AABB::class.qualifiedName -> VariantConverterNames.aabb
    fqName == NodePath::class.qualifiedName -> VariantConverterNames.nodePath
    fqName == Transform2D::class.qualifiedName -> VariantConverterNames.transform2D
    fqName == Transform3D::class.qualifiedName -> VariantConverterNames.transform3D
    fqName == PackedByteArray::class.qualifiedName -> VariantConverterNames.packedByteArray
    fqName == PackedInt32Array::class.qualifiedName -> VariantConverterNames.packedInt32Array
    fqName == PackedInt64Array::class.qualifiedName -> VariantConverterNames.packedInt64Array
    fqName == PackedFloat32Array::class.qualifiedName -> VariantConverterNames.packedFloat32Array
    fqName == PackedFloat64Array::class.qualifiedName -> VariantConverterNames.packedFloat64Array
    fqName == PackedStringArray::class.qualifiedName -> VariantConverterNames.packedStringArray
    fqName == PackedVector2Array::class.qualifiedName -> VariantConverterNames.packedVector2Array
    fqName == PackedVector3Array::class.qualifiedName -> VariantConverterNames.packedVector3Array
    fqName == PackedVector4Array::class.qualifiedName -> VariantConverterNames.packedVector4Array
    fqName == PackedColorArray::class.qualifiedName -> VariantConverterNames.packedColorArray
    fqName.startsWith(LambdaCallable::class.qualifiedName!!) -> VariantConverterNames.callable
    isCoreType() -> VariantConverterNames.parserName(
        fqName.substringAfterLast(".").convertToCamelCase().uppercase(Locale.getDefault())
    )
    fqName == Any::class.qualifiedName -> VariantConverterNames.any
    else -> VariantConverterNames.obj
}

fun Type.toTypeName(): TypeName = ClassName(
    fqName.substringBeforeLast("."),
    fqName.substringAfterLast(".")
)

fun <T : Enum<T>> T.asEnumName() = MemberName(this::class.asClassName(), this.name)
