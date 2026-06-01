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
import java.io.File

object ClassGraphProcessor {
    fun process(runtimeClassPathFiles: Set<File>, settings: ProcessorSettings): List<ScriptClass> {
        val scanResult = ClassGraph()
            .overrideClasspath(runtimeClassPathFiles)
            .enableClassInfo()
            .enableAnnotationInfo()
            .enableFieldInfo()
            .enableMethodInfo()
            .ignoreFieldVisibility()
            .ignoreMethodVisibility()
            .scan()

        scanResult.use {
            require(settings.userCodeClassPathRoots.isNotEmpty()) {
                "No user code classpath roots were provided for ClassGraph symbol processing. Ensure compilation ran before classGraph tasks and check that the build directory contains compiled user classes."
            }

            val context = ProcessorContext(scanResult = it, settings = settings)
            val shapeResolvers = JvmShapeResolvers()
            val annotationMapper = AnnotationMapper(context)
            lateinit var classMapper: ClassMapper
            val typeMapper = TypeMapper(context) { classMapper }
            val memberMapper = MemberMapper(context, typeMapper, annotationMapper, shapeResolvers)
            classMapper = ClassMapper(context, memberMapper, shapeResolvers)

            val scriptClasses = it.getClassesWithAnnotation(RegisterClass::class.java.name)
                .intersect(it.getSubclasses(KtObject::class.java))
                .filter { classInfo -> !classInfo.hasAnnotation(GodotBaseType::class.java) }
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
    }
}
