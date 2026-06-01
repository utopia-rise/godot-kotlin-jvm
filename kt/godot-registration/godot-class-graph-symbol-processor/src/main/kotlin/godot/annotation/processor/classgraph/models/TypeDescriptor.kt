package godot.annotation.processor.classgraph.models

import godot.annotation.processor.classgraph.ProcessorContext
import godot.annotation.processor.classgraph.constants.JVM_OBJECT
import godot.annotation.processor.classgraph.constants.VOID
import godot.annotation.processor.classgraph.constants.isGodotPrimitive
import godot.annotation.processor.classgraph.constants.jvmPrimitivesToKotlinPrimitives
import godot.annotation.processor.classgraph.extensions.toStringWithoutAnnotations
import godot.annotation.processor.classgraph.shape.JvmShapeResolver
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
    val rawDescriptor: String = descriptor.toStringWithoutAnnotations()

    constructor(fieldInfo: FieldInfo, classInfo: ClassInfo, shapeResolver: JvmShapeResolver) : this(
        fieldInfo.typeDescriptor,
        (fieldInfo.typeSignature as? ClassRefTypeSignature)?.typeArguments ?: listOf(),
        !shapeResolver.hasAnnotation(fieldInfo, classInfo, NotNull::class.java.name),
        shapeResolver.isLateinit(fieldInfo, classInfo),
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

    val primitiveType: Type? = when {
        isGodotPrimitive -> Type(
            fqName = requireNotNull(jvmPrimitivesToKotlinPrimitives[rawDescriptor]),
            kind = TypeKind.PRIMITIVE,
            isNullable = false,
        )

        else -> null
    }

    val isPrimitive: Boolean = primitiveType != null
    val isVoid: Boolean = rawDescriptor == VOID
    val isObject: Boolean = rawDescriptor == JVM_OBJECT

    fun typeClassInfo(context: ProcessorContext): ClassInfo =
        requireNotNull(context.getClassInfoOrNull(rawDescriptor)) {
            "Could not resolve class info for descriptor: $rawDescriptor"
        }
}
