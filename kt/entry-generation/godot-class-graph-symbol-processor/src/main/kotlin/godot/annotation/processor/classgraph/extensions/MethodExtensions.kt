package godot.annotation.processor.classgraph.extensions

import godot.annotation.processor.classgraph.Context
import godot.annotation.processor.classgraph.Settings
import godot.annotation.processor.classgraph.models.TypeDescriptor
import godot.entrygenerator.model.FunctionAnnotation
import godot.entrygenerator.model.RegisteredFunction
import io.github.classgraph.ClassInfo
import io.github.classgraph.MethodInfo

fun MethodInfo.mapMethodToRegisteredFunction(currentClass: ClassInfo, settings: Settings): RegisteredFunction {
    val parameters = parameterInfo.map { it.mapToValueParameter(settings) }
    val annotations = annotationInfo.mapNotNull { it.mapToGodotAnnotation(this, fqName) as? FunctionAnnotation }

    val typeDescriptor = TypeDescriptor(this)
    return RegisteredFunction(
        fqName = fqName.replace("$", "."),
        isOverridee = isOverridee,
        isDeclaredInThisClass = classInfo == currentClass,
        parameters = parameters,
        returnType = if (typeDescriptor.isVoid) null else typeDescriptor.getMappedType(settings),
        annotations = annotations.toList(),
        symbolProcessorSource = this
    )
}

val MethodInfo.isOverridee: Boolean
    get() = classInfo.collectSuperMethodSignatures().contains(methodSignature)

private val MethodInfo.methodSignature: String
    get() = "$name:$typeDescriptor"

private fun ClassInfo.collectSuperMethodSignatures(): Set<String> {
    val signatures = mutableSetOf<String>()
    for (superclass in superclasses) {
        signatures += superclass.collectHierarchyMethodSignatures()
    }
    return signatures
}

private fun ClassInfo.collectHierarchyMethodSignatures(): Set<String> {
    return Context.hierarchyMethodSignaturesByClass.getOrPut(name) {
        val signatures = mutableSetOf<String>()
        for (method in methodInfo) {
            signatures += "${method.name}:${method.typeDescriptor}"
        }
        for (superclass in superclasses) {
            signatures += superclass.collectHierarchyMethodSignatures()
        }
        signatures
    }
}
