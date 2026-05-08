package godot.annotation.processor.classgraph.extensions

import godot.annotation.script
import godot.annotation.Register
import godot.annotation.RegisterSignal
import godot.annotation.Visible
import godot.annotation.processor.classgraph.Context
import godot.annotation.processor.classgraph.ErrorsDatabase
import godot.annotation.processor.classgraph.TypeCacheKey
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
import godot.entrygenerator.settings.RegisteredNameMode
import godot.entrygenerator.settings.Settings
import io.github.classgraph.ClassInfo
import io.github.classgraph.TypeArgument

fun ClassInfo.mapToClazz(settings: Settings): Clazz {
    val fqName = name
    Context.mappedClazzByFqName[fqName]?.let { return it }

    val supertypes = superclasses.union(interfaces).map { it.mapToClazz(settings) }

    val annotations = annotationInfo
        .mapNotNull { it.mapToGodotAnnotation(this, fqName) as? ClassAnnotation }

    val methods = methodInfo
        .filter { it.hasAnnotation(Register::class.java) }
        .map { it.mapMethodToRegisteredFunction(this, settings) }

    val fields = fieldInfo
        .filter { fieldInfo ->
            fieldInfo.hasAnnotation(Visible::class.java, this)
        }
        .map { it.mapToRegisteredProperty(settings, this) }

    val signals = fieldInfo
        .filter { fieldInfo ->
            fieldInfo.hasAnnotation(RegisterSignal::class.java, this)
        }
        .map { it.mapFieldToRegisteredSignal(settings, this) }

    val shouldBeRegistered = shouldBeRegistered(methods, fields, signals)

    val clazz = if (shouldBeRegistered) {
        if (!constructorInfo.any { it.isPublic && it.parameterInfo.isEmpty() }) {
            ErrorsDatabase.add(
                "You should provide a default constructor for class $fqName"
            )
        }

        RegisteredClass(
            customName = provideCustomName(),
            sourceProjectName = provideSourceProjectName(settings),
            fqName = fqName,
            supertypes = supertypes,
            annotations = annotations,
            functions = methods,
            signals = signals,
            properties = fields,
            isAbstract = isAbstract,
        )
    } else {
        Clazz(
            fqName = fqName,
            supertypes = supertypes,
            annotations = annotations,
        )
    }

    Context.mappedClazzByFqName[fqName] = clazz
    return clazz
}

private fun ClassInfo.shouldBeRegistered(
    registeredFunctions: List<RegisteredFunction>,
    registeredProperties: List<RegisteredProperty>,
    registeredSignals: List<RegisteredSignal>
) = !isInterface && (
        hasAnnotation(script::class.java) ||
                isAbstractAndContainsRegisteredMembers(
                    registeredFunctions,
                    registeredProperties,
                    registeredSignals
                ) ||
                isAbstractAndInheritsGodotObject
        )

private fun ClassInfo.isAbstractAndContainsRegisteredMembers(
    registeredFunctions: List<RegisteredFunction>,
    registeredProperties: List<RegisteredProperty>,
    registeredSignals: List<RegisteredSignal>
) = isAbstract && (registeredFunctions.isNotEmpty() || registeredSignals.isNotEmpty() || registeredProperties.isNotEmpty())

private val ClassInfo.isAbstractAndInheritsGodotObject
    get() = isAbstract && extendsSuperclass(KtObject::class.java)

private fun ClassInfo.provideCustomName(): String? {
    val registerClassAnnotation = annotationInfo
        .firstOrNull { it.name == script::class.qualifiedName }

    return registerClassAnnotation
        ?.parameterValues
        ?.firstOrNull()
        ?.value as? String
}

internal fun getJavaLangObjectType(settings: Settings): Type {
    val fqName = KOTLIN_ANY
    val registeredTypeName = provideRegisteredTypeName(
        fqName = fqName,
        customName = null,
        sourceProjectName = settings.projectName,
        settings = settings
    )

    return Type(
        fqName = fqName,
        kind = TypeKind.CLASS,
        supertypes = listOf(),
        arguments = { listOf() },
        registeredName = { _ -> registeredTypeName }
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
    val cacheKey = TypeCacheKey(
        fqName = name,
        typeArgumentDescriptors = typeArguments.map { it.toString() }
    )
    Context.mappedTypeByKey[cacheKey]?.let { return it }

    val superTypes = superclasses.map { it.mapToType(listOf(), settings) }
        .union(
            interfaces.map { it.mapToType(listOf(), settings) }
        )
        .toList()

    val customName = provideCustomName()
    val sourceProjectName = provideSourceProjectName(settings)
    val mappedTypeArguments = typeArguments.map { it.getType(settings) }
    val registeredTypeName = provideRegisteredTypeName(
        fqName = name,
        customName = customName,
        sourceProjectName = sourceProjectName,
        settings = settings
    )

    val type = Type(
        fqName = name.replace("$", "."),
        kind = typeKind,
        supertypes = superTypes,
        arguments = { mappedTypeArguments },
        registeredName = { _ -> registeredTypeName },
    )

    Context.mappedTypeByKey[cacheKey] = type
    return type
}

val ClassInfo.isScala: Boolean
    get() = sourceFile.endsWith(".scala")

private fun ClassInfo.provideSourceProjectName(settings: Settings): String {
    val classpathElementFile = try {
        classpathElementFile?.canonicalFile
    } catch (_: IllegalArgumentException) {
        null
    }

    if (classpathElementFile in settings.userCodeClassPathRoots) {
        return settings.projectName
    }

    val classpathElementName = classpathElementFile
        ?.nameWithoutExtension
        ?.takeIf { name -> name.isNotBlank() }
        ?: classpathElementFile
            ?.name
            ?.takeIf { name -> name.isNotBlank() }

    return classpathElementName
        ?.replace(" ", "_")
        ?: settings.projectName
}

private fun provideRegisteredTypeName(
    fqName: String,
    customName: String?,
    sourceProjectName: String,
    settings: Settings,
): String {
    val customRegisteredName = customName?.takeIf { it.isNotBlank() }
    if (customRegisteredName != null) {
        return customRegisteredName
    }

    val defaultRegisteredName = when (settings.registeredNameMode) {
        RegisteredNameMode.SIMPLE_NAME,
        RegisteredNameMode.PROJECT_PREFIX -> fqName.substringAfterLast(".")
        RegisteredNameMode.FQ_NAME -> fqName
    }

    return when (settings.registeredNameMode) {
        RegisteredNameMode.SIMPLE_NAME,
        RegisteredNameMode.FQ_NAME -> defaultRegisteredName
        RegisteredNameMode.PROJECT_PREFIX -> {
            if (sourceProjectName == settings.projectName) {
                defaultRegisteredName
            } else {
                "${sourceProjectName}_$defaultRegisteredName"
            }
        }
    }
}
