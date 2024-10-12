package godot.annotation.processor.ext

import com.google.devtools.ksp.getAllSuperTypes
import com.google.devtools.ksp.getConstructors
import com.google.devtools.ksp.getDeclaredProperties
import com.google.devtools.ksp.isAbstract
import com.google.devtools.ksp.isPublic
import com.google.devtools.ksp.symbol.KSClassDeclaration
import com.google.devtools.ksp.symbol.KSFunctionDeclaration
import com.google.devtools.ksp.symbol.KSPropertyDeclaration
import godot.annotation.GodotApiMember
import godot.annotation.GodotMember
import godot.annotation.processor.Settings
import godot.entrygenerator.model.ClassAnnotation
import godot.entrygenerator.model.Clazz
import godot.entrygenerator.model.RegisteredClass
import godot.entrygenerator.model.RegisteredFunction
import godot.entrygenerator.model.RegisteredProperty
import godot.entrygenerator.model.RegisteredSignal
import godot.tools.common.constants.GodotKotlinJvmTypes
import godot.tools.common.constants.godotCorePackage
import java.io.File

internal fun KSClassDeclaration.mapToClazz(
    settings: Settings,
): Clazz {
    val fqName = requireNotNull(qualifiedName?.asString()) {
        "Qualified name for class declaration of a registered type or it's super types cannot be null! KSClassDeclaration: $this"
    }
    val supertypeDeclarations = getAllSuperTypes()
        .mapNotNull { it.declaration as? KSClassDeclaration } //we're only interested in classes not interfaces
        .map { it.mapToClazz(settings) }
        .toList()
    val mappedAnnotations = annotations
        .flatMap { it.mapToAnnotation(this) }
        .filterIsInstance<ClassAnnotation>()
        .toList()

    val registeredFunctions = getAllFunctions()
        .filter { function ->
            function.hasAnnotation(GodotMember::class) || function.overridesApiFunction()
        }
        .mapNotNull { it.mapToRegisteredFunction(this, settings) }
        .toList()

    val declaredProperties = getDeclaredProperties()
    val allProperties = getAllProperties()
    val registeredProperties = allProperties
        .filter { property ->
            property.hasRegistrationAnnotation() || property.overridesRegisteredProperty()
        }
        .map {
            it.mapToRegisteredProperty(settings)
        }
        .toList()
    val registeredSignals = allProperties
        .filter { property ->
            property
                .type
                .resolve()
                .declaration
                .qualifiedName
                ?.asString()
                ?.startsWith("$godotCorePackage.${GodotKotlinJvmTypes.signal}") == true
                && !property.hasAnnotation(GodotApiMember::class)
        }
        .map { it.mapToRegisteredSignal(declaredProperties.toList(), settings) }
        .toList()

    val shouldBeRegistered = hasRegistrationAnnotation() ||
        isAbstractAndContainsRegisteredMembers(registeredFunctions, registeredProperties, registeredSignals) ||
        isAbstractAndInheritsGodotBaseClass()

    val absoluteSourcePath = this.containingFile?.filePath?.let { File(it) }
    val relativeSourcePath = absoluteSourcePath?.relativeTo(settings.projectBaseDir)?.invariantSeparatorsPath ?: ""

    return if (shouldBeRegistered) {

        val registeredConstructors = getConstructors()
            .filter { it.isPublic() }
            .filter { constructor ->
                constructor.hasAnnotation(GodotMember::class) ||
                    constructor.parameters.isEmpty()
            }
            .map { it.mapToRegisteredConstructor(settings) }
            .toList()

        RegisteredClass(
            registeredName = requireNotNull(provideRegisteredClassName(settings)) {
                "Failed to calculate RegisteredName for a registered class: ${this.qualifiedName?.asString()}. This is a bug. Please report it on Github"
            },
            fqName = fqName,
            relativeSourcePath = relativeSourcePath,
            supertypes = supertypeDeclarations,
            annotations = mappedAnnotations,
            constructors = registeredConstructors,
            functions = registeredFunctions,
            signals = registeredSignals,
            properties = registeredProperties,
            isAbstract = isAbstract(),
            isFqNameRegistrationEnabled = settings.isFqNameRegistrationEnabled,
            classNamePrefix = settings.classPrefix,
            symbolProcessorSource = this
        )
    } else {
        Clazz(
            fqName = fqName,
            relativeSourcePath = relativeSourcePath,
            supertypes = supertypeDeclarations,
            annotations = mappedAnnotations,
            symbolProcessorSource = this
        )
    }
}

internal fun KSClassDeclaration.isAbstractAndContainsRegisteredMembers(
    registeredFunctions: List<RegisteredFunction>,
    registeredProperties: List<RegisteredProperty>,
    registeredSignals: List<RegisteredSignal>
): Boolean {
    return isAbstract() && (registeredFunctions.isNotEmpty() || registeredProperties.isNotEmpty() || registeredSignals.isNotEmpty())
}

// issue: https://github.com/utopia-rise/godot-kotlin-jvm/issues/365
// also register empty abstract classes which inherit from a godot base class as child class registrars will reference the class registrar of this class
internal fun KSClassDeclaration.isAbstractAndInheritsGodotBaseClass(): Boolean {
    return isAbstract()
        && superTypes
        .any { supertype ->
            supertype
                .resolve()
                .declaration
                .annotations
                .any { annotation -> annotation.fqNameUnsafe == "godot.annotation.GodotBaseType" }
        }
}

private fun KSFunctionDeclaration.overridesApiFunction(isOveridee: Boolean = false): Boolean {
    return if (hasAnnotation(GodotApiMember::class) && !isOveridee) {
        // when we retrieve all functions from KSP, KSP adds the override modifier to all functions not declared in the current class
        // hence if we are in the first recursion, we are coming from the current class. If any function here contains the `GodotApiMember`
        // annotation, it means, it was added by KSP for us, and it is no function we need to register
        false
    } else {
        val overridee = (findOverridee() as? KSFunctionDeclaration) ?: return false

        if (overridee.hasAnnotation(GodotApiMember::class)) {
            return true
        } else {
            return overridee.overridesApiFunction(true)
        }
    }
}

private fun KSPropertyDeclaration.overridesRegisteredProperty(): Boolean {
    return hasAnnotation(GodotMember::class) || findOverridee()?.overridesRegisteredProperty() == true
}
