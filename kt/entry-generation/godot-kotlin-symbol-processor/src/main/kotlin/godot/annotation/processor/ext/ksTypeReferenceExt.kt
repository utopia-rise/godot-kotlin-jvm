package godot.annotation.processor.ext

import com.google.devtools.ksp.symbol.*
import godot.annotation.RegisterClass
import godot.entrygenerator.model.Type
import godot.entrygenerator.model.TypeKind
import java.io.File

internal fun KSTypeReference.mapToType(
    isFqNameRegistrationEnabled: Boolean,
    classNamePrefix: String?,
    projectBaseDir: File,
): Type {
    val resolvedType = resolve()
    val declaration = resolvedType.declaration

    val fqName = requireNotNull(declaration.qualifiedName?.asString()) {
        "resolvedType $resolvedType cannot have no fqName"
    }.removeSuffix("?")

    val superTypes = when (val declaration = declaration) {
        is KSClassDeclaration -> declaration.superTypes.mapNotNull { it.mapToType(isFqNameRegistrationEnabled, classNamePrefix, projectBaseDir) }.toList()
        is KSTypeAlias -> listOfNotNull(declaration.type.mapToType(isFqNameRegistrationEnabled, classNamePrefix, projectBaseDir))
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
        arguments = { resolvedType.arguments.mapNotNull { it.type?.mapToType(isFqNameRegistrationEnabled, classNamePrefix, projectBaseDir) } },
        registeredName = { resolvedType.provideRegisteredClassName(isFqNameRegistrationEnabled, classNamePrefix) },
    )
}

internal fun KSType.provideRegisteredClassName(
    isFqNameRegistrationEnabled: Boolean,
    classNamePrefix: String?,
): String? {
    return this.declaration.provideRegisteredClassName(isFqNameRegistrationEnabled, classNamePrefix)
}

internal fun KSDeclaration.provideRegisteredClassName(
    isFqNameRegistrationEnabled: Boolean,
    classNamePrefix: String?,
): String? {
    val registerClassAnnotation = annotations
        .firstOrNull { it.fqNameUnsafe == RegisterClass::class.qualifiedName }

    val customName = registerClassAnnotation
        ?.arguments
        ?.first()
        ?.value as? String

    val fqName = this.qualifiedName?.asString() ?: return null

    val registeredName = if (customName.isNullOrEmpty()) {
        if (isFqNameRegistrationEnabled) {
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

    return if (classNamePrefix != null) {
        if (registeredName.contains("_")) {
            val packageName = registeredName.substringBeforeLast("_")
            val classNameWithPrefix = registeredName
                .substringAfterLast("_")
                .let { className -> "${classNamePrefix.uppercase()}$className" }

            "${packageName}_$classNameWithPrefix"
        } else {
            "${classNamePrefix.uppercase()}$registeredName"
        }
    } else {
        registeredName
    }
}
