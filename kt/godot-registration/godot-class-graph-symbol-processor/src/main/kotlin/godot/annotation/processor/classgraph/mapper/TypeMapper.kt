package godot.annotation.processor.classgraph.mapper

import godot.annotation.GodotBaseType
import godot.annotation.processor.classgraph.ProcessorContext
import godot.annotation.processor.classgraph.TypeCacheKey
import godot.annotation.processor.classgraph.constants.BIT_FIELD
import godot.annotation.processor.classgraph.constants.BIT_FIELD_BASE
import godot.annotation.processor.classgraph.extensions.toStringWithoutAnnotations
import godot.annotation.processor.classgraph.shape.JvmShapeResolver
import godot.registration.model.types.*
import io.github.classgraph.*
import org.jetbrains.annotations.NotNull

private const val CORE_TYPE_FQ_NAME = "godot.core.CoreType"

class TypeMapper(
    private val context: ProcessorContext,
    private val classMapperProvider: () -> ClassMapper,
) {
    fun map(parameterInfo: MethodParameterInfo): Type = mapRaw(
        rawDescriptor = parameterInfo.typeDescriptor.toStringWithoutAnnotations(),
        typeArguments = (parameterInfo.typeSignature as? ClassRefTypeSignature)?.typeArguments ?: listOf(),
    )

    fun mapFieldType(fieldInfo: FieldInfo): Type = mapRaw(
        rawDescriptor = fieldInfo.typeDescriptor.toStringWithoutAnnotations(),
        typeArguments = (fieldInfo.typeSignature as? ClassRefTypeSignature)?.typeArguments ?: listOf(),
    )

    fun mapReturnType(methodInfo: MethodInfo): Type {
        val rawDescriptor = methodInfo.typeDescriptor.resultType.toStringWithoutAnnotations()
        return mapRaw(
            rawDescriptor = rawDescriptor,
            typeArguments = (methodInfo.typeSignature?.resultType as? ClassRefTypeSignature)?.typeArguments ?: listOf(),
        )
    }

    fun mapProperty(fieldInfo: FieldInfo, owner: ClassInfo, shapeResolver: JvmShapeResolver): Type {
        val rawDescriptor = fieldInfo.typeDescriptor.toStringWithoutAnnotations()
        val base = mapRaw(
            rawDescriptor = rawDescriptor,
            typeArguments = (fieldInfo.typeSignature as? ClassRefTypeSignature)?.typeArguments ?: listOf(),
        )
        val isLateInit = shapeResolver.isLateinit(fieldInfo, owner)
        val isGodotPrimitive = Type.getCoreType(rawDescriptor)?.kind == TypeKind.PRIMITIVE
        val nullable = !shapeResolver.hasAnnotation(fieldInfo, owner, NotNull::class.java.name)
        val propertyNullable = !isGodotPrimitive &&
            base.kind != TypeKind.CORE_TYPE &&
            !isLateInit &&
            nullable

        if (base.kind == TypeKind.CLASS || base.kind == TypeKind.INTERFACE) {
            return base
        }

        return base.with(
            isNullable = propertyNullable,
            genericArguments = base.genericArguments,
        )
    }

    fun mapSignalType(fieldInfo: FieldInfo, owner: ClassInfo, shapeResolver: JvmShapeResolver): Type =
        if (fieldInfo.name.endsWith(godot.annotation.processor.classgraph.extensions.DELEGATE_SUFFIX)) {
            mapReturnType(shapeResolver.getter(fieldInfo, owner))
        } else {
            mapFieldType(fieldInfo)
        }

    fun map(typeArgument: TypeArgument): Type = mapRaw(
        rawDescriptor = typeArgument.typeSignature.toStringWithoutAnnotations(),
        typeArguments = (typeArgument.typeSignature as? ClassRefTypeSignature)?.typeArguments ?: listOf(),
    )

    private fun mapRaw(rawDescriptor: String, typeArguments: List<TypeArgument>): Type {
        val mappedTypeArguments = typeArguments.map(::map)
        return Type.getCoreType(rawDescriptor, genericArguments = mappedTypeArguments) ?: if (rawDescriptor == TYPE_JAVA_OBJECT) {
            getJavaLangObjectType()
        } else {
            mapClassInfo(
                requireNotNull(context.getClassInfoOrNull(rawDescriptor)) {
                    "Could not resolve class info for descriptor: $rawDescriptor"
                },
                typeArguments
            )
        }
    }

    fun typeArgumentClassInfo(typeArgument: TypeArgument): ClassInfo =
        requireNotNull(context.getClassInfoOrNull(typeArgument.typeSignature.toString())) {
            "Could not resolve class info for type signature: ${typeArgument.typeSignature}"
        }

    fun mapClassInfo(classInfo: ClassInfo, typeArguments: List<TypeArgument>): Type {
        val cacheKey = TypeCacheKey(
            fqName = classInfo.name,
            typeArgumentDescriptors = typeArguments.map { typeArgument -> typeArgument.toString() },
        )
        context.mappedTypeByKey[cacheKey]?.let { type -> return type }

        val mappedTypeArguments = typeArguments.map { typeArgument -> map(typeArgument) }

        val fqName = classInfo.name.replace("$", ".")
        val type = when (classInfo.modelTypeKind) {
            TypeKind.CLASS -> mapReferencedClass(classInfo)
            TypeKind.INTERFACE -> classMapperProvider().mapScriptInterface(classInfo)
            TypeKind.CORE_TYPE -> requireNotNull(Type.getCoreType(fqName, genericArguments = mappedTypeArguments))
            TypeKind.ENUM -> Type.getEnum(fqName, genericArguments = mappedTypeArguments)
            TypeKind.BITFIELD -> Type.getBitField(fqName, genericArguments = mappedTypeArguments)
            TypeKind.OTHER -> Type(
                fqName = fqName,
                kind = TypeKind.OTHER,
                isNullable = false,
                genericArguments = mappedTypeArguments,
            )
            TypeKind.PRIMITIVE -> Type.getCoreType(fqName, genericArguments = mappedTypeArguments)
                ?: Type(
                    fqName = fqName,
                    kind = TypeKind.OTHER,
                    isNullable = false,
                    genericArguments = mappedTypeArguments,
                )
        }

        context.mappedTypeByKey[cacheKey] = type
        return type
    }

    fun mapReferencedClass(classInfo: ClassInfo): Type =
        if (classInfo.isGodotCompatibleClass) {
            classMapperProvider().mapGodotClass(classInfo) as Type
        } else {
            SourceClass(fqName = classInfo.name.replace("$", "."))
        }

    private fun getJavaLangObjectType() = Type(
        fqName = TYPE_KOTLIN_ANY,
        kind = TypeKind.CLASS,
        isNullable = false,
    )
}

val ClassInfo.modelTypeKind: TypeKind
    get() = when {
        isCoreType -> TypeKind.CORE_TYPE
        isEnum -> TypeKind.ENUM
        isBitField -> TypeKind.BITFIELD
        isInterface -> TypeKind.INTERFACE
        isStandardClass -> TypeKind.CLASS
        else -> TypeKind.OTHER
    }

private val ClassInfo.isCoreType: Boolean
    get() = name == CORE_TYPE_FQ_NAME ||
        superclasses.any { superclass -> superclass.name == CORE_TYPE_FQ_NAME } ||
        interfaces.any { iface -> iface.name == CORE_TYPE_FQ_NAME }

internal val ClassInfo.isBitField: Boolean
    get() = name == BIT_FIELD ||
        superclasses.any { superclass -> superclass.name == BIT_FIELD } ||
        name == BIT_FIELD_BASE ||
        superclasses.any { superclass -> superclass.name == BIT_FIELD_BASE }

private val ClassInfo.isGodotCompatibleClass: Boolean
    get() = hasAnnotation(GodotBaseType::class.java) ||
        superclasses.any { superclass -> superclass.hasAnnotation(GodotBaseType::class.java) }
