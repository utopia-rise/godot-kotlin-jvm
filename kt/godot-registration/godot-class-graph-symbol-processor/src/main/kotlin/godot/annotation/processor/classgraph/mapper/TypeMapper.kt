package godot.annotation.processor.classgraph.mapper

import godot.annotation.GodotBaseType
import godot.annotation.processor.classgraph.ProcessorContext
import godot.annotation.processor.classgraph.TypeCacheKey
import godot.annotation.processor.classgraph.constants.KOTLIN_ANY
import godot.annotation.processor.classgraph.models.TypeDescriptor
import godot.registration.model.types.*
import io.github.classgraph.ClassInfo
import io.github.classgraph.TypeArgument

private const val CORE_TYPE_FQ_NAME = "godot.core.CoreType"

class TypeMapper(
    private val context: ProcessorContext,
    private val classMapperProvider: () -> ClassMapper,
) {
    fun map(descriptor: TypeDescriptor): Type = descriptor.primitiveType ?: if (descriptor.isObject) {
        getJavaLangObjectType()
    } else {
        mapClassInfo(descriptor.typeClassInfo(context), descriptor.typeArguments)
    }

    fun mapProperty(descriptor: TypeDescriptor): Type {
        val base = map(descriptor)
        val propertyNullable = !descriptor.isGodotPrimitive &&
            base.kind != TypeKind.CORE_TYPE &&
            !descriptor.isLateInit &&
            descriptor.nullable

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

    fun map(typeArgument: TypeArgument): Type = map(TypeDescriptor(typeArgument))

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

        val type = when (classInfo.modelTypeKind) {
            TypeKind.CLASS -> mapReferencedGodotClass(classInfo)
            TypeKind.INTERFACE -> mapReferencedScriptInterface(classInfo)
            else -> Type(
                fqName = classInfo.name.replace("$", "."),
                kind = classInfo.modelTypeKind,
                isNullable = false,
                genericArguments = mappedTypeArguments,
            )
        }

        context.mappedTypeByKey[cacheKey] = type
        return type
    }

    fun mapReferencedGodotClass(classInfo: ClassInfo): Type =
        if (classInfo.hasAnnotation(GodotBaseType::class.java)) {
            classMapperProvider().mapGodotBaseClass(classInfo)
        } else {
            ReferencedGodotClass(
                fqName = classInfo.name.replace("$", "."),
                parent = classInfo.superclass?.let { superclass -> mapReferencedGodotClass(superclass) as GodotClass },
                interfaces = classMapperProvider().directSuperInterfaces(classInfo)
                    .map { iface -> mapReferencedScriptInterface(iface) as ScriptFamily },
            )
        }

    fun mapReferencedScriptInterface(classInfo: ClassInfo): Type =
        ReferencedScriptInterface(
            fqName = classInfo.name.replace("$", "."),
            interfaces = classMapperProvider().directSuperInterfaces(classInfo)
                .map { iface -> mapReferencedScriptInterface(iface) as ScriptFamily },
        )

    private fun getJavaLangObjectType() = Type(
        fqName = KOTLIN_ANY,
        kind = TypeKind.CLASS,
        isNullable = false,
    )
}

val ClassInfo.modelTypeKind: TypeKind
    get() = when {
        isCoreType -> TypeKind.CORE_TYPE
        isEnum -> TypeKind.ENUM
        isInterface -> TypeKind.INTERFACE
        isStandardClass -> TypeKind.CLASS
        else -> TypeKind.OTHER
    }

private val ClassInfo.isCoreType: Boolean
    get() = name == CORE_TYPE_FQ_NAME ||
        superclasses.any { superclass -> superclass.name == CORE_TYPE_FQ_NAME } ||
        interfaces.any { iface -> iface.name == CORE_TYPE_FQ_NAME }
