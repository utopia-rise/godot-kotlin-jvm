package godot.annotation.processor.classgraph.mapper

import godot.annotation.Export
import godot.annotation.RegisterSignal
import godot.annotation.Rpc
import godot.annotation.processor.classgraph.ProcessorContext
import godot.annotation.processor.classgraph.extensions.fqName
import godot.annotation.processor.classgraph.extensions.toStringWithoutAnnotations
import godot.annotation.processor.classgraph.shape.JvmShapeResolvers
import godot.registration.model.RegisteredConstructor
import godot.registration.model.RegisteredFunction
import godot.registration.model.RegisteredProperty
import godot.registration.model.RegisteredSignal
import godot.registration.model.ValueParameter
import godot.registration.model.hint.property.EnumFlagHintStringHint
import godot.registration.model.hint.property.EnumHint
import godot.registration.model.hint.property.EnumHintStringHint
import godot.registration.model.hint.property.EnumListHintStringHint
import godot.registration.model.hint.property.PropertyHint
import io.github.classgraph.AnnotationInfo
import io.github.classgraph.ClassRefTypeSignature
import io.github.classgraph.ClassInfo
import io.github.classgraph.FieldInfo
import io.github.classgraph.MethodInfo
import godot.registration.model.types.Type
import godot.registration.model.types.TypeKind

class MemberMapper(
    private val context: ProcessorContext,
    private val typeMapper: TypeMapper,
    private val annotationMapper: AnnotationMapper,
    private val shapeResolvers: JvmShapeResolvers,
) {
    fun mapConstructor(methodInfo: MethodInfo): RegisteredConstructor =
        RegisteredConstructor(
            parameterTypes = methodInfo.parameterInfo.map(typeMapper::map),
        )

    fun mapFunction(methodInfo: MethodInfo): RegisteredFunction {
        val parameters = methodInfo.parameterInfo.mapIndexed { index, parameter ->
            ValueParameter(
                parameter.name ?: "arg$index",
                typeMapper.map(parameter),
            )
        }
        val rpcConfig = methodInfo.annotationInfo
            .firstOrNull { annotation -> annotation.name == Rpc::class.java.name }
            ?.let(annotationMapper::toRpcConfig)

        return RegisteredFunction(
            fqName = methodInfo.fqName.replace("$", "."),
            parameters = parameters,
            returnType = typeMapper.mapReturnType(methodInfo),
            rpcConfig = rpcConfig,
        )
    }

    fun mapProperty(fieldInfo: FieldInfo, owner: ClassInfo): RegisteredProperty {
        val shapeResolver = shapeResolvers.forClass(owner)
        return RegisteredProperty(
            fqName = fieldInfo.fqName.replace("$", "."),
            type = typeMapper.mapProperty(fieldInfo, owner, shapeResolver),
            getterFqName = shapeResolver.propertyGetterFqName(fieldInfo, owner),
            setterFqName = shapeResolver.propertySetterFqName(fieldInfo, owner),
            isMutable = !fieldInfo.isFinal,
            isLateinit = shapeResolver.isLateinit(fieldInfo, owner),
            isOverridee = shapeResolver.isFieldOverride(fieldInfo, owner, context),
            isExported = shapeResolver.hasAnnotation(fieldInfo, owner, Export::class.java.name),
            hints = collectPropertyHints(
                fieldInfo,
                shapeResolver.fieldAnnotations(fieldInfo, owner)
            ),
        )
    }

    @Suppress("UNCHECKED_CAST")
    fun mapSignal(fieldInfo: FieldInfo, owner: ClassInfo): RegisteredSignal {
        val shapeResolver = shapeResolvers.forClass(owner)
        val type = typeMapper.mapSignalType(fieldInfo, owner, shapeResolver)

        val parameterValues = shapeResolver.fieldAnnotations(fieldInfo, owner)
            .first { annotation -> annotation.classInfo.name == RegisterSignal::class.java.name }
            .parameterValues

        return RegisteredSignal(
            fqName = fieldInfo.fqName.replace("$", "."),
            type = type,
            parameterTypes = type.genericArguments,
            parameterNames = (parameterValues.getValue("parameters") as Array<String>).toList(),
            isFunctionReference = shapeResolver.isFunctionReferenceSignal(fieldInfo, owner),
            isOverridee = shapeResolver.isFieldOverride(fieldInfo, owner, context),
        )
    }

    private fun collectPropertyHints(
        fieldInfo: FieldInfo,
        annotations: Collection<AnnotationInfo>,
    ): List<PropertyHint> {
        val hints = annotations
            .mapNotNull { annotation -> annotationMapper.toPropertyHint(annotation) }
            .toMutableList()

        val fieldType = fieldInfo.typeDescriptor?.toString() ?: throw IllegalStateException("Type cannot be null")
        val rawDescriptor = fieldInfo.typeDescriptor.toStringWithoutAnnotations()
        val isPrimitive = Type.getCoreType(rawDescriptor).kind == TypeKind.PRIMITIVE

        if (!isPrimitive && hints.none { hint -> hint is EnumHint }) {
            val typeClassInfo = requireNotNull(context.getClassInfoOrNull(rawDescriptor)) {
                "Could not resolve class info for descriptor: $rawDescriptor"
            }
            val containedEnum = {
                (fieldInfo.typeSignature as? ClassRefTypeSignature)
                    ?.typeArguments
                    ?.firstOrNull()
                    ?.let(typeMapper::typeArgumentClassInfo)
                    ?.takeIf { contained -> contained.isEnum }
            }

            when {
                // Single enum -> dropdown.
                typeClassInfo.isEnum -> hints.add(EnumHintStringHint(typeClassInfo.toEnumValues()))

                // BitField<E> -> bitmask, hint read from the backing enum E.
                typeClassInfo.isBitField -> containedEnum()
                    ?.let { enum -> hints.add(EnumFlagHintStringHint(enum.toEnumValues())) }

                // Any Collection<Enum> -> list of dropdowns.
                fieldType.startsWith("kotlin.collections") || fieldType.isJavaCollectionDescriptor() ->
                    containedEnum()?.let { enum -> hints.add(EnumListHintStringHint(enum.toEnumValues())) }
            }
        }

        return hints.toList()
    }

    private fun String.isJavaCollectionDescriptor(): Boolean = startsWith("java.util.")
}
