package godot.annotation.processor.classgraph

import godot.annotation.RegisterClass
import godot.annotation.processor.classgraph.extensions.mapToClazz
import io.github.classgraph.ClassGraph

fun generateEntryUsingClassGraph(settings: Settings, vararg classPackageRoots: String) {
    val scanResult = ClassGraph()
        .overrideClasspath(*classPackageRoots)
        .enableAllInfo()
        .enableSystemJarsAndModules()
        .scan()
    scanResult
        .use {
            with(it) {
                val classes = it.getClassesWithAnyAnnotation(RegisterClass::class.java)
                    .map { classInfo ->
                        classInfo.mapToClazz(settings)
                    }
                TODO()
            }
        }
}
