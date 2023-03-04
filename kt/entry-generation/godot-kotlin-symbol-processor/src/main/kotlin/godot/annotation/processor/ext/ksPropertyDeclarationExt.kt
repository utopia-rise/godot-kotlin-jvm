package godot.annotation.processor.ext

import com.google.devtools.ksp.symbol.ClassKind
import com.google.devtools.ksp.symbol.KSClassDeclaration
import com.google.devtools.ksp.symbol.KSPropertyDeclaration
import com.google.devtools.ksp.symbol.Modifier
import godot.annotation.processor.compiler.PsiProvider
import godot.entrygenerator.ext.hasAnnotation
import godot.entrygenerator.model.EnumAnnotation
import godot.entrygenerator.model.EnumHintStringAnnotation
import godot.entrygenerator.model.EnumListHintStringAnnotation
import godot.entrygenerator.model.PropertyAnnotation
import godot.entrygenerator.model.RegisteredProperty
import godot.entrygenerator.model.RegisteredSignal

fun KSPropertyDeclaration.mapToRegisteredProperty(declaredProperties: List<KSPropertyDeclaration>): RegisteredProperty {
    val fqName = requireNotNull(qualifiedName?.asString()) {
        "Qualified name for a registered property declaration cannot be null"
    }
    val annotations = annotations
        .mapNotNull { it.mapToAnnotation(this) as? PropertyAnnotation }
        .toMutableList()
        .also { declaredAnnotations ->
            declaredAnnotations.addAll(
                findOverridee()
                    ?.let { overridee ->
                        overridee
                            .annotations
                            .mapNotNull { it.mapToAnnotation(overridee) as? PropertyAnnotation }
                    }
                    ?: emptySequence()
            )
        }

    val typeDeclaration = type.resolve().declaration
    if (
        !annotations.hasAnnotation<EnumAnnotation>() &&
        (typeDeclaration as? KSClassDeclaration)?.classKind == ClassKind.ENUM_CLASS
    ) {
        annotations.add(
            EnumHintStringAnnotation(
                typeDeclaration
                    .declarations
                    .filterIsInstance<KSClassDeclaration>()
                    .filter { it.classKind == ClassKind.ENUM_ENTRY }
                    .map { it.simpleName.asString() }
                    .toList()
            )
        )
    }
    if (
        !annotations.hasAnnotation<EnumAnnotation>() &&
        typeDeclaration.qualifiedName?.asString()?.startsWith("kotlin.collections") == true
    ) {
        val containingTypeDeclaration = (type.resolve().arguments.firstOrNull()?.type?.resolve()?.declaration as? KSClassDeclaration)
        if (containingTypeDeclaration?.classKind == ClassKind.ENUM_CLASS) {
            annotations.add(
                EnumListHintStringAnnotation( //here we already know it has to be a enumList as enumFlags are already covered in the annotation resolving
                    containingTypeDeclaration
                        .declarations
                        .filterIsInstance<KSClassDeclaration>()
                        .filter { it.classKind == ClassKind.ENUM_ENTRY }
                        .map { it.simpleName.asString() }
                        .toList()
                )
            )
        }
    }

    val mappedType = requireNotNull(type.mapToType()) {
        "type of property $fqName cannot be null"
    }

    return RegisteredProperty(
        fqName,
        mappedType,
        isMutable,
        modifiers.contains(Modifier.LATEINIT),
        findOverridee() != null,
        annotations.toList()
    )
}

fun KSPropertyDeclaration.mapToRegisteredSignal(declaredProperties: List<KSPropertyDeclaration>): RegisteredSignal {
    val fqName = requireNotNull(qualifiedName?.asString()) {
        "Qualified name for a registered property declaration cannot be null"
    }
    val annotations = annotations
        .mapNotNull { it.mapToAnnotation(this) as? PropertyAnnotation }

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
