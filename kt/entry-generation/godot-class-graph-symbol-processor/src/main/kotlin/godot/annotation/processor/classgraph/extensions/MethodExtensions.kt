package godot.annotation.processor.classgraph.extensions

import godot.annotation.GodotBaseType
import godot.annotation.Register
import godot.annotation.Rpc
import godot.annotation.processor.classgraph.Context
import godot.annotation.processor.classgraph.models.TypeDescriptor
import godot.entrygenerator.model.FunctionAnnotation
import godot.entrygenerator.model.RegisteredFunction
import godot.entrygenerator.settings.Settings
import io.github.classgraph.ClassInfo
import io.github.classgraph.MethodInfo

fun MethodInfo.mapMethodToRegisteredFunction(currentClass: ClassInfo, settings: Settings): RegisteredFunction {
    val parameters = parameterInfo.mapIndexed { index, parameter -> parameter.mapToValueParameter(settings, index) }
    val annotations = getAnnotations()
        .filter { it.name in methodAnnotationNames }
        .mapNotNull { it.mapToGodotAnnotation(this, fqName) as? FunctionAnnotation }

    val typeDescriptor = TypeDescriptor(this)
    return RegisteredFunction(
        fqName = fqName.replace("$", "."),
        isOverridee = isOverridee,
        isDeclaredInThisClass = classInfo == currentClass,
        parameters = parameters,
        returnType = if (typeDescriptor.isVoid) null else typeDescriptor.getMappedType(settings),
        annotations = annotations.toList(),
    )
}

private val methodAnnotationNames = setOf(
    Register::class.java.name,
    Rpc::class.java.name,
)

fun MethodInfo.hasAnnotation(annotationClass: Class<out Annotation>): Boolean =
    getAnnotations().any { it.name == annotationClass.name }

fun MethodInfo.getAnnotations() = annotationInfo
    .flatMap { annotation -> annotation.getAnnotationChain() }
    .distinctBy { annotation -> annotation.name }

val MethodInfo.isGodotBaseTypeOverridee: Boolean
    get() = classInfo.collectGodotBaseHierarchyMethodSignatures().contains(registrationSignature)

val MethodInfo.isOverridee: Boolean
    get() = classInfo.collectSuperMethodSignatures().contains(registrationSignature)

val MethodInfo.registrationSignature: String
    get() = "$name:$typeDescriptor"

private fun ClassInfo.collectSuperMethodSignatures(): Set<String> {
    return Context.hierarchyMethodSignaturesByClass.getOrPut(name) {
        superclasses
            .flatMap { superclass -> superclass.methodInfo.asSequence() }
            .map { method -> method.registrationSignature }
            .toSet()
    }
}

private fun ClassInfo.collectGodotBaseHierarchyMethodSignatures(): Set<String> {
    return Context.godotBaseHierarchyMethodSignaturesByClass.getOrPut(name) {
        superclasses
            .asSequence()
            .filter { superclass -> superclass.hasAnnotation(GodotBaseType::class.java) }
            .flatMap { superclass -> superclass.methodInfo.asSequence() }
            .map { method -> method.registrationSignature }
            .toSet()
    }
}
