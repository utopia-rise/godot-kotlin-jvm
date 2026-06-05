package godot.annotation.processor.classgraph

import godot.annotation.GodotBaseType
import godot.annotation.RegisterClass
import godot.annotation.processor.classgraph.mapper.AnnotationMapper
import godot.annotation.processor.classgraph.mapper.ClassMapper
import godot.annotation.processor.classgraph.mapper.MemberMapper
import godot.annotation.processor.classgraph.mapper.TypeMapper
import godot.annotation.processor.classgraph.shape.JvmShapeResolvers
import godot.core.KtObject
import godot.registration.model.types.ScriptClass
import io.github.classgraph.ClassGraph
import io.github.classgraph.ScanResult
import java.io.File

object ClassGraphProcessor {
    data class IncrementalProcessResult(
        val dirtyClassNames: Set<String>,
        val registeredClasses: List<ScriptClass>,
    )

    fun process(runtimeClassPathFiles: Set<File>, settings: ProcessorSettings): List<ScriptClass> {
        return scan(runtimeClassPathFiles).use { scanResult ->
            mapRegisteredClasses(scanResult, settings)
        }
    }

    fun processIncrementally(
        runtimeClassPathFiles: Set<File>,
        settings: ProcessorSettings,
        seedClassNames: Set<String>,
    ): IncrementalProcessResult {
        return scan(runtimeClassPathFiles).use { scanResult ->
            val dirtyClassNames = expandDirtyClassNames(scanResult, seedClassNames)
            IncrementalProcessResult(
                dirtyClassNames = dirtyClassNames,
                registeredClasses = mapRegisteredClasses(scanResult, settings, dirtyClassNames)
            )
        }
    }

    private fun scan(runtimeClassPathFiles: Set<File>): ScanResult {
        return ClassGraph()
            .overrideClasspath(runtimeClassPathFiles)
            .enableClassInfo()
            .enableAnnotationInfo()
            .enableFieldInfo()
            .enableMethodInfo()
            .ignoreFieldVisibility()
            .ignoreMethodVisibility()
            .scan()
    }

    private fun mapRegisteredClasses(
        scanResult: ScanResult,
        settings: ProcessorSettings,
        dirtyClassNames: Set<String>? = null,
    ): List<ScriptClass> {
        require(settings.userCodeClassPathRoots.isNotEmpty()) {
            "No user code classpath roots were provided for ClassGraph symbol processing. Ensure compilation ran before classGraph tasks and check that the build directory contains compiled user classes."
        }

        val context = ProcessorContext(scanResult = scanResult, settings = settings)
        val shapeResolvers = JvmShapeResolvers()
        val annotationMapper = AnnotationMapper()
        lateinit var classMapper: ClassMapper
        val typeMapper = TypeMapper(context) { classMapper }
        val memberMapper = MemberMapper(context, typeMapper, annotationMapper, shapeResolvers)
        classMapper = ClassMapper(context, memberMapper, shapeResolvers)

        val scriptClasses = scanResult.getClassesWithAnnotation(RegisterClass::class.java.name)
            .intersect(scanResult.getSubclasses(KtObject::class.java))
            .filter { classInfo -> !classInfo.hasAnnotation(GodotBaseType::class.java) }
            .filter { classInfo -> dirtyClassNames == null || classInfo.name in dirtyClassNames }
            .map { classInfo -> classMapper.mapScriptClass(classInfo) }
            .distinctBy { scriptClass -> scriptClass.fqName }

        require(context.errors.isEmpty()) {
            buildString {
                for (error in context.errors) {
                    appendLine(error)
                }
            }
        }

        return scriptClasses
    }

    private fun expandDirtyClassNames(
        scanResult: ScanResult,
        seedClassNames: Set<String>,
    ): Set<String> {
        val dirtyClassNames = linkedSetOf<String>()

        seedClassNames.forEach { seedClassName ->
            dirtyClassNames += seedClassName

            val seedClassInfo = scanResult.getClassInfo(seedClassName) ?: return@forEach
            if (seedClassInfo.isInterface) {
                dirtyClassNames += scanResult.getClassesImplementing(seedClassName).map { it.name }
            } else {
                dirtyClassNames += scanResult.getSubclasses(seedClassName).map { it.name }
            }
        }

        return dirtyClassNames
    }
}
