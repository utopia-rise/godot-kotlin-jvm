package godot.annotation.processor.classgraph

import godot.annotation.GodotBaseType
import godot.annotation.RegisterClass
import godot.annotation.processor.classgraph.extensions.mapToClazz
import godot.core.KtObject
import godot.entrygenerator.model.RegisteredClass
import godot.entrygenerator.settings.Settings
import io.github.classgraph.ClassGraph
import java.io.File

object ClassGraphProcessor {
    fun process(runtimeClassPathFiles: Set<File>, settings: Settings): List<RegisteredClass> {
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

            val registeredClasses = it.getClassesWithAnnotation(RegisterClass::class.java.name)
                .intersect(it.getSubclasses(KtObject::class.java))
                .filter { classInfo -> !classInfo.hasAnnotation(GodotBaseType::class.java) }
                .map { classInfo -> classInfo.mapToClazz(settings) }
                .filterIsInstance<RegisteredClass>()
                .distinctBy { clazz -> clazz.fqName }

            require(ErrorsDatabase.isEmpty()) {
                buildString {
                    for (error in ErrorsDatabase.errors) {
                        appendLine(error)
                    }
                }
            }

            return registeredClasses
        }
    }
}
