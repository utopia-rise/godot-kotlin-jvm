package godot.annotation.processor.ext

import com.google.devtools.ksp.getAllSuperTypes
import com.google.devtools.ksp.getConstructors
import com.google.devtools.ksp.getDeclaredProperties
import com.google.devtools.ksp.isPublic
import com.google.devtools.ksp.symbol.ClassKind
import com.google.devtools.ksp.symbol.KSClassDeclaration
import com.google.devtools.ksp.symbol.Modifier
import godot.annotation.RegisterClass
import godot.annotation.RegisterConstructor
import godot.annotation.RegisterSignal
import godot.annotation.processor.compiler.CompilerDataProvider
import godot.entrygenerator.model.ClassAnnotation
import godot.entrygenerator.model.Clazz
import godot.entrygenerator.model.RegisteredClass
import godot.entrygenerator.model.RegisteredFunction
import godot.entrygenerator.model.RegisteredProperty
import godot.entrygenerator.model.RegisteredSignal
import java.io.File

fun KSClassDeclaration.hasCompilationErrors(): Boolean = superTypes.toList().any { it.resolve().isError }

fun KSClassDeclaration.getResPath(srcDirs: List<String>, projectDir: String): String = containingFile
    ?.filePath
    ?.let { filePath ->
        val srcDir = requireNotNull(
            srcDirs
                .map { it.replace(File.separator, "/") }
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
    } ?: throw IllegalStateException("Cannot get res path for declaration: ${qualifiedName?.asString()}")

fun KSClassDeclaration.mapToClazz(projectDir: String): Clazz {
    val fqName = requireNotNull(qualifiedName?.asString()) {
        "Qualified name for class declaration of a registered type or it's super types cannot be null"
    }
    val supertypeDeclarations = getAllSuperTypes()
        .mapNotNull { it.declaration as? KSClassDeclaration } //we're only interested in classes not interfaces
        .map { it.mapToClazz(projectDir) }
        .toList()
    val mappedAnnotations = annotations
        .mapNotNull { it.mapToAnnotation(this) as? ClassAnnotation }
        .toList()

    val functions = getAllFunctions()
        .mapNotNull { it.mapToFunction() }
        .toList()

    val declaredProperties = getDeclaredProperties()
    val allProperties = getAllProperties()
    val properties = allProperties
        .map {
            it.mapToProperty(declaredProperties.toList())
        }
        .toList()
    val registeredSignals = allProperties
        .filter { property ->
            property.annotations.any { it.fqNameUnsafe == RegisterSignal::class.qualifiedName }
        }
        .map { it.mapToRegisteredSignal(declaredProperties.toList()) }
        .toList()

    val shouldBeRegistered = annotations.any { it.fqNameUnsafe == RegisterClass::class.qualifiedName } ||
        isAbstractAndContainsRegisteredMembers(
            registeredFunctions = functions.filterIsInstance<RegisteredFunction>(),
            registeredProperties = properties.filterIsInstance<RegisteredProperty>(),
            registeredSignals = registeredSignals
        ) ||
        isAbstractAndInheritsGodotBaseClass()

    val constructors = getConstructors()
        .filter { it.isPublic() }
        .filter { constructor ->
            constructor.annotations.any { it.fqNameUnsafe == RegisterConstructor::class.qualifiedName } ||
                constructor.parameters.isEmpty()
        }
        .map { it.mapToConstructor(isParentClassRegistered = shouldBeRegistered) }
        .toList()

    return if (shouldBeRegistered) {
        RegisteredClass(
            fqName = fqName,
            supertypes = supertypeDeclarations,
            resPath = getResPath(CompilerDataProvider.srcDirs, projectDir),
            annotations = mappedAnnotations,
            constructors = constructors,
            functions = functions,
            signals = registeredSignals,
            properties = properties,
            isAbstract = isAbstractClass(),
            isInterface = isInterface(),
        )
    } else {
        Clazz(
            fqName = fqName,
            supertypes = supertypeDeclarations,
            annotations = mappedAnnotations,
            constructors = constructors,
            functions = functions,
            properties = properties,
            isAbstract = isAbstractClass(),
            isInterface = isInterface(),
        )
    }
}

private fun KSClassDeclaration.isAbstractClass(): Boolean = this.modifiers.contains(Modifier.ABSTRACT)
private fun KSClassDeclaration.isInterface(): Boolean = this.classKind == ClassKind.INTERFACE

fun KSClassDeclaration.isAbstractAndContainsRegisteredMembers(
    registeredFunctions: List<RegisteredFunction>,
    registeredProperties: List<RegisteredProperty>,
    registeredSignals: List<RegisteredSignal>
): Boolean {
    return isAbstractClass() && (registeredFunctions.isNotEmpty() || registeredProperties.isNotEmpty() || registeredSignals.isNotEmpty())
}

// issue: https://github.com/utopia-rise/godot-kotlin-jvm/issues/365
// also register empty abstract classes which inherit from a godot base class as child class registrars will reference the class registrar of this class
fun KSClassDeclaration.isAbstractAndInheritsGodotBaseClass(): Boolean {
    return isAbstractClass()
        && superTypes
        .any { supertype ->
            supertype
                .resolve()
                .declaration
                .annotations
                .any { annotation -> annotation.fqNameUnsafe == "godot.annotation.GodotBaseType" }
        }
}
