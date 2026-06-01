package godot.annotation.processor.classgraph.shape

import godot.annotation.processor.classgraph.ProcessorContext
import godot.annotation.processor.classgraph.extensions.DELEGATE_SUFFIX
import godot.annotation.processor.classgraph.extensions.sanitizedName
import godot.annotation.processor.classgraph.models.TypeDescriptor
import io.github.classgraph.AnnotationInfo
import io.github.classgraph.ClassInfo
import io.github.classgraph.FieldInfo
import io.github.classgraph.MethodInfo

interface JvmShapeResolver {
    fun supports(classInfo: ClassInfo): Boolean

    fun getterName(fieldInfo: FieldInfo, owner: ClassInfo): String
    fun setterName(fieldInfo: FieldInfo, owner: ClassInfo): String
    fun syntheticAnnotationMethodName(fieldInfo: FieldInfo, owner: ClassInfo): String? = null

    fun getter(fieldInfo: FieldInfo, owner: ClassInfo): MethodInfo =
        owner.getMethodInfo(getterName(fieldInfo, owner)).first { it.parameterInfo.isEmpty() }

    fun setter(fieldInfo: FieldInfo, owner: ClassInfo): MethodInfo =
        owner.getMethodInfo(setterName(fieldInfo, owner)).first {
            it.parameterInfo.size == 1 &&
                it.parameterInfo.first().typeDescriptor == fieldInfo.typeDescriptor
        }

    fun fieldAnnotations(fieldInfo: FieldInfo, owner: ClassInfo): Collection<AnnotationInfo> {
        val syntheticAnnotations = syntheticAnnotationMethodName(fieldInfo, owner)
            ?.let { methodName -> owner.getMethodInfo(methodName).firstOrNull()?.annotationInfo }
            ?: emptyList()

        return syntheticAnnotations
            .union(fieldInfo.annotationInfo)
            .distinct()
    }

    fun hasAnnotation(fieldInfo: FieldInfo, owner: ClassInfo, annotationName: String): Boolean =
        fieldInfo.hasAnnotation(annotationName) ||
            owner.methodInfo.any { method ->
                method.hasAnnotation(annotationName) &&
                    (method.name == syntheticAnnotationMethodName(fieldInfo, owner) || method.name == getterName(
                        fieldInfo,
                        owner
                    ))
            }

    fun propertyGetterFqName(fieldInfo: FieldInfo, owner: ClassInfo): String? = null
    fun propertySetterFqName(fieldInfo: FieldInfo, owner: ClassInfo): String? = null

    fun signalTypeDescriptor(fieldInfo: FieldInfo, owner: ClassInfo): TypeDescriptor =
        if (fieldInfo.name.endsWith(DELEGATE_SUFFIX)) {
            TypeDescriptor(getter(fieldInfo, owner))
        } else {
            TypeDescriptor(fieldInfo, owner, this)
        }

    fun isFunctionReferenceSignal(fieldInfo: FieldInfo, owner: ClassInfo): Boolean = false

    fun isLateinit(fieldInfo: FieldInfo, owner: ClassInfo): Boolean =
        hasAnnotation(fieldInfo, owner, "kotlin.Lateinit")

    fun isFieldOverride(fieldInfo: FieldInfo, owner: ClassInfo, context: ProcessorContext): Boolean =
        owner.methodInfo
            .filter { method ->
                method.name == getterName(fieldInfo, owner) || method.name == setterName(
                    fieldInfo,
                    owner
                )
            }
            .any { method -> isMethodOverride(method, owner, context) }

    fun isMethodOverride(methodInfo: MethodInfo, owner: ClassInfo, context: ProcessorContext): Boolean =
        collectSuperMethodSignatures(owner, context).contains(methodInfo.methodSignature)

    private fun collectSuperMethodSignatures(owner: ClassInfo, context: ProcessorContext): Set<String> {
        val signatures = mutableSetOf<String>()
        for (superclass in owner.superclasses) {
            signatures += collectHierarchyMethodSignatures(superclass, context)
        }
        return signatures
    }

    private fun collectHierarchyMethodSignatures(owner: ClassInfo, context: ProcessorContext): Set<String> {
        return context.hierarchyMethodSignaturesByClass.getOrPut(owner.name) {
            val signatures = mutableSetOf<String>()
            for (method in owner.methodInfo) {
                signatures += method.methodSignature
            }
            for (superclass in owner.superclasses) {
                signatures += collectHierarchyMethodSignatures(superclass, context)
            }
            signatures
        }
    }

    private val MethodInfo.methodSignature: String
        get() = "$name:$typeDescriptor"
}

internal fun FieldInfo.capitalizedName(): String = sanitizedName
    .replaceFirstChar { char -> if (char.isLowerCase()) char.titlecase() else char.toString() }

internal fun FieldInfo.isKotlinBooleanIsProperty(): Boolean {
    if (!name.startsWith("is") || name.length <= 2 || !name[2].isUpperCase()) {
        return false
    }

    return typeDescriptor.toString() in setOf("boolean", "java.lang.Boolean", "kotlin.Boolean")
}
