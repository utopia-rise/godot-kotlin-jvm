package godot.annotation.processor.ext

import com.google.devtools.ksp.symbol.KSClassDeclaration

fun KSClassDeclaration.hasCompilationErrors(): Boolean = superTypes
    .toList()
    .any { superTypeDeclaration ->
        superTypeDeclaration.resolve().isError
    } ||
    this.asStarProjectedType().isError ||
    this.getAllProperties().any { property ->
        property.type.resolve().isError
            || property.annotations.any { it.annotationType.resolve().isError }
    } ||
    this.getAllFunctions().any { function ->
        function.returnType?.resolve()?.isError == true
            || function.parameters.any { param -> param.type.resolve().isError }
            || function.annotations.any { it.annotationType.resolve().isError }
    } ||
    this.annotations.any { it.annotationType.resolve().isError }
