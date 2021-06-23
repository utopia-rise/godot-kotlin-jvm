package godot.annotation.processor.ext

import com.google.devtools.ksp.symbol.ClassKind
import com.google.devtools.ksp.symbol.KSClassDeclaration
import com.google.devtools.ksp.symbol.KSTypeAlias
import com.google.devtools.ksp.symbol.KSTypeReference
import godot.entrygenerator.model.Type
import godot.entrygenerator.model.TypeKind

fun KSTypeReference.mapToType(): Type {
    val resolvedType = resolve()
    val fqName = requireNotNull(resolvedType.declaration.qualifiedName?.asString()) {
        "resolvedType $resolvedType cannot have no fqName"
    }.removeSuffix("?")

    val superTypes = when (val declaration = resolvedType.declaration) {
        is KSClassDeclaration -> declaration.superTypes.mapNotNull { it.mapToType() }.toList()
        is KSTypeAlias -> listOfNotNull(declaration.type.mapToType())
        else -> throw IllegalStateException("Unknown declaration type $declaration for type reference")
    }

    val typeKind = when ((resolvedType.declaration as? KSClassDeclaration)?.classKind) {
        ClassKind.INTERFACE -> TypeKind.INTERFACE
        ClassKind.CLASS -> TypeKind.CLASS
        ClassKind.ENUM_CLASS -> TypeKind.ENUM_CLASS
        ClassKind.ENUM_ENTRY -> TypeKind.ENUM_ENTRY
        ClassKind.OBJECT -> TypeKind.OBJECT
        ClassKind.ANNOTATION_CLASS -> TypeKind.ANNOTATION_CLASS
        null -> TypeKind.TYPE_ALIAS
    }

    return Type(
        fqName,
        typeKind,
        resolvedType.isMarkedNullable,
        superTypes
    ) { resolvedType.arguments.mapNotNull { it.type?.mapToType() } }
}
