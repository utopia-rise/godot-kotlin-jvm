package godot.annotation.processor.classgraph.models

import godot.annotation.processor.classgraph.Context
import godot.annotation.processor.classgraph.Settings
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
    private val descriptor: TypeSignature,
    val typeArguments: List<TypeArgument>,
    private val nullable: Boolean,
    val isLateInit: Boolean,
    private val descriptorType: DescriptorType
) {
    constructor(fieldInfo: FieldInfo, classInfo: ClassInfo) : this(
        fieldInfo.typeDescriptor,
        (fieldInfo.typeSignature as? ClassRefTypeSignature)?.typeArguments ?: listOf(),
        !fieldInfo.hasAnnotation(NotNull::class.java, classInfo),
        fieldInfo.hasAnnotation("kotlin.Lateinit", classInfo),
        FieldType(fieldInfo.name)
    )

    constructor(parameterInfo: MethodParameterInfo) : this(
        parameterInfo.typeDescriptor,
        (parameterInfo.typeSignature as? ClassRefTypeSignature)?.typeArguments ?: listOf(),
        !parameterInfo.hasAnnotation(NotNull::class.java),
        false,
        ParameterType(parameterInfo.name)
    )

    constructor(methodInfo: MethodInfo) : this(
        methodInfo.typeDescriptor.resultType,
        (methodInfo.typeSignature?.resultType as? ClassRefTypeSignature)?.typeArguments ?: listOf(),
        !methodInfo.hasAnnotation(NotNull::class.java),
        false,
        MethodType(methodInfo.name)
    )

    constructor(typeArgument: TypeArgument) : this(
        typeArgument.typeSignature,
        (typeArgument.typeSignature as? ClassRefTypeSignature)?.typeArguments ?: listOf(),
        typeArgument.typeAnnotationInfo?.containsName(NotNull::class.java.name) ?: true,
        false,
        TypeArgumentType(typeArgument.toString())
    )

    private val isGodotPrimitive: Boolean = descriptor.toStringWithoutAnnotations().isGodotPrimitive

    private val primitiveType = when {
        isGodotPrimitive -> {
            val fqName = requireNotNull(jvmPrimitivesToKotlinPrimitives[descriptor.toStringWithoutAnnotations()])
            Type(
                fqName = fqName,
                kind = TypeKind.UNKNOWN,
                supertypes = listOf(),
                arguments = { listOf() },
                registeredName = { fqName }
            )
        }
        descriptor.toStringWithoutAnnotations() == VOID -> null
        else -> null
    }

    val isPrimitive = primitiveType != null
    val isVoid = descriptor.toStringWithoutAnnotations() == VOID
    val isObject = descriptor.toStringWithoutAnnotations() == JVM_OBJECT

    val typeClassInfo: ClassInfo
        get() = Context.scanResult.getClassInfo(descriptor.toStringWithoutAnnotations())

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

    private sealed interface DescriptorType {
        val name: String
    }

    private class FieldType(override val name: String) : DescriptorType {
        override fun toString() = "Property: $name"
    }
    private class ParameterType(override val name: String) : DescriptorType {
        override fun toString() = "Parameter: $name"
    }
    private class MethodType(override val name: String): DescriptorType {
        override fun toString() = "Method: $name"
    }
    private class TypeArgumentType(override val name: String): DescriptorType {
        override fun toString() = "TypeArgument: $name"
    }
}
