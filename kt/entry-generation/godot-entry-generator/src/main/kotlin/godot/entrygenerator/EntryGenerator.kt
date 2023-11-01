package godot.entrygenerator

import godot.entrygenerator.checks.ConstructorArgCountCheck
import godot.entrygenerator.checks.ConstructorOverloadingCheck
import godot.entrygenerator.checks.DefaultConstructorCheck
import godot.entrygenerator.checks.ExportedMutablilityCheck
import godot.entrygenerator.checks.FunctionArgCountCheck
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
        jvmTypeFqNamesProvider: (JvmType) -> Set<String>,
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

        if (executeSanityChecks(logger, sourceFiles)) {
            throw ChecksFailedException()
        }

        with(MainEntryFileBuilder) {
            sourceFiles.forEach { sourceFile ->
                sourceFile.registeredClasses.forEach { registeredClass ->
                    registerClassRegistrar(
                        ClassRegistrarFileBuilder(
                            projectName = projectName,
                            registeredClass = registeredClass,
                            registrarAppendableProvider = classRegistrarAppendableProvider
                        )
                    )
                }
            }
            registerUserTypesVariantMappings(sourceFiles.flatMap { it.registeredClasses })
            registerProjectName(projectName)
            val classRegistrarsForCurrentCompilationCount = sourceFiles.flatMap { it.registeredClasses }.size
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

    private fun generateServiceFile(randomPackagePathForEntryFile: String, serviceFile: File) {
        serviceFile.writeText("$randomPackagePathForEntryFile.Entry")
    }

    private fun executeSanityChecks(
        logger: Logger,
        sourceFiles: List<SourceFile>
    ): Boolean {
        return listOf(
            DefaultConstructorCheck(logger, sourceFiles).execute(),
            ConstructorArgCountCheck(logger, sourceFiles).execute(),
            ConstructorOverloadingCheck(logger, sourceFiles).execute(),

            FunctionArgCountCheck(logger, sourceFiles).execute(),

            SignalTypeCheck(logger, sourceFiles).execute(),

            ExportedMutablilityCheck(logger, sourceFiles).execute(),

            RpcCheck(logger, sourceFiles).execute(),
        ).any { hasIssue -> hasIssue }
    }

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
