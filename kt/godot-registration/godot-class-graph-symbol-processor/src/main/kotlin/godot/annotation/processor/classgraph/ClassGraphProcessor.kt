package godot.annotation.processor.classgraph

import godot.annotation.processor.classgraph.mapper.RegistrationMapper
import godot.registration.model.types.ScriptClass
import io.github.classgraph.ClassGraph
import io.github.classgraph.ScanResult
import java.io.File

object ClassGraphProcessor {
    data class IncrementalProcessResult(
        val dirtyClassNames: Set<String>,
        val scriptClasses: List<ScriptClass>,
    )

    fun process(runtimeClassPathFiles: Set<File>, settings: ProcessorSettings): List<ScriptClass> {
        return scan(runtimeClassPathFiles).use { scanResult ->
            mapScriptClasses(scanResult, settings)
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
                scriptClasses = mapDirtyScriptClasses(scanResult, settings, dirtyClassNames)
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

    private fun mapScriptClasses(
        scanResult: ScanResult,
        settings: ProcessorSettings,
    ): List<ScriptClass> {
        require(settings.userCodeClassPathRoots.isNotEmpty()) {
            "No user code classpath roots were provided for ClassGraph symbol processing. Ensure compilation ran before classGraph tasks and check that the build directory contains compiled user classes."
        }

        return RegistrationMapper(scanResult, settings).map()
    }

    private fun mapDirtyScriptClasses(
        scanResult: ScanResult,
        settings: ProcessorSettings,
        dirtyClassNames: Set<String>,
    ): List<ScriptClass> {
        require(settings.userCodeClassPathRoots.isNotEmpty()) {
            "No user code classpath roots were provided for ClassGraph symbol processing. Ensure compilation ran before classGraph tasks and check that the build directory contains compiled user classes."
        }

        return RegistrationMapper(scanResult, settings).mapIncrementally(dirtyClassNames)
    }

    private fun expandDirtyClassNames(
        scanResult: ScanResult,
        seedClassNames: Set<String>,
    ): Set<String> {
        val dirtyClassNames = linkedSetOf<String>()

        seedClassNames.forEach { seedClassName ->
            dirtyClassNames += seedClassName

            val seedClassInfo = scanResult.getClassInfo(seedClassName) ?: return@forEach
            dirtyClassNames += if (seedClassInfo.isInterface) {
                scanResult.getClassesImplementing(seedClassName).map { it.name }
            } else {
                scanResult.getSubclasses(seedClassName).map { it.name }
            }
        }

        return dirtyClassNames
    }
}

