package godot.annotation.processor.ext

import com.google.devtools.ksp.symbol.KSClassDeclaration
import com.google.devtools.ksp.symbol.KSFunctionDeclaration
import com.google.devtools.ksp.symbol.Modifier
import godot.annotation.processor.Settings
import godot.entrygenerator.model.ConstructorAnnotation
import godot.entrygenerator.model.FunctionAnnotation
import godot.entrygenerator.model.RegisteredConstructor
import godot.entrygenerator.model.RegisteredFunction

internal fun KSFunctionDeclaration.mapToRegisteredConstructor(
    settings: Settings,
): RegisteredConstructor {
    return RegisteredConstructor(
        fqName = requireNotNull(qualifiedName?.asString() ?: parentDeclaration?.qualifiedName?.asString()) {
            "Qualified name for a registered constructor declaration cannot be null"
        },
        parameters = parameters.map { ksValueParameter ->
            ksValueParameter.mapToValueParameter(settings)
        },
        annotations = annotations
            .mapNotNull { it.mapToAnnotation(this) as? ConstructorAnnotation }
            .toList(),
        symbolProcessorSource = this
    )
}


internal fun KSFunctionDeclaration.mapToRegisteredFunction(
    currentClass: KSClassDeclaration,
    settings: Settings,
): RegisteredFunction? {
    val fqName = qualifiedName?.asString() ?: return null
    val parameters = parameters.map { it.mapToValueParameter(settings) }
    val annotations = annotations.mapNotNull { it.mapToAnnotation(this) as? FunctionAnnotation }
    return RegisteredFunction(
        fqName = fqName,
        isOverridee = this.modifiers.contains(Modifier.OVERRIDE),
        isDeclaredInThisClass = parentDeclaration == currentClass,
        parameters = parameters,
        returnType = returnType?.mapToType(settings),
        annotations = annotations.toList(),
        symbolProcessorSource = this
    )
}
