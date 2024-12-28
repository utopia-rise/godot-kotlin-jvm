package godot.annotation.processor.classgraph.models

import godot.annotation.processor.classgraph.Settings
import godot.annotation.processor.classgraph.extensions.getJavaLangObjectType
import godot.annotation.processor.classgraph.extensions.mapToType
import godot.entrygenerator.model.Type
import godot.entrygenerator.model.TypeKind
import io.github.classgraph.ClassInfo
import io.github.classgraph.FieldInfo
import io.github.classgraph.MethodInfo
import io.github.classgraph.MethodParameterInfo
import io.github.classgraph.ScanResult
import io.github.classgraph.TypeSignature
import org.jetbrains.annotations.NotNull

class TypeDescriptor private constructor(
    private val value: TypeSignature,
    private val nullable: Boolean,
    private val descriptorType: DescriptorType
) {
    constructor(fieldInfo: FieldInfo) : this(
        fieldInfo.typeDescriptor,
        !fieldInfo.hasAnnotation(NotNull::class.java),
        FieldType(fieldInfo.name)
    )

    constructor(parameterInfo: MethodParameterInfo) : this(
        parameterInfo.typeDescriptor,
        !parameterInfo.hasAnnotation(NotNull::class.java),
        ParameterType(parameterInfo.name)
    )

    constructor(methodInfo: MethodInfo) : this(
        methodInfo.typeDescriptor.resultType,
        !methodInfo.hasAnnotation(NotNull::class.java),
        MethodType(methodInfo.name)
    )

    private val primitiveType = when(value.toString()) {
        "boolean", "int", "long", "float", "double", "byte", "short", "java.lang.String" -> {
            val fqName = value.toString()
            Type(
                fqName = fqName,
                kind = TypeKind.UNKNOWN,
                isNullable = nullable,
                supertypes = listOf(),
                arguments = { listOf() },
                registeredName = { fqName }
            )
        }
        "void" -> null
        else -> null
    }

    val isPrimitive = primitiveType != null
    val isVoid = value.toString() == "void"
    val isObject = value.toString() == "java.lang.Object"

    context(ScanResult)
    val typeClassInfo: ClassInfo
        get() = this@ScanResult.getClassInfo(value.toString())

    context(ScanResult)
    fun getMappedType(settings: Settings): Type = primitiveType ?: if (isObject) {
        getJavaLangObjectType(nullable, settings)
    } else {
        typeClassInfo.mapToType(settings, nullable)
    }

    context(ScanResult)
    val enumValues: List<String>
        get() {
            val classInfo = typeClassInfo
            require(classInfo.isEnum) {
                "Content type of enumFlag set has to be of class kind ENUM but was class kind ${classInfo.name}. $descriptorType"
            }
            return classInfo.fieldInfo
                .filter { it.isEnum }
                .map { it.name }
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
}
