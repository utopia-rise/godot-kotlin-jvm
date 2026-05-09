package godot.annotation.processor.classgraph.models

import godot.annotation.processor.classgraph.Context
import godot.annotation.processor.classgraph.constants.JVM_OBJECT
import godot.annotation.processor.classgraph.constants.VOID
import godot.annotation.processor.classgraph.constants.isGodotPrimitive
import godot.annotation.processor.classgraph.constants.jvmPrimitivesToKotlinPrimitives
import godot.annotation.processor.classgraph.extensions.getJavaLangObjectType
import godot.annotation.processor.classgraph.extensions.hasAnnotation
import godot.annotation.processor.classgraph.extensions.mapToType
import godot.annotation.processor.classgraph.extensions.toStringWithoutAnnotations
import godot.entrygenerator.ext.isCoreType
import godot.entrygenerator.model.PropertyType
import godot.entrygenerator.settings.Settings
import godot.entrygenerator.model.Type
import godot.entrygenerator.model.TypeKind
import io.github.classgraph.ClassInfo
import io.github.classgraph.ClassRefTypeSignature
import io.github.classgraph.FieldInfo
import io.github.classgraph.MethodInfo
import io.github.classgraph.MethodParameterInfo
import io.github.classgraph.TypeArgument
import io.github.classgraph.TypeSignature
import org.jetbrains.annotations.NotNull

class TypeDescriptor private constructor(
    descriptor: TypeSignature,
    val typeArguments: List<TypeArgument>,
    private val nullable: Boolean,
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

    private val isGodotPrimitive: Boolean = rawDescriptor.isGodotPrimitive

    private val primitiveType = when {
        isGodotPrimitive -> {
            val fqName = requireNotNull(jvmPrimitivesToKotlinPrimitives[rawDescriptor])
            Type(
                fqName = fqName,
                kind = TypeKind.UNKNOWN,
                supertypes = listOf(),
                arguments = { listOf() },
                registeredName = { _ -> fqName }
            )
        }
        rawDescriptor == VOID -> null
        else -> null
    }

    val isPrimitive = primitiveType != null
    val isVoid = rawDescriptor == VOID
    val isObject = rawDescriptor == JVM_OBJECT

    val typeClassInfoOrNull: ClassInfo?
        get() = Context.getClassInfoOrNull(rawDescriptor)

    val typeClassInfo: ClassInfo
        get() = requireNotNull(typeClassInfoOrNull) {
            "Could not resolve class info for descriptor: $rawDescriptor"
        }

    fun getMappedType(settings: Settings): Type = primitiveType ?: if (isObject) {
        getJavaLangObjectType(settings)
    } else {
        typeClassInfo.mapToType(typeArguments, settings)
    }

    fun getMappedPropertyType(settings: Settings): PropertyType {
        val type = getMappedType(settings)
        return PropertyType(
            type,
            !isGodotPrimitive && !type.isCoreType() && !isLateInit && nullable
        )
    }
}
