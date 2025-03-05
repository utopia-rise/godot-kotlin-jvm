package godot.annotation.processor.ext

import com.google.devtools.ksp.getAllSuperTypes
import com.google.devtools.ksp.getConstructors
import com.google.devtools.ksp.getDeclaredProperties
import com.google.devtools.ksp.isAbstract
import com.google.devtools.ksp.isPublic
import com.google.devtools.ksp.symbol.KSClassDeclaration
import godot.annotation.RegisterClass
import godot.annotation.RegisterProperty
import godot.annotation.RegisterSignal
import godot.annotation.processor.Settings
import godot.entrygenerator.model.ClassAnnotation
import godot.entrygenerator.model.Clazz
import godot.entrygenerator.model.RegisteredClass
import godot.entrygenerator.model.RegisteredFunction
import godot.entrygenerator.model.RegisteredProperty
import godot.entrygenerator.model.RegisteredSignal

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
        .mapNotNull { it.mapToAnnotation(this) as? ClassAnnotation }
        .toList()

    val registeredFunctions = getAllFunctions()
        .mapNotNull { it.mapToRegisteredFunction(this, settings) }
        .toList()

    val declaredProperties = getDeclaredProperties()
    val allProperties = getAllProperties()
    val registeredProperties = allProperties
        .filter { property ->
            property.annotations.any { it.fqNameUnsafe == RegisterProperty::class.qualifiedName } ||
                property.findOverridee()?.annotations?.any { it.fqNameUnsafe == RegisterProperty::class.qualifiedName } == true
        }
        .map {
            it.mapToRegisteredProperty(settings)
        }
        .toList()
    val registeredSignals = allProperties
        .filter { property ->
            property.annotations.any { it.fqNameUnsafe == RegisterSignal::class.qualifiedName }
        }
        .map { it.mapToRegisteredSignal(declaredProperties.toList(), settings) }
        .toList()

    val shouldBeRegistered = annotations.any { it.fqNameUnsafe == RegisterClass::class.qualifiedName } ||
        isAbstractAndContainsRegisteredMembers(registeredFunctions, registeredProperties, registeredSignals) ||
        isAbstractAndInheritsGodotBaseClass()

    return if (shouldBeRegistered) {
        val constructors = getConstructors()

        val duplicateConstructorArgumentCount = constructors
            .groupBy { it.parameters.size }
            .toList()
            .firstOrNull { it.second.size > 1 }
            ?.first

        if (duplicateConstructorArgumentCount != null) {
            throw Exception(
                "Cannot have more than one constructor with $duplicateConstructorArgumentCount arguments in registered class $fqName"
            )
        }

        val registeredConstructors = constructors
            .filter { it.isPublic() }
            .filter { constructor ->
                constructor.parameters.isEmpty()
            }
            .map { it.mapToRegisteredConstructor(settings) }
            .toList()

        RegisteredClass(
            registeredName = requireNotNull(provideRegisteredClassName(settings)) {
                "Failed to calculate RegisteredName for a registered class: ${this.qualifiedName?.asString()}. This is a bug. Please report it on Github"
            },
            fqName = fqName,
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
