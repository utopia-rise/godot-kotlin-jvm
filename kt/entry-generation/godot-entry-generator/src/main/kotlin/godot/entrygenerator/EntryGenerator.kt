package godot.entrygenerator

import godot.entrygenerator.checks.ConstructorArgCountCheck
import godot.entrygenerator.checks.ConstructorOverloadingCheck
import godot.entrygenerator.checks.DefaultConstructorCheck
import godot.entrygenerator.checks.FunctionArgCountCheck
import godot.entrygenerator.checks.LateinitPropertyCheck
import godot.entrygenerator.checks.NullablePropertyCheck
import godot.entrygenerator.checks.PropertyMutablilityCheck
import godot.entrygenerator.checks.PropertyTypeCheck
import godot.entrygenerator.checks.RpcCheck
import godot.entrygenerator.checks.SignalTypeCheck
import godot.entrygenerator.exceptions.ChecksFailedException
import godot.entrygenerator.filebuilder.ClassRegistrarFileBuilder
import godot.entrygenerator.filebuilder.MainEntryFileBuilder
import godot.entrygenerator.filebuilder.RegistrationFileGenerator
import godot.entrygenerator.model.JvmType
import godot.entrygenerator.model.RegisteredClass
import godot.entrygenerator.model.RegisteredClassMetadataContainer
import godot.entrygenerator.model.SourceFile
import godot.entrygenerator.utils.Logger
import godot.tools.common.constants.FileExtensions
import godot.tools.common.constants.godotEntryBasePackage
import godot.tools.common.constants.godotRegistrationPackage
import java.io.BufferedWriter
import java.io.File

object EntryGenerator {
    private var _logger: Logger? = null
    internal val logger: Logger
        get() = _logger ?: throw UninitializedPropertyAccessException("logger not yet initialized. Get logger only after generateEntryFiles was called")

    private var _jvmTypeFqNamesProvider: ((JvmType) -> Set<String>)? = null
    internal val jvmTypeFqNamesProvider: ((JvmType) -> Set<String>)
        get() = _jvmTypeFqNamesProvider ?: throw UninitializedPropertyAccessException("jvmTypeFqNamesProvider not yet initialized. Get jvmTypeFqNamesProvider only after generateEntryFiles was called")

    fun generateEntryFiles(
        projectDir: String,
        projectName: String,
        classRegistrarFromDependencyCount: Int,
        logger: Logger,
        sourceFiles: List<SourceFile>,
        isRegistrationFileHierarchyEnabled: Boolean,
        jvmTypeFqNamesProvider: (JvmType) -> Set<String>,
        compilationTimeRelativeRegistrationFilePathProvider: (RegisteredClass) -> String,
        classRegistrarAppendableProvider: (RegisteredClass) -> BufferedWriter,
        mainBufferedWriterProvider: () -> BufferedWriter
    ) {
        generateEntryFilesUsingRegisteredClasses(
            projectDir,
            projectName,
            classRegistrarFromDependencyCount,
            logger,
            sourceFiles.flatMap { it.registeredClasses },
            isRegistrationFileHierarchyEnabled,
            jvmTypeFqNamesProvider,
            compilationTimeRelativeRegistrationFilePathProvider,
            classRegistrarAppendableProvider,
            mainBufferedWriterProvider
        )
    }

    fun generateEntryFilesUsingRegisteredClasses(
        projectDir: String,
        projectName: String,
        classRegistrarFromDependencyCount: Int,
        logger: Logger,
        registeredClasses: List<RegisteredClass>,
        isRegistrationFileHierarchyEnabled: Boolean,
        jvmTypeFqNamesProvider: (JvmType) -> Set<String>,
        compilationTimeRelativeRegistrationFilePathProvider: (RegisteredClass) -> String,
        classRegistrarAppendableProvider: (RegisteredClass) -> BufferedWriter,
        mainBufferedWriterProvider: () -> BufferedWriter
    ) {
        val serviceFile = File(projectDir)
            .resolve("src/main/resources/META-INF/services")
            .apply { mkdirs() }
            .resolve("$godotRegistrationPackage.Entry")

        // the package path for an entry file needs to be unique over all possible dependencies otherwise they'll override each other and only one will be used/loaded
        val randomPackageForEntryFile = getOrCreateRandomPackageName(serviceFile)

        _logger = logger
        _jvmTypeFqNamesProvider = jvmTypeFqNamesProvider

        if (executeSanityChecksUsingRegisteredClasses(logger, registeredClasses)) {
            throw ChecksFailedException()
        }

        with(MainEntryFileBuilder()) {
            registeredClasses.forEach { registeredClass ->
                registerClassRegistrar(
                    ClassRegistrarFileBuilder(
                        projectName = projectName,
                        registeredClass = registeredClass,
                        registrarAppendableProvider = classRegistrarAppendableProvider,
                        compilationTimeRelativeRegistrationFilePath = compilationTimeRelativeRegistrationFilePathProvider(registeredClass),
                        isRegistrationFileHierarchyEnabled = isRegistrationFileHierarchyEnabled
                    )
                )
            }
            registerUserTypesVariantMappings(registeredClasses)
            registerProjectName(projectName)
            val classRegistrarsForCurrentCompilationCount = registeredClasses.size
            registerClassRegistrarCount(
                classRegistrarFromCurrentCompilationCount = classRegistrarsForCurrentCompilationCount,
                classRegistrarFromDependencyCount = classRegistrarFromDependencyCount
            )
            build(randomPackageForEntryFile, mainBufferedWriterProvider)
        }

        generateServiceFile(randomPackageForEntryFile, serviceFile)
    }

