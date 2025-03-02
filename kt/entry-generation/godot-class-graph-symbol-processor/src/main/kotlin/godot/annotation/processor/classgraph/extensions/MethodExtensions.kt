package godot.annotation.processor.classgraph.extensions

import godot.annotation.processor.classgraph.Settings
import godot.annotation.processor.classgraph.models.TypeDescriptor
import godot.entrygenerator.model.ConstructorAnnotation
import godot.entrygenerator.model.FunctionAnnotation
import godot.entrygenerator.model.RegisteredConstructor
import godot.entrygenerator.model.RegisteredFunction
import io.github.classgraph.ClassInfo
import io.github.classgraph.MethodInfo

fun MethodInfo.mapMethodToRegisteredFunction(currentClass: ClassInfo, settings: Settings): RegisteredFunction {
    val parameters = parameterInfo.map { it.mapToValueParameter(settings) }
    val annotations = annotationInfo.mapNotNull { it.mapToGodotAnnotation(this) as? FunctionAnnotation }

    val typeDescriptor = TypeDescriptor(this)
    return RegisteredFunction(
        fqName = fqdn.replace("$", "."),
        isOverridee = isOverridee,
        isDeclaredInThisClass = classInfo == currentClass,
        parameters = parameters,
        returnType = if (typeDescriptor.isVoid) null else typeDescriptor.getMappedType(settings),
        annotations = annotations.toList(),
        symbolProcessorSource = this
    )
}

val MethodInfo.isOverridee: Boolean
    get() {
        for (superclass in classInfo.superclasses) {
            if (isOverrideInHierarchyOf(superclass)) {
                return true
            }
        }

        return false
    }

private fun MethodInfo.isOverrideInHierarchyOf(classInfo: ClassInfo): Boolean {
    if (classInfo.methodInfo.any { name == it.name && typeDescriptor == it.typeDescriptor }) {
        return true
    }

    for (superclass in classInfo.superclasses) {
        if (isOverrideInHierarchyOf(superclass)) {
            return true
        }
    }

    return false
}

fun MethodInfo.mapToRegisteredConstructor(settings: Settings): RegisteredConstructor {
    val parameters = parameterInfo.map { it.mapToValueParameter(settings) }
    return RegisteredConstructor(
        fqName = fqdn,
        parameters = parameters,
        annotations = annotationInfo
            .mapNotNull { it.mapToGodotAnnotation(settings) as? ConstructorAnnotation },
        symbolProcessorSource = this
    )
}
