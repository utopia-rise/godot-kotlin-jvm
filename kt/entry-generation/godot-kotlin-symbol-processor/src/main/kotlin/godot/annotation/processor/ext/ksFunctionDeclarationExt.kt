package godot.annotation.processor.ext

import com.google.devtools.ksp.symbol.KSFunctionDeclaration
import godot.annotation.RegisterFunction
import godot.entrygenerator.model.ConstructorAnnotation
import godot.entrygenerator.model.FunctionAnnotation
import godot.entrygenerator.model.RegisteredConstructor
import godot.entrygenerator.model.RegisteredFunction

fun KSFunctionDeclaration.mapToRegisteredConstructor(): RegisteredConstructor {
    return RegisteredConstructor(
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


fun KSFunctionDeclaration.mapToRegisteredFunction(): RegisteredFunction? {
    return if (annotations.any { it.fqNameUnsafe == RegisterFunction::class.qualifiedName }) {
        val fqName = requireNotNull(qualifiedName?.asString()) {
            "Qualified name for a registered function declaration cannot be null"
        }
        val parameters = parameters.map { it.mapToValueParameter() }
        val annotations = annotations.mapNotNull { it.mapToAnnotation(this) as? FunctionAnnotation }
        RegisteredFunction(
            fqName,
            parameters,
            returnType?.mapToType(),
            annotations.toList()
        )
    } else null
}
