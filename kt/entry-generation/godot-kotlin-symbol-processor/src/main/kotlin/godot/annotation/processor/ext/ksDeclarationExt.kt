package godot.annotation.processor.ext

import com.google.devtools.ksp.symbol.KSClassDeclaration

fun KSClassDeclaration.hasCompilationErrors(): Boolean = superTypes
    .toList()
    .any { superTypeDeclaration -> superTypeDeclaration.resolve().isError }
    || this.asStarProjectedType().isError
