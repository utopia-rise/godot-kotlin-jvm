package godot.annotation.processor.ext

import com.google.devtools.ksp.getAllSuperTypes
import com.google.devtools.ksp.getConstructors
import com.google.devtools.ksp.getDeclaredProperties
import com.google.devtools.ksp.symbol.KSClassDeclaration
import godot.annotation.RegisterClass
import godot.annotation.RegisterProperty
import godot.annotation.RegisterSignal
import godot.annotation.processor.compiler.CompilerDataProvider
import godot.entrygenerator.model.ClassAnnotation
import godot.entrygenerator.model.Clazz
import godot.entrygenerator.model.RegisteredClass
import java.io.File

fun KSClassDeclaration.getResPath(srcDirs: List<String>, projectDir: String): String = containingFile
    ?.filePath
    ?.let { filePath ->
        val srcDir = requireNotNull(
            srcDirs
                .filter { srcDir ->
                    filePath.contains(srcDir)
                }
                .maxByOrNull { it.length }
                ?.removePrefix(projectDir)
                ?.replace(File.separator, "/")
                ?.removePrefix("/")
                ?.removeSuffix("/")
        )

        val relativeFilePath = filePath
            .substringAfterLast(srcDir)
            .removePrefix("/")

        "res://$srcDir/$relativeFilePath"
    } ?: throw IllegalStateException("Cannot get res path for declaration: $qualifiedName")

fun KSClassDeclaration.mapToClazz(projectDir: String): Clazz {
    val fqName = requireNotNull(qualifiedName?.asString()) {
        "Qualified name for class declaration of a registered type or it's super types cannot be null"
    }
    val supertypeDeclarations = getAllSuperTypes()
        .mapNotNull { it.declaration as? KSClassDeclaration } //we're only interested in classes not interfaces
        .map { it.mapToClazz(projectDir) }
        .toList()
    val mappedAnnotations = annotations
        .mapNotNull { it.mapToAnnotation() as? ClassAnnotation }
        .toList()

    return if (annotations.any { it.fqNameUnsafe == RegisterClass::class.qualifiedName }) {
        val registeredFunctions = getAllFunctions()
            .mapNotNull { it.mapToRegisteredFunction() }
            .toList()

        val declaredProperties = getDeclaredProperties()
        val allProperties = getAllProperties()
        val registeredProperties = allProperties
            .filter { property ->
                property.annotations.any { it.fqNameUnsafe == RegisterProperty::class.qualifiedName } ||
                    property.findOverridee()?.annotations?.any { it.fqNameUnsafe == RegisterProperty::class.qualifiedName } == true
            }
            .map {
                it.mapToRegisteredProperty(declaredProperties.toList())
            }
            .toList()
        val registeredSignals = allProperties
            .filter { property ->
                property.annotations.any { it.fqNameUnsafe == RegisterSignal::class.qualifiedName }
            }
            .map { it.mapToRegisteredSignal(declaredProperties.toList()) }
            .toList()
        val registeredConstructors = getConstructors()
            .map { it.mapToRegisteredConstructor() }
            .toList()

        RegisteredClass(
            fqName,
            supertypeDeclarations,
            getResPath(CompilerDataProvider.srcDirs, projectDir),
            mappedAnnotations,
            registeredConstructors,
            registeredFunctions,
            registeredSignals,
            registeredProperties
        )
    } else {
        Clazz(
            fqName,
            supertypeDeclarations,
            mappedAnnotations
        )
    }
}
