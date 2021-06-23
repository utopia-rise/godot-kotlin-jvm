package godot.annotation.processor.ext

import com.google.devtools.ksp.symbol.KSPropertyDeclaration
import com.google.devtools.ksp.symbol.Modifier
import godot.annotation.processor.compiler.PsiProvider
import godot.entrygenerator.model.PropertyAnnotation
import godot.entrygenerator.model.RegisteredProperty
import godot.entrygenerator.model.RegisteredSignal

fun KSPropertyDeclaration.mapToRegisteredProperty(declaredProperties: List<KSPropertyDeclaration>): RegisteredProperty {
    val fqName = requireNotNull(qualifiedName?.asString()) {
        "Qualified name for a registered property declaration cannot be null"
    }
    val annotations = annotations
        .mapNotNull { it.mapToAnnotation() as? PropertyAnnotation }
        .toMutableList()
        .also { declaredAnnotations ->
            declaredAnnotations.addAll(
                findOverridee()
                    ?.annotations
                    ?.mapNotNull { it.mapToAnnotation() as? PropertyAnnotation }
                    ?: emptySequence()
            )
        }

    val mappedType = requireNotNull(type.mapToType()) {
        "type of property $fqName cannot be null"
    }

    val isInheritedButNotOverridden = !declaredProperties.map { it.qualifiedName?.asString() }.contains(fqName)
    val defaultValueProviderFqName = if (isInheritedButNotOverridden) {
        "${findOverridee()?.qualifiedName?.asString()}"
    } else fqName

    return RegisteredProperty(
        fqName,
        mappedType,
        isMutable,
        modifiers.contains(Modifier.LATEINIT),
        findOverridee() != null,
        annotations.toList()
    ) {
        PsiProvider.providePropertyInitializer(defaultValueProviderFqName)
    }
}

fun KSPropertyDeclaration.mapToRegisteredSignal(declaredProperties: List<KSPropertyDeclaration>): RegisteredSignal {
    val fqName = requireNotNull(qualifiedName?.asString()) {
        "Qualified name for a registered property declaration cannot be null"
    }
    val annotations = annotations
        .mapNotNull { it.mapToAnnotation() as? PropertyAnnotation }

    val mappedType = requireNotNull(type.mapToType()) {
        "type of property $fqName cannot be null"
    }

    val isInheritedButNotOverridden = !declaredProperties.map { it.qualifiedName?.asString() }.contains(fqName)

    val signalParameterNames = PsiProvider.provideSignalArgumentNames(
        if (isInheritedButNotOverridden) {
            "${findOverridee()?.qualifiedName?.asString()}"
        } else fqName
    )

    return RegisteredSignal(
        fqName,
        mappedType,
        type.resolve().arguments.mapIndexed { index, ksTypeArgument ->
            val argumentType = requireNotNull(requireNotNull(ksTypeArgument.type) {
                "typeArgument's type of type $mappedType cannot be null"
            }.mapToType()) {
                "Type of signal $fqName cannot be null"
            }

            val argumentName = signalParameterNames[index]

            argumentName to argumentType
        }.toMap(),
        findOverridee() != null,
        annotations.toList()
    )
}
