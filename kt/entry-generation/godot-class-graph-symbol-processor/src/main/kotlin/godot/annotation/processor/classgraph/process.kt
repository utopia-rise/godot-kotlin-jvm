package godot.annotation.processor.classgraph

import godot.annotation.RegisterClass
import godot.annotation.processor.classgraph.extensions.mapToClazz
import godot.annotation.processor.classgraph.logging.LoggerWrapper
import godot.entrygenerator.EntryGenerator
import godot.entrygenerator.ext.provideExistingRegistrationFiles
import godot.entrygenerator.ext.provideRegistrationFilePathForInitialGeneration
import godot.entrygenerator.model.RegisteredClass
import godot.entrygenerator.utils.DefaultJvmTypeProvider
import godot.tools.common.constants.FileExtensions
import io.github.classgraph.ClassGraph
import org.slf4j.Logger
import java.io.File
import java.io.FileOutputStream

fun generateEntryUsingClassGraph(
    settings: Settings,
    logger: Logger,
    vararg classPackageRoots: String
) {
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

                val registeredClasses = classes.filterIsInstance<RegisteredClass>()
                val existingRegistrationFiles = settings.projectBaseDir.provideExistingRegistrationFiles()

                EntryGenerator.generateEntryFilesUsingRegisteredClasses(
                    projectName = settings.projectName,
                    projectDir = settings.projectBaseDir.absolutePath,
                    registeredClasses = registeredClasses,
                    logger = LoggerWrapper(logger),
                    jvmTypeFqNamesProvider = DefaultJvmTypeProvider(),
                    compilationTimeRelativeRegistrationFilePathProvider = {registeredClass ->
                            val registrationFile = existingRegistrationFiles["${registeredClass.registeredName}.${FileExtensions.GodotKotlinJvm.registrationFile}"]
                            ?.relativeTo(settings.projectBaseDir)
                            ?: File(
                                registeredClass.provideRegistrationFilePathForInitialGeneration(
                                    isRegistrationFileHierarchyEnabled = settings.isRegistrationFileHierarchyEnabled,
                                    compilationProjectName = settings.projectName,
                                    classProjectName = settings.projectName, // same as project name as no registration file exists for this class, hence it is new / renamed
                                    registrationFileOutDir = settings.registrationBaseDirPathRelativeToProjectDir
                                )
                            )

                        registrationFile.invariantSeparatorsPath
                    },
                    classRegistrarAppendableProvider = { registeredClass ->
                        val file = settings.generatedSourceRootDir
                            .resolve("godot")
                            .resolve("entry")
                            .resolve("${registeredClass.registeredName}Registrar.kt")

                        file.parentFile.mkdirs()

                        if (!file.exists()) {
                            file.createNewFile()
                        }

                        FileOutputStream(file).bufferedWriter()
                    },
                    mainBufferedWriterProvider = {
                        val file = settings.generatedSourceRootDir
                            .resolve("godot")
                            .resolve("Entry.kt")

                        file.parentFile.mkdirs()

                        if (!file.exists()) {
                            file.createNewFile()
                        }

                        FileOutputStream(file).bufferedWriter()
                    },
                    classRegistrarFromDependencyCount = registeredClasses.size
                )
            }
        }
}
