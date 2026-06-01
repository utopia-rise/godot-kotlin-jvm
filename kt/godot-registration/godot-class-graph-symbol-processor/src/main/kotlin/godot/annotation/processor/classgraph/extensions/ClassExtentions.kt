package godot.annotation.processor.classgraph.extensions

import godot.annotation.*
import godot.annotation.processor.classgraph.Context
import godot.annotation.processor.classgraph.ProcessorSettings
import godot.annotation.processor.classgraph.TypeCacheKey
import godot.annotation.processor.classgraph.constants.KOTLIN_ANY
import godot.annotation.processor.classgraph.models.TypeDescriptor
import godot.core.KtObject
import godot.registration.model.RegisteredConstructor
import godot.registration.model.RegisteredFunction
import godot.registration.model.RegisteredProperty
import godot.registration.model.RegisteredSignal
import godot.registration.model.types.*
import io.github.classgraph.ClassInfo
import io.github.classgraph.MethodInfo
import io.github.classgraph.TypeArgument

private const val CORE_TYPE_FQ_NAME = "godot.core.CoreType"

/** A class is either a built-in Godot base ([GodotBaseClass]) or a user [ScriptClass]. */
fun ClassInfo.mapToGodotClass(settings: ProcessorSettings): GodotClass =
    if (hasAnnotation(GodotBaseType::class.java)) mapToGodotBaseClass() else mapToScriptClass(settings)

fun ClassInfo.mapToScriptClass(settings: ProcessorSettings): ScriptClass {
    (Context.mappedFamilyByFqName[name] as? ScriptClass)?.let { return it }

    val functions = methodInfo
        .filter { it.hasAnnotation(RegisterFunction::class.java) }
        .map { it.mapMethodToRegisteredFunction(settings) }

    val properties = fieldInfo
        .filter { it.hasAnnotation(RegisterProperty::class.java, this) }
        .map { it.mapToRegisteredProperty(settings, this) }

    val signals = fieldInfo
        .filter { it.hasAnnotation(RegisterSignal::class.java, this) }
        .map { it.mapFieldToRegisteredSignal(settings, this) }

    val scriptClass = ScriptClass(
        fqName = name.replace("$", "."),
        customName = provideCustomName(),
        sourceProjectName = provideSourceProjectName(settings),
        isRegistered = isRegistered(functions, properties, signals),
        isAbstract = isAbstract,
        isTool = hasAnnotation(Tool::class.java),
        // null parent terminates the chain at the Godot root.
        parent = superclass?.mapToGodotClass(settings),
        interfaces = directSuperInterfaces().map { it.mapToScriptInterface(settings) },
        constructors = constructorInfo
            .filter { it.isPublic }
            .map { it.mapToRegisteredConstructor(settings) },
        signals = signals,
        properties = properties,
        functions = functions,
    )

    Context.mappedFamilyByFqName[name] = scriptClass
    return scriptClass
}

private fun ClassInfo.mapToGodotBaseClass(): GodotBaseClass {
    (Context.mappedFamilyByFqName[name] as? GodotBaseClass)?.let { return it }

    val parent = superclass
        ?.takeIf { it.hasAnnotation(GodotBaseType::class.java) }
        ?.mapToGodotBaseClass()

    // Godot already knows this type: no members, but we still keep the built-in parent chain so ancestry
    // checks can distinguish things like Button -> Node and NavigationMesh -> RefCounted.
    val godotBaseClass = GodotBaseClass(
        fqName = name.replace("$", "."),
        parent = parent,
    )

    Context.mappedFamilyByFqName[name] = godotBaseClass
    return godotBaseClass
}

private fun ClassInfo.mapToScriptInterface(settings: ProcessorSettings): ScriptInterface {
    (Context.mappedFamilyByFqName[name] as? ScriptInterface)?.let { return it }

    val functions = methodInfo
        .filter { it.hasAnnotation(RegisterFunction::class.java) }
        .map { it.mapMethodToRegisteredFunction(settings) }

    // Stores this interface's DIRECT super-interfaces; the full hierarchy is recovered by tree-walking.
    val scriptInterface = ScriptInterface(
        fqName = name.replace("$", "."),
        interfaces = directSuperInterfaces().map { it.mapToScriptInterface(settings) },
        functions = functions,
    )

    Context.mappedFamilyByFqName[name] = scriptInterface
    return scriptInterface
}

/**
 * The DIRECT super-interfaces of this class/interface — ALL of them. The full interface hierarchy is
 * recovered by walking each resulting [ScriptInterface]'s own [interfaces] as a tree.
 *
 * ClassGraph only exposes the transitive interface set, so "direct" is derived by removing interfaces
 * inherited from the superclass and those reachable through another directly-implemented interface.
 */
