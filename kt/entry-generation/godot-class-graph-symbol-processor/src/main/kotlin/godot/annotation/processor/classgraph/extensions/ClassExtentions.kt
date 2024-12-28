package godot.annotation.processor.classgraph.extensions

import godot.annotation.RegisterClass
import godot.annotation.RegisterConstructor
import godot.annotation.RegisterFunction
import godot.annotation.RegisterProperty
import godot.annotation.RegisterSignal
import godot.annotation.processor.classgraph.Settings
import godot.entrygenerator.model.ClassAnnotation
import godot.entrygenerator.model.Clazz
import godot.entrygenerator.model.RegisteredClass
import godot.entrygenerator.model.Type
import godot.entrygenerator.model.TypeKind
import io.github.classgraph.ClassInfo
import io.github.classgraph.ScanResult
import org.jetbrains.annotations.NotNull

context(ScanResult)
fun ClassInfo.mapToClazz(settings: Settings): Clazz {
    val fqName = name
    val supertypes = superclasses.map { it.mapToClazz(settings) }

    val annotations = annotationInfo
        .mapNotNull { it.mapToGodotAnnotation(this) as? ClassAnnotation }

    val methods = methodInfo
        .filter { it.hasAnnotation(RegisterFunction::class.java) }
        .map { it.mapMethodToRegisteredFunction(this, settings) }

    val fields = fieldInfo
        .filter { fieldInfo ->
            fieldInfo.hasAnnotation(RegisterProperty::class.java, this)
        }
        .map { it.mapToRegisteredProperty(settings) }

    val signals = fieldInfo
        .filter { fieldInfo ->
            fieldInfo.hasAnnotation(RegisterSignal::class.java, this)
        }
        .map { it.mapFieldToRegisteredSignal(settings) }

    val constructors = constructorInfo
        .filter { constructor ->
            constructor.isPublic &&
                (constructor.hasAnnotation(RegisterConstructor::class.java) || constructor.parameterInfo.isEmpty())
        }
        .map { it.mapToRegisteredConstructor(settings) }

    val shouldBeRegistered = annotationInfo.any { it.classInfo.name == RegisterClass::class.java.name }

    //TODO: HOW TO GET SOURCE PATH ?
//    val absoluteSourcePath = File(location)?.absolutePath
//    val relativeSourcePath = absoluteSourcePath?.let { File(it).relativeTo(settings.projectBaseDir).invariantSeparatorsPath } ?: ""

    return if (shouldBeRegistered) {
        RegisteredClass(
            registeredName = provideRegisteredClassName(settings),
            fqName = fqName,
            relativeSourcePath = "TODO", //TODO: Cannot get original source file with ClassGraph
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
            relativeSourcePath = "TODO", //TODO: Cannot get original source file with ClassGraph
            supertypes = supertypes,
            annotations = annotations,
            symbolProcessorSource = this
        )
    }
}

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

// TODO: remove when https://github.com/classgraph/classgraph/issues/703 is fixed
internal fun getJavaLangObjectType(isNullable: Boolean, settings: Settings): Type {
    val fqName = "java.lang.Object"
    return Type(
        fqName = fqName,
        kind = TypeKind.CLASS,
        isNullable = isNullable,
        supertypes = listOf(),
        arguments = { listOf() },
        registeredName = { getDefaultRegisteredName(fqName, settings) }
    )
}

context(ScanResult)
internal fun ClassInfo.mapToType(settings: Settings, nullable: Boolean): Type {
    val fqName = name

    val superTypes = superclasses.map { it.mapToType(settings, nullable) }

    val typeKind = when {
        isAnnotation -> TypeKind.ANNOTATION_CLASS
        isInterface -> TypeKind.INTERFACE
        isEnum -> TypeKind.ENUM_CLASS
        isStandardClass -> TypeKind.CLASS
        else -> TypeKind.UNKNOWN
    }

    return Type(
        fqName = fqName,
        kind = typeKind,
        isNullable = hasAnnotation(NotNull::class.java),
        supertypes = superTypes,
        arguments = { getTypeParameters(settings) },
        registeredName = { provideRegisteredClassName(settings) },
    )
}

context(ScanResult)
internal fun ClassInfo.getTypeParameters(settings: Settings): List<Type> = typeDescriptor
    .typeParameters
    .map { it.typeClassInfo.mapToType(settings, false) } //TODO: See how to manage nullables
