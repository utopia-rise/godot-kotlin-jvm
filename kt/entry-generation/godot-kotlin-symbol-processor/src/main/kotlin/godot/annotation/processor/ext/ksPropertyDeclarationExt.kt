package godot.annotation.processor.ext

import com.google.devtools.ksp.symbol.ClassKind
import com.google.devtools.ksp.symbol.KSClassDeclaration
import com.google.devtools.ksp.symbol.KSPropertyDeclaration
import com.google.devtools.ksp.symbol.Modifier
import godot.annotation.processor.Settings
import godot.annotation.processor.compiler.PsiProvider
import godot.entrygenerator.ext.hasAnnotation
import godot.entrygenerator.model.EnumAnnotation
import godot.entrygenerator.model.EnumHintStringAnnotation
import godot.entrygenerator.model.EnumListHintStringAnnotation
import godot.entrygenerator.model.PropertyAnnotation
import godot.entrygenerator.model.RegisteredProperty
import godot.entrygenerator.model.RegisteredSignal

internal fun KSPropertyDeclaration.mapToRegisteredProperty(
    settings: Settings,
): RegisteredProperty {
    val fqName = requireNotNull(qualifiedName?.asString()) {
        "Qualified name for a registered property declaration cannot be null"
    }
    val annotations = annotations
        .flatMap { it.mapToAnnotation(this) }
        .filterIsInstance<PropertyAnnotation>()
        .toMutableList()
        .also { declaredAnnotations ->
            declaredAnnotations.addAll(
                findOverridee()
                    ?.let { overridee ->
                        overridee
                            .annotations
                            .flatMap { it.mapToAnnotation(overridee) }
                            .filterIsInstance<PropertyAnnotation>()
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
                enumValueNames = typeDeclaration
                    .declarations
                    .filterIsInstance<KSClassDeclaration>()
                    .filter { it.classKind == ClassKind.ENUM_ENTRY }
                    .map { it.simpleName.asString() }
                    .toList(),
                source = this
            )
        )
    }
    if (
        !annotations.hasAnnotation<EnumAnnotation>() &&
        typeDeclaration.qualifiedName?.asString()?.startsWith("kotlin.collections") == true
    ) {
        val containingTypeDeclaration =
            (type.resolve().arguments.firstOrNull()?.type?.resolve()?.declaration as? KSClassDeclaration)
        if (containingTypeDeclaration?.classKind == ClassKind.ENUM_CLASS) {
            annotations.add(
                EnumListHintStringAnnotation( //here we already know it has to be a enumList as enumFlags are already covered in the annotation resolving
                    enumValueNames = containingTypeDeclaration
                        .declarations
                        .filterIsInstance<KSClassDeclaration>()
                        .filter { it.classKind == ClassKind.ENUM_ENTRY }
                        .map { it.simpleName.asString() }
                        .toList(),
                    source = this
                )
            )
        }
    }

    val mappedType = requireNotNull(type.mapToType(settings)) {
        "type of property $fqName cannot be null"
    }

    return RegisteredProperty(
        fqName = fqName,
        type = mappedType,
        isMutable = isMutable,
        isLateinit = modifiers.contains(Modifier.LATEINIT),
        isOverridee = findOverridee() != null,
        annotations = annotations.toList(),
        symbolProcessorSource = this
    )
}

internal fun KSPropertyDeclaration.mapToRegisteredSignal(
    declaredProperties: List<KSPropertyDeclaration>,
    settings: Settings,
): RegisteredSignal {
    val fqName = requireNotNull(qualifiedName?.asString()) {
        "Qualified name for a registered property declaration cannot be null"
    }
    val annotations = annotations
        .flatMap { it.mapToAnnotation(this) }
        .filterIsInstance<PropertyAnnotation>()

    val mappedType = requireNotNull(type.mapToType(settings)) {
        "type of property $fqName cannot be null"
    }

    val isInheritedButNotOverridden = !declaredProperties.map { it.qualifiedName?.asString() }.contains(fqName)

    val signalParameterNames = PsiProvider.provideSignalArgumentNames(
        this,
        if (isInheritedButNotOverridden) {
            "${findOverridee()?.qualifiedName?.asString()}"
        } else fqName
    )

    return RegisteredSignal(
        fqName = fqName,
        type = mappedType,
        parameterTypes = type.resolve().arguments.map { ksTypeArgument ->
            requireNotNull(requireNotNull(ksTypeArgument.type) {
                "typeArgument's type of type $mappedType cannot be null"
            }.mapToType(settings)) {
                "Type of signal $fqName cannot be null"
            }
        },
        parameterNames = signalParameterNames,
        isOverridee = findOverridee() != null,
        annotations = annotations.toList(),
        symbolProcessorSource = this
    )
}
