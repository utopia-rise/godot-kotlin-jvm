package godot.annotation.processor.classgraph.models

import godot.annotation.processor.classgraph.Context
import godot.annotation.processor.classgraph.ProcessorSettings
import godot.annotation.processor.classgraph.constants.JVM_OBJECT
import godot.annotation.processor.classgraph.constants.VOID
import godot.annotation.processor.classgraph.constants.isGodotPrimitive
import godot.annotation.processor.classgraph.constants.jvmPrimitivesToKotlinPrimitives
import godot.annotation.processor.classgraph.extensions.getJavaLangObjectType
import godot.annotation.processor.classgraph.extensions.hasAnnotation
import godot.annotation.processor.classgraph.extensions.mapToType
import godot.annotation.processor.classgraph.extensions.toStringWithoutAnnotations
import godot.registration.model.types.Type
import godot.registration.model.types.TypeKind
import io.github.classgraph.*
import org.jetbrains.annotations.NotNull

class TypeDescriptor private constructor(
    descriptor: TypeSignature,
    val typeArguments: List<TypeArgument>,
    val nullable: Boolean,
    val isLateInit: Boolean,
) {
    private val rawDescriptor = descriptor.toStringWithoutAnnotations()

    constructor(fieldInfo: FieldInfo, classInfo: ClassInfo) : this(
        fieldInfo.typeDescriptor,
        (fieldInfo.typeSignature as? ClassRefTypeSignature)?.typeArguments ?: listOf(),
        !fieldInfo.hasAnnotation(NotNull::class.java, classInfo),
        fieldInfo.hasAnnotation("kotlin.Lateinit", classInfo),
    )

    constructor(parameterInfo: MethodParameterInfo) : this(
        parameterInfo.typeDescriptor,
        (parameterInfo.typeSignature as? ClassRefTypeSignature)?.typeArguments ?: listOf(),
        !parameterInfo.hasAnnotation(NotNull::class.java),
        false,
    )

    constructor(methodInfo: MethodInfo) : this(
        methodInfo.typeDescriptor.resultType,
        (methodInfo.typeSignature?.resultType as? ClassRefTypeSignature)?.typeArguments ?: listOf(),
        !methodInfo.hasAnnotation(NotNull::class.java),
        false,
    )

    constructor(typeArgument: TypeArgument) : this(
        typeArgument.typeSignature,
        (typeArgument.typeSignature as? ClassRefTypeSignature)?.typeArguments ?: listOf(),
        typeArgument.typeAnnotationInfo?.containsName(NotNull::class.java.name) ?: true,
        false,
    )

    val isGodotPrimitive: Boolean = rawDescriptor.isGodotPrimitive

    // Primitives have no ClassInfo to inspect, so their model Type is built directly with kind = PRIMITIVE.
    private val primitiveType = when {
        isGodotPrimitive -> Type(
            fqName = requireNotNull(jvmPrimitivesToKotlinPrimitives[rawDescriptor]),
            kind = TypeKind.PRIMITIVE,
            isNullable = false,
        )

        else -> null
    }

    val isPrimitive = primitiveType != null
    val isVoid = rawDescriptor == VOID
    val isObject = rawDescriptor == JVM_OBJECT

    val typeClassInfo: ClassInfo
        get() = requireNotNull(Context.getClassInfoOrNull(rawDescriptor)) {
            "Could not resolve class info for descriptor: $rawDescriptor"
        }

    fun getMappedType(settings: ProcessorSettings): Type = primitiveType ?: if (isObject) {
        getJavaLangObjectType()
    } else {
        typeClassInfo.mapToType(typeArguments, settings)
    }

    /** Like [getMappedType] but carries the property's nullability on the returned [Type.isNullable]. */
    fun getMappedPropertyType(settings: ProcessorSettings): Type {
        val base = getMappedType(settings)
        val propertyNullable = !isGodotPrimitive && base.kind != TypeKind.CORE_TYPE && !isLateInit && nullable
        if (base.kind == TypeKind.CLASS || base.kind == TypeKind.INTERFACE) {
            return base
        }

        return Type(
            fqName = base.fqName,
            kind = base.kind,
            isNullable = propertyNullable,
            genericArguments = base.genericArguments,
        )
    }
}
