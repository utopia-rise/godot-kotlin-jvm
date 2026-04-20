package godot.annotation.processor.classgraph

import godot.annotation.GodotBaseType
import godot.annotation.RegisterClass
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
import io.github.classgraph.ClassInfo
import org.slf4j.Logger
import java.io.File
import java.io.FileOutputStream

fun generateEntryUsingClassGraph(
    settings: Settings,
    logger: Logger,
    runtimeClassPathFiles: Set<File>
) {
    ErrorsDatabase.clear()

    val scanResult = ClassGraph()
        .overrideClasspath(runtimeClassPathFiles)
        .enableClassInfo()
        .enableAnnotationInfo()
        .enableFieldInfo()
        .enableMethodInfo()
        .ignoreClassVisibility()
        .ignoreFieldVisibility()
        .ignoreMethodVisibility()
        .enableSystemJarsAndModules()
        .scan()
    Context.reset(scanResult)
    scanResult
        .use {
            RegisteredClassMetadataContainerDatabase.populateDependencies(it, settings)

            val normalizedUserCodeRoots = settings.userCodeClassPathRoots.mapTo(hashSetOf()) { file ->
                file.canonicalFile
            }
            val classesToProcess = it.getClassesWithAnnotation(RegisterClass::class.java.name)
                .filter { classInfo -> classInfo.isFromUserCode(normalizedUserCodeRoots) }

            val classes = classesToProcess
                .filter { classInfo ->
                    classInfo.extendsSuperclass(KtObject::class.java)
                        && !classInfo.hasAnnotation(GodotBaseType::class.java)
                }
                .filter { classInfo -> !RegisteredClassMetadataContainerDatabase.dependenciesContainsFqName(classInfo.name) }
                .map { classInfo ->
                    classInfo.mapToClazz(settings)
                }

            require(ErrorsDatabase.isEmpty()) {
                buildString {
                    for (error in ErrorsDatabase.errors) {
                        appendLine(error)
                    }
                }
            }

            val registeredClasses = classes.filterIsInstance<RegisteredClass>().distinctBy { clazz -> clazz.fqName }

            RegisteredClassMetadataContainerDatabase.populateCurrentProject(registeredClasses, settings)
            val allRegisteredClassMetadataContainers = RegisteredClassMetadataContainerDatabase.list()

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
                                registeredClassMetadataContainers = allRegisteredClassMetadataContainers,
                                isRegistrationFileHierarchyEnabledSetting = settings.isRegistrationFileHierarchyEnabled,
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
                classRegistrarFromDependencyCount = RegisteredClassMetadataContainerDatabase.dependenciesSize,
                isRegistrationFileHierarchyEnabled = settings.isRegistrationFileHierarchyEnabled
            )

            if (settings.isRegistrationFileGenerationEnabled) {
                EntryGenerator.generateRegistrationFiles(
                    registeredClassMetadataContainers = allRegisteredClassMetadataContainers,
                    registrationFileAppendableProvider = { metadata ->
                        val registrationFile = provideRegistrationFilePathForInitialGeneration(
                            registeredClassMetadataContainers = allRegisteredClassMetadataContainers,
                            isRegistrationFileHierarchyEnabledSetting = settings.isRegistrationFileHierarchyEnabled,
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

                val classgraphRegistrationFilesBaseDir = settings.projectBaseDir
                    .resolve("build/generated/classgraph/main/resources/entryFiles")
                    .resolve(settings.registrationBaseDirPathRelativeToProjectDir)

                val initialRegistrationFilesOutDir = settings.projectBaseDir
                    .resolve(settings.registrationBaseDirPathRelativeToProjectDir)

                EntryGenerator.updateRegistrationFiles(
                    generatedRegistrationFilesBaseDir = classgraphRegistrationFilesBaseDir,
                    initialRegistrationFilesOutDir = initialRegistrationFilesOutDir,
                    existingRegistrationFilesMap = existingRegistrationFiles,
                )
            }
        }
}

private fun ClassInfo.isFromUserCode(normalizedUserCodeRoots: Set<File>): Boolean {
    if (normalizedUserCodeRoots.isEmpty()) return true

    val classpathElementFile = classpathElementFile?.canonicalFile ?: return false
    return normalizedUserCodeRoots.contains(classpathElementFile)
}
