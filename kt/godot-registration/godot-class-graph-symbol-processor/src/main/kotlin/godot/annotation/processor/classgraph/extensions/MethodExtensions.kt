package godot.annotation.processor.classgraph.extensions

import godot.annotation.Rpc
import godot.annotation.processor.classgraph.Context
import godot.annotation.processor.classgraph.ProcessorSettings
import godot.annotation.processor.classgraph.models.TypeDescriptor
import godot.registration.model.RegisteredFunction
import io.github.classgraph.ClassInfo
import io.github.classgraph.MethodInfo

fun MethodInfo.mapMethodToRegisteredFunction(settings: ProcessorSettings): RegisteredFunction {
    val parameters = parameterInfo.mapIndexed { index, parameter -> parameter.mapToValueParameter(settings, index) }
    val rpcConfig = annotationInfo
        .firstOrNull { it.name == Rpc::class.java.name }
        ?.toRpcConfig()

    val typeDescriptor = TypeDescriptor(this)
    return RegisteredFunction(
        fqName = fqName.replace("$", "."),
        parameters = parameters,
        returnType = if (typeDescriptor.isVoid) null else typeDescriptor.getMappedType(settings),
        rpcConfig = rpcConfig,
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