    fun generateRegistrationFiles(
        registeredClassMetadataContainers: List<RegisteredClassMetadataContainer>,
        registrationFileAppendableProvider: (RegisteredClassMetadataContainer) -> BufferedWriter,
    ) {
        registeredClassMetadataContainers.forEach { metadata ->
            RegistrationFileGenerator(
                metadata,
                registrationFileAppendableProvider
            ).build()
        }
    }

    fun updateRegistrationFiles(
        generatedRegistrationFilesBaseDir: File,
        initialRegistrationFilesOutDir: File,
        existingRegistrationFilesMap: Map<String, File>
    ) {
        val kspRegistrationFiles = generatedRegistrationFilesBaseDir
            .walkTopDown()
            .filter { file ->
                file.extension == FileExtensions.GodotKotlinJvm.registrationFile
            }
            .associateBy { file ->
                file.name
            }

        // compare ksp and existing registration files
        val deletedRegistrationFiles = existingRegistrationFilesMap
            .filterKeys { registrationFileName -> !kspRegistrationFiles.containsKey(registrationFileName) }
            .values

        val updatedRegistrationFiles = existingRegistrationFilesMap
            .filterKeys { registrationFileName -> kspRegistrationFiles.containsKey(registrationFileName) }

        val newRegistrationFiles = kspRegistrationFiles
            .filterKeys { registrationFileName -> !existingRegistrationFilesMap.containsKey(registrationFileName) }


        // delete obsolete registration files
        deletedRegistrationFiles.forEach { obsoleteRegistrationFile ->
            try {
                obsoleteRegistrationFile.delete()
            } catch (e: Throwable) {
                logger.warn("Could not delete obsolete registration file. You need to delete it manually! ${obsoleteRegistrationFile.absolutePath}")
            }
        }
        // delete empty dirs in the initial gdj out folder (but not anywhere else!)
        initialRegistrationFilesOutDir
            .walkBottomUp()
            .filter { dir -> dir.isDirectory && dir.listFiles()?.isEmpty() == true }
            .forEach { emptyDir ->
                try {
                    emptyDir.delete()
                } catch (e: Throwable) {
                    logger.warn("Could not delete seemingly empty registration directory! ${emptyDir.absolutePath}")
                }
            }

        // replace existing registration files
        updatedRegistrationFiles.forEach { (registrationFileName, registrationFile) ->
            kspRegistrationFiles[registrationFileName]?.copyTo(registrationFile, overwrite = true)
        }

        // copy new registration files
        newRegistrationFiles.forEach { (_, registrationFile) ->
            val relativePath = registrationFile.toRelativeString(generatedRegistrationFilesBaseDir)
            val targetFile = initialRegistrationFilesOutDir.resolve(relativePath)
            registrationFile.copyTo(targetFile, overwrite = true)
        }
    }

    private fun generateServiceFile(randomPackagePathForEntryFile: String, serviceFile: File) {
        serviceFile.writeText("$randomPackagePathForEntryFile.Entry")
    }

    private fun executeSanityChecksUsingRegisteredClasses(
        logger: Logger,
        registeredClasses: List<RegisteredClass>
    ): Boolean {
        return listOf(
            DefaultConstructorCheck(logger, registeredClasses).execute(),
            ConstructorArgCountCheck(logger, registeredClasses).execute(),
            ConstructorOverloadingCheck(logger, registeredClasses).execute(),

            FunctionArgCountCheck(logger, registeredClasses).execute(),

            SignalTypeCheck(logger, registeredClasses).execute(),

            PropertyTypeCheck(logger, registeredClasses).execute(),
            PropertyMutablilityCheck(logger, registeredClasses).execute(),
            LateinitPropertyCheck(logger, registeredClasses).execute(),
            NullablePropertyCheck(logger, registeredClasses).execute(),

            RpcCheck(logger, registeredClasses).execute(),
        ).any { hasIssue -> hasIssue }
    }

    private fun executeSanityChecks(
        logger: Logger,
        sourceFiles: List<SourceFile>
    ) = executeSanityChecksUsingRegisteredClasses(logger, sourceFiles.flatMap { it.registeredClasses })

    /**
     * Either gets the previously generated random package path of the entry class or creates a new one.
     */
    private fun getOrCreateRandomPackageName(serviceFile: File): String {
        return if (serviceFile.exists()) {
            serviceFile.readText().trim().removeSuffix(".Entry")
        } else {
            "$godotEntryBasePackage.${randomPackageName()}"
        }
    }

    private fun randomPackageName(length: Int = 20): String {
        val allowedChars = ('A'..'Z') + ('a'..'z')
        return (1..length)
            .map { allowedChars.random() }
            .joinToString("")
    }
}
