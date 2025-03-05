package godot.annotation.processor.classgraph.extensions

import godot.annotation.RegisterClass
import godot.annotation.RegisterConstructor
import godot.annotation.RegisterFunction
import godot.annotation.RegisterProperty
import godot.annotation.RegisterSignal
import godot.annotation.processor.classgraph.Settings
import godot.annotation.processor.classgraph.constants.KOTLIN_ANY
import godot.core.KtObject
import godot.entrygenerator.model.ClassAnnotation
import godot.entrygenerator.model.Clazz
import godot.entrygenerator.model.RegisteredClass
import godot.entrygenerator.model.RegisteredFunction
import godot.entrygenerator.model.RegisteredProperty
import godot.entrygenerator.model.RegisteredSignal
import godot.entrygenerator.model.Type
import godot.entrygenerator.model.TypeKind
import io.github.classgraph.ClassInfo
import io.github.classgraph.TypeArgument

fun ClassInfo.mapToClazz(settings: Settings): Clazz {
    val fqName = name
    val supertypes = superclasses.union(interfaces).map { it.mapToClazz(settings) }

    val annotations = annotationInfo
        .mapNotNull { it.mapToGodotAnnotation(this) as? ClassAnnotation }

    val methods = methodInfo
        .filter { it.hasAnnotation(RegisterFunction::class.java) }
        .map { it.mapMethodToRegisteredFunction(this, settings) }

    val fields = fieldInfo
        .filter { fieldInfo ->
            fieldInfo.hasAnnotation(RegisterProperty::class.java, this)
        }
        .map { it.mapToRegisteredProperty(settings, this) }

    val signals = fieldInfo
        .filter { fieldInfo ->
            fieldInfo.hasAnnotation(RegisterSignal::class.java, this)
        }
        .map { it.mapFieldToRegisteredSignal(settings, this) }

    val duplicateConstructorArgumentCount = constructorInfo
        .groupBy { it.parameterInfo.size }
        .toList()
        .firstOrNull { it.second.size > 1 }
        ?.first

    val shouldBeRegistered = shouldBeRegistered(methods, fields, signals)

    if (shouldBeRegistered && duplicateConstructorArgumentCount != null) {
        throw Exception(
            "Cannot have more than one constructor with $duplicateConstructorArgumentCount arguments in registered class $fqName"
        )
    }

    val constructors = constructorInfo
        .filter { constructor ->
            constructor.isPublic &&
                (constructor.hasAnnotation(RegisterConstructor::class.java) || constructor.parameterInfo.isEmpty())
        }
        .map { it.mapToRegisteredConstructor(settings) }

    return if (shouldBeRegistered) {
        RegisteredClass(
            registeredName = provideRegisteredClassName(settings),
            fqName = fqName,
            supertypes = supertypes,
            annotations = annotations,
            constructors = constructors,
            functions = methods,
            signals = signals,
            properties = fields,
            isAbstract = isAbstract,
            isFqNameRegistrationEnabled = settings.isFqNameRegistrationEnabled,
            classNamePrefix = settings.classPrefix,
            symbolProcessorSource = this
        )
    } else {
        Clazz(
            fqName = fqName,
            supertypes = supertypes,
            annotations = annotations,
            symbolProcessorSource = this
        )
    }
}

private fun ClassInfo.shouldBeRegistered(
    registeredFunctions: List<RegisteredFunction>,
    registeredProperties: List<RegisteredProperty>,
    registeredSignals: List<RegisteredSignal>
) = hasAnnotation(RegisterClass::class.java) || isAbstractAndContainsRegisteredMembers(
    registeredFunctions,
    registeredProperties,
    registeredSignals
) || isAbstractAndInheritsGodotObject

private fun ClassInfo.isAbstractAndContainsRegisteredMembers(
    registeredFunctions: List<RegisteredFunction>,
    registeredProperties: List<RegisteredProperty>,
    registeredSignals: List<RegisteredSignal>
) = isAbstract && (registeredFunctions.isNotEmpty() || registeredSignals.isNotEmpty() || registeredProperties.isNotEmpty())

private val ClassInfo.isAbstractAndInheritsGodotObject
    get() = isAbstract && extendsSuperclass(KtObject::class.java)

private fun getDefaultRegisteredName(fqName: String, settings: Settings): String = if (settings.isFqNameRegistrationEnabled) {
    fqName.replace(".", "_")
} else {
    if (fqName.contains(".")) {
        fqName.substringAfterLast(".")
    } else {
        fqName
    }
}

internal fun ClassInfo.provideRegisteredClassName(
    settings: Settings,
): String {
    val registerClassAnnotation = annotationInfo
        .firstOrNull { it.name == RegisterClass::class.qualifiedName }

    val customName = registerClassAnnotation
        ?.parameterValues
        ?.firstOrNull()
        ?.value as? String

    val fqName = this.name

    val registeredName = if (customName.isNullOrEmpty()) {
        getDefaultRegisteredName(fqName, settings)
    } else {
        customName
    }

    return if (settings.classPrefix != null) {
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

internal fun getJavaLangObjectType(settings: Settings): Type {
    val fqName = KOTLIN_ANY
    return Type(
        fqName = fqName,
        kind = TypeKind.CLASS,
        supertypes = listOf(),
        arguments = { listOf() },
        registeredName = { getDefaultRegisteredName(fqName, settings) }
    )
}

val ClassInfo.typeKind: TypeKind
    get() = when {
        isAnnotation -> TypeKind.ANNOTATION_CLASS
        isInterface -> TypeKind.INTERFACE
        isEnum -> TypeKind.ENUM_CLASS
        isStandardClass -> TypeKind.CLASS
        else -> TypeKind.UNKNOWN
    }

internal fun ClassInfo.mapToType(typeArguments: List<TypeArgument>, settings: Settings): Type {
    val superTypes = superclasses.map { it.mapToType(listOf(), settings) }
        .union(
            interfaces.map { it.mapToType(listOf(), settings) }
        )
        .toList()

    return Type(
        fqName = name,
        kind = typeKind,
        supertypes = superTypes,
        arguments = { typeArguments.map { it.getType(settings) } },
        registeredName = { provideRegisteredClassName(settings) },
    )
}

val ClassInfo.isScala: Boolean
    get() = sourceFile.endsWith(".scala")
