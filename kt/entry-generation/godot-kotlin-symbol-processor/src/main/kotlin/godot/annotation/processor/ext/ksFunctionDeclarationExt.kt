package godot.annotation.processor.ext

import com.google.devtools.ksp.symbol.KSFunctionDeclaration
import godot.annotation.RegisterFunction
import godot.entrygenerator.model.ConstructorAnnotation
import godot.entrygenerator.model.FunctionAnnotation
import godot.entrygenerator.model.RegisteredConstructor
import godot.entrygenerator.model.RegisteredFunction

internal fun KSFunctionDeclaration.mapToRegisteredConstructor(): RegisteredConstructor {
    return RegisteredConstructor(
        fqName = requireNotNull(qualifiedName?.asString() ?: parentDeclaration?.qualifiedName?.asString()) {
            "Qualified name for a registered constructor declaration cannot be null"
        },
        parameters = parameters.map { ksValueParameter ->
            ksValueParameter.mapToValueParameter()
        },
        annotations = annotations
            .mapNotNull { it.mapToAnnotation(this) as? ConstructorAnnotation }
            .toList(),
        symbolProcessorSource = this
    )
}


internal fun KSFunctionDeclaration.mapToRegisteredFunction(): RegisteredFunction? {
    return if (annotations.any { it.fqNameUnsafe == RegisterFunction::class.qualifiedName }) {
        val fqName = requireNotNull(qualifiedName?.asString()) {
            "Qualified name for a registered function declaration cannot be null"
        }
        val parameters = parameters.map { it.mapToValueParameter() }
        val annotations = annotations.mapNotNull { it.mapToAnnotation(this) as? FunctionAnnotation }
        RegisteredFunction(
            fqName = fqName,
            parameters = parameters,
            returnType = returnType?.mapToType(),
            annotations = annotations.toList(),
            symbolProcessorSource = this
        )
    } else null
}
