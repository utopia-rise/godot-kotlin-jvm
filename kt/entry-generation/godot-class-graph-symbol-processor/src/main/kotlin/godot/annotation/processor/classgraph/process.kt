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
import godot.tools.common.constants.godotRegistrationPackage
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
        .scan()
    Context.reset(scanResult)
    scanResult
        .use {
            RegisteredClassMetadataContainerDatabase.populateDependencies(it, settings)
            require(settings.userCodeClassPathRoots.isNotEmpty()) {
                "No user code classpath roots were provided for ClassGraph symbol processing. Ensure compilation ran before classGraphSymbolsProcess and check that the build directory contains compiled user classes."
            }

            val registeredClasses = it.getClassesWithAnnotation(RegisterClass::class.java.name)
                .intersect(it.getSubclasses(KtObject::class.java))
                // 1. Select scanned classes that are eligible for registration in the current project.
                .filter { classInfo -> classInfo.isFromUserCode(settings.userCodeClassPathRoots) }
                .filter { classInfo -> !classInfo.hasAnnotation(GodotBaseType::class.java) }
                .filter { classInfo -> !RegisteredClassMetadataContainerDatabase.dependenciesContainsFqName(classInfo.name) }
                // 2. Map ClassGraph metadata to the entry generator model.
                .map { classInfo -> classInfo.mapToClazz(settings) }
                // 3. Keep only concrete registration outputs and remove duplicate fqNames.
                .filterIsInstance<RegisteredClass>()
                .distinctBy { clazz -> clazz.fqName }

            require(ErrorsDatabase.isEmpty()) {
                buildString {
                    for (error in ErrorsDatabase.errors) {
                        appendLine(error)
                    }
                }
            }

            RegisteredClassMetadataContainerDatabase.populateCurrentProject(registeredClasses, settings)
            val allRegisteredClassMetadataContainers = RegisteredClassMetadataContainerDatabase.list()

            val existingRegistrationFiles = settings.projectBaseDir.provideExistingRegistrationFiles()

            EntryGenerator.generateEntryFilesUsingRegisteredClasses(
                projectName = settings.projectName,
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
                serviceFile = settings.generatedSourceRootDir
                    .resolve("resources")
                    .resolve("META-INF")
                    .resolve("services")
                    .resolve("$godotRegistrationPackage.Entry"),
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

private fun ClassInfo.isFromUserCode(userCodeClassPathRoots: Set<File>): Boolean {
    val classpathElementFile = classpathElementFile?.canonicalFile ?: return false
    return userCodeClassPathRoots.contains(classpathElementFile)
}