private fun ClassInfo.directSuperInterfaces(): List<ClassInfo> {
    val inheritedFromSuperclass = (superclass?.interfaces ?: emptyList()).toSet()
    val own = interfaces.filterNot { it in inheritedFromSuperclass }
    return own.filter { candidate -> own.none { other -> other != candidate && candidate in other.interfaces } }
}

private fun MethodInfo.mapToRegisteredConstructor(settings: ProcessorSettings): RegisteredConstructor =
    RegisteredConstructor(
        parameterTypes = parameterInfo.map { TypeDescriptor(it).getMappedType(settings) },
    )

/**
 * Structural (not sanity) determination of whether a class is registered with Godot:
 * it carries `@RegisterClass`, or it is an abstract class that either contains registered members or
 * inherits a Godot object (so Godot must still know it).
 */
private fun ClassInfo.isRegistered(
    functions: List<RegisteredFunction>,
    properties: List<RegisteredProperty>,
    signals: List<RegisteredSignal>,
): Boolean = !isInterface && (
    hasAnnotation(RegisterClass::class.java) ||
        (isAbstract && (functions.isNotEmpty() || properties.isNotEmpty() || signals.isNotEmpty())) ||
        (isAbstract && extendsSuperclass(KtObject::class.java))
    )

private fun ClassInfo.provideCustomName(): String? = annotationInfo
    .firstOrNull { it.name == RegisterClass::class.qualifiedName }
    ?.parameterValues
    ?.firstOrNull()
    ?.value as? String

internal fun getJavaLangObjectType() = Type(
    fqName = KOTLIN_ANY,
    kind = TypeKind.CLASS,
    isNullable = false,
)

private val ClassInfo.isCoreType: Boolean
    get() = name == CORE_TYPE_FQ_NAME ||
        superclasses.any { it.name == CORE_TYPE_FQ_NAME } ||
        interfaces.any { it.name == CORE_TYPE_FQ_NAME }

/**
 * Classifies a resolved class into a model [TypeKind] (primitives are handled earlier, in TypeDescriptor).
 * Core type is checked before interface/enum so a Godot core type that happens to be an interface
 * (e.g. `Callable`) is classified as [TypeKind.CORE_TYPE], not [TypeKind.INTERFACE].
 */
val ClassInfo.modelTypeKind: TypeKind
    get() = when {
        isCoreType -> TypeKind.CORE_TYPE
        isEnum -> TypeKind.ENUM
        isInterface -> TypeKind.INTERFACE
        isStandardClass -> TypeKind.CLASS
        else -> TypeKind.OTHER
    }

internal fun ClassInfo.mapToType(typeArguments: List<TypeArgument>, settings: ProcessorSettings): Type {
    val cacheKey = TypeCacheKey(
        fqName = name,
        typeArgumentDescriptors = typeArguments.map { it.toString() }
    )
    Context.mappedTypeByKey[cacheKey]?.let { return it }

    val mappedTypeArguments = typeArguments.map { it.getType(settings) }

    val type = when (modelTypeKind) {
        TypeKind.CLASS -> mapToReferencedGodotClass(settings)
        TypeKind.INTERFACE -> mapToReferencedScriptInterface(settings)
        else -> Type(
            fqName = name.replace("$", "."),
            kind = modelTypeKind,
            isNullable = false,
            genericArguments = mappedTypeArguments,
        )
    }

    Context.mappedTypeByKey[cacheKey] = type
    return type
}

private fun ClassInfo.mapToReferencedGodotClass(settings: ProcessorSettings): Type =
    if (hasAnnotation(GodotBaseType::class.java)) {
        mapToGodotBaseClass()
    } else {
        ReferencedGodotClass(
            fqName = name.replace("$", "."),
            parent = superclass?.let { it.mapToReferencedGodotClass(settings) as GodotClass },
            interfaces = directSuperInterfaces().map { it.mapToReferencedScriptInterface(settings) as ScriptFamily },
        )
    }

private fun ClassInfo.mapToReferencedScriptInterface(settings: ProcessorSettings): Type =
    ReferencedScriptInterface(
        fqName = name.replace("$", "."),
        interfaces = directSuperInterfaces().map { it.mapToReferencedScriptInterface(settings) as ScriptFamily },
    )

val ClassInfo.isScala: Boolean
    get() = sourceFile.endsWith(".scala")

private fun ClassInfo.provideSourceProjectName(settings: ProcessorSettings): String {
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
