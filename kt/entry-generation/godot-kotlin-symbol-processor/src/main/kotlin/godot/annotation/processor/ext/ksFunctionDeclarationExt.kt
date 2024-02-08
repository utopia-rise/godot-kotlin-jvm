package godot.annotation.processor.ext

import com.google.devtools.ksp.symbol.KSClassDeclaration
import com.google.devtools.ksp.symbol.KSFunctionDeclaration
import com.google.devtools.ksp.symbol.Modifier
import godot.annotation.RegisterFunction
import godot.entrygenerator.model.ConstructorAnnotation
import godot.entrygenerator.model.FunctionAnnotation
import godot.entrygenerator.model.RegisteredConstructor
import godot.entrygenerator.model.RegisteredFunction
import java.io.File

internal fun KSFunctionDeclaration.mapToRegisteredConstructor(
    isFqNameRegistrationEnabled: Boolean,
    classNamePrefix: String?,
    projectBaseDir: File,
    ): RegisteredConstructor {
    return RegisteredConstructor(
        fqName = requireNotNull(qualifiedName?.asString() ?: parentDeclaration?.qualifiedName?.asString()) {
            "Qualified name for a registered constructor declaration cannot be null"
        },
        parameters = parameters.map { ksValueParameter ->
            ksValueParameter.mapToValueParameter(isFqNameRegistrationEnabled, classNamePrefix, projectBaseDir)
        },
        annotations = annotations
            .mapNotNull { it.mapToAnnotation(this) as? ConstructorAnnotation }
            .toList(),
        symbolProcessorSource = this
    )
}


internal fun KSFunctionDeclaration.mapToRegisteredFunction(
    currentClass: KSClassDeclaration,
    isFqNameRegistrationEnabled: Boolean,
    classNamePrefix: String?,
    projectBaseDir: File,
    ): RegisteredFunction? {
    return if (annotations.any { it.fqNameUnsafe == RegisterFunction::class.qualifiedName }) {
        val fqName = requireNotNull(qualifiedName?.asString()) {
            "Qualified name for a registered function declaration cannot be null"
        }
        val parameters = parameters.map { it.mapToValueParameter(isFqNameRegistrationEnabled, classNamePrefix, projectBaseDir) }
        val annotations = annotations.mapNotNull { it.mapToAnnotation(this) as? FunctionAnnotation }
        RegisteredFunction(
            fqName = fqName,
            isOverridee = this.modifiers.contains(Modifier.OVERRIDE),
            isDeclaredInThisClass = parentDeclaration == currentClass,
            parameters = parameters,
            returnType = returnType?.mapToType(isFqNameRegistrationEnabled, classNamePrefix, projectBaseDir),
            annotations = annotations.toList(),
            symbolProcessorSource = this
        )
    } else null
}
