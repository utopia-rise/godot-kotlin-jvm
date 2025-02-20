package godot.annotation.processor.classgraph

import godot.annotation.GodotBaseType
import godot.annotation.processor.classgraph.extensions.mapToClazz
import godot.annotation.processor.classgraph.logging.LoggerWrapper
import godot.core.KtObject
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
    files: Set<File>
) {
    val scanResult = ClassGraph()
        .overrideClasspath(files)
        .enableAllInfo()
        .enableSystemJarsAndModules()
        .scan()
    scanResult
        .use {
            with(it) {
                RegisteredClassMetadataContainerDatabase.populateDependencies(it)

                val classes = it.allClasses
                    .filter { clazz ->
                        clazz.extendsSuperclass(KtObject::class.java)
                            && !clazz.hasAnnotation(GodotBaseType::class.java)
                    }
                    .filter { classInfo -> !RegisteredClassMetadataContainerDatabase.dependenciesContainsFqdn(classInfo.name) }
                    .map { classInfo ->
                        classInfo.mapToClazz(settings)
                    }

                val registeredClasses = classes.filterIsInstance<RegisteredClass>().distinctBy { clazz -> clazz.fqName }

                RegisteredClassMetadataContainerDatabase.populateCurrentProject(registeredClasses, settings)

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
                                    registeredClassMetadataContainers = ,
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
                            .resolve("main")
                            .resolve("kotlin")
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
                            .resolve("main")
                            .resolve("kotlin")
                            .resolve("godot")
                            .resolve("Entry.kt")

                        file.parentFile.mkdirs()

                        if (!file.exists()) {
                            file.createNewFile()
                        }

                        FileOutputStream(file).bufferedWriter()
                    },
                    classRegistrarFromDependencyCount = RegisteredClassMetadataContainerDatabase.dependenciesSize
                )
                
                //TODO: remove existing registration files and registrars that should be deleted

                if (settings.isRegistrationFileGenerationEnabled) {
                    EntryGenerator.generateRegistrationFiles(
                        registeredClassMetadataContainers = RegisteredClassMetadataContainerDatabase.list(),
                        registrationFileAppendableProvider = { metadata ->
                            val registrationFile = provideRegistrationFilePathForInitialGeneration(
                                isRegistrationFileHierarchyEnabled = settings.isRegistrationFileHierarchyEnabled,
                                fqName = metadata.fqName,
                                registeredName = metadata.registeredName,
                                compilationProjectName = settings.projectName,
                                classProjectName = metadata.projectName,
                                registrationFileOutDir = settings.registrationBaseDirPathRelativeToProjectDir
                            )

                            val file = settings.generatedSourceRootDir
                                .resolve("main")
                                .resolve("resources")
                                .resolve("entryFiles")
                                .resolve(registrationFile)

                            file.parentFile.mkdirs()

                            if (!file.exists()) {
                                file.createNewFile()
                            }

                            FileOutputStream(file).bufferedWriter()
                        }
                    )
                }
            }
        }
}
