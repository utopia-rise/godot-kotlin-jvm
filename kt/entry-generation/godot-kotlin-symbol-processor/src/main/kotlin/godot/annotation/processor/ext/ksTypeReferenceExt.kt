package godot.annotation.processor.ext

import com.google.devtools.ksp.symbol.ClassKind
import com.google.devtools.ksp.symbol.KSClassDeclaration
import com.google.devtools.ksp.symbol.KSDeclaration
import com.google.devtools.ksp.symbol.KSType
import com.google.devtools.ksp.symbol.KSTypeAlias
import com.google.devtools.ksp.symbol.KSTypeReference
import godot.annotation.RegisterClass
import godot.annotation.processor.Settings
import godot.entrygenerator.model.Type
import godot.entrygenerator.model.TypeKind

internal fun KSTypeReference.mapToType(
    settings: Settings,
): Type {
    val resolvedType = resolve()
    val declaration = resolvedType.declaration

    val fqName = requireNotNull(declaration.qualifiedName?.asString()) {
        "resolvedType $resolvedType cannot have no fqName"
    }.removeSuffix("?")

    val superTypes = when (val declaration = declaration) {
        is KSClassDeclaration -> declaration.superTypes.mapNotNull { it.mapToType(settings) }.toList()
        is KSTypeAlias -> listOfNotNull(declaration.type.mapToType(settings))
        else -> throw IllegalStateException("Unknown declaration type $declaration for type reference")
    }

    val typeKind = when ((declaration as? KSClassDeclaration)?.classKind) {
        ClassKind.INTERFACE -> TypeKind.INTERFACE
        ClassKind.CLASS -> TypeKind.CLASS
        ClassKind.ENUM_CLASS -> TypeKind.ENUM_CLASS
        ClassKind.ENUM_ENTRY -> TypeKind.ENUM_ENTRY
        ClassKind.OBJECT -> TypeKind.OBJECT
        ClassKind.ANNOTATION_CLASS -> TypeKind.ANNOTATION_CLASS
        null -> TypeKind.UNKNOWN
    }

    return Type(
        fqName = fqName,
        kind = typeKind,
        isNullable = resolvedType.isMarkedNullable,
        supertypes = superTypes,
        arguments = { resolvedType.arguments.mapNotNull { it.type?.mapToType(settings) } },
        registeredName = { resolvedType.provideRegisteredClassName(settings) },
    )
}

internal fun KSType.provideRegisteredClassName(
    settings: Settings,
): String? {
    return this.declaration.provideRegisteredClassName(settings)
}

internal fun KSDeclaration.provideRegisteredClassName(
    settings: Settings,
): String? {
    return settings
        .registeredClassMetadataContainers
        .firstOrNull { it.fqName == this.qualifiedName?.asString() }
        ?.registeredName
        ?: run {
            val registerClassAnnotation = annotations
                .firstOrNull { it.fqNameUnsafe == RegisterClass::class.qualifiedName }

            val customName = registerClassAnnotation
                ?.arguments
                ?.first()
                ?.value as? String

            val fqName = this.qualifiedName?.asString() ?: return null

            val registeredName = if (customName.isNullOrEmpty()) {
                if (settings.isFqNameRegistrationEnabled) {
                    fqName.replace(".", "_")
                } else {
                    if (fqName.contains(".")) {
                        fqName.substringAfterLast(".")
                    } else {
                        fqName
                    }
                }
            } else {
                customName
            }

            if (settings.classPrefix != null) {
                if (registeredName.contains("_")) {
                    val packageName = registeredName.substringBeforeLast("_")
                    val classNameWithPrefix = registeredName
                        .substringAfterLast("_")
                        .let { className -> "${settings.classPrefix.uppercase()}$className" }

                    "${packageName}_$classNameWithPrefix"
                } else {
                    "${settings.classPrefix.uppercase()}$registeredName"
                }
            } else {
                registeredName
            }
        }
}
