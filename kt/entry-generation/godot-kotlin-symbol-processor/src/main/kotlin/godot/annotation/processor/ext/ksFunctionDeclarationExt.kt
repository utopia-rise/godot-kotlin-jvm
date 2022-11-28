package godot.annotation.processor.ext

import com.google.devtools.ksp.symbol.KSFunctionDeclaration
import godot.annotation.RegisterConstructor
import godot.annotation.RegisterFunction
import godot.entrygenerator.model.Constructor
import godot.entrygenerator.model.ConstructorAnnotation
import godot.entrygenerator.model.Function
import godot.entrygenerator.model.FunctionAnnotation
import godot.entrygenerator.model.RegisteredConstructor
import godot.entrygenerator.model.RegisteredFunction

fun KSFunctionDeclaration.mapToConstructor(
    isParentClassRegistered: Boolean
): Constructor {
    val isRegistered = annotations.any { it.fqNameUnsafe == RegisterConstructor::class.qualifiedName } ||
        (isParentClassRegistered && parameters.isEmpty())

    return if (isRegistered) {
        RegisteredConstructor(
            requireNotNull(qualifiedName?.asString() ?: parentDeclaration?.qualifiedName?.asString()) {
                "Qualified name for a registered constructor declaration cannot be null"
            },
            parameters.map { ksValueParameter ->
                ksValueParameter.mapToValueParameter()
            },
            annotations
                .mapNotNull { it.mapToAnnotation(this) as? ConstructorAnnotation }
                .toList()
        )
    } else {
        Constructor(
            requireNotNull(qualifiedName?.asString() ?: parentDeclaration?.qualifiedName?.asString()) {
                "Qualified name for a registered constructor declaration cannot be null"
            },
            parameters.map { ksValueParameter ->
                ksValueParameter.mapToValueParameter()
            },
            annotations
                .mapNotNull { it.mapToAnnotation(this) as? ConstructorAnnotation }
                .toList()
        )
    }
}


fun KSFunctionDeclaration.mapToFunction(): Function? {
    val fqName = qualifiedName?.asString() ?: return null
    val parameters = parameters.map { it.mapToValueParameter() }
    val mappedAnnotations = annotations.mapNotNull { it.mapToAnnotation(this) as? FunctionAnnotation }
    val isOverridee = findOverridee() != null

    return if (annotations.any { it.fqNameUnsafe == RegisterFunction::class.qualifiedName }) {
        RegisteredFunction(
            fqName = fqName,
            isOverridee = isOverridee,
            parameters = parameters,
            returnType = returnType?.mapToType(),
            annotations = mappedAnnotations.toList()
        )
    } else {
        Function(
            fqName = fqName,
            isOverridee = isOverridee,
            parameters = parameters,
            returnType = returnType?.mapToType(),
            annotations = mappedAnnotations.toList()
        )
    }
}
