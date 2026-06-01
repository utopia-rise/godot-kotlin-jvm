package godot.annotation.processor.classgraph

import godot.annotation.GodotBaseType
import godot.annotation.RegisterClass
import godot.annotation.processor.classgraph.extensions.mapToScriptClass
import godot.core.KtObject
import godot.registration.model.types.ScriptClass
import io.github.classgraph.ClassGraph
import java.io.File

object ClassGraphProcessor {
    fun process(runtimeClassPathFiles: Set<File>, settings: ProcessorSettings): List<ScriptClass> {
        ErrorsDatabase.clear()

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

            Context.reset(it)

            val scriptClasses = it.getClassesWithAnnotation(RegisterClass::class.java.name)
                .intersect(it.getSubclasses(KtObject::class.java))
                .filter { classInfo -> !classInfo.hasAnnotation(GodotBaseType::class.java) }
                .map { classInfo -> classInfo.mapToScriptClass(settings) }
                .distinctBy { scriptClass -> scriptClass.fqName }

            require(ErrorsDatabase.isEmpty()) {
                buildString {
                    for (error in ErrorsDatabase.errors) {
                        appendLine(error)
                    }
                }
            }

            return scriptClasses
        }
    }
}
