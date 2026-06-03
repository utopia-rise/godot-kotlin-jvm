package godot.annotation.processor.classgraph.mapper

import godot.annotation.Export
import godot.annotation.RegisterSignal
import godot.annotation.Rpc
import godot.annotation.processor.classgraph.ProcessorContext
import godot.annotation.processor.classgraph.extensions.fqName
import godot.annotation.processor.classgraph.models.TypeDescriptor
import godot.annotation.processor.classgraph.shape.JvmShapeResolvers
import godot.registration.model.*
import godot.registration.model.hint.property.EnumFlagHintStringHint
import godot.registration.model.hint.property.EnumHint
import godot.registration.model.hint.property.EnumHintStringHint
import godot.registration.model.hint.property.EnumListHintStringHint
import godot.registration.model.hint.property.PropertyHint
import io.github.classgraph.AnnotationInfo
import io.github.classgraph.ClassInfo
import io.github.classgraph.FieldInfo
import io.github.classgraph.MethodInfo

class MemberMapper(
    private val context: ProcessorContext,
    private val typeMapper: TypeMapper,
    private val annotationMapper: AnnotationMapper,
    private val shapeResolvers: JvmShapeResolvers,
) {
    fun mapConstructor(methodInfo: MethodInfo): RegisteredConstructor =
        RegisteredConstructor(
            parameterTypes = methodInfo.parameterInfo.map { parameter -> typeMapper.map(TypeDescriptor(parameter)) },
        )

    fun mapFunction(methodInfo: MethodInfo): RegisteredFunction {
        val owner = methodInfo.classInfo
        val shapeResolver = shapeResolvers.forClass(owner)
        val parameters = methodInfo.parameterInfo.mapIndexed { index, parameter ->
            ValueParameter(
                parameter.name ?: "arg$index",
                typeMapper.map(TypeDescriptor(parameter)),
            )
        }
        val rpcConfig = methodInfo.annotationInfo
            .firstOrNull { annotation -> annotation.name == Rpc::class.java.name }
            ?.let(annotationMapper::toRpcConfig)

        val typeDescriptor = TypeDescriptor(methodInfo)
        return RegisteredFunction(
            fqName = methodInfo.fqName.replace("$", "."),
            parameters = parameters,
            returnType = if (typeDescriptor.isVoid) null else typeMapper.map(typeDescriptor),
            rpcConfig = rpcConfig,
        )
    }

    fun mapProperty(fieldInfo: FieldInfo, owner: ClassInfo): RegisteredProperty {
        val shapeResolver = shapeResolvers.forClass(owner)
        val typeDescriptor = TypeDescriptor(fieldInfo, owner, shapeResolver)
        return RegisteredProperty(
            fqName = fieldInfo.fqName.replace("$", "."),
            type = typeMapper.mapProperty(typeDescriptor),
            getterFqName = shapeResolver.propertyGetterFqName(fieldInfo, owner),
            setterFqName = shapeResolver.propertySetterFqName(fieldInfo, owner),
            isMutable = !fieldInfo.isFinal,
            isLateinit = typeDescriptor.isLateInit,
            isOverridee = shapeResolver.isFieldOverride(fieldInfo, owner, context),
            isExported = shapeResolver.hasAnnotation(fieldInfo, owner, Export::class.java.name),
            hints = collectPropertyHints(
                fieldInfo,
                owner,
                typeDescriptor,
                shapeResolver.fieldAnnotations(fieldInfo, owner)
            ),
        )
    }

    @Suppress("UNCHECKED_CAST")
    fun mapSignal(fieldInfo: FieldInfo, owner: ClassInfo): RegisteredSignal {
        val shapeResolver = shapeResolvers.forClass(owner)
        val typeDescriptor = shapeResolver.signalTypeDescriptor(fieldInfo, owner)
        val type = typeMapper.map(typeDescriptor)

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
        owner: ClassInfo,
        typeDescriptor: TypeDescriptor,
        annotations: Collection<AnnotationInfo>,
    ): List<PropertyHint> {
        val hints = annotations
            .mapNotNull { annotation -> annotationMapper.toPropertyHint(annotation) }
            .toMutableList()

        val fieldType = fieldInfo.typeDescriptor?.toString() ?: throw IllegalStateException("Type cannot be null")

        if (!typeDescriptor.isPrimitive && hints.none { hint -> hint is EnumHint }) {
            val typeClassInfo = typeDescriptor.typeClassInfo(context)
            val containedEnum = {
                typeDescriptor.typeArguments.firstOrNull()
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
