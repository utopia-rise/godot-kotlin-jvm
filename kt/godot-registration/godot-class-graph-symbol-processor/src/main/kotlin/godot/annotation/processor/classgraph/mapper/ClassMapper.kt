package godot.annotation.processor.classgraph.mapper

import godot.annotation.*
import godot.annotation.processor.classgraph.ProcessorContext
import godot.annotation.processor.classgraph.shape.JvmShapeResolvers
import godot.core.KtObject
import godot.registration.model.RegisteredFunction
import godot.registration.model.RegisteredProperty
import godot.registration.model.RegisteredSignal
import godot.registration.model.types.GodotBaseClass
import godot.registration.model.types.GodotClass
import godot.registration.model.types.ScriptClass
import godot.registration.model.types.ScriptInterface
import io.github.classgraph.ClassInfo

class ClassMapper(
    private val context: ProcessorContext,
    private val memberMapper: MemberMapper,
    private val shapeResolvers: JvmShapeResolvers,
) {
    fun mapGodotClass(classInfo: ClassInfo): GodotClass =
        if (classInfo.hasAnnotation(GodotBaseType::class.java)) {
            mapGodotBaseClass(classInfo)
        } else {
            mapScriptClass(classInfo)
        }

    fun mapScriptClass(classInfo: ClassInfo): ScriptClass {
        (context.mappedFamilyByFqName[classInfo.name] as? ScriptClass)?.let { scriptClass -> return scriptClass }

        val functions = classInfo.methodInfo
            .filter { method -> method.hasAnnotation(RegisterFunction::class.java) }
            .map(memberMapper::mapFunction)

        val properties = classInfo.fieldInfo
            .filter { field -> shapeHasAnnotation(field, classInfo, RegisterProperty::class.java.name) }
            .map { field -> memberMapper.mapProperty(field, classInfo) }

        val signals = classInfo.fieldInfo
            .filter { field -> shapeHasAnnotation(field, classInfo, RegisterSignal::class.java.name) }
            .map { field -> memberMapper.mapSignal(field, classInfo) }

        val scriptClass = ScriptClass(
            fqName = classInfo.name.replace("$", "."),
            customName = classInfo.provideCustomName(),
            sourceProjectName = classInfo.provideSourceProjectName(),
            isRegistered = classInfo.isRegistered(functions, properties, signals),
            isAbstract = classInfo.isAbstract,
            isTool = classInfo.hasAnnotation(Tool::class.java),
            parent = classInfo.superclass?.let(::mapGodotClass),
            interfaces = directSuperInterfaces(classInfo).map(::mapScriptInterface),
            constructors = classInfo.constructorInfo
                .filter { constructor -> constructor.isPublic }
                .map(memberMapper::mapConstructor),
            signals = signals,
            properties = properties,
            functions = functions,
        )

        context.mappedFamilyByFqName[classInfo.name] = scriptClass
        return scriptClass
    }

    fun mapGodotBaseClass(classInfo: ClassInfo): GodotBaseClass {
        (context.mappedFamilyByFqName[classInfo.name] as? GodotBaseClass)?.let { godotBaseClass ->
            return godotBaseClass
        }

        val parent = classInfo.superclass
            ?.takeIf { superclass -> superclass.hasAnnotation(GodotBaseType::class.java) }
            ?.let(::mapGodotBaseClass)

        val godotBaseClass = GodotBaseClass(
            fqName = classInfo.name.replace("$", "."),
            parent = parent,
        )

        context.mappedFamilyByFqName[classInfo.name] = godotBaseClass
        return godotBaseClass
    }

    fun mapScriptInterface(classInfo: ClassInfo): ScriptInterface {
        (context.mappedFamilyByFqName[classInfo.name] as? ScriptInterface)?.let { scriptInterface ->
            return scriptInterface
        }

        val scriptInterface = ScriptInterface(
            fqName = classInfo.name.replace("$", "."),
            interfaces = directSuperInterfaces(classInfo).map(::mapScriptInterface),
            functions = classInfo.methodInfo
                .filter { method -> method.hasAnnotation(RegisterFunction::class.java) }
                .map(memberMapper::mapFunction),
        )

        context.mappedFamilyByFqName[classInfo.name] = scriptInterface
        return scriptInterface
    }

    fun directSuperInterfaces(classInfo: ClassInfo): List<ClassInfo> {
        val inheritedFromSuperclass = (classInfo.superclass?.interfaces ?: emptyList()).toSet()
        val own = classInfo.interfaces.filterNot { iface -> iface in inheritedFromSuperclass }
        return own.filter { candidate -> own.none { other -> other != candidate && candidate in other.interfaces } }
    }

    private fun shapeHasAnnotation(
        fieldInfo: io.github.classgraph.FieldInfo,
        owner: ClassInfo,
        annotationName: String
    ): Boolean {
        return shapeResolvers.forClass(owner).hasAnnotation(fieldInfo, owner, annotationName)
    }

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
        .firstOrNull { annotation -> annotation.name == RegisterClass::class.qualifiedName }
        ?.parameterValues
        ?.firstOrNull()
        ?.value as? String

    private fun ClassInfo.provideSourceProjectName(): String {
        val classpathElementFile = try {
            classpathElementFile?.canonicalFile
        } catch (_: IllegalArgumentException) {
            null
        }

        if (classpathElementFile in context.settings.userCodeClassPathRoots) {
            return context.settings.projectName
        }

        val classpathElementName = classpathElementFile
            ?.nameWithoutExtension
            ?.takeIf { name -> name.isNotBlank() }
            ?: classpathElementFile
                ?.name
                ?.takeIf { name -> name.isNotBlank() }

        return classpathElementName
            ?.replace(" ", "_")
            ?: context.settings.projectName
    }
}
